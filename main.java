//AHORCADO CREADO POR CARLOS, ALBERTO Y ALVARO
package ahorcado;
import javax.swing.JOptionPane;

public class main {

    public static void main(String[] args) {
        Boolean MenuPrincipal = false;
        Jugador JugadorActual = new Jugador();
        jugar jugar = new jugar();
        JOptionPane.showMessageDialog(null, "Bienvenido al Ahorcado de Carlos, Alberto y Alvaro");
        JugadorActual.cambiarnombre();
        Palabras palabra=new Palabras();


        while (!MenuPrincipal) {
            String opcionMenuPrincipal = JOptionPane.showInputDialog(null, "AHORCADO JAVA EDITION \n¿Que opcion quieres elegir?\n1. Jugar.\n2. Ver Puntuaciones.\n3. Salir del programa.");
            if (opcionMenuPrincipal == null) {
            int salirPrograma = JOptionPane.showConfirmDialog(null, "¿Estás seguro que quieres salir del programa?", "Confirmar salida", JOptionPane.YES_NO_OPTION);
    
            if (salirPrograma == JOptionPane.YES_OPTION) {
                MenuPrincipal = true;
            // Si hemos visto break; esto es lo contrario, continue;
            continue;
            }
        }
    
        switch (opcionMenuPrincipal) {
                //JUGAR

                
                case "1":
                boolean MenuJuego = false;
                while(!MenuJuego){
                String juego=jugar.menuJugarJava();
                switch (juego) {
                    //JUAGAR CON PALABRA ALEATORIA
                    case "1":
                        int dificultad = jugar.dificultadJuego();
                        if (dificultad == 0) {
                            break;
                            
                        }else{
                            palabra.setPalabraRandom(dificultad);
                        if (MenuJuego) {
                            
                        }
                        jugar.JugarMain(palabra.getPalabra());
                        break;
                        }
                        

                    //JUGAR CON PALABRA PRESELECCIONADA
                    case "2":
                        palabra.setPalabraUser();
                        jugar.JugarMain(palabra.getPalabra());
                        break;

                    //ATRAS SATANAS
                    case "3":
                        MenuJuego = true;
                        break;

                    default:
                    JOptionPane.showMessageDialog(null,"Valor invalido ");
                        break;
                    }
                }
                break;


                //VER PUNTUACIONES
                case "2":

                    boolean MenuPuntuaciones = false;
                    while (!MenuPuntuaciones) {
                    String opciones = JOptionPane.showInputDialog(null, "JUGADOR ACTUAL: "+ JugadorActual.getJugadorC() +"\nMejor Puntuación: "+JugadorActual.getMejorPuntuacion()+"\n1. Mostrar tabla \n2. Cambiar Nombre \n3. Salir");
                        if (opciones == null) {
                            MenuPuntuaciones = true;
                            break;
                            
                        }
                        switch (opciones) {
                            //VER TABLA DE PUNTUCIONES
                            case "1":
                            JugadorActual.TablaPuntuacionCompleta();

                                break;
                            
                            //Cambiar nombre del usuario
                            case "2":
                            JugadorActual.cambiarnombre();

                            //ATRAS SATANAS
                            case "3":
                            MenuPuntuaciones = true;
                            System.out.println("Atras de menu Puntuaciones");
                            break;
                            default:
                            JOptionPane.showMessageDialog(null, "Debe de seleccionar un numero correcto del 1 al 3.");
                                break;
                        }

                    }
                    
                break;

                //SALIR PROGRAMA
                case "3":
                    MenuPrincipal = true;
                    
                break;
            
                default:
                JOptionPane.showMessageDialog(null, "Debe de seleccionar un numero correcto del 1 al 3.");
                    break;
            }
        }

    }
}
