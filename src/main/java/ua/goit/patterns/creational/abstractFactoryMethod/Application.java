package ua.goit.patterns.creational.abstractFactoryMethod;


import ua.goit.patterns.creational.abstractFactoryMethod.button.Button;
import ua.goit.patterns.creational.abstractFactoryMethod.checkbox.Checkbox;
import ua.goit.patterns.creational.abstractFactoryMethod.factory.GUIFactory;

/**
 * Код, использующий фабрику, не волнует с какой конкретно фабрикой он работает.
 * Все получатели продуктов работают с продуктами через абстрактный интерфейс.
 */
public class Application {
    private final Button button;
    private final Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
        System.out.println("Button type: " + button.buttonType());
        System.out.println("Checkbox type: " + checkbox.checkboxType());
    }
}