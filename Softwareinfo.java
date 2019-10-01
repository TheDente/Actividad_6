public class Softwareinfo {

public void softinfo(){
    System.out.println("El sistema operativo es: " + System.getProperty("os.name"));
    System.out.println("El tipo de sistema operativo es: " + System.getProperty("os.arch"));
    System.out.println("El version de sistema operativo es: " + System.getProperty("os.version"));
    String java_version = System.getProperty("java.version");
    String version_message = String.format("Java version: %s", java_version);
    System.out.println(version_message);
}


}