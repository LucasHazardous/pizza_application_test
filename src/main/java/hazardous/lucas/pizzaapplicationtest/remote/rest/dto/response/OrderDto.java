package hazardous.lucas.pizzaapplicationtest.remote.rest.dto.response;

import hazardous.lucas.pizzaapplicationtest.domain.model.OrderStatusType;
import hazardous.lucas.pizzaapplicationtest.remote.rest.dto.request.PersonOrderDto;
import hazardous.lucas.pizzaapplicationtest.remote.rest.dto.request.PizzaOrderDto;

import java.util.List;

public class OrderDto {
    private Integer id;
    private PersonOrderDto person;
    private OrderStatusType status;
    private List<PizzaOrderDto> pizzas;

    public OrderDto() {}

    public OrderDto(Integer id, PersonOrderDto person, OrderStatusType status, List<PizzaOrderDto> pizzas) {
        this.id = id;
        this.person = person;
        this.status = status;
        this.pizzas = pizzas;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public PersonOrderDto getPerson() {
        return person;
    }

    public void setPerson(PersonOrderDto person) {
        this.person = person;
    }

    public OrderStatusType getStatus() {
        return status;
    }

    public void setStatus(OrderStatusType status) {
        this.status = status;
    }

    public List<PizzaOrderDto> getPizzas() {
        return pizzas;
    }

    public void setPizzas(List<PizzaOrderDto> pizzas) {
        this.pizzas = pizzas;
    }
}
