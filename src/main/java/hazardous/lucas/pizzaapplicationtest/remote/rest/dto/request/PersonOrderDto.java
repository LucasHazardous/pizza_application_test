package hazardous.lucas.pizzaapplicationtest.remote.rest.dto.request;

public class PersonOrderDto {
    private String name;
    private Integer floor;
    private String phone;
    private String address;

    public PersonOrderDto() {}

    public PersonOrderDto(String name, Integer floor, String phone, String address) {
        this.name = name;
        this.floor = floor;
        this.phone = phone;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getFloor() {
        return floor;
    }

    public void setFloor(Integer floor) {
        this.floor = floor;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
