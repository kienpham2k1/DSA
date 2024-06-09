public class BubbleSortExample {
        static void bubbleSort(int[] arr) {
                int n = arr.length;
                int temp = 0;
                for (int i = 0; i < n - 1; i++) {
                        for (int j = i + 1; j < n; j++) {
                                if (arr[i] > arr[j]) {
                                        temp = arr[j];
                                        arr[j] = arr[i];
                                        arr[i] = temp;
                                }
                        }
                }

        }

        public static void main(String[] args) {
                int arr[] = { 3, 60, 35, 2, 45, 320, 5 ,-12};

                System.out.println("Array Before Bubble Sort");
                for (int i = 0; i < arr.length; i++) {
                        System.out.print(arr[i] + " ");
                }
                System.out.println();

                bubbleSort(arr);// sorting array elements using bubble sort

                System.out.println("Array After Bubble Sort");
                for (int i = 0; i < arr.length; i++) {
                        System.out.print(arr[i] + " ");
                }

        }
}