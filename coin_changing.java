package DAA_FINAL;
import java.util.*;
//import java.io.*;
public class coin_changing {
	public static int numberOfCoins(int arr[],int sum) {
		int ans=0;
		int n=arr.length;
		int coins[][]=new int[n][sum+1];
		for(int i=0;i<n;i++) {
			coins[i][0]=0;
			
		}
		for(int j=0;j<=sum;j++) {
			coins[0][j]=j;
		}
		for(int i=1;i<n;i++) {
			for(int j=1;j<=sum;j++) {
				if(arr[i]>j) {
					coins[i][j]=coins[i-1][j];
				}
				else {
					coins[i][j]=Math.min(coins[i-1][j], 1+coins[i][j-arr[i]]);
				}
			}
		}
		ans=coins[n-1][sum];
		return ans;
	}
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter THe Lenght of Coins array: ");
	int n=sc.nextInt();
	int CoinsArr[]=new int[n];
	System.out.println("Enter THe Elements in Array: ");
	for(int i=0;i<n;i++) {
		CoinsArr[i]=sc.nextInt();
		
	}
	System.out.println("Enter THe Sum Req: ");
	int sum=sc.nextInt();
	int ans=numberOfCoins(CoinsArr,sum);
	System.out.println("Min no. of coins req to get sum is"+ ans);
}
}
