package ua.goit.patterns.creational.factoryMethod.button;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WindowsButton implements Button {
    JPanel panel = new JPanel();
    JFrame frame = new JFrame();
    JButton button;

    public void render() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Hello World!");
        label.setOpaque(true);
        label.setBackground(new Color(235, 233, 126));
        label.setFont(new Font("Dialog", Font.BOLD, 44));
        label.setHorizontalAlignment(SwingConstants.CENTER);

        // Устанавливаем BorderLayout для правильного позиционирования
        panel.setLayout(new BorderLayout());

        // Добавляем метку сверху
        panel.add(label, BorderLayout.NORTH);

        // Добавляем кнопку по центру
        onClick();  // Создание кнопки и установка обработчика события
        panel.add(button, BorderLayout.CENTER);

        frame.getContentPane().add(panel);

        frame.setSize(320, 200);
        frame.setLocationRelativeTo(null); // Центрируем окно на экране
        frame.setVisible(true);
    }

    public void onClick() {
        button = new JButton("Exit");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Показать всплывающее окно при нажатии на кнопку
                JOptionPane.showMessageDialog(frame, "You pressed the button", "Button Pressed", JOptionPane.INFORMATION_MESSAGE);

                // Закрытие программы
                frame.setVisible(false);
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        WindowsButton windowButton = new WindowsButton();
        windowButton.render();
    }
}


