import java.util.Scanner;
import java.util.Arrays;

public class MoveZeroes{
        public static void moveZeroes(int [] nums){
            int j = 0;
            for (int i = 0; i < nums.length; i++){
                if(nums[i] != 0){
                    int temp = nums[i];
                    nums [i] = nums[j];
                    nums [j] = temp;
                    j++;
                }
            }
        }
        public static void main(String [] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the size of the array");
            int size = sc.nextInt();
            int [] arr = new int [size];
            System.out.println("enter the " + size + " element in your array");
            for(int i = 0; i < arr.length; i++){
             arr[i] = sc.nextInt();
             
            }
            sc.close();
            System.out.println("Original array given by you " + Arrays.toString(arr));
            moveZeroes(arr);
            System.out.println("Your modified array after the move zeroes at the end " + Arrays.toString(arr));
        }
    }
// import java.util.Scanner;
// class MoveZeroes {
//  public static void main(String [] args){
//      Scanner sc = new Scanner(System.in);
//      int a = sc.nextInt();
//      for (int i = 0; i<=a ; i++){
//          for(int j= 1; j<1; j++){
//              System.out.print("*");
//          }
//          System.out.println(" ");
//      }
//      sc.close();
//  }
// }