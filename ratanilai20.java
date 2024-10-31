import java.util.Scanner;
public class ratanilai20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int i,j;
        float nilaimhs,totalnilai,ratanilai;

        i=1;
        while (i <=5) {
            totalnilai=0;
            System.out.println("input nilai mahasiswa ke " + i);
            for (j=1;j<=5;j++){
                System.out.print("nilai mahasiswa ke " + j + " = ");
                nilaimhs= sc.nextInt();
                totalnilai+=nilaimhs;
            }
            ratanilai = totalnilai/5;
            System.out.println("rata rata nilai mahasiswa ke " + i + " adalah " + ratanilai);
            i++;
        }

        
        
    }
    
}
