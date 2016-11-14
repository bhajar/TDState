/**
 * Created by hajarboulhdir on 14/11/2016.
 */
public class Client {
    private MState state;

    public Client(MState state) {
        this.state = state;
    }

    public void give(int n){
        state.give(n);
    }
    public void askCoffee(){
        state.askCoffee();
    }
    public void askTea(){
        state.askTea();
    }
}
