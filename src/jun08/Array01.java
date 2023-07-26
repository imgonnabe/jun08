package jun08;

import java.util.Arrays;
import java.util.Scanner;

// 배열 : 같은 데이터 타입이 줄줄이 있습니다.
// 같은 타입, 동일관리, 주소호출
public class Array01 {
	public static void main(String[] args) {
		// int 타입의 10개 공간을 만든다.
		// 데이터 타입 변수명 = 값[공간 개수];
		int[] arr01 = new int[10];
		// double 형태의 배열 5칸짜리
		double[] arr02 = new double[5];
		// 문자열 3개를 저장하는 arr03
		String[] arr03 = new String[3];
		
		System.out.println(arr01);// [I@3d012ddd
		                          //int~~~~~~~~~ 메모리 위치
		// 출력 [위치(index, 번지)]를 적어준다.
		System.out.println(arr01[0]);// 변수[int index]
		// 입력 변수[위치]
		arr01[0] = 100;
		arr01[1] = 10;
		arr01[2] = 50;

		arr03[0] = "홍길동";
		arr03[1] = "김길동";
		arr03[2] = "이길동";
		//arr03[3] = "박길동";// 배열의 길이: 3 > 0,1,2
		// 마지막 번지 = 길이 - 1
		
		System.out.println(arr03.length);// 길이 출력 int
		for (int i = 0; i < arr03.length; i++) {
			System.out.println(arr03[i]);
		}
		System.out.println(arr03);//[Ljava.lang.String;@626b2d4a
		
		for (int i = 0; i < arr01.length; i++) {
			arr01[i] = i + 1;
		}
		System.out.println(Arrays.toString(arr01));
		System.out.println(Arrays.toString(arr02));
		// [0.0, 0.0, 0.0, 0.0, 0.0]
		// 초기값 = 객체는 객체 생성과 동시에 초기값을 가진다.
		// 정수 = 0, 실수 = 0.0, 객체 = null, char = , boolean = false
		System.out.println(Arrays.toString(arr03));
		
		boolean[] arr04 = new boolean[3];
		System.out.println(Arrays.toString(arr04));
		
		byte[] test01 = new byte[3];
		System.out.println(Arrays.toString(test01));
		short[] test02 = new short[3];
		System.out.println(Arrays.toString(test02));
		int[] test03 = new int[3];
		System.out.println(Arrays.toString(test03));
		long[] test04 = new long[3];
		System.out.println(Arrays.toString(test04));
		
		float[] test05 = new float[3];
		System.out.println(Arrays.toString(test05));
		
		char[] test06 = new char[3];
		System.out.println(Arrays.toString(test06));
		
		String[] test07 = new String[3];
		System.out.println(Arrays.toString(test07));
		
		Scanner[] test08 = new Scanner[3];
		System.out.println(Arrays.toString(test08));
		
		Object[] test09 = new Object[3];
		System.out.println(Arrays.toString(test09));
		
		
	}

}
