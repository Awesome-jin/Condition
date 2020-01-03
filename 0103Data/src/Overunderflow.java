
public class Overunderflow {

	// 자바 어플리케이션의 시작 메소드
	public static void main(String[] args) {
		// TODO Auto-generated method stub

			// overflow task
			short s = (short)32768;
			System.out.println(s); // 표현범위를 넘어선 순간 음수가 찍히는걸 확인
			
			//underflow task
			short u = (short)-32769;
			System.out.println(u);  //표현범위를 밑으로 넘어서면 다시 최대값부터 시작함
	}

}
