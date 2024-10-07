package vezerlo;

import model.AutokModel;
import nezet.AutokFelugroNezet;

public class AutokFelugroVezerlo {
    private final AutokModel model;
    private final AutokFelugroNezet nezet;

    public AutokFelugroVezerlo(AutokModel model, AutokFelugroNezet nezet) {
        this.model = model;
        this.nezet = nezet;
        start();
    }
    
     public final void start() {
       nezet.megjelenit(model.bemutatas());

    }
}
