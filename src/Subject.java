
public interface Subject {

    /**
     * Method to register an observer object
     *
     * @param observer
     */
    void register(Observer observer);

    /**
     * Method to unregister an observer object
     *
     * @param observer
     */
    void unregister(Observer observer);

    /**
     * Method to get the state of the subject
     * @return
     */
    int getState();

    /**
     * Method to set the state of the subject
     * @param state
     */
    void setState(int state);

    /**
     * Method to notify observers of a change
     */
    void notifyObservers();
}
