package simple;

public class Example {
    public static void main(String[] args) {
        SimpleSubject simpleSubject=new SimpleSubject();
        SimpleOberver simpleOberver=new SimpleOberver(simpleSubject);
        simpleSubject.setValue(80);
        simpleSubject.setValue(90);
        simpleSubject.setValue(70);
        simpleSubject.registerObserver(simpleOberver);

    }
}
