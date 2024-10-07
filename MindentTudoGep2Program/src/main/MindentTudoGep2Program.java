
package main;

import modell.MindentTudoGep;


public class MindentTudoGep2Program {

    
    public static void main(String[] args) {
        new MindentTudoGep2Program().szelvenyBemutato();
    }

    private void szelvenyBemutato() {
        MindentTudoGep gep = new MindentTudoGep();
        //hibás, ha ezt nem hívjuk
        //gep.booleSzelvenytGeneral();
        System.out.println("1. (boole) szelvény:");
        boolean[] szelvenyBoole = gep.getSzelvenyBoole();
        booleSzelvenyMutat(szelvenyBoole);
        
        //gep.booleSzelvenytGeneral();
//        System.out.println("2. (boole) szelvény:");
//        szelvenyBoole = gep.getSzelvenyBoole();
//        booleSzelvenyMutat(szelvenyBoole);
        
        System.out.println("2. (int) szelvény:");
        int[] szelvenyInt = gep.getSzelvenyInt();
        intSzelvenytMutat(szelvenyInt);
        
        
        System.out.println("3. (int v boole?) szelvény:");
        String szelveny= gep.getSzelvenySzoveg();
        System.out.println(szelveny);
        
        System.out.println("5.(típusa?) szelvény:");
        szelveny = gep.getSzelvenySzoveg();
        System.out.println(szelveny);
        
        System.out.println("6.(típusa?) szelvény:");
        gep.szelvenytGeneral();
        szelveny = gep.getSzelvenySzoveg();
        System.out.println(szelveny);
    }
    
    //problémák: getter referenciát ad -> setter 
    //
    //ne adjuk vissza referenciát!!!!!!!!!!!!!

    private void booleSzelvenyMutat(boolean[] szelveny) {
        for (int i = 0; i < szelveny.length; i++) {
            if(szelveny[i]){
                System.out.print(i +" ");
            }
        }
        System.out.println("");
    }
    
    private void intSzelvenytMutat(int[] szelveny){
         for (int i = 0; i < szelveny.length; i++) {
                System.out.print(szelveny [i] +" ");
        }
        System.out.println("");
    }
    
}
