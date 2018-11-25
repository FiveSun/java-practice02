package practice02;

import java.util.Scanner;

public class Prob02 {
//키보드에서 배열 크기만큼 정수를 입력받고 평균을 구하는 프로그램을 작성하시오
	public static void main(String[] args) {
		System.out.println("5개 숫자를 입력하세요.");
		Scanner in = new Scanner( System.in );
        int intArray[] = new int[5];
        double sum = 0;

        
        /* 키보드에서 배열 크기만큼 입력 받아 배열에 저장하는 코드 */
        for(int i=0; i < intArray.length; i++) {
        	intArray[i] = in.nextInt();
        	
        	 /* 배열에 저장된 정수 값 더하기 */
        	sum += intArray[i];
        }
        /* 출력 */
		System.out.println("평균은 " + sum/intArray.length +" 입니다.");


       

        
	}

}
