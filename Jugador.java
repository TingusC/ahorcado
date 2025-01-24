package ahorcado;

import javax.swing.JOptionPane;

public class Jugador {
    public static String JugadorC;
    public static int PuntuacionC;
    public static int MejorPuntuacion;
    //puntuaciones predeterminadas a batir 
    public static int Puntuacion1 = 5000;
    public static int Puntuacion2 = 2500;
    public static int Puntuacion3 = 1250;
    public static int Puntuacion4 = 1000;
    public static int Puntuacion5 = 800;
    //nombre de usuarios a batir predeterminados
    public static String Jugador1 = "Sergio";
    public static String Jugador2 = "Carlos";
    public static String Jugador3 = "Alberto";
    public static String Jugador4 = "Balas";
    public static String Jugador5 = "Eva";

    //valores iniciales del jugador
    public Jugador() {
        JugadorC = "Sin Nombre";
        PuntuacionC = 0;
        MejorPuntuacion = 0;
    }

    //muestra la tabla de las mejores puntuaciones
    public void TablaPuntuacionCompleta() {
        JOptionPane.showMessageDialog(null, 
            Jugador1 + ": " + Puntuacion1 + "\n" +
            Jugador2 + ": " + Puntuacion2 + "\n" +
            Jugador3 + ": " + Puntuacion3 + "\n" +
            Jugador4 + ": " + Puntuacion4 + "\n" +
            Jugador5 + ": " + Puntuacion5);
    }

    //agrega tu nueva puntuacion y compara con las mejores
    public static void addUserPoints(int nuevosPuntos) {
        if (nuevosPuntos > Puntuacion5) {
            System.out.println(nuevosPuntos);
            System.out.println("El usuario " + JugadorC + " puede entrar en la tabla de puntuaciones");
            addPuntos(nuevosPuntos, JugadorC);
        } else {
            JOptionPane.showMessageDialog(null, "Te has quedado a las puertas. ¡Sigue jugando!");
        }
    }

    //añadir puntos a la tabla de puntuaciones, comprueba y pide desplazar
    private static void addPuntos(int nuevosPuntos, String NuevoJugador) {
        if (nuevosPuntos > Puntuacion1) {
            desplazarPuntuaciones(1, nuevosPuntos, NuevoJugador);
        } else if (nuevosPuntos > Puntuacion2) {
            desplazarPuntuaciones(2, nuevosPuntos, NuevoJugador);
        } else if (nuevosPuntos > Puntuacion3) {
            desplazarPuntuaciones(3, nuevosPuntos, NuevoJugador);
        } else if (nuevosPuntos > Puntuacion4) {
            desplazarPuntuaciones(4, nuevosPuntos, NuevoJugador);
        } else if (nuevosPuntos > Puntuacion5) {
            actualizarPuntuacion(5, nuevosPuntos, NuevoJugador);
        }
        cambiarmejorpuntuacion(nuevosPuntos); 
    }

    //esto desplaza las puntuaciones hacia abajo si ganas
    private static void desplazarPuntuaciones(int posicion, int nuevosPuntos, String nuevoJugador) {
        for (int i = 5; i > posicion; i--) {
            actualizarPuntuacion(i, getPuntuacion(i - 1), getJugador(i - 1)); 
        }
        actualizarPuntuacion(posicion, nuevosPuntos, nuevoJugador);
    }

    //actualiza la puntuacion y el nombre del jugador
    private static void actualizarPuntuacion(int posicion, int puntos, String jugador) {
        switch (posicion) {
            case 1:
                Puntuacion1 = puntos;
                Jugador1 = jugador;
                break;
            case 2:
                Puntuacion2 = puntos;
                Jugador2 = jugador;
                break;
            case 3:
                Puntuacion3 = puntos;
                Jugador3 = jugador;
                break;
            case 4:
                Puntuacion4 = puntos;
                Jugador4 = jugador;
                break;
            case 5:
                Puntuacion5 = puntos;
                Jugador5 = jugador;
                break;
        }
        System.out.println("Pos" + posicion + ": " + puntos + " " + jugador);
    }
    
    //cambiar el nombre de usuario
    public void cambiarnombre() {
        String nuevonombre = JOptionPane.showInputDialog(null, "¿Cómo quiere llamarse?");
            if (nuevonombre == null || nuevonombre.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "No se ha cambiado el nombre");
            } else {
                JugadorC = nuevonombre.trim();
                    System.out.println("Nombre cambiado a: " + JugadorC);
                }
            }
     
    //actualiza la mejor puntuacion del usuario
    public static void cambiarmejorpuntuacion(int nuevosPuntos) {
        if (nuevosPuntos > MejorPuntuacion) {
            MejorPuntuacion = nuevosPuntos;
            System.out.println("Sobreescribiendo la mejor puntuación");
        } else {
            System.out.println("La puntuación ya es mejor que la nueva, no se sobreescribirá");
        }
    }

    public static void cambiarUltimaPuntuacion(int nuevosPuntos) {
        PuntuacionC = nuevosPuntos;
    }


    /////
    ///// Getters
    ///// 
    public int getPuntuacionC() {
        return PuntuacionC;
    }

    public String getJugadorC() {
        return JugadorC;
    }

    public int getMejorPuntuacion() {
        return MejorPuntuacion;
    }

    private static int getPuntuacion(int posicion) {
        switch (posicion) {
            case 1:
                return Puntuacion1;
            case 2:
                return Puntuacion2;
            case 3:
                return Puntuacion3;
            case 4:
                return Puntuacion4;
            case 5:
                return Puntuacion5;
            default:
                return 0;
        }
    }

    public int getPuntuacion1() {
        return Puntuacion1;
    }

    public int getPuntuacion2() {
        return Puntuacion2;
    }

    public int getPuntuacion3() {
        return Puntuacion3;
    }

    public int getPuntuacion4() {
        return Puntuacion4;
    }

    public int getPuntuacion5() {
        return Puntuacion5;
    }

    private static String getJugador(int posicion) {
        switch (posicion) {
            case 1:
                return Jugador1;
            case 2:
                return Jugador2;
            case 3:
                return Jugador3;
            case 4:
                return Jugador4;
            case 5:
                return Jugador5;
            default:
                return "";
        }
    }

    public String getJugador1() {
        return Jugador1;
    }

    public String getJugador2() {
        return Jugador2;
    }

    public String getJugador3() {
        return Jugador3;
    }

    public String getJugador4() {
        return Jugador4;
    }

    public String getJugador5() {
        return Jugador5;
    }
}
