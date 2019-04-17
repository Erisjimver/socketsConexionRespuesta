package Clases;
import java.io.* ;
import java.net.* ;

public class Servidor {
    
    Escribir img = new Escribir();
    static final int PUERTO=7000;


    
    public void Servidor( ) {
        try {
            ServerSocket Servidor = new ServerSocket(PUERTO);
            img.escribirLog("Inicio servicios");
            System.out.println("Escucho el puerto " + PUERTO );
            img.escribirLog("Escucho el puerto " + PUERTO);

                for( int numCli = 0; numCli< 3; numCli++) 
                {
                    Socket Cliente = Servidor.accept(); // Crea objeto.
                    
                    InetAddress ina= Cliente.getInetAddress();
                    
               
                    
                    
                    img.escribirLog("Sirvo al cliente " + numCli+ " con ip "+ina);//Historial 
 
                    OutputStream aux = Cliente.getOutputStream();
                    
                    DataOutputStream flujo= new DataOutputStream( aux );
                    
                   // flujo.writeUTF("Hola cliente " + numCli +" Con ip: "+ina);
                   img.escribirLog("Sirvo al cliente "+Cliente.getInetAddress().getHostName() + " Con ip: "+ina);//Historial 
                   System.out.println("Sirvo al cliente " + numCli+ " con nombre: " +Cliente.getInetAddress().getHostName()+ " Con ip: "+Cliente.getInetAddress().getHostAddress());
                   
                   flujo.writeUTF("Hola cliente: " + Cliente.getInetAddress().getHostName()+" Con ip: "+Cliente.getInetAddress().getHostAddress());
                 
                   
                   img.escribirLog("Conexion Exitosa al servidor Israel "); //Historial 
                    
                    
                    
                    Cliente.close();
                }
                
            System.out.println("Demasiados clientes por hoy");
            img.escribirLog("Se supero el limite permitido de usuarios conectados");//Historial 
        }
        catch( IOException e )
        {
        
            System.out.println( e.getMessage() );
            
        }
    }
    
     

}
