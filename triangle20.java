import java.util.Scanner;
public class triangle20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("masukan nilai N = ");

        int N = sc.nextInt();
        int i = 0;
         while (i <= N) {
            int j = 0;
            while (j<i) {
                System.out.print("*");
                j++;
            }
            i++;
         }
        
    }
}
