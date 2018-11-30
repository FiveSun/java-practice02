package practice02;

import java.util.Random;
import java.util.Scanner;

public class Prob05 {
//[문제5]
//	숨겨진 카드의 수를 맞추는 게임입니다. 1-100까지의 임의의 수를 가진 카드를 한 장
//	숨기고 이 카드의 수를 맞추는 게임입니다. 아래의 화면과 같이 카드 속의 수가 57인 경
//	우를 보면 수를 맞추는 사람이 40이라고 입력하면 "더 높게", 다시 75이라고 입력하면
//	"더 낮게" 라는 식으로 범위를 좁혀가며 수를 맞추고 있습니다. 게임을 반복하기 위해
//	y/n이라고 묻고 n인 경우 종료됩니다..

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		boolean quit = true;
		while (quit) {
			Random r = new Random();
			int k = r.nextInt(100) + 1;
			System.out.println("수를 결정하였습니다. 맞추어 보세요"+k);
			int max = 100;
			int min = 1;
			for (int i = 1; i < 10000; i++) {

				System.out.println(min + "-" + max);
				System.out.print(i + ">>");
				int number = scanner.nextInt();
				if (number < k) {
					System.out.println("더 높게");
					min = number;
				} else if (number > k) {
					System.out.println("더 낮게");
					max = number;
				} else {
					System.out.print("맞았습니다.\n다시하시겠습니까(y/n)>>");
					String answer = scanner.nextLine();
					if (answer.equals("y")) {
						quit = false;
						return;
						// break;
					}
				}

//			String answer = scanner.nextLine();

			}
		}
		scanner.close();
	}

	// String answer = scanner.nextLine();

	// if(answer.equals("y"))
}
