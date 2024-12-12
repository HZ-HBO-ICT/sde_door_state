public class DoorFrame {

    private DoorStates _currentDoorState;

    public DoorFrame(DoorStates initialState) {
        this._currentDoorState = initialState;
    }

    public void changeState(DoorStates newState) {
        this._currentDoorState = newState;
    }

    public void closeDoor() {
        this._currentDoorState.close();
    }

    public void openDoor() {
        this._currentDoorState.open();
    }

    public void setHalfway() {
        this._currentDoorState.setHalfway();
    }
}
