package jun08;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 시저 암호는, 고대 로마의 황제 줄리어스 시저가 만들어 낸 암호이다.
 * 예를 들어, 알파벳 A를 입력했을 때, 그 알파벳의 n개 뒤에 오는(여기서는 예를 들 때 3으로 지정하였다)알파벳이 출력된다.
 * 예를 들어 바꾸려는 단어가 'CAT"고, n을 5로 지정하였을 때 "HFY"가 되는 것이다.
 * 어떠한 암호를 만들 문장과 n을 입력했을 때 암호를 만들어 출력하는 프로그램을 작성해라.
 */
public class Test04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("암호화 할 문장을 입력하세요.");
		System.out.print("입력: ");
		String input = sc.nextLine();
		// 입력받은 문장을 모두 대문자화 하기
		input = input.toUpperCase();

		char[] chInput = input.toCharArray();// String > char 배열
		System.out.println(Arrays.toString(chInput));

		// X Y Z > A B C
		for (int i = 0; i < chInput.length; i++) {
			if (chInput[i] + 3 >= 'X') {
				System.out.print((char) (chInput[i] - 23));
			} else {
				System.out.print((char) (chInput[i] + 3));
			}// else 안 쓰면 print가 두번 찍힌다.
		}
		sc.close();

	}

}
