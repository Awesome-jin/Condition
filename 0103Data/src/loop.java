
public class loop {

	public static void main(String[] args) {
		
		// 반복문 3가지로 hello sj을 출력해보자
		int i = 0;
		while (i<3)
		{
			System.out.println("hello sj");
			i = i +1;
		}
		
		// do while은 한번 수행할 내용 > do 에서 반복 수행할 내용 > while 조건 순으로 작성
		int j = 0;
		do
		{
			System.out.println("hello java");
			j = j+1;
		}
		while (j < 3);
		
		//for문으로 작성해보기
		for (int k = 0; k < 3 ; k = k+1)
		{
			System.out.println("goodbye");
		}
		
		// 교재에 있는 것들 if -> while등으로 바꿔보기!!
	}

}
