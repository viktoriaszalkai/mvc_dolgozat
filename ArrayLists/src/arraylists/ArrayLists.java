
package arraylists;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Random;
import java.util.Set;


public class ArrayLists {
    
    private static final Random rnd = new Random();
    private static ArrayList<Integer> szamokLista;
    private static HashSet<Integer> kulonbozoek;
    
  
    public static void main(String[] args) {
          szamokLista = new ArrayList<>();
          feltolt();
          kiirLista("párosok és páratlanok:");
          kiveszParatlant();
          kiirLista("csak páros:");
          mikMaradtak();
          kiiraHalmaz();
          mibolMennyi();
    }

    private static void feltolt() {
       for (int i = 0; i < 20; i++) {
            szamokLista.add(rnd.nextInt(10,21));
           
        }  
    
    }
    
    private static void kiveszParatlant(){
        for (int i = szamokLista.size()-1; i > 0; i--) {
            if(szamokLista.get(i) %2 == 1){
                szamokLista.remove(szamokLista.get(i));
            }
        }
    }

    private static void kiirLista(String uzenet) {
        System.out.println(uzenet+"\n"+szamokLista);
      
    }
    
    private static void kiiraHalmaz(){
        System.out.println("Különböző elemek:");
        for (int szam : kulonbozoek) {
            System.out.print(szam +" ");
        }  System.out.println("\n");
    }
     
    private static void mikMaradtak(){
        kulonbozoek = new HashSet<>(szamokLista);
    }
    
    private static void mibolMennyi(){
        HashMap<Integer, Integer> statisztika = new HashMap<>();
        for (int kulcs : szamokLista) {
            if (statisztika.containsKey(kulcs)) {
                int ertek= statisztika.get(kulcs);
                statisztika.put(kulcs, ++ertek);
            }else{
                //létrehozzuk a kulcsot az 1 értékkel
                statisztika.put(kulcs, 1);
            }
        }
        for ( Map.Entry<Integer, Integer>entry : statisztika.entrySet()) {
            int kulcs=entry.getKey();
            int ertek=entry.getValue();
            String s="[%d]=%d%n".formatted(kulcs, ertek);
            System.out.printf(s);
        }
        Set<Map.Entry<Integer, Integer>> entry = statisztika.entrySet();
    }
   
}
