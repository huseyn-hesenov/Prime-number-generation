import java.util.Scanner;

public class PrimeNumberGeneration {
    
    public static void main(String[] args) {
/*
this code finds prime numbers between one and hundred
 */

        int j,count;
        System.out.print("enter number : ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=2;i<=n;i++)
        {
            count=0;
            for(j=1;j<=i;j++)
            {
                if(i%j==0)
                {
                    count++;
                }
            }
            if(count==2)
                System.out.print(i+"  ");
        }


    }
}
