package condition;

public class If01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int age = 25;

		if (age <= 18) {
			System.out.println(age + "세라고! 미짜");
		} else if (age <= 60) {
			System.out.println(age + "세군요. 어른");
		} else if (age > 60) {
			System.out.println(age + "세시군요~ 홀홀홀");
		}
	}

}
