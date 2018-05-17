/* 
    Try This 5-1
    Demonstrate the Bubble sort.
*/

class Bubble {
    public static void main(String args[]) {
        int nums[] = {99, -10, 100123, 18, -978, 5623, 463, -9, 287, 49 };

        int a, b, t;
        int size;

        size = 10; // size of the array (# of elements to sort)

        // display original array
        System.out.print("Original array is:");
        for(int i=0; i < size; i++)
            System.out.print(" " + nums[i]);
        System.out.println("\n\n");

        // This is the Bubble sort
        for(a=1; a < size; a++) {
            for(b=size-1; b>=a; b--){
                if(nums[b-1] > nums[b]){ // if out of order
                    // exchange elements
                    t = nums[b-1];
                    nums[b-1] = nums[b];
                    nums[b] = t;
                    System.out.println("Processed array when b = " + b);
                    System.out.print("Processed inner array is:");
                    for(int i=0; i < size; i++)
                            System.out.print(" " + nums[i]);
                    System.out.println();
                }
            }
            System.out.println("Processed array when a = " + a);
            System.out.print("Processed array is:");
            for(int i=0; i < size; i++)
                System.out.print(" " + nums[i]);
            System.out.println("\n\n");
        }
        
        // display sorted array
        System.out.print("Sorted array is:");
        for(int i=0; i < size; i++)
            System.out.print(" " + nums[i]);
        System.out.println();

    }
}


