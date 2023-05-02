import skypro.CiTY2;
import skypro.Employee;
import java.sql.SQLException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public  class Realization implements EmployeeDAO {


    public Employee setEmployee(Employee employee) throws SQLException{ // СОЗДАТЬ (добавление) сущности Employee в таблицу.


        try (final Connection connection = DataConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO employee(id, first_nama, last_name, gender, age) VALUES((?),(?),(?),(?),(?))")) {


            preparedStatement.setInt(1, employee.getId());
            preparedStatement.setString(2, employee.getFirst_nama());
            preparedStatement.setString(3, employee.getLast_name());
            preparedStatement.setString(4, employee.getGender());
            preparedStatement.setInt(5, employee.getAge());
            //preparedStatement.setString(6, employee.getCiTY2().getCity_name());
            preparedStatement.execute();


        } catch (SQLException e) {
            e.printStackTrace();
        }

        return employee;
    }

    @Override
    public Employee getEmployeeId(int id) { // Получить обьекты по ID
        Employee employee = null;
        try {Connection connection = DataConnection.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM employee  WHERE id = (?)");

            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
           while (resultSet.next()) {

               String first_nama = resultSet.getString("first_nama");
               String last_name = resultSet.getString("last_name");
               String gender = resultSet.getString("gender");
               int age = resultSet.getInt("age");
               int city_id = resultSet.getInt("city_id");
             //  String city_name = resultSet.getString("city_name");

           }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return employee;
    }

    @Override
    public List<Employee> gerEmployee() throws SQLException { // Получить все обьекты
        List<Employee> employees = new ArrayList<>();
        try (Connection connection = DataConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM employee LEFT JOIN city  ON city.city_id = employee.city_id ORDER BY id")) {
            ResultSet resultSet1 = preparedStatement.executeQuery();
            while (resultSet1.next()) {

                int id = resultSet1.getInt("id");
                String first_nama = resultSet1.getString("first_nama");
                String last_name = resultSet1.getString("last_name");
                String gender = resultSet1.getString("gender");
                int age = resultSet1.getInt("age");
                int city_id = resultSet1.getInt("city_id");
                String city_name = resultSet1.getString("city_name");

                employees.add(new Employee(id, first_nama, last_name, gender, age, new CiTY2(city_id, city_name)));
            }

            }catch (SQLException e) {
            e.printStackTrace();
        }
        return employees;
        }

    @Override
    public void ChangeEmployeebyID(Employee employee) { // Изменение конкретного объекта Employee в базе по id
        try (Connection connection = DataConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement("UPDATE employee SET first_nama = (?), last_name = (?), age = (?), city_id = (?) WHERE id = (?))")) {

            preparedStatement.setString(1, employee.getFirst_nama());
            preparedStatement.setString(2, employee.getLast_name());
            preparedStatement.setInt(3, employee.getAge());
            preparedStatement.setInt(4, employee.getCity_id());
            preparedStatement.setInt(5, employee.getId());

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

        @Override
    public void deleteEmployee(int id) { // Удаление конкретного объекта Employee из базы по id.
           try {
               Connection connection = DataConnection.getConnection();
               PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM employee WHERE id = (?)");

                   preparedStatement.setInt(1, id);
                  preparedStatement.executeUpdate();


           }catch (SQLException e){
                e.printStackTrace();
           }
    }
}


