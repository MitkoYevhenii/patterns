package ua.goit.patterns.creational.abstractFactoryMethod.factory;

import ua.goit.patterns.creational.abstractFactoryMethod.button.Button;
import ua.goit.patterns.creational.abstractFactoryMethod.button.MacOSButton;
import ua.goit.patterns.creational.abstractFactoryMethod.checkbox.Checkbox;
import ua.goit.patterns.creational.abstractFactoryMethod.checkbox.MacOSCheckbox;

/**
 * Каждая конкретная фабрика знает и создаёт только продукты своей вариации.
 */
public class MacOSFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
