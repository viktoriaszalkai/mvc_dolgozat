
package modell;


public class MindentTudoGep {
    
    private final int[] lottoSzelveny = new int[5];
    private String totoSzelveny = " ";
    private String[] dalok;
     
    public MindentTudoGep(){
       this(new String[0]); 
    }
      
    public MindentTudoGep(String dal){
        this(new String[]{dal});
    }
    
    public MindentTudoGep(String[] dalok) {
        this.ujraindit();
        if(! (dalok == null || dalok. length == 0 || dalok[0].isBlank()) ){
            dalokatFelvesz(dalok);
        }
    }

    public void ujraindit(){
        this.setLottoSzelveny();
        this.setTotoSzelveny();
        this.dallalFeltolt();
    }
    
    private void dallalFeltolt() {
        this.dalok = new String[3];
        dalok[0] = "lalala";
        dalok[1] = "lalala2";
        dalok[2] = "lalala3";
    }
        
    public void setLottoSzelveny( ) {
        
        int db = 0;
        while (db < 5) {            
           int r = (int) (Math.random()*90)+1;
           if(!benneVan(r,db)){
               lottoSzelveny[db] = r;
               db++;
           }
        }
    }
    
    private boolean benneVan(int r,int db ) {
        int i = 0;
        while (i< db && !(lottoSzelveny[i] == r)) {            
            i++;
        }
        return i < db;
    }

        
    public void setTotoSzelveny() {
       
        String[] lehetosegek = new String[3];
        lehetosegek[0] = "X";
        lehetosegek[1] = "1";
        lehetosegek[2] = "2";
 
        for (int i = 1; i < 14; i++) {
            totoSzelveny+=i+"\s";
        }
        totoSzelveny+="13+1\n\s";
        for (int i = 0; i < 10; i++) {
            totoSzelveny+=lehetosegek[((int)(Math.random() * 3))]+"\s";
        }
        for (int i = 11; i < 15; i++) {
            totoSzelveny+="\s"+lehetosegek[((int)(Math.random() * 3))]+"\s";
        }
    
    }


    public String getLottoSzelveny() {
        String lottoSzelvenyS= " ";
        for (int i = 0; i < 5; i++) {
            lottoSzelvenyS+= lottoSzelveny[i] + " ";
        }
        return lottoSzelvenyS;
    }

    public String getTotoSzelveny() {
        return totoSzelveny;
    }

    private void dalokatFelvesz(String[] dalok) {
       
    }

    public String getDalok() {
        return dalok[(int) (Math.random() * 3)];
    }

    
   
    

   
    
   
   
    
}
