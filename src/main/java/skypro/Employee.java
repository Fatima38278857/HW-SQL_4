package skypro;

public class Employee {

    private final int id;
    private final String first_nama;
    private String last_name;
    private String gender;
    private int age;
    private int city_id;
    private Citytwo ciTY2;

    public Employee(int id, String first_nama, String last_name, String gender, int age, Citytwo ciTY2) {
        this.id = id;
        this.first_nama = first_nama;
        this.last_name = last_name;
        this.gender = gender;
        this.age = age;
        this.city_id = city_id;
        this.ciTY2 = ciTY2;
    }

    public int getId() {
        return id;
    }

    public String getFirst_nama() {
        return first_nama;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCity_id() {
        return city_id;
    }

    public void setCity_id(int city_id) {
        this.city_id = city_id;
    }

    public Citytwo getCiTY2() {
        return ciTY2;
    }

    public void setCiTY2(Citytwo ciTY2) {
        this.ciTY2 = ciTY2;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "ID Сотрудкика=" + id +
                ", Имя ='" + first_nama + '\'' +
                ", Фамилия ='" + last_name + '\'' +
                ", Пол='" + gender + '\'' +
                ", Возрост =" + age +
                ", ID Города =" + city_id +
                ", ciTY2 =" + ciTY2 +
                '}';
    }

}
