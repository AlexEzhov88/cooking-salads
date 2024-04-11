package in.salads;

import in.exception.PlateBrokenException;
import in.ingredients.Beet;
import in.ingredients.Herring;
import in.ingredients.Onion;

/**
 * Класс, представляющий салат "Селёдка под шубой".
 */
public class HerringUnderFurCoatSalad extends Salad {

    public HerringUnderFurCoatSalad() {
        super("Селёдка под шубой");
    }

    @Override
    protected void addSalt() {
        System.out.println("  Добавление " + SALT_QUANTITY);
    }

    @Override
    protected void dressSalad() {
        // Заправка салата майонезом происходит только на последнем слое
    }

    @Override
    public void prepareSalad() {
        System.out.println(name + " Готовим:");
        System.out.println("  Предварительная подготовка:");
        addIngredients();

        System.out.println("  Выкладывание первого слоя: селёдка");

        System.out.println("  Выкладывание второго слоя: лук");

        System.out.println("  Выкладывание третьего слоя: свекла");
        System.out.println("  Заправка салата майонезом");

        try {
            serveSalad();
        } catch (PlateBrokenException e) {
            System.out.println("  Подача салата не удалась, потому что тарелка разбилась. " + e.getMessage());
            serveSaladOnAnotherPlate();
        }
        serveToClient();
    }

    @Override
    protected void mixIngredients() {
        // Метод переопределён, так как для этого салата не требуется перемешивание ингредиентов в обычном понимании
    }

    @Override
    protected void addIngredients() {
        // Добавление ингредиентов выполняется в рамках подготовки к выкладыванию слоёв
        new Herring().cut();
        new Onion().cut();
        new Beet().cut();
    }
}
