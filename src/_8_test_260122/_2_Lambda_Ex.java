package _8_test_260122;

import javax.swing.*;

public class _2_Lambda_Ex {
    public static void main(String[] args) {
        JFrame frame = new JFrame("람다식 예시");
        JButton button = new JButton("Exit");

        button.addActionListener(e -> frame.dispose());

        frame.add(button);
        frame.setSize(200, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
