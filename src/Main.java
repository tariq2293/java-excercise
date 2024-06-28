public class Main {
    public static void main(String[] args) {
        Provility provility = new Provility();
        Room room1 = new Room("East side");
        Room room2 = new Room("West side");

        provility.assignEmployeeToRoom(new Employee("tariq"), room1);
        provility.assignEmployeeToRoom(new Employee("fariz"), room1);
        provility.assignEmployeeToRoom(new Employee("refai"), room1);
        provility.assignEmployeeToRoom(new Employee("celina"), room1);
        provility.assignEmployeeToRoom(new Employee("sangavi"), room2);
        provility.assignEmployeeToRoom(new Employee("ithiris"), room1);
        provility.assignEmployeeToRoom(new Employee("karan"), room1);
        provility.assignEmployeeToRoom(new Employee("sasikala"), room1);
        provility.assignEmployeeToRoom(new Employee("roshan"), room1);
        provility.assignEmployeeToRoom(new Employee("nasreen"), room1);
        provility.assignEmployeeToRoom(new Employee("sheerin"), room1);
        provility.assignEmployeeToRoom(new Employee("pavithran"), room2);
        provility.assignEmployeeToRoom(new Employee("andrew"), room1);
        provility.assignEmployeeToRoom(new Employee("rasikhan"), room2);
        provility.assignEmployeeToRoom(new Employee("vignesh"), room2);
        provility.assignEmployeeToRoom(new Employee("priyanka"), room2);
        provility.assignEmployeeToRoom(new Employee("vinoth"), room1);
        provility.assignEmployeeToRoom(new Employee("ganesh"), room1);
        provility.assignEmployeeToRoom(new Employee("wadood"), room1);
        provility.assignEmployeeToRoom(new Employee("vinothini"), room1);
        provility.assignEmployeeToRoom(new Employee("vijai"), room1);
        provility.assignEmployeeToRoom(new Employee("kishore"), room1);
        provility.assignEmployeeToRoom(new Employee("sowmiya"), room2);
        provility.assignEmployeeToRoom(new Employee("malathi"), room2);
        provility.assignEmployeeToRoom(new Employee("saravanan"), room2);
        provility.assignEmployeeToRoom(new Employee("elvin"), room1);
        provility.assignEmployeeToRoom(new Employee("reshma"), room1);
        provility.assignEmployeeToRoom(new Employee("shanmugapriya"), room2);
        provility.assignEmployeeToRoom(new Employee("ganesh(eform)"), room1);
        provility.assignEmployeeToRoom(new Employee("kelvin"), room1);

        provility.printEmployeeAndRoomInfo();
    }
}
