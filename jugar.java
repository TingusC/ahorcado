
//AHORCADO CREADO POR CARLOS, ALBERTO Y ALVARO
package ahorcado;

import javax.swing.JOptionPane;

public class jugar {
    private String texto="",cadena="",letra="";
    private String letraUsada="";
    private pintarAhorcado figura=new pintarAhorcado();
    private Boolean salida;




    //ELECCION DE MODO DE JUEGO
    public String menuJugarJava(){
        String juego=JOptionPane.showInputDialog("ELIGE EL MODO DE JUEGO\n1-Palabra aleatoria.\n2-Elegir palabra.\n3-Atras.");
        if (juego == null) {
            juego = "3";
        }
        return juego;
    }
    //ELECCION DE LA DIFICULTAD EN EL MODO DE PALABRA ALEATORIA
    public int dificultadJuego(){
        int dificultad=0;
        boolean salida=false;
        while(salida==false){
            String eleccion=JOptionPane.showInputDialog("Elige la dificultad\n1-Facil\n2-Medio\n3-Dificil\n\n4-Atras");
            if (eleccion == null) {
                eleccion = "4";
            }
            switch (eleccion) {
                case "1":
                        dificultad=1;
                        salida=true;
                    break;
                case "2":
                        dificultad=2;
                        salida=true;
                    break;
                case "3":
                        dificultad=3;
                        salida=true;
                    break;
                case "4":
                        dificultad=0;
                        salida=true;
                    break;

                default:
                        JOptionPane.showMessageDialog(null,"Valor invalido =(\nIntentalo de nuevo...");
                    break;
            }
        }
        return dificultad;
    }
                    
    //DESARROLLO DEL JUEGO
    public void JugarMain(String palabra) {
        texto = "";
        cadena = "";
        letra = "";
        letraUsada = "";
        salida = false;
        int puntuacion = 0;
        //ESCONDER LA PALABRA
        for (int i = 0; i < palabra.length(); i++) {
            cadena += "-";
        }
        texto = cadena;
        figura.setInicio();
        //OPCIONES DE JUGABILIDAD
        while (!salida) {
            //ABANDONO
            if (letra.equals("0")) {
                salida = true;
                JOptionPane.showMessageDialog(null, "Más suerte la próxima vez");
            //DERROTA
            } else if (figura.getFigura() == figura.getDerrota()) {
                salida = true;
                JOptionPane.showMessageDialog(null, figura.getDerrota() + "\nHas perdido. La palabra era '" + palabra.toUpperCase() + "'");
            //VICTORIA
            } else if (texto.equalsIgnoreCase(palabra)) {
                JOptionPane.showMessageDialog(null, "¡ENHORABUENA!\nLa palabra era '" + palabra.toUpperCase() + "'");
                salida = true;
            //MENU DE LA PARTIDA
            } else {
                Boolean aciertoFallo = false;
                letra = JOptionPane.showInputDialog(figura.getFigura() + "\n" + texto.toUpperCase() + "\nElige una letra\nLetras usadas: " + letraUsada.toUpperCase());
                cadena = "";
                //CONFIGURA LA OPCION DE CANCELAR DEL JOPTIONPANE PARA QUE SE LEA COMO ABANDONO 
                //Y NO COMO CERRAR EL PROGRAMA
                if (letra == null) {
                    letra = "0";
                //VALORES NULOS QUE DA EL JUGADOR
                } else if (letra.length() != 1 || letra.equals(" ")) {
                    JOptionPane.showMessageDialog(null, "Debes darme solo una letra");
                //SISTEMA DE ACIERTOS Y FALLOS Y REVELAR LA PALABRA
                } else {
                    for (int i = 0; i < palabra.length(); i++) {
                        //LETRA ADIVINADA
                        if (Character.toLowerCase(palabra.charAt(i)) == Character.toLowerCase(letra.charAt(0))) {
                            cadena += letra.charAt(0);
                            aciertoFallo = true;
                        //RELLENAR LETRAS NO ACERTADAS 
                        } else {
                            cadena += texto.charAt(i);
                        }
                    }
    
                    figura.setFigura(aciertoFallo);
                    texto = cadena;
                    letraUsada += letra + ", ";
    
                    // Actualizar puntuación
                    if (aciertoFallo) {
                        puntuacion += 1000; // Sumar puntos por acierto
                    } else {
                        puntuacion -= 500; // Restar puntos por error
                    }
                }
            }
        }
    
        JOptionPane.showMessageDialog(null, "Tu puntuación final es: " + puntuacion);
    
        // Actualizar puntuación del jugador
        Jugador.cambiarUltimaPuntuacion(puntuacion);
        Jugador.addUserPoints(puntuacion);
    
        System.out.println("Puntuación registrada: " + puntuacion);
    }
}
