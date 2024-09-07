package ua.goit.patterns.creational.abstractFactoryMethod.factory;

import ua.goit.patterns.creational.abstractFactoryMethod.button.Button;
import ua.goit.patterns.creational.abstractFactoryMethod.checkbox.Checkbox;


public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
