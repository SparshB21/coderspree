import java.util.*;

public class PrimeFactorisation{
  
    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
      int n = sc.nextInt();
      int i;
      for(i=1;i<=n/2;i++)
      {
        if(n%i==0)
        {System.out.println(i);}
        sc.close();
      }
    }
}