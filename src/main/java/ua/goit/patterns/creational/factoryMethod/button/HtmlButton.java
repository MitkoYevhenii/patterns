package ua.goit.patterns.creational.factoryMethod.button;

public class HtmlButton implements Button {

    public void render() {
        System.out.println("<button>Test Button</button>");
        onClick();
    }

    public void onClick() {
        System.out.println("Click! Button says - 'Hello World!'");
    }

    public static void main(String[] args) {
        HtmlButton htmlButton = new HtmlButton();
        htmlButton.onClick();
    }
}

