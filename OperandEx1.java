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
		System.out.println("Ʈ���� ȣ���� ��� ���̴� " + res + "���Դϴ�.");

		int bogo = 1;
		System.out.println("��ȣ �ο� ����, " + bogo + "��!");
		bogo--;
		System.out.println("��ȣ �ο� ����, " + bogo + "��!");
		--bogo;
		System.out.println("��ȣ �ο� ����, " + bogo + "��!");
		System.out.println("�̻� �� :)");
		// �� �κ��� ���� for���̳� while������ �����ϰ� ��ü �����մϴ�. :3

		String a1 = "male";
		String a2 = "female";
		String a3 = (3 % 2 == 1) ? a1 : a2;
		System.out.println("����� ������ " + a3 + "�̽ʴϴ�.");

		char b1 = 'b', b2 = 'B';
		boolean res1, res2;
		res1 = (b1 > 'a') && (b1 < 'z');
		res2 = (b2 < 'A') || (b2 < 'Z');
		System.out.println("&& ������ ��� : " + res1 + "�Դϴ�.");
		System.out.println("|| ������ ��� : " + res2 + "�Դϴ�.");
		System.out.println("! ������ ��� : " + !res2 + "�Դϴ�.");

		char c1 = 'c', c2 = 'C';
		System.out.println("== ������ ��� : " + (c1 == c2) + "�Դϴ�.");
		System.out.println("> ������ ��� : " + (c1 > c2) + "�Դϴ�.");
		
		int myage = 25, yuriage = 26;
		String answer = (myage > yuriage) ? "old" : "young";
		System.out.println(answer);
	}

}
