package condition;

public class SwitchCase01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int rank = 1;

		switch (rank) {
		case 1:
			System.out.println(rank + "위의 메달 색은 Gold입니다.");
			break;
		case 2:
			System.out.println(rank + "위의 메달 색은 Silver입니다.");
			break;
		case 3:
			System.out.println(rank + "위의 메달 색은 Bronze입니다.");
			break;
		default:
			System.out.println("세상에서 가장 아름다운 꼴등입니다.");
		}
	}

}
