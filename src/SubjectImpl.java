import java.util.ArrayList;
import java.util.List;

public class SubjectImpl implements Subject {

    private List<Observer> observerList = new ArrayList<>();
    private int state;

    @Override
    public void register(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void unregister(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public int getState() {
        return state;
    }

    @Override
    public void setState(int state) {
        this.state = state;
        notifyObservers();
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observerList) {
            observer.update();
        }
    }

    @Override
    public String toString() {
        return "SubjectImpl{" +
                "state=" + state +
                '}';
    }
}
