package simple;

import java.util.ArrayList;
import java.util.List;

public class SimpleSubject implements Subject {
    private List<Observer> observerList;
    private int value=0;
    public SimpleSubject(){
        observerList=new ArrayList<Observer>();
    }
    @Override
    public void registerObserver(Observer o) {
    observerList.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
    observerList.remove(0);
    }

    @Override
    public void notifyObserver() {
        for(Observer observer:observerList){
            observer.update(value);
        }
    }

    public void setValue(int value){
        this.value=value;
        notifyObserver();
    }
}
