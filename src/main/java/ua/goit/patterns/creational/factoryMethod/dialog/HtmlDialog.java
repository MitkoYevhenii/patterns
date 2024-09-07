package ua.goit.patterns.creational.factoryMethod.dialog;

import ua.goit.patterns.creational.factoryMethod.button.Button;
import ua.goit.patterns.creational.factoryMethod.button.HtmlButton;

public class HtmlDialog extends Dialog {
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
