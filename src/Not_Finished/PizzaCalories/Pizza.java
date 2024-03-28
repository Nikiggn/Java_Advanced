package Not_Finished.PizzaCalories;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String name;
    private Dough dough;
    private List<Topping> toppings;

    public Pizza(String name, int numberOfToppings) {
        this.setName(name);

        this.setToppings(numberOfToppings);
    }

    public String getName() {
        return name;
    }

    public void addTopping(Topping topping) {

        this.toppings.add(topping);
    }

    public  double getOverallCalories(){
        double cal = this.toppings.stream().mapToDouble(Topping::calculateCalories).sum();
        return this.dough.calculateCalories() + cal;
    }


    public void setDough(Dough dough) {
        this.dough = dough;
    }

    private void setName(String name) {
        if (name.length() > 15 || name.trim().length() < 1) {
            throw new IllegalArgumentException("Pizza name should be between 1 and 15 symbols");
        }
        this.name = name;
    }

    private void setToppings(int numberOfToppings) {
        if (numberOfToppings < 0|| numberOfToppings > 10){
            throw new IllegalArgumentException("Number of topping should be in range [0..10].");
        }
        this.toppings = new ArrayList<>(numberOfToppings);
    }
}
