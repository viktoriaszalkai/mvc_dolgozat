
package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import modell.Ember;


public class FilekezeléesOOP {
        
    public static void main(String[] args) throws IOException {
      
   
        InputStream is = Ember.class.getClassLoader().getResourceAsStream("folder/emberek.csv");
        BufferedReader bf = new BufferedReader(new InputStreamReader(is));
        ArrayList<Ember> emberek = new ArrayList<>();
        String sor;
        while((sor = bf.readLine()) != null){
            Ember ember = new Ember(sor);
            emberek.add(ember);
        }
        System.out.println("A file tartalma");
        for(Ember ember:  emberek){
            System.out.println(ember);
        }
        System.out.println("ki lakik bp-n?");
        int i  = 0;
        while(!(emberek.get(i).getCim().equals("Bp"))){
            i++;
        }
        System.out.println(emberek.get(i).getNev());
    }
}
