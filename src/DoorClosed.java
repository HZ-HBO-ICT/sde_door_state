public class DoorClosed extends DoorStates {

    public void open () {
        DoorOpen newState = new DoorOpen();
        setState(newState);
    }

    public void close() {
        // noting will happen, one cannot close a closed door
    }

    public void setHalfway() {
        DoorHalfway newState = new DoorHalfway();
        setState(newState);
    }
}
