package ua.goit.patterns.creational.factoryMethod.dialog;

import ua.goit.patterns.creational.factoryMethod.button.Button;
import ua.goit.patterns.creational.factoryMethod.button.WindowsButton;

public class WindowDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
