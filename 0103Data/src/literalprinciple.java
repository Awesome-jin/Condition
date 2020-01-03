
public class literalprinciple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*3개의 정수를 저장하는 변수를 만들고 
		2개에는 동일한 값을 1개에는 다른 값을 저장해서 해시코드를 출력해보자 */
		
		int a = 10;
		int b = 10;
		int c = 20;
		
		// a와 b는 static에 10을 저장해서 stack에 같은 참조를 저장했으므로 같아야한다
		System.out.println("a:" + System.identityHashCode(a));
		System.out.println("b:" + System.identityHashCode(b));
		System.out.println("c:" + System.identityHashCode(c));
		
		//문자열 참조하기 예시
		int age = 20;
		double h = 175.52;
		System.out.printf("나이는 %d, 키는 %.1f 입니다", age, h); //.1f이므로 둘째자리에서 반올림

	}

}
