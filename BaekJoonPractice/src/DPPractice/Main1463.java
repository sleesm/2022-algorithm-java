package DPPractice;

import java.util.Scanner;

class Main1463 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		sc.close();
		int[] dp = new int[(int) Math.pow(10, 6) + 1];
		
		for(int i =2; i<= x; i++) {
			dp[i] = dp[i-1] +1;
			if(i%2 == 0) {
				dp[i] = Math.min(dp[i], dp[i/2] + 1);
			}
			if(i%3 == 0) {
				dp[i] = Math.min(dp[i], dp[i/3] + 1);
			}
		}
		System.out.println(dp[x]);
	}
}
