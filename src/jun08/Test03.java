package jun08;

import java.util.Arrays;

// 알파벳을 A-Z까지 저장하는 배열을 만드세요.
public class Test03 {
	public static void main(String[] args) {
		char[] ch = new char[26];
		for (int i = 0; i < ch.length; i++) {
			ch[i] = (char) (i + 65);
		}
		System.out.println(Arrays.toString(ch));
	}

}
