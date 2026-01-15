package _3_test_260115.ex;

public class Ex2_Book {
    // 설계 도면으로 사용할 클래스

    // 실습2
    //1.
    //1) 클래스 설계(정의)
    //클래스명 : Book -> Ex2_Book
    //멤버 변수 1) name 2) price 3) writer
    String name;
    String price;
    String writer;
    //기능 :책소개 메서드 이름 : introduceBook()
    void introduceBook(){
        System.out.println("책의 이름 : " + this.name);
        System.out.println("책의 가격 : " + this.price);
        System.out.println("책의 저자 : " + this.writer);
        System.out.println();
    }
    //기능 내부에는 , 현재 책의 이름과, 가격과 저자를 소개하는 출력 기능이 있습니다.
}
