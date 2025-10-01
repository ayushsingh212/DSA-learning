//  import java.util.Scanner;
// public class Sarr{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();
//         int numbers[] = new int[size];
//         for(int i =0;i<size;i++){
//             numbers[i]=sc.nextInt();
//             sc.close();
//         }
//         for(int i =0;i<size;i++){
//             System.out.println(numbers[i]);
//         }
//     }
// } 
import java.util.Scanner;
public class Sarr{
    public static void main(String [] args){
        int a;
        System.out.println("enter how much star you want to print");
        Scanner d=new Scanner(System.in);
        d.close();
        a=d.nextInt();
        for(int i=0;i<=a;i++){
            for(int j=0;j<=i;j++){
                System.out.println("*");
            }
        }
        System.out.println(" ");

    }
}