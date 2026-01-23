package _8_test_260122;

import javax.swing.*;
import java.awt.*;

public class _3_FlowLayoutDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("FlowLayout Demo");
        JPanel panel = new JPanel();

        //패널에 정렬 규칙 : 나란히 배치 . FlowLayout
        // 여기만 변경
        panel.setLayout(new FlowLayout());

        // 패널에 버튼 붙이기.
        JButton aBtn = new JButton("D");
        panel.add(new JButton("A"));
        panel.add(new JButton("B"));
        panel.add(new JButton("C"));
        panel.add(aBtn);

        // 프레임에 패널 붙이기.
        frame.add(panel);

        // 기본 옵션, 창크기, 닫기 기능, 보이기 기능.
        frame.setSize(300, 120);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
