class selectionSort {
  selectionSort(int[] arr){
    for(int i=0; i < arr.length;i++) {
      for(int j=i; j < arr.length; j++) {
       if(arr[j] <= arr[i]){
          arr[i] = arr[j];
        }
      }
    }

    for(int e: arr) {
      System.out.println(e);
    }
  }
}