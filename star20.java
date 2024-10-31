import java.util.Scanner;
public class star20 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.err.println("masukan nilai N = ");
        int N = sc.nextInt();

        for (int i = 1; i <=N; i++){
            System.out.print("*");
        } 

    }
}