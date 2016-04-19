public class Main {

    public static void main(String[] args) {
        Subject subject = new SubjectImpl();
        subject.setState(0);

        Observer observer1 = new ObserverImpl("observer1");
        observer1.setSubject(subject);

        Observer observer2 = new ObserverImpl("observer2");
        observer2.setSubject(subject);

        Observer observer3 = new ObserverImpl("observer3");
        observer3.setSubject(subject);

        System.out.println("Changing state to 1...");
        subject.setState(1);

        System.out.println();

        System.out.println("Changing state to 2...");
        subject.setState(2);

        System.out.println();

        System.out.println("Changing state to 3...");
        subject.setState(3);
    }
}
