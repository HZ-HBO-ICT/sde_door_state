public abstract class DoorStates {

    protected DoorFrame _frame;

    protected void setContext(DoorFrame frame) {
        this._frame = frame;
    }

    protected void setState(DoorStates newState) {
        newState.setContext(this._frame);
        this._frame.changeState(newState);

        log(newState);
    }

    private void log(DoorStates newState) {
        System.out.println("Door is in state: " + newState.toString());
    }

    public abstract void open();

    public abstract void close();

    public abstract void setHalfway();
}
