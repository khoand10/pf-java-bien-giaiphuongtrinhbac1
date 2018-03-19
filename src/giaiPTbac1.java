import java.util.Scanner;

public class giaiPTbac1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so a: ");
        int a = input.nextInt();
        System.out.println("nhap so b: ");
        int b = input.nextInt();
        if(a==0)
        {
            if(b==0)
            {
                System.out.println("PT co vo so nghiem!!!");
            }
            else
            {
                System.out.println("PT vo nghiem!!!");
            }
        }
        else
        {
            System.out.println("PT co 1 nghiem x= "+(double)(-b)/a);
        }
    }
}
