public class BubbleSort {
 public static void main(String[] args) {
 int[] arr = {64, 34, 25, 12, 22, 11, 90};
 // Bubble Sort in one function
 for (int i = 0; i < arr.length - 1; i++) {
 for (int j = 0; j < arr.length - i - 1; j++) {
 if (arr[j] > arr[j + 1]) {
 // Swap elements
 int temp = arr[j];
 arr[j] = arr[j + 1];
 arr[j + 1] = temp;
 }
 }
 }
 for (int i = 0; i < arr.length; i++) {
 System.out.print(arr[i] + " ");
 }
 }}