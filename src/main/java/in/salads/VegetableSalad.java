package in.salads;

import in.ingredients.Cucumber;
import in.ingredients.Onion;
import in.ingredients.Tomato;

/**
 * Класс, представляющий овощной салат.
 */
public class VegetableSalad extends Salad {

    public VegetableSalad() {
        super("Овощной салат");
    }

    @Override
    protected void addSalt() {
        System.out.println("  Добавление " + SALT_QUANTITY);
    }

    @Override
    protected void dressSalad() {
        System.out.println("  Заправка салата маслом");
    }

    @Override
    public void prepareSalad() {
        addIngredients();
        super.prepareSalad();
    }

    @Override
    protected void addIngredients() {
        System.out.println("Предварительная подготовка:");
        new Tomato().cut();
        new Cucumber().cut();
        new Onion().cut();
    }

}
