package fr.miage.paris10.tdstate;

/**
 * Created by hajarboulhdir on 14/11/2016.
 */
public class MmonnaieSup implements MState {
    int c;

    public MmonnaieSup(int c) {
        super();
        this.c = c;
    }

    @Override
    public MState askCoffee(){
        System.out.println("Caffee OK!");
        return new MmonnaieInf(0);
    }

    @Override
    public MState askTea() {
        System.out.println("Tea OK!");
        return new MmonnaieInf(0);
    }

    @Override
    public MState give(int n) {
        c+=n;
        if (c>10){return new MmonnaieSup(c);}
        else {return new MmonnaieInf(c);}


    }

}
