public class DoorHalfway extends DoorStates {

    public void open() {
        DoorOpen newState = new DoorOpen();
        setState(newState);
    }


    public void close() {
        DoorClosed newState = new DoorClosed();
        setState(newState);
    }

    public void setHalfway() {
        // nothing will happen
    }
}
