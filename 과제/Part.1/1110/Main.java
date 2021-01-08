import java.util.Scanner;

public class Main {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		String num = sc.next();
		int count = 0;
		String nums[] = new String[2];
		if(num.length() == 1) {
			nums[0] = "0";
	    	nums[1] = num;
	    	num = nums[0]+nums[1];
		} else {
			nums = num.split("");
		}
		while(true) {
			nums = step(nums).split("");
			count++;
			if(num.equals(nums[0]+nums[1])) {
				break;
			}
		}
		
		System.out.println(count);
	    
		sc.close();
	}
	public static String step(String[] before) {
		String after[] = new String[2];
		after[0] = before[1];
		after[1] = Integer.toString((Integer.parseInt(before[0])+Integer.parseInt(before[1]))%10);
		return after[0]+after[1];
	}
}
