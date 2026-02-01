class large_num {
    public static void main(String[] args) {
        int[] arr = {14,12,36,58,5,3,87};
        
        int small = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < small){
                small = arr[i];
               
            }
        }
        System.out.println("smallest element  = " + small);
    }
}