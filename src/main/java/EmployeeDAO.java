import skypro.Employee;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public interface EmployeeDAO {

    Employee setEmployee(Employee employee) throws SQLException; // Создание (добавление) сущности Employee в таблицу.
    Employee getEmployeeId(int id); // Получение конкретного объекта Employee по id.

    public List<Employee> gerEmployee() throws SQLException; // Получение списка всех объектов Employee из базы.

    void ChangeEmployeebyID(Employee employee); // Изменение конкретного объекта Employee в базе по id.

    void deleteEmployee(int id); // Удаление конкретного объекта Employee из базы по id.


}

