public class createarray {

    public static void main(String[] args) {
        int age[]= {18,12,13,15,8,16};
        // int age [] = new int[6];
        // age[0]=12;
        // age[1]=13; 
        // age[2]=14;
        // age[3]=15;
        // age[4]=16;
        // age[5]=17;
    System.out.println(age[3]);
    // for(int i=0;i<=age.length;i++){
        // if(age[i]==15){
        //     System.out.println("you are a child");
        
        
        // }
        // int sum = 0;
        // System.out.println(age[5]);  
        // for (int nums: age){
        //    sum += nums;
        // }
        // System.out.println(sum);
        int min = Integer.MAX_VALUE;
        System.out.println(min);
        for (int nums: age) {
            if (nums < min) {
                min = nums;
            }
            System.out.println(min);
        }
    }
    
    // }

//  create 2D array
// public class createarray {
// public static void main(String[] args) {
//     int marks [] [] = new int[3] [4];
//     marks [0] [0]=12;
    
//     marks [0][0]= 2;
//     marks [0][1]= 34;
//     marks [0][2]= 23;

//     marks [1][0]= 34;
//     marks [1][1]= 45;
//     marks [1][2]= 24;

//     marks [2][0]= 54;
//     marks [2][1]= 55;
//     marks [2][2]= 44;

//     marks [3][0]= 33;
//     marks [3][1]= 46;
//     marks [3][2]= 67;
//     System.out.println(marks[1][1]);

// // 2nd method
//     int marks[][] ={
//         {22, 23, 34},
//         {33, 45, 43},
//         {12, 25, 54},
//         {55, 43, 42}

//     };
//     System.out.println(marks[1][2]);


        // Creating and initializing a 3D array
        // int[][][] array = {
        //     {
        //         {1, 2, 3, 4, 5},
        //         {6, 7, 8, 9, 10},
        //         {11, 12, 13, 14, 15},
        //         {16, 17, 18, 19, 20}
        //     },
        //     {
        //         {21, 22, 23, 24, 25},
        //         {26, 27, 28, 29, 30},
        //         {31, 32, 33, 34, 35},
        //         {36, 37, 38, 39, 40}
        //     },
        //     {
        //         {41, 42, 43, 44, 45},
        //         {46, 47, 48, 49, 50},
        //         {51, 52, 53, 54, 55},
        //         {56, 57, 58, 59, 60}
        //     }
        // };

        // // Traversing the 3D array
        // for (int i = 0; i < array.length; i++) {
        //     for (int j = 0; j < array[i].length; j++) {
        //         for (int k = 0; k < array[i][j].length; k++) {
        //             System.out.print(array[i][j][k] + " ");
        //         }
        //         System.out.println();
        //     }
        //     System.out.println();
        // }

        // create 4d array
        // int[][][][] array = {
        //     {
        //         {
        //             {1, 2, 3, 4, 5},
        //             {6, 7, 8, 9, 10},
        //             {11, 12, 13, 14, 15},
        //             },
        //             {
        //                 {16, 17, 18, 19, 20},
        //                 {21, 22, 23, 24, 25},
        //                 {26, 27, 28, 29, 30},
        //                 }
        //                 },
        //                 {
        //                     {
        //                         {31, 32, 33, 34, 35},
        //                         {36, 37, 38, 39, 40},
        //                         {41, 42, 43, 44, 45},
        //                         {46, 47, 48, 49, 50},
        //                         {51, 52, 53, 54, 55},
        //                         {56, 57, 58, 59, 60}
        //                         }
        //                         }
        //                         };
        //                         // Traversing the 4D array
        //                         for (int i = 0; i < array.length; i++) {
        //                             for (int j = 0; j < array[i].length; j++) {
        //                                 for (int k = 0; k < array[i][j].length; k++)
        //                                 for (int l = 0; l < array[i][j][k].length;
        //                                 l++) {
        //                                     System.out.print(array[i][j][k][l] + " ");
        //                                     }
        //                                     System.out.println();
        //                                     }
        //                                     System.out.println();
// }
// }
}
