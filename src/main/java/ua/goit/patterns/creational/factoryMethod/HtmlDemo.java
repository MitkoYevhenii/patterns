package ua.goit.patterns.creational.factoryMethod;

import ua.goit.patterns.creational.factoryMethod.dialog.Dialog;
import ua.goit.patterns.creational.factoryMethod.dialog.HtmlDialog;
import ua.goit.patterns.creational.factoryMethod.dialog.WindowDialog;

public class HtmlDemo {
    public static Dialog dialog;

    static void configure() {
        if (System.getProperty("os.name").equals("Windows 10")) {
            dialog = new WindowDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }

    static void runBusinessLogic() {
        dialog.renderWindow();
    }


    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }
}
