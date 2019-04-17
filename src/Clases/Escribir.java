package Clases;

import java.io.*;
import java.util.Date;


public class Escribir {
    

    
       public void escribirLog(String texto) {
        File f;
        f = new File("registro.log");
        try {
            FileWriter w = new FileWriter(f, true);
            try (BufferedWriter bw = new BufferedWriter(w); PrintWriter wr = new PrintWriter(bw)) {

                wr.println(new Date()+": "+texto);
                wr.append("");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());        }
    } 
}
