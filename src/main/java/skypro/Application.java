package skypro;

import java.sql.SQLException;


public class Application {
    public static void main(String[] args)throws SQLException {

        EmployeeDAO employeeDAO = new EmployeeDAOImpl();


       // employeeDAO.setEmployee(new Employee(7, "Марина", "Варонова", "W", 27, new CiTY2(7, "Россия")));

       // employeeDAO.deleteEmployee(7);


      //  employeeDAO.getEmployeeId(5);

     //  employeeDAO.ChangeEmployeebyID(new Employee(2, "Селеста", "Каришева", "Ж", 45, new CiTY2(8, "Франция")));

        employeeDAO.gerEmployee().stream().forEachOrdered(System.out::println);
    }
    }