public class Main {

    public static void main(String[] args) {

        System.out.println("Starting game: OPEN THE DOOR!");
        Assets assets = new Assets();
        System.out.print(assets.getIllustration());

        // game setup
        DoorOpen openDoor = new DoorOpen();
        DoorFrame door = new DoorFrame(openDoor);

        openDoor.setContext(door);

        // our hero will open and close the door a few times.
        door.setHalfway();
        door.openDoor();
        door.setHalfway();
        door.closeDoor();
        door.openDoor();
        door.setHalfway();
    }
}