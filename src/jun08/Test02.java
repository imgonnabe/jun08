package jun08;

public class Test02 {
	public static void main(String[] args) {
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.printf("%d x %d = %d\t", i, j, i * j);	
			}
			System.out.println("");
		}
		System.out.println();
		for (int i = 1; i < 10; i++) {
			for (int j = 2; j < 10; j++) {
				System.out.printf("%d x %d = %d\t", j, i, i * j);	
			}
			System.out.println("");
		}
	}

}
