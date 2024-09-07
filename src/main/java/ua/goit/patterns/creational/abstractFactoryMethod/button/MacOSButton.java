package ua.goit.patterns.creational.abstractFactoryMethod.button;

public class MacOSButton implements Button{
    @Override
    public void paint() {
        System.out.println("You have created MacOSButton.");
    }

    @Override
    public String buttonType() {
        return "MacOSButton";
    }
}
