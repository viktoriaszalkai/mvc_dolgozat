
package fileok;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;

import java.util.List;

public class Fileok {


    public static void main(String[] args) throws IOException {
        
        List<String> abszolut = Files.readAllLines(Path.of("C:\\Files\\abszolut.txt"));
            System.out.println("txt ="+abszolut);
   
    

//        List<String> relativ = Files.readAllLines(Path.of("relativ.txt"));
//            System.out.println("txt ="+relativ);    CSAKK AKKOR JÓ, HA EGY DB BEDRÓTOZOTT FILE-AL DOLGOZOL
        InputStream is = Fileok.class.getClassLoader().getResourceAsStream("res/res.txt");
        BufferedReader bf = new BufferedReader(new InputStreamReader(is));
        String sor;
        while((sor = bf.readLine()) != null){
            System.out.println("sor = "+ sor);
        }
       
        
    }
    
    
    
}
