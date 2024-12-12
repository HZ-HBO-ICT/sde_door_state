public class DoorOpen extends DoorStates {

    public void open() {
        // nothing will happen. one cannot open an open door.
    }

    public void close() {
        DoorClosed newState = new DoorClosed();
        setState(newState);
    }



    public void setHalfway() {
        DoorHalfway newState = new DoorHalfway();
        setState(newState);
    }
}
