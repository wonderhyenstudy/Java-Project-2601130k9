package _8_test_260122;

import javax.swing.*;
import java.awt.*;

public class _5_GridLayoutDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("GridLayout Demo");
        JPanel panel = new JPanel();

        // 여기만 변경
        panel.setLayout(new GridLayout(3, 2));
        panel.add(new JButton("1"));
        panel.add(new JButton("2"));
        panel.add(new JButton("3"));
        panel.add(new JButton("4"));
        panel.add(new JButton("5"));
        panel.add(new JButton("6"));

        frame.add(panel);

        // 기본 옵션, 창크기, 닫기 기능, 보이기 기능.
        frame.setSize(250, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
