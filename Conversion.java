package dataType;

public class Conversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ������ Ÿ�� ��ȯ - ����Ʈ ũ�Ⱑ ���� �ڷ��� > ū �ڷ���
		// ����� Ÿ�� ��ȯ - ����Ʈ ũ�Ⱑ ū �ڷ��� > ���� �ڷ���

		byte bNum = 127;
		int iNum = bNum;

		System.out.println(bNum);
		System.out.println(iNum);

		int iNum2 = 20;
		float fNum = iNum2;

		System.out.println(iNum2 + fNum);
		
		 double dNum = 1.2d;
         float fNum2 = 0.9f;
         
         int iNum3 = (int)dNum + (int)fNum2;
         int iNum4 = (int)(dNum + fNum2);
         double iNum5 = (double)dNum + (double)fNum2;
         
         System.out.println(iNum3);
         System.out.println(iNum4);
         System.out.println(iNum5);
	}

}
