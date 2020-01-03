
public class condi_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 10;
		//x가 4의 배수인지 판별해보고 싶음
		boolean result = x%4==0;
		System.out.println(result);
		
		
		// 윤년인지 판별해보기
		// 윤년은 4의 배수이고 100의 배수가 아닌 경우 또는 400의 배수인 경우
		int year = 2020;
		boolean result02 = year%4==0 && year%100!=0 | year%400==0;
		System.out.println(result02);
		
		// 다음은 몇 일 몇 시간 몇 분 몇초일까??
		int i = 51251609;
		int day = i / 86400; // 86400으로 나누면 몫인 정수만 day
		int hour = (i-(day * 86400))/3600; // day*86400만큼을 빼주고 3600으로 나눠야 함
		int minute = (i - (day*86400)-(hour*3600))/60; // 마찬가지로 날,시간에 해당하는 값을 다 빼고 60으로 나누기
		int sec = i % 60;
		System.out.println(day + "일" + hour + "시간" + minute + "분" + sec + "초");
	}

}
