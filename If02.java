package condition;

public class If02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int age = -25;

		boolean flag = (age >= 18);

		if (flag) {
			System.out.println("��Դϴ�.");
		} else {
			System.out.println("��� �ƴմϴ�.");
		}

		int myage = 25, yuriage = 26;
		String res = (myage < yuriage) ? "����" : "����";
		System.out.println(res);

		if (myage < yuriage) {
			System.out.println("����");
		} else {
			System.out.println("����");
		}

		int age1 = 25;

		if (age1 < 6) {
			System.out.println("�����Դϴ�.");
		} else if (age1 <= 13) {
			System.out.println("600���Դϴ�.");
		} else if (age1 <= 18) {
			System.out.println("1400���Դϴ�.");
		}
		if (age1 > 18) {
			System.out.println("��Դϴ�.");
			if (age1 > 60) {
				System.out.println("�����Դϴ�.");
			} else {
				System.out.println("2000���Դϴ�.");
			}
		}

		int age2 = 25;
		int pay;

		if (age2 < 6) {
			pay = 0;
		} else if (age2 <= 13) {
			pay = 600;
		} else if (age2 <= 18) {
			pay = 1400;
		}
		if (age2 > 18) {
			if (age2 > 60) {
				pay = 2000;
			} else {
				pay = 0;
			}
			System.out.println(age2 + "���� " + pay + "���Դϴ�.");
		}
	}

}
