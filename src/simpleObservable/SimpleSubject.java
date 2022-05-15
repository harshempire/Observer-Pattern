package simpleObservable;

import java.util.Observable;


// this is a subject and needed to be observed that's why it implements Observable interface
// Observable is inbuilt java interface but you can create for you also
public class SimpleSubject extends Observable {
    private int value=0;
    public SimpleSubject(){}
    public void setValue(int value){
        this.value=value;
        setChanged();
        notifyObservers(value);
    }
    public int getValue(){
        return this.value;
    }
}
