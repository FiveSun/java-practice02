package practice02;

public class Prob04 {

//	[문제4]
//			문자열(String)을 입력 받아, 해당 문자열을 문자 순서를 뒤집어서 char[]로 반환하는 메소드를 만들고, 
//	char[]을 입력 받아 출력하는 메소드를 만드시오.

	public static void main(String[] args) {
		char[] arrayReverse1 = reverse("Hello World");
		printCharArray(arrayReverse1);
		
		char[] arrayReverse2 = reverse("Java Programming!");
		printCharArray(arrayReverse2);
	}

	public static char[] reverse(String  str) {
		char[] tempchar;
		tempchar = new char[str.length()];
		for(int i=0; i < str.length(); i++) {
			tempchar[str.length()-1 - i] = str.charAt(i);
		}
		return tempchar;
	}
	
	public static void printCharArray(char[] array) {
		System.out.println(array);
	}
}
