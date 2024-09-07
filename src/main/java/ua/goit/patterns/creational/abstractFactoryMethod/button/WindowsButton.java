package ua.goit.patterns.creational.abstractFactoryMethod.button;

public class WindowsButton implements Button{
    @Override
    public void paint() {
        System.out.println("You have created WindowsButton.");
    }

    @Override
    public String buttonType() {
        return "WindowsButton";
    }
}
