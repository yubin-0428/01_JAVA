/**
 * ��Ű��: com.pcwk.var01
 * ���� : VariableCasting06.java
 * �ۼ���: ITSC
 */
package com.pcwk.var01;

public class VariableCasting06 {

//	����� ����ȯ : ������ ����ȯ�� �ݴ��� ���																
//	��ȯ �Ǵ� �ڷ����� ����ؾ� ��, �ڷ��� �ս��� �߻� �Ҽ� �ִ�.													
	public static void main(String[] args) {
		//ū���� ���� ������ �Ҵ�.
		int iNum = 11;
		byte bNum = (byte) iNum;
		
		System.out.println("iNum:"+iNum);
		System.out.println("bNum:"+bNum);

		int iNum01 = 1000;
		byte bNum01 = (byte) iNum01;
		System.out.println("iNum01: "+iNum01);//1000
		System.out.println("bNum01: "+bNum01);//������ ��
		
		//�� ������ �ڷ������� �� ������ ������ ����
		double  dNum02 = 3.14;
		int  iNum02  = (int) dNum02;
		System.out.println("dNum02:"+dNum02);//3.14
		System.out.println("iNum02:"+iNum02);//3		
	}

}
