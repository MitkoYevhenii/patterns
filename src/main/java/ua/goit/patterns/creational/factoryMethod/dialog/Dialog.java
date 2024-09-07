package ua.goit.patterns.creational.factoryMethod.dialog;

import ua.goit.patterns.creational.factoryMethod.button.Button;

public abstract class Dialog {

    public void renderWindow() {
        Button okButton = createButton();
        okButton.render();
    }

    public abstract Button createButton();
}

