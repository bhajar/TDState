/**
 * Created by hajarboulhdir on 14/11/2016.
 */
public class MmonnaieInf implements MState {

    private int c;

    public MmonnaieInf(int c) {
        this.c = c;
    }

    @Override
    public MState askCoffee() {
    System.out.print("Pas possible - Solde inferieur à 10! -");
        return null;
    }

    @Override
    public MState askTea() {
        System.out.print("Pas possible - Solde inferieur à 10! -");
        return null;
    }

    @Override
    public MState give(int n) {
        c += n;
        if (c < 10) {
            return new MmonnaieInf(c);
        }
        else {
            return this;
        }
    }
}
