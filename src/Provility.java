import java.util.ArrayList;
import java.util.List;

public class Provility {
    private List<Room> rooms;

    public Provility() {
        rooms = new ArrayList<>();
    }

    public void addRoom(Room room) {
        if (!rooms.contains(room)) {
            rooms.add(room);
        }
    }

    public void assignEmployeeToRoom(Employee employee, Room room) {
        addRoom(room); // Ensure the room is added to the list of rooms
        room.addEmployee(employee); // Add the employee to the room
    }

    public void printEmployeeAndRoomInfo() {
        System.out.println("Employee and Room Information:");
        System.out.println("Rooms:");

        for (Room room : rooms) {
            System.out.println("- Side Name: " + room.getSideName());
            System.out.println("  Employees in this room:");
            List<Employee> employees = room.getEmployees();
            for (int j = 0; j < employees.size(); j++) {
                Employee employee = employees.get(j);
                System.out.println("  " + (j + 1) + " " + employee.getName());
            }
        }
    }
}
