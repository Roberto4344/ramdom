import java.util.Random;
import java.util.ArrayList;

public class randomizer{
    private ArrayList<String> respuesta;
    private int index;
    private int n;
    Random r = new Random();

    /**
     * constructor
     */
    public randomizer(){
        n=100;
        respuesta=new ArrayList<String>();
    }

    /**
     * metodo para mostrar numeros enteros aleatorios
     */
    public void numRandom(int cuantosNum,int hastaNum){
        for(int q =0 ; q < cuantosNum; q++){
            int num = r.nextInt(hastaNum+1);
            System.out.println(num);

        }
    }

    /**
     * metodo para mostrar numeros enteros aleatorios
     */
    public void bolRandom(int cuantosBol){
        for(int q =0 ; q < cuantosBol; q++){
            System.out.println( r.nextBoolean());
        }
    }

    /**
     * metodo para mostrar numeros enteros aleatorios
     */
    public void siNoTalvez(){
        int num= r.nextInt(2+1);
        if(num==0){
            System.out.println("Si");}
        else if(num==1){
            System.out.println("No");}
        else{
            System.out.println("Tal vez");}
    }

    public void addRespuesta(String respuestas){
        respuesta.add(respuestas);
    }

    /**
     * metodo para mostrar numeros enteros aleatorios
     */
    public void codigoAleatorio(){
        int num= r.nextInt(respuesta.size());
        String answer = respuesta.get(num);
        System.out.println(answer);
    }

    /**
     * devuelve un numero aleatorio
     */
    public void numeroRandom(){

        System.out.println(r.nextInt());
    }
    
    /**
     * metodo para mostrar numeros enteros aleatorios
     */
    public void numerosRandom(int cuantosNum){
        for(int q =0 ; q < cuantosNum; q++){
            System.out.println( r.nextInt());
        }
    }
}

