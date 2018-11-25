package practice02;

import java.util.Scanner;

public class Prob01 {

	public static void main(String[] args) {
		//키보드로 입력된 돈의 액수를 입력받아 오만원,만원,오천원,천원,오백원,백원,오십원,1원으로 각 몇개인지
		//힌트는 배열로 금액을 만들란다.
		
		int[] tongWha = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1};
		Scanner scanner = new Scanner(System.in);

			System.out.print("금액:");
			int number = scanner.nextInt();
			
		for(int i=0; i < tongWha.length; i++) {
			int tongWhaCount;
			tongWhaCount = number / tongWha[i];
			number %= tongWha[i];
			System.out.println(tongWha[i]+"원 : " + tongWhaCount +"개");
		}
	}

}
