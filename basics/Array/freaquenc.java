public class freaquenc {
    public static void main(String[] args){
        int arr[] = {2,5,4,2,6,2,5};

        for(int i = 0; i < arr.length; i++){
            int count = 1;
            //System.out.println("outter loop : " + arr[i]);

            for(int j = 0; j < arr.length; j++){
                //System.out.println("inner loop : " +arr[j]);
                if(arr[i] == arr[j] && i != j){
                    //System.out.println("same ele : " + arr[j]);
                    count++;
                    }
                }
                System.out.println(arr[i] +  " appears -> " + count + " time");     
            }
        }
}
