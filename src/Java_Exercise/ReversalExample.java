package Java_Exercise;

public class ReversalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String str = "Anybody can do the automation";
//		String reverse = "";
//		System.out.println(str);
//		for (int i = str.length()-1; i >= 0; i--) {
//			reverse = reverse + str.charAt(i);
//		}
//		System.out.println(reverse);
		
		int num = 17092025;
		int sum = 0;
		String numsString = Integer.toString(num);
		
		for (int i = 0; i < numsString.length(); i++) {
			int digit = Integer.parseInt(numsString, i, i+1, 10);
			sum = sum + digit;
		}
		System.out.println(sum);
		
//		while (num>0) {
//			int rem = num % 10;
//			num = num/10;
//			sum = sum + rem;
//		}
//		System.out.println("Sum is "+sum);
	}
}
