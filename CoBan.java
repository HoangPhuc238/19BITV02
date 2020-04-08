import java.util.Scanner;

public class CoBan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int so ;
		int soNhapVao = 0;
		boolean ketQua = true;
		// ỏ false
		
		Scanner scanner = new Scanner(System.in);
		
		int input = scanner.nextInt();
		
	
		
		/* do {
			//cau lenh
			System.out.println(" so");
			input++;
		}
		while (input < 10);
		
		for (int i = 0;i < 10;      i++) {
			System.out.println("Hello");
		}
		*/
		if (input < 10) {
			
			System.out.println("So nhap vao be hon 10");
			
		}
		else {
			System.out.println("So nhap vao lon hon 10");
		}
	}

}
