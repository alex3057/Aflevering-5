import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // 3.g
        Room r1 = new Room(2, 3);
        Room r2 = new Room(1, 1);
        Room r3 = new Room(4, 2);

        // 3.h
        ArrayList<Room> rooms = new ArrayList<>();
        rooms.add(r1);
        rooms.add(r2);
        rooms.add(r3);

        // 3.i
        Building building = new Building(rooms, 2);

        // 3.j
        System.out.println("Lamps: " + countLampsInBuilding(building));
        System.out.println("Windows: " + countWindowsInBuilding(building));
        System.out.println("Rooms: " + countRoomsInBuilding(building));

        // 3.k
        System.out.println("Is normal: " + isNormal(building));
    }

    public static int countLampsInBuilding(Building building) {
        int total = 0;
        for (Room r : building.getRooms()) {
            total += r.getNumberOfLamps();
        }
        return total;
    }

    public static int countWindowsInBuilding(Building building) {
        int total = 0;
        for (Room r : building.getRooms()) {
            total += r.getNumberOfWindows();
        }
        return total;
    }

    public static int countRoomsInBuilding(Building building) {
        return building.getRooms().size();
    }

    public static boolean isNormal(Building building) {
        return building.getNumberOfFloors() <= building.getRooms().size();
    }
}

class Room {
    private int numberOfLamps;
    private int numberOfWindows;

    // 3.b
    public Room(int numberOfLamps, int numberOfWindows) {
        this.numberOfLamps = numberOfLamps;
        this.numberOfWindows = numberOfWindows;
    }

    // 3.c
    public int getNumberOfLamps() {
        return numberOfLamps;
    }

    public void setNumberOfLamps(int numberOfLamps) {
        this.numberOfLamps = numberOfLamps;
    }

    public int getNumberOfWindows() {
        return numberOfWindows;
    }

    public void setNumberOfWindows(int numberOfWindows) {
        this.numberOfWindows = numberOfWindows;
    }
}

class Building {
    private ArrayList<Room> rooms;
    private int numberOfFloors;

    // 3.e
    public Building(ArrayList<Room> rooms, int numberOfFloors) {
        this.rooms = rooms;
        this.numberOfFloors = numberOfFloors;
    }

    // 3.f
    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public void setRooms(ArrayList<Room> rooms) {
        this.rooms = rooms;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }
}
