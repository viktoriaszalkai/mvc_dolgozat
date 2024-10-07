
package modell;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;


public class MindentTudoGep {
    private boolean[] szelvenyBoole;
    private int[] szelvenyInt;
    private ArrayList<Integer> szelvenyLista;
    private HashSet<Integer> szelvenyHalmazRendezetlen;
    private TreeSet<Integer> szelvenyHalmazRendezett;

    public MindentTudoGep() {
        szelvenyBoole = new boolean[91]; //1..90
        booleSzelvenytGeneral();
       
        szelvenyInt = new int[5];
        intSzelvenytGeneral();
        
        szelvenyLista = new ArrayList<>();
        //szelvenytGeneral();
        
        szelvenyHalmazRendezetlen = new HashSet<>();
        szelvenytGeneral();
        
        szelvenyHalmazRendezett = new TreeSet<>();
        szelvenytGeneral();
        
        
        
    }
    
    public void szelvenytGeneral(){
//        szelvenyLista.clear();
//        while(szelvenyLista.size()<5){
//            int v = (int)(Math.random()*90)+1;
//            if(!szelvenyLista.contains(v)){
//                szelvenyLista.add(v);
//            }
//        }
        while (szelvenyHalmazRendezetlen.size()<5){
            int v = (int)(Math.random()*90)+1;
            
        }
    }
    
    public void booleSzelvenytGeneral(){
        Arrays.fill(szelvenyBoole, false);
        int db = 0;
        while(db<5){
            int v = (int)(Math.random()*90)+1;
            if(!szelvenyBoole[v]){
                szelvenyBoole [v] = true;
                db++;
            }
        }
        Collections.sort(szelvenyLista);
    }

    public boolean[] getSzelvenyBoole() {
        return szelvenyBoole;
    }

    private void intSzelvenytGeneral() {
        int db = 0;
        while(db<5){
            int v = (int)(Math.random()*90)+1;
            if (!benneVan(v,db)){
                szelvenyInt[db++] = v;
            }
        }
        Arrays.sort(szelvenyInt);
    }
        private boolean benneVan(int v,int db ) {
        int i = 0;
        while (i< db && !(szelvenyInt[i] == v)) {            
            i++;
        }
        return i < db;
    }

    public int[] getSzelvenyInt() {
        int[] ujTomb = Arrays.copyOf(szelvenyInt, szelvenyInt.length);
        return ujTomb;
    }

    public String getSzelvenySzoveg() {
        String txt = Arrays.toString(szelvenyInt);
        return txt;
          
    }
    
    public List<Integer> getSzelvenyLista(){
        return Collections.unmodifiableList(szelvenyLista);
    }
           
}

