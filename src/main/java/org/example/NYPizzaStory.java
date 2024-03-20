package org.example;

public class NYPizzaStory extends PizzaStore{
    @Override
    Pizza createPizza(String item) {
        if (item.equals("cheese")){
            return new NYStyleCheesePizza();
        }else if (item.equals("veggie")){
            return new NYStyleVeggiePizza();
        }else if (item.equals("pepperoni")){
            return new NYStylePepperoniPizza();
        }else return null;
    }
}