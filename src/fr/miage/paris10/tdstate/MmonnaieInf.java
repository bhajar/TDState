package fr.miage.paris10.tdstate;

/**
 * Created by hajarboulhdir on 14/11/2016.
 */
public class MmonnaieInf implements MState {

    private int c;

    public MmonnaieInf(int c) {
        this.c = c;
    }

    @Override
    public MState askCoffee() throws MachineException{
    try {
        throw new MachineException("Pas possible\n");
    }catch (MachineException e){
        System.out.print("Pas possible - Solde inferieur à 10! -\n");
        return this;
    }
    }

    @Override
    public MState askTea() {
        try {
            throw new MachineException("Pas possible");
        } catch (MachineException e) {
            System.out.println("Pas possible Solde inferieur à 10!\n");
            return this;
        }
    }

    @Override
    public MState give(int n) {
        c += n;
        if (c>10) return (MmonnaieSup) new MmonnaieSup(c);
        else return (MmonnaieInf) new MmonnaieInf(c);
    }
    }
