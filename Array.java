public class Array {
    public static void main(String[] args) {
        
        //=> Most 
        String[] furit = {"Apple","Mango","guavava"};
        System.out.println(furit[0]);
        furit[0] = "banana";
        System.out.println(furit[0]);

        //=> use new when you have creat array and fill the value after
        String[] cars = new String[3];
         cars[0] = "volvo";
         cars[1] = "BMW";
         cars[2] = "kiya"; 
         System.out.println(cars[1]);
         System.out.println(cars[5]);  //error

         //=>.leanght to know the size of array
         int size = cars.length;
         System.out.println("Size of array : " +size);

         //=> loop trowout array
         for(int i = 0; i <= size; i++){
            System.out.println("index : " + i + " value : " + cars[i]);
         }

         //=> Use it when you dont know the size 
         String[] colors = new String[] {"Pink","red","green","yellow"};
         System.out.println(colors[3]);

    }
}

    class Student {
        int roll_no;
        String name;
        float mark;

        public Student(int r,String n,float m) {
            r = roll_no;
            n = name;
            m = mark;
        }
    }

    class display {
        public static void main(String[] args) {

            //declares student array
            Student[] arr;
            
            //allocating memory for 2 objects of student type
            arr = new Student[2];

            //intalizting value
            arr[0] = new Student(135,"jack",85.32);
            arr[1] = new Student(766,"max",74.23);
            arr[2] = new Student(652,"rose",.91.56);

        }
    }

