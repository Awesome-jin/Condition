import java.util.Scanner;

public class consoleinput {

	public static void main(String[] args) {
		// 이름과 나이를 입력 받아서 출력하기
		Scanner sc = new Scanner(System.in); // new scanner까지 입력하고 오류 라인쳐지면 마우스 갖다대고 import부분 클릭
		
		//이름을 입력받기
		System.out.print("이름을 입력하세요: ");
		String name = sc.nextLine();
		
		//나이를 입력 받기
		System.out.print("나이를 입력하세요.: ");
		int age = sc.nextInt();
		
		//출력
		System.out.println("이름은" + name + "나이는" + age+"입니다.");
		
		sc.close();
	}

}
