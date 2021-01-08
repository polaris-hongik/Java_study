import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	int h = Integer.parseInt(sc.next());
    	int m = Integer.parseInt(sc.next());
    	
    	int time[] = cal(h,m);
    	
    	System.out.println(time[0]+" "+time[1]);

    	sc.close();
    }
    public static int[] cal(int h , int m) {
    	if(m < 45) {
    		if(h == 0) {
    			int result[] = {h+23, m+15};
    			return result;
    		}else {
    			int result[] = {h-1, m+15};
    			return result;
    		}
    	} else {
    		int result[] = {h, m-45};
    		return result;
    	}
    }
}
