import skypro.Employee;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAOImpl {
    public static void main(String[] args) {
   /* @Override
    public List<Employee> getAllEmployee() {
        List<Employee> employees = new ArrayList<>();
*/
        final String user = "postgres";
        final String password = "RAMADAN38278857";
        final String url = "jdbc:postgresql://localhost:5432/skypro2";


        try (final Connection connection =
                     DriverManager.getConnection(url, user, password);
             PreparedStatement statement =
                     connection.prepareStatement("SELECT * FROM employee JOIN CITY ON CITY.city_id = employee.city_id WHERE id = 2;")) {


            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                System.out.println("ID сотрудника: " + id);
                String first_nama = resultSet.getString("first_nama");
                String last_name = resultSet.getString("last_name");
                String gender = resultSet.getString("gender");
                int age = resultSet.getInt("age");
                int city_id = resultSet.getInt("city_id");

                System.out.println("Имя: " + first_nama);
                System.out.println("Фамилия : " + last_name);
                System.out.println("Пол: " + gender);
                System.out.println("Возрост" + age);
                System.out.println("Страна" + city_id);


            }
        } catch (SQLException e) {
            System.out.println("Ошибка при подключении к базе данных!");
            e.printStackTrace();
        }
      //  return employees;
    }
}
