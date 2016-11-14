/**
 * Created by hajarboulhdir on 14/11/2016.
 */
public interface MState {
    MState askCoffee();
    MState askTea();
    MState give(int n);
}
