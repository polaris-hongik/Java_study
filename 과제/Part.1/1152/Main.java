import java.util.Scanner;

public class Main {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		
    	int count = line.length()-line.replaceAll(" ", "").length()+1;
		if(line.substring(0,1).equals(" ")) {
			count--;
		}
		if(line.substring(line.length()-1).equals(" ")) {
			count--;
		}
		System.out.println(count);
		
		
		sc.close();
	}
}
