
public class ObserverImpl implements Observer {

    private Subject subject;
    private String observerName;

    public ObserverImpl(String observerName) {
        this.observerName = observerName;
    }

    @Override
    public void update() {
        System.out.println("Update method invoked for " + observerName + " from change on subject " + subject);
    }

    @Override
    public void setSubject(Subject subject) {
        this.subject = subject;
        this.subject.register(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ObserverImpl)) return false;

        ObserverImpl observer = (ObserverImpl) o;

        if (subject != null ? !subject.equals(observer.subject) : observer.subject != null) return false;
        return observerName != null ? observerName.equals(observer.observerName) : observer.observerName == null;
    }

    @Override
    public int hashCode() {
        int result = subject != null ? subject.hashCode() : 0;
        result = 31 * result + (observerName != null ? observerName.hashCode() : 0);
        return result;
    }
}
