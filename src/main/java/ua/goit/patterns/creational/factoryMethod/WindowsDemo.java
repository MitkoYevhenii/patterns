package ua.goit.patterns.creational.factoryMethod;

import ua.goit.patterns.creational.factoryMethod.dialog.Dialog;
import ua.goit.patterns.creational.factoryMethod.dialog.WindowDialog;

public class WindowsDemo {
    public static Dialog dialog;

    static void configure() {
        // Всегда создаём объект WindowDialog
        dialog = new WindowDialog();
    }

    static void runBusinessLogic() {
        dialog.renderWindow();
    }

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }
}

