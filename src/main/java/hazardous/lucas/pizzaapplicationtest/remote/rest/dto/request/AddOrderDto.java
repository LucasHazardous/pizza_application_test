package hazardous.lucas.pizzaapplicationtest.remote.rest.dto.request;

import java.util.List;

public class AddOrderDto {
    private PersonOrderDto person;
    private List<PizzaOrderDto> pizzas;

    public AddOrderDto() {}

    public AddOrderDto(PersonOrderDto person, List<PizzaOrderDto> pizzas) {
        this.person = person;
        this.pizzas = pizzas;
    }

    public PersonOrderDto getPerson() {
        return person;
    }

    public void setPerson(PersonOrderDto person) {
        this.person = person;
    }

    public List<PizzaOrderDto> getPizzas() {
        return pizzas;
    }

    public void setPizzas(List<PizzaOrderDto> pizzas) {
        this.pizzas = pizzas;
    }
}
