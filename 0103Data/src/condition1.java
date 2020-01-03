import java.util.Scanner;

public class condition1 {

	public static void main(String[] args) {
		//1. 키보드를 입력 받기 위한 객체를 만들기
		Scanner sc = new Scanner(System.in);
		
		//2.점수를 입력 받아보기
		System.out.print("점수입력 : ");  //2-1) 입력 받을 부분 print로 찍어내기
		int score = sc.nextInt(); //2-2) 입력 받은 값 객체로 만들기. 정수형으로 받을거니까 nextInt
		
		// 3. 조건문 작성
		
		if (score >= 60) //60점이상을 입력 받으면 pass라고 하기!
		{
			System.out.printf("congratulation %d is pass!!", score); //참조할거는 꼭 printf인점 기억하기
		}
		else //60점 이하 점수는 fail
		{
			System.out.printf("fail!");
		}
		
		sc.close();
	}

}
