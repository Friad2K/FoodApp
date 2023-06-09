import java.util.ArrayList;
import java.util.List;

public class SandwichMaker implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private Sandwich sandwich;

    public void makeSandwich(SandwichBuilder builder) {
        sandwich = builder.build();
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(sandwich);
        }
    }
}
