package ua.goit.patterns.creational.abstractFactoryMethod.checkbox;

public class WindowsCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("You have created WindowsCheckbox.");
    }

    @Override
    public String checkboxType() {
        return "MacOSCheckbox";
    }
}
