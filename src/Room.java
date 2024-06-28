import java.util.ArrayList;
import java.util.List;

public class Room {
   private String sideName;
   private List<Employee> employees;

   public Room(String sideName) {
      this.sideName = sideName;
      this.employees = new ArrayList<>();
   }

   public String getSideName() {
      return sideName;
   }

   public List<Employee> getEmployees() {
      return employees;
   }

   public void addEmployee(Employee employee) {
      if (!employees.contains(employee)) {
         employees.add(employee);
      }
   }
}
