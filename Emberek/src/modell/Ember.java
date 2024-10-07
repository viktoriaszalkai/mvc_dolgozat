
package modell;


public class Ember {

    private final String nev;
    private final String cim;

    public Ember(String nev, String cim) {
        this.nev = nev;
        this.cim = cim;
    }

    public Ember(String sor) {
         String[] s = sor.split(";");
            this.nev = s[0];
            this.cim = s[1];
    }
    
        
    
    public String getNev() {
        return nev;
    }

    public String getCim() {
        return cim;
    }

    @Override
    public String toString() {
        return "Ember{" + "nev=" + nev + ", cim=" + cim + '}';
    }

    
    
    
    
}
