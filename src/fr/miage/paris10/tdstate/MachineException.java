package fr.miage.paris10.tdstate;

/**
 * Created by hajarboulhdir on 14/11/2016.
 */
public class MachineException extends Exception {
    public MachineException(String message) {
        super(message);
    }

    public MachineException() {
        System.out.println("C'est pas possible!");
    }
}
