package dustmq;
import java.util.Scanner;

public class dustmq {
	
	public static void main(String[] args) {
		
	System.out.println("���� ���� ����");
	System.out.print("����� �ϳ��� �Է��ϼ��� : ");
	
	String a;
	 int n=0;
	
	Scanner scan = new Scanner(System.in);
	a = scan.nextLine();
	
	System.out.println("���� : "+a);
	
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
	System.out.println( "������ ���� : " + n);
	}
}