public class MoveZeros {


    public static void moveZerosToEnd(int[] nums) {


        int i = 0;// index to iterate through the array



        // Move all non-zero elements to the front of the array


        for (int j = 0; j < nums.length; j++) {


            if (nums[j] != 0) {


                nums[i] = nums[j];


                i++;

            
    }

        
}


        // Fill the remaining positions with zeros


        while (i < nums.length) {


            nums[i] = 0;


            i++;


        }

    
}



   public static void main(String[] args) {


        int[] nums = {0, 1, 0, 3, 12};


        moveZerosToEnd(nums);



        // Print the modified array


        for (int num : nums) {


            System.out.print(num + " ");


        }


    }

}