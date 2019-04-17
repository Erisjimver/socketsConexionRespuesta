package Clases;

import java.io.*;
import java.net.*;

public class Cliente {

   // static final String HOST = "localhost";
    static final String HOST = "192.168.101.45";
    static final int PUERTO=7000;
 
    public Cliente( ) {
        
        try{
            Socket skCliente = new Socket( HOST , PUERTO);
            InputStream aux = skCliente.getInputStream();
            DataInputStream flujo = new DataInputStream( aux );
            System.out.println( flujo.readUTF() );
            skCliente.close();
        }
        catch( IOException e ) {
                System.out.println( e.getMessage() );
        }
 }
 
    public static void main( String[] arg ) {
        Cliente cliente = new Cliente();
 }
}
