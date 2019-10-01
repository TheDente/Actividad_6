
public class Hardwareinfo {

public void memory(){

    long memoria = Runtime.getRuntime().totalMemory();
    long mem = memoria / 1024;
    System.out.println("La memoria total es: " + mem + " MB");  
    System.out.println("Identificador del CPU:" + System.getenv("PROCESSOR_IDENTIFIER"));
    System.out.println("Arquitectura del procesador: " + System.getenv("PROCESSOR_ARCHITECTURE"));
    System.out.println("Cores: " + System.getenv("NUMBER_OF_PROCESSORS"));



}

   

    

    

}