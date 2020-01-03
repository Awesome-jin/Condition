
public class operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 증감연산자
		int a = 10;
		a++;
		System.out.println(a); // a는 1증가한 11을 출력
		System.out.println(a++); //a를 일단 출력 하고 1을 더해!니까 11이 나오고 a값은 12
		System.out.println(++a); // 위의 연산에서 a는 12가 됐고 1을 더한 값을 출력해야 하니 13
		
		a = 0;
		int result = ++a + ++a; // a에 1을 더하고 (현재 값1) 1을 다시 더해서 두 값을 더해
		System.out.println(result); // 결과는 3!
		
		//산술 연산자 : 패턴을 갖는 반복문 수행하기
		//% 나머지를 이용해서 1초마다 몹 젠시간 만들어보기
		 
		int i = 0;
		for (;;) { //for(;;)는 무한 반복문. python의 While true; 같은!
			try {
				i = i%4; // 4가지의 값이 필요하니 4개의 값(0,1,2,3)을 만들 수 있는 연산자 이용
				if (i==0)
					System.out.println("토끼");
				else if (i==1)
					System.out.println("다람쥐");
				else if(i==2)
					System.out.println("사슴");
				else if(i==3)
					System.out.println("소");
				Thread.sleep(1000); //1초마다 라는 명령어. 여기까지 치고 경고에서 catch try자동 생성.
				i++;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			//shift 연산자
			int n = 10;
			System.out.println("n >> 2 :" + (n >> 2));   // 2번 오른쪽으로 밀어! (=4로 나눈 효과)
			System.out.println("n >>34 : " + (n >> 34)); // 32번 이상을 하면 그 나머지 만큼만 나누게 한다.
		
			// 비트 논리 연산자
			int a1 = 15;
			int b1 = 7;
			
			System.out.println("a&b :" + (a1&b1));
			System.out.println("a|b :" + (a1|b1) );
			System.out.println("a^b"+(a1^b1));
			
			//조건 논리 연산자
			int a2 = 10;
			
			//앞의 문장이 참이므로 뒷문장을 수행해야함. 일단 연산을 하고 ++를 하니까 a2는 11
			boolean result2 = a2>5 && (a2++>10);
			System.out.println("결과 :" + result2);
			System.out.println("a2 : "+ a2);
			
			
			//a < 5는 false이므로 뒷 문장을 무시해서 증가하지 않음 여전히 a2는 11.
			boolean result3 = a2 <5 && (a2++>10);
			System.out.println("결과 :" + result3);
			System.out.println("a2 : "+ a2);
			
			
		}
	}

}
