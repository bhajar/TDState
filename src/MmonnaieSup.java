/**
 * Created by hajarboulhdir on 14/11/2016.
 */
public class MmonnaieSup implements MState {
    int c;

    public MmonnaieSup(int c) {
        this.c = c;
    }

    @Override
    public MState askCoffee() {
        System.out.print("OK! - Solde superieur à 10! -");
        return null;
    }

    @Override
    public MState askTea() {

        System.out.print("OK! - Solde superieur à 10! -");
        return null;
    }

    @Override
    public MState give(int n) {
        c += n;
        if (c < 10)
            return(MmonnaieSup) new MmonnaieSup(c);
        else
            return (MmonnaieInf) new MmonnaieInf(c);

    }

}
