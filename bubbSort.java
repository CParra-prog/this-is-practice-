class bubbSort {
  bubbSort(int[] arr) {
    int temp = 0;
    for(int j  = 0; j < arr.length; j++) {
      for(int i = 0; i < arr.length-1; i++) {
      // after first pass left-most elem is considered sorted
          if(arr[i] > arr[i+1]) {
            temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
          }
      }
    }
    for(int e: arr) {
      System.out.println(e);
    }
  }


}