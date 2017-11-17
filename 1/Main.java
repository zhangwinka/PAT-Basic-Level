import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		scanner.close();
		int count = 0;
		while(number != 1) {
			if(number%2 != 0) {
				number = 3*number + 1;
			}
			number /= 2;
			count ++;
		}
		System.out.println(count);
    
	}

}
