import java.util.Scanner;

public class condition2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	 Scanner sc = new Scanner(System.in);
	 
	 System.out.print("Input your score: ");
	 int score = sc.nextInt();
	 
	 // 100~90점 사이는 A. 80점에서 90점은 B. 70~80은 C. 나머진 F 주기
	 if (score >=90 && score < 100)
	 {
		 System.out.printf("%d point is grade A", score);
	 }

	 else if (score >=80 && score < 90)
	 {
		 System.out.printf("%d point is grade B", score);
	 }
	 
	 else if (score >=70 && score < 80)
	 {
		 System.out.printf("%d point is grade C", score);
	 }
	 
	 else if(score >=0 && score < 70)
	 {
		 System.err.printf("%d point is grade F", score);
	 }
	 else
	 {
		 System.err.println("You put wrong score");
	 }
	 
	 sc.close();
	 
	}

}
