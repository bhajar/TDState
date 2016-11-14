package fr.miage.paris10.tdstate;

/**
 * Created by hajarboulhdir on 14/11/2016.
 */
public class Client {
    private MState state;

    public Client() {
        this.state =  new MmonnaieInf(0);
    }

    public void give(int n) throws MachineException {
        state=state.give(n);
    }
    public void askCoffee() throws MachineException {
        try {
            state=state.askCoffee();
        } catch (MachineException e) {
            e.printStackTrace();
        }
    }
    public void askTea() throws MachineException {
        try {
            state=state.askTea();
        } catch (MachineException e) {
            e.printStackTrace();
        }
    }
}
