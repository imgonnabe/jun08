package jun08;

public class Test01 {
	public static void main(String[] args) {
		// %d = 정수, %f = 실수, %o = 8진수, %x = 16진수, \n = 줄바꿈
		// %c = 문자
		// %b = 불리언
		// %s = 문자열
		String name = "홍길동";
		System.out.printf("제 이름은 %s입니다.\n", name);
		System.out.printf("제 이름은 %10s입니다.\n", name);
		System.out.printf("제 이름은 %10s입니다.\n", "가나다라마");
		
		double pi = 3.14;
		System.out.printf("파이는 %f입니다.\n", pi);
		System.out.printf("파이는 %.2f입니다.\n", pi);
		
		int money = 5000;
		System.out.printf("제 용돈은 %d원입니다.\n", money);
		System.out.printf("제 용돈은 %,d원입니다.\n", money);
		System.out.printf("제 용돈은 %10d원입니다.\n", money);
		
		char ch = 65;
		System.out.printf("제 이름은 %c입니다.\n", ch);
		System.out.printf("제 이름은 %10d입니다.\n", 1000);
		System.out.printf("제 이름은 %-10d입니다.\n", 1000);
		System.out.printf("제 이름은 %010d입니다.\n", 1000);
		
		
		for (int i = 1; i < 10; i++) {
			//System.out.println("2 x " + i + " = " + 2 * i);
			System.out.printf("2 x %d = %d\n", i, (2 * i));
		}
		

	}
}
