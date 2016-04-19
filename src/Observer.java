
public interface Observer {

    /**
     * Method to update the observer
     */
    void update();

    /**
     * Attach with subject to observer
     * @param subject
     */
    void setSubject(Subject subject);
}
