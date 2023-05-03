package skypro;

public class Citytwo {

    private  int city_id;
    private  String city_name;

    public Citytwo(int city_id, String city_name) {
        this.city_id = city_id;
        this.city_name = city_name;
    }

    public int getCity_id() {
        return city_id;
    }

    public void setCity_id(int city_id) {
        this.city_id = city_id;
    }

    public String getCity_name() {
        return city_name;
    }

    public void setCity_name(String city_name) {
        this.city_name = city_name;
    }

    @Override
    public String toString() {
        return "CiTY2{" +
                "ID Города =" + city_id +
                ", Название города ='" + city_name + '\'' +
                '}';
    }
}