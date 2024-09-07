package ua.goit.patterns.creational.abstractFactoryMethod.factory;


import ua.goit.patterns.creational.abstractFactoryMethod.button.Button;
import ua.goit.patterns.creational.abstractFactoryMethod.button.WindowsButton;
import ua.goit.patterns.creational.abstractFactoryMethod.checkbox.Checkbox;
import ua.goit.patterns.creational.abstractFactoryMethod.checkbox.WindowsCheckbox;

public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}