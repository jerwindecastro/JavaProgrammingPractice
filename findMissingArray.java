public class findMissingArray {

	public void findMissingNumber(int arr[]) {
        int resSum = 0;
        int n = arr.length + 1;
        int sum = n * (n + 1)/2;
		for (int i = 0; i < arr.length; i++) {
           resSum += arr[i];
		}
		System.out.println("The missing number is " + (sum - resSum) );

	}

	public static void main(String args[]) {
        int inputArray[] = {1,3,4,5,6,7,8,9,10}; 
		findMissingArray find = new findMissingArray();
		find.findMissingNumber(inputArray);
		
	}
}
