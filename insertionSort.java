class insertionSort {
  insertionSort(int[] arr) {
    int temp = 0;
    for(int i=1; i < arr.length; i++) {

      for(int j=0;j < i; j++) {
        if(arr[j] > arr[i]) {
          temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
          temp = 0;
        }
      }

    }
    for(int e : arr) {
      System.out.println(e);
    }
  }
}