package com.pcwk.var01;

public class VariableChar02 {
/*
��ǻ�Ϳ����� ���ڵ� ���������� ��Ʈ�� �������� ǥ��												
�ڹٿ����� ���ڸ� 2����Ʈ�� ó��												
												
���ڵ� - �� ���ڿ� ���� Ư���� ���ڰ�(�ڵ� ��)�� �ο�												
���ڵ� - ���ڰ�(�ڵ� ��)�� ������ ���ڷ� ��ȯ												

 */
	public static void main(String[] args) {
		char ch01 = 'A';
		System.out.println("ch01:"+ch01);//ch01:A
		//'A'�� �ش��ϴ� ASCII�ڵ� ��
		System.out.println((int)ch01);//65
		
		char ch02 = 66;//���ڿ� ���� �� ����
		System.out.println("ch02:"+ch02);//ch02:B
		
		int ch03  = 67;
		System.out.println("ch03:"+ch03);//ch03:67
		System.out.println((char)ch03);//C
		
	}

}
