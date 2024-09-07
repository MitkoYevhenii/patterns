package ua.goit.patterns.creational.abstractFactoryMethod.checkbox;

public class MacOSCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("You have created MacOSCheckbox.");
    }

    @Override
    public String checkboxType() {
        return "MacOSCheckbox";
    }
}
