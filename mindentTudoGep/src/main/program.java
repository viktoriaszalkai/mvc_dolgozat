
package main;

import modell.MindentTudoGep;

public class program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       MindentTudoGep m1 = new MindentTudoGep();
       System.out.println("Totó szelvény: \n" + m1.getTotoSzelveny());
       System.out.println("Lottó szelvény: \n" + m1.getLottoSzelveny());
       System.out.println("Dal: \n "+m1.getDalok());
    }
    
}
