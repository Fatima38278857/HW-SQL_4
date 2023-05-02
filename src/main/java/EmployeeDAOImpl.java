import skypro.CiTY2;
import skypro.Employee;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class EmployeeDAOImpl {
    public static void main(String[] args)throws SQLException {

        EmployeeDAO employeeDAO = new Realization();


       // employeeDAO.setEmployee(new Employee(7, "Марина", "Варонова", "W", 27, new CiTY2(7, "Россия")));

       // employeeDAO.deleteEmployee(7);


      //  employeeDAO.getEmployeeId(5);

     //  employeeDAO.ChangeEmployeebyID(new Employee(2, "Селеста", "Каришева", "Ж", 45, new CiTY2(8, "Франция")));

        employeeDAO.gerEmployee().stream().forEachOrdered(System.out::println);
    }
    }