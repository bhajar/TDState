package fr.miage.paris10.tdstate;

/**
 * Created by hajarboulhdir on 14/11/2016.
 */
public interface MState {
    MState askCoffee() throws MachineException;
    MState askTea() throws MachineException;
    MState give(int n) throws MachineException;
}
