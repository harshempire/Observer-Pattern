package simple;

public class SimpleOberver implements Observer{
    private int value;

    // every observer has a subject
    private Subject subject;

    public SimpleOberver(Subject subject){
        this.subject=subject;
        subject.registerObserver(this);
    }


    @Override
    public void update(int value) {
        this.value=value;
        display();
    }
    public void display(){
        System.out.println("Value "+value);
    }
}
