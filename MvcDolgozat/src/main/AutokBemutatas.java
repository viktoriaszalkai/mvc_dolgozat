package main;

import model.AutokModel;
import nezet.AutokFelugroNezet;
import vezerlo.AutokFelugroVezerlo;

public class AutokBemutatas {


    public static void main(String[] args) {
       
        AutokModel model = new AutokModel();
        AutokFelugroNezet nezet = new AutokFelugroNezet();
        AutokFelugroVezerlo vezerlo = new AutokFelugroVezerlo(model, nezet);
    }
    
}
