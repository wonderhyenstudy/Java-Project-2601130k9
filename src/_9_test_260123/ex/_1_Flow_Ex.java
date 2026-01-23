package _9_test_260123.ex;

import javax.swing.*;
import java.awt.*;

public class _1_Flow_Ex {
//    FlowLayout(왼쪽정렬)로
//    JLabel("이름"), JTextField(8글자), JButton("검색")을
//    순서대로 배치하세요.
//    JTextField 입력된 내용을, 검색 버튼을 클릭시, 이벤트 리스너를 이용해서,
//    콘솔에 출력해보기.
    public static void main(String[] args) {
        // 컨테이너 생성 , 프레임 , 패널 생성.
        JFrame frame = new JFrame("검색창");
        //    FlowLayout(왼쪽정렬)로
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        //    JLabel("이름"), JTextField(8글자), JButton("검색")을
//    순서대로 배치하세요.
        // 패널에, 라벨 이름 붙이기.
        panel.add(new JLabel("이름"));

        //JTextField(8글자), 따로 객체를 생성해서, 즉 이름을 부여해서, 재사용.
        // 이벤트 리스너에 사용해야함.
        JTextField textField = new JTextField(8);
        panel.add(textField);

        // JButton("검색") 따로 객체를 생성해서, 즉 이름을 부여해서, 재사용.
        // 이벤트 리스너에 사용해야함.
        JButton searchBtn = new JButton("검색");
        panel.add(searchBtn);

        // 이벤트 적용해보기.
        searchBtn.addActionListener(e -> {
            //  텍스트필드에 입력된 값 가져오기.
            String inputText = textField.getText();
            System.out.println("입력된 내용 : " + inputText);
        });

        // 만든 UI 화면에 나타내기.
        frame.add(panel);
        // 기본 옵션, (반복, 창 크기, 창 닫기, 창 보이기 기능)
        frame.setSize(300, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);


    }
}
