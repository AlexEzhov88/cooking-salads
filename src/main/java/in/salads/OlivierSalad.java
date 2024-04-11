package in.salads;

import in.ingredients.Egg;
import in.ingredients.PickledCucumber;
import in.ingredients.Potato;
import in.ingredients.Sausage;

/**
 * Класс, представляющий салат Оливье.
 */
public class OlivierSalad extends Salad {

    public OlivierSalad() {
        super("Салат Оливье");
    }

    @Override
    protected void addSalt() {
        System.out.println("  Добавление " + SALT_QUANTITY);
    }

    @Override
    protected void dressSalad() {
        System.out.println("  Заправка салата майонезом");
    }

    @Override
    protected void decorateSalad() {
        System.out.println("  Украшение салата зеленью.");
    }

    @Override
    public void prepareSalad() {
        addIngredients();
        super.prepareSalad();
    }

    @Override
    protected void addIngredients() {
        System.out.println("Добавление ингредиентов для Оливье:");
        new Potato().cut();
        new Sausage().cut();
        new Egg().cut();
        new PickledCucumber().cut();
    }

}
