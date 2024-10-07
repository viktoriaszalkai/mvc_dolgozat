
package model;

public class AutokModel {
    private Auto[] autok;

    public AutokModel() {
        autok = new Auto[3];
        autok[0] = new Auto("ABC123", "piros");
        autok[1] = new Auto("BCD234", "fehér","bőrülés");
        autok[2] = new Auto("CDE345", "fekete");
    
        autok[2].setSzin("narancssárga");
        autok[2].setExtra("légkondi");
        
    }
    
    public String bemutatas(){
        String txt  = "Az autók a kövezkezők:\n";
        int i = 1;
           for(Auto auto:autok){
               String rendsz = auto.getRendszam();
               String szin = auto.getSzin();
               String extra = auto.getExtra();
               txt += i++ + ". autó: \n"+"rendszáma: "+rendsz+", színe: "+szin+", extra: "+extra+"\n";
           }  
        return txt;
        
    }
      
}
