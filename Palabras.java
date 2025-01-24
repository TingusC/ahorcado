package ahorcado;
import javax.swing.JOptionPane;

public class Palabras {
    private String palabra;
    //constructor
    public Palabras(){
        palabra=null;
    }
    //geters
    public String getPalabra(){
        return palabra;
    }
    //setters
    public void setPalabraRandom(int eleccion){
        if(eleccion==1){
                int opc=(int)(Math.random()*10);
                switch (opc) {
                //faciles
                case 0:
                        palabra="gato";
                        break;
                case 1:
                        palabra="abeja";
                        break;
                case 2:
                        palabra="coche";
                        break;
                case 3:
                        palabra="abril";
                        break;
                case 4:
                        palabra="balon";
                        break;
                case 5:
                        palabra="dado";
                        break;
                case 6:
                        palabra="casa";
                        break;
                case 7:
                        palabra="zorro";
                        break;
                case 8:
                        palabra="pajaro";
                        break;
                case 9:
                        palabra="agua";
                        break;
                case 10:
                        palabra="flor";
                        break; 
                }
        }else if(eleccion==2){
                int opc=(int)(Math.random()*10);
                switch (opc) {
                //normales
                case 1:
                        palabra="faciles";
                        break; 
                case 2:
                        palabra="adivinar";
                        break; 
                case 3:
                        palabra="caminar";
                        break; 
                case 4:
                        palabra="coletas";
                        break;
                case 5:
                        palabra="flauta";
                        break; 
                case 6:
                        palabra="solar";
                        break; 
                case 7:
                        palabra="tumba";
                        break;  
                case 8:
                        palabra="puerro";
                        break;  
                case 9:
                        palabra="cobrar";
                        break;  
                case 10:
                        palabra="gorron";
                        break; 
                }
        }else if(eleccion==3){
                int opc=(int)(Math.random()*10);
                switch (opc) {   
            //dificiles
                case 1:
                        palabra="oxigeno";
                        break;
                case 2:
                        palabra="exquisito";
                        break;
                case 3:
                        palabra="quimera";
                        break;
                case 4:
                        palabra="saxofon";
                        break;
                case 5:
                        palabra="exhumar";
                        break;
                case 6:
                        palabra="quizas";
                        break;
                case 7:
                        palabra="novedoso";
                        break;
                case 8:
                        palabra="kiosco";
                        break;
                case 9:
                        palabra="zarzamora";
                        break;
                case 10:
                        palabra="quilate";
                        break;
                default:
                        palabra="ahoracado";
                        break;
                }
        }
    }
    public void setPalabraUser() {
        String nuevapalabra = JOptionPane.showInputDialog("Elige tu palabra:");
        if (nuevapalabra == null || nuevapalabra.trim().isEmpty()) {
                setPalabraRandom(1);
                JOptionPane.showMessageDialog(null, "No ingresaste ninguna palabra. Se ha asignado una palabra aleatoria con dificultad: Fácil.");
        } else {
            palabra = nuevapalabra;
        }
    }
       
}
