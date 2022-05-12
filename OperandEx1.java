package operand;

public class OperandEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * int a = 1; int b = -127; int c = a - b; System.out.println(c);
		 * 
		 * int d = 5; d %= 2; System.out.println(d);
		 * 
		 * char answer = (5 > 3) ? 'y' : 'n'; System.out.println(answer);
		 */

		int ho1 = 26;
		int ho2 = 26;
		int ho3 = 25;
		float res = (float) (ho1 + ho2 + ho3) / 3;
		System.out.println("트리플 호구의 평균 나이는 " + res + "세입니다.");

		int bogo = 1;
		System.out.println("점호 인원 보고, " + bogo + "번!");
		bogo--;
		System.out.println("점호 인원 보고, " + bogo + "번!");
		--bogo;
		System.out.println("점호 인원 보고, " + bogo + "번!");
		System.out.println("이상 무 :)");
		// 이 부분은 물론 for문이나 while문으로 간단하게 대체 가능합니다. :3

		String a1 = "male";
		String a2 = "female";
		String a3 = (3 % 2 == 1) ? a1 : a2;
		System.out.println("당신의 성별은 " + a3 + "이십니다.");

		char b1 = 'b', b2 = 'B';
		boolean res1, res2;
		res1 = (b1 > 'a') && (b1 < 'z');
		res2 = (b2 < 'A') || (b2 < 'Z');
		System.out.println("&& 연산자 결과 : " + res1 + "입니다.");
		System.out.println("|| 연산자 결과 : " + res2 + "입니다.");
		System.out.println("! 연산자 결과 : " + !res2 + "입니다.");

		char c1 = 'c', c2 = 'C';
		System.out.println("== 연산자 결과 : " + (c1 == c2) + "입니다.");
		System.out.println("> 연산자 결과 : " + (c1 > c2) + "입니다.");
		
		int myage = 25, yuriage = 26;
		String answer = (myage > yuriage) ? "old" : "young";
		System.out.println(answer);
	}

}
