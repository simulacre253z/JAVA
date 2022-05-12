package dataType;

public class Conversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 묵시적 타입 변환 - 바이트 크기가 작은 자료형 > 큰 자료형
		// 명시적 타입 변환 - 바이트 크기가 큰 자료형 > 작은 자료형

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
