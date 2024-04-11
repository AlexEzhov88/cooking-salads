package in.salads;

import in.exception.PlateBrokenException;

/**
 * Абстрактный класс, описывающий базовую структуру и поведение салата.
 */
public abstract class Salad {

    protected String name;

    protected static final String SALT_QUANTITY = "щепотка соли";

    /**
     * Конструктор салата.
     * @param name Название салата.
     */
    protected Salad(String name) {
        this.name = name;
    }

    /**
     * Метод для перемешивания ингредиентов салата.
     */
    protected void mixIngredients() {
        System.out.println("  Перемешивание всех ингредиентов салата");
    }

    /**
     * Метод для добавления соли.
     */
    protected void addSalt() {
        // По умолчанию ничего не делаем
    }

    /**
     * Метод для заправки салата.
     */
    protected void dressSalad() {
        // По умолчанию ничего не делаем
    }

    /**
     * Метод для украшения салата.
     */
    protected void decorateSalad() {
        // По умолчанию ничего не делаем
    }

    protected void addIngredients() {
        // По умолчанию ничего не делаем
    }

    /**
     * Основной метод для подготовки салата.
     */
    public void prepareSalad() {
        System.out.println(name + " Готовим:");
        mixIngredients();
        addSalt();
        dressSalad();
        mixIngredients();
        decorateSalad();
        try {
            serveSalad();
        } catch (PlateBrokenException e) {
            System.out.println("  Подача салата не удалась, потому что тарелка разбилась. " + e.getMessage());
            serveSaladOnAnotherPlate();
        }
        serveToClient();
    }

    /**
     * Метод для подачи салата на блюдо.
     * @throws PlateBrokenException Если тарелка разбилась.
     */
    protected void serveSalad() throws PlateBrokenException {
        if (Math.random() > 0.5) {
            throw new PlateBrokenException("Тарелка разбилась.");
        }
        System.out.println("  Подача салата на блюдо");
    }

    /**
     * Метод для подачи салата на другое блюдо в случае разбития первого.
     */
    protected void serveSaladOnAnotherPlate() {
        System.out.println("  Подача салата на другое блюдо");
    }

    /**
     * Метод для подачи салата клиенту.
     */
    protected void serveToClient() {
        System.out.println("  Подача салата клиенту");
    }
}
