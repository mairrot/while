import java.util.Scanner;
public class Condicional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num=scan.nextInt();
		while(num!=0) {
			if (num>0) {
				System.out.println(num+" "+"positivo");
			}
			else {
				System.out.println(num+" "+"negativo");
			}
			System.out.println(num+" "+"numero");
			num=num+2;
		}
		if (num==0) {
			System.out.println("fin");
		}	
	}

}
