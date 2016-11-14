package fr.miage.paris10.tdstate;

/**
 * Created by hajarboulhdir on 14/11/2016.
 */
public class Main {
    public static void main(String arg[]) throws MachineException {
        Client client=new Client();
        try {
            client.give(22);
        } catch (MachineException e) {
            e.printStackTrace();
        }
        client.askCoffee();
        client.give(9);
        client.askTea();
        client.askCoffee();
        client.give(2);
        client.askCoffee();
    }
}
