
package teszt;

import modell.MindentTudoGep;


public class tesztMindentudoGep {
    public static void main(String[] args) {
        new tesztMindentudoGep().tesztesetek();
    }

    private void tesztesetek() {
        tesztSzevenyGeneralas();
        tesztIntervallum();
    }

    private void tesztSzevenyGeneralas() {
        MindentTudoGep gep = new MindentTudoGep();
        String szelveny = gep.getSzelvenySzoveg();
        System.out.println("teszt: nem üres a szelvény");
        assert szelveny.isBlank(): "üres a szelvény";
        
        System.out.println("teszt: öt számot tartalmaz");
        gep = new MindentTudoGep();
        szelveny = gep.getSzelvenySzoveg();
        String[] sz = szelveny.split(",");
        assert sz.length == 5: "nem tartalmaz 5 számot";
        
        System.out.println("teszt:számjegyek az elemei");
        gep = new MindentTudoGep();
        szelveny = gep.getSzelvenySzoveg();
        sz = szelveny.split(",");
        
        for (String szoveg : sz){
            for (int i = 0; i < szoveg.length(); i++) {
                char c = szoveg.charAt(i);
                assert Character.isDigit(c): "nem csak számjegy";
            }
            
        }
        
    }

    private void tesztIntervallum() {
        System.out.println("teszt: a számok 1 és 90 között vannak");
        MindentTudoGep gep = new MindentTudoGep();
        String szelveny = gep.getSzelvenySzoveg();
        String[] sz = szelveny.split(",");
        for (String s : sz){
            int szam = Integer.parseInt(s);
            boolean jo = szam >= 1 && szam <=90;
            assert jo : "hibás intervallum";
            
    }
    }
    
}
