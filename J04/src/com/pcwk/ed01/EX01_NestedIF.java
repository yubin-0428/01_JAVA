package com.pcwk.ed01;
import java.util.Scanner;

public class EX01_NestedIF {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("아이디를 입력 하세요>");
		String userId = scanner.nextLine();
		System.out.println("userId:"+userId);

		//userId: java, passwd: 1234
		if(userId.equals("java")) {
			System.out.println("id일치");
			System.out.print("비밀번호를 입력 하세요>");
			String passwd = scanner.nextLine();
			
			if(passwd.equals("1234")) {
				System.out.println("비번 일치");
			}else {
				System.out.println("비번을 확인 하세요.");
			}
			
	    //--if------------------------------------	
		}else {
			System.out.println("아이디를 확인 하세요.");
		}
		
	}

}
