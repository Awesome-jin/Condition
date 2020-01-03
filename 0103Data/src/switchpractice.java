import java.util.Scanner;

public class switchpractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 입력 받는 객체 생성
				Scanner sc = new Scanner(System.in);
				
				// 입력값 저장하는 객체 생성
				System.out.print("메뉴를 입력하세요 1-한식 2-중식 3-양식 기타-일식: ");
				
				int menu = sc.nextInt();
				
				// final로 읽기 변수 만들어주기 (이렇게 switch문을 짜면 훨씬 이해하기 쉽다)
				final int korea = 1;
				final int china = 2;
				final int west = 3;
				
				// 위에서 입력 받은 값이 1이면 한식 2면 중식 3은 양식, 나머진 일식으로
				switch(menu) {
					case korea:
						System.out.println("한식입니다");
						break;
					case china:
						System.out.println("중식입니다");
						break;
					case west:
						System.out.println("양식입니다");
						break;
					default:
						System.out.println("일식입니다");
						break;		
				}
				
				sc.close();
	}

}
