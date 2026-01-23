package _8_test_260122;

import javax.swing.*;
import java.awt.*;

public class _4_BorderLayoutDemo {
    public static void main(String[] args) {

        JFrame frame = new JFrame("BorderLayout Demo");

        // 동,서,남,북,가운데 배치.
        // 여기만 변경
        frame.setLayout(new BorderLayout());

        frame.add(new JButton("North"), BorderLayout.NORTH);
        frame.add(new JButton("South"), BorderLayout.SOUTH);
        frame.add(new JButton("East"), BorderLayout.EAST);
        frame.add(new JButton("West"), BorderLayout.WEST);
        frame.add(new JButton("Center"), BorderLayout.CENTER);

        // 기본 옵션, 창크기, 닫기 기능, 보이기 기능.
        frame.setSize(350, 180);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
