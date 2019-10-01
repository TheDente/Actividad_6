public class Main { 

public static void main(String[] args) throws Exception {

    System.out.println("-----Informacion del software-----");
    Softwareinfo op = new Softwareinfo();
    op.softinfo();
    
    System.out.println("-----Informacion del hardware-----");    
    Hardwareinfo op1 = new Hardwareinfo();
    op1.memory();

    System.out.println("-----Informacion del Network-----");
    Networkinfo op2 = new Networkinfo();
    op2.netinfo();
    Networkinfo.getInterfacesInfo();


}


}