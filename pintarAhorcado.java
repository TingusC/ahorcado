package ahorcado;

public class pintarAhorcado {
    //Variable que almacena la figura del ahorcado
    private String figura;
    private String derrota;
    private int ciclo;
    //Constructor que inicializa la variable figura al inicio del ahorcado (sin partes del cuerpo)
    public pintarAhorcado() {
        figura = "+---+\r\n" +
                "  |   |\r\n" +
                "      |\r\n" +
                "      |\r\n" +
                "      |\r\n" +
                "      |\r\n" +
                "========="; 
        derrota ="+---+\r\n" +
                "  |   |\r\n" +
                "  O   |\r\n" +
                " /|\\  |\r\n" +
                " / \\  |\r\n" +
                "      |\r\n" +
                "=========";
        ciclo=0;
    }
    //setters
    public void setInicio(){
        figura= "+---+\r\n" +
                "  |   |\r\n" +
                "      |\r\n" +
                "      |\r\n" +
                "      |\r\n" +
                "      |\r\n" +
                "========";
        ciclo=0;
    }
    public void setFigura(Boolean opcion){
        if(opcion==false){
            ciclo++;
            switch (ciclo) {
                case 1:
                        figura= "+---+\r\n" +
                                "  |   |\r\n" +
                                "  O   |\r\n" +
                                "      |\r\n" +
                                "      |\r\n" +
                                "      |\r\n" +
                                "=========";
                    break;
                case 2:
                        figura= "+---+\r\n" + 
                                "  |   |\r\n" + 
                                "  O   |\r\n" + 
                                "  |   |\r\n" + 
                                "      |\r\n" + 
                                "      |\r\n" + 
                                "=========";          
                    break;
                case 3:
                        figura= "+---+\r\n" +
                                "  |   |\r\n" +
                                "  O   |\r\n" +
                                " /|   |\r\n" +
                                "      |\r\n" +
                                "      |\r\n" +
                                "=========";
                    break;
                case 4:
                        figura= "+---+\r\n" +
                                "  |   |\r\n" +
                                "  O   |\r\n" +
                                " /|\\  |\r\n" +
                                "      |\r\n" +
                                "      |\r\n" +
                                "=========";
                    break;
                case 5:
                        figura= "+---+\r\n" +
                                "  |   |\r\n" +
                                "  O   |\r\n" +
                                " /|\\  |\r\n" +
                                " /    |\r\n" +
                                "      |\r\n" +
                                "=========";
                    break;
                case 6:
                        figura= "+---+\r\n" +
                                "  |   |\r\n" +
                                "  O   |\r\n" +
                                " /|\\  |\r\n" +
                                " / \\  |\r\n" +
                                "      |\r\n" +
                                "=========";
                default:
                    break;
            }
        }
    }
    //getters
    public String getFigura(){
        return figura;
    }
    public String getDerrota(){
        return derrota;
    }
}