package dustmq;
import java.util.Scanner;

public class dustmq {
	
	public static void main(String[] args) {
		
	System.out.println("모음 갯수 세기");
	System.out.print("영어문장 하나를 입력하세요 : ");
	
	String a;
	 int n=0;
	
	Scanner scan = new Scanner(System.in);
	a = scan.nextLine();
	
	System.out.println("문장 : "+a);
	
	for(int i=0; i < a.length(); i++) {
		
		switch (a.charAt(i)) {
		
		case 'a' : n++; break;
		
		case 'e' : n++; break;
		
		case 'u' : n++; break;
		
		case 'i' : n++; break;
		
		case 'o' : n++; break;
		
		default : break;
		}
	}
	System.out.println( "모음의 개수 : " + n);
	}
}