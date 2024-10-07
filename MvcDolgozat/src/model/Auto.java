package model;

public class Auto {
    private String rendszam, szin, extra;

    public Auto(String rendszam, String szin) {
       this(rendszam,szin," - ");
    }
    
    public Auto(String rendszam, String szin, String extra) {
        this.rendszam = rendszam;
        this.szin = szin;
        this.extra = extra;
    }

    public void setSzin(String szin) {
        this.szin = szin;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }
    
    public String getRendszam() {
        return rendszam;
    }

    public String getSzin() {
        return szin;
    }

    public String getExtra() {
        return extra;
    }

    
    
     
}
