import java.util.Scanner;

public class SubarrayProducts {

	public static void main(String[] args) {


		int n;
		Scanner sc =new Scanner(System.in);

		n=sc.nextInt();
		int[] arr =new int[n];
		for (int i = 0; i < n ; i++) {
			arr[i] = sc.nextInt();
		}
		int k=sc.nextInt();
		subArr(arr,k);
	}

	private static void subArr(int[] arr,int k) {

		int prod=1;
		int left =0;
		int right =0;
		int result =0;
		
		while(right < arr.length)
		{
			prod *= arr[right];
			
			while(prod >= k)
			{
				prod /= arr[left];
				left++;
			}
			
			result += (right-left) + 1;
			right++;
		}
		System.out.println(result);
	}

}