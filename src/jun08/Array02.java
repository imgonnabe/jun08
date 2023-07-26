package jun08;

import java.util.Arrays;

/*
 * 배열(Array)
 * 배열은 객체이다.
 * 
 * 배열은 동일한 타입의 데이터를 하나의 묶음으로 관리하기 위해 사용하는 데이터 구조이다.
 * 예를 들어, int 타입의 변수가 100이 필요하다고 하면
 * 우리는 100개의 다른 이름, 다른 변수를 만들어야 한다.
 * 시간도 많이 걸리고 관리하기 어렵다.
 * 이를 보완하기 위해 사용하는 것이 배열이다.
 * 
 * 배열은 객체이기 때문에 객체의 속성과 메소드를 사용해서 배열을 관리한다.
 * 배열은 유일하게 속성만 가지고 있다.
 * 배열의 속성 중 배열의 길이를 나타내는 length가 있다.
 * 객체의 속성과 메소드 등을 호출할 때는 .(점)을 사용한다.
 */
public class Array02 {
	public static void main(String[] args) {
		// 10 9 8 7 6 5 4 3 2 1
		// 생성
		int[] arr01 = new int[10];
		// 값 입력
		for (int i = 0; i < arr01.length; i++) {
			arr01[i] = 10 - i;
		}
		// 출력
		System.out.println(Arrays.toString(arr01));

		// 생성 + 값 입력
		int[] arr02 = new int[] { 10, 9, 8, 7, 5 };
		int[] arr03 = { 5, 4, 3, 2, 1 };

	}

}
