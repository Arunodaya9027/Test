import java.util.Scanner;

public class CountEvenOdd {
	public static void main(String[] args) {
		int size, evenCount = 0, oddCount = 0;
		Scanner input = new Scanner(System.in);
		size = input.nextInt();
		int[] arr = new int[size];
		for(int i=0; i<size; i++)
			arr[i] = input.nextInt();

		for(int num: arr) {
			if(num % 2 == 0)
				evenCount++;
			else
				oddCount++;
		}

		System.out.printf("The even elements in array are %d and odd elements are %d", evenCount, oddCount);
	}
}
