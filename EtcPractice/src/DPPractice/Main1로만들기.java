package DPPractice;

import java.util.Scanner;

/**
 * 다이나믹 프로그래밍
 * 1로 만들기
 */
class Main1로만들기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		sc.close();
		int[] dp = new int[30001];
		
		for(int i =2; i<= x; i++) {
			dp[i] = dp[i-1] +1;
			if(i%2 == 0) {
				dp[i] = Math.min(dp[i], dp[i/2] + 1);
			}
			if(i%3 == 0) {
				dp[i] = Math.min(dp[i], dp[i/3] + 1);
			}
			if(i%5 == 0) {
				dp[i] = Math.min(dp[i], dp[i/5] + 1);
			}
		}
		System.out.println(dp[x]);
	}
}
