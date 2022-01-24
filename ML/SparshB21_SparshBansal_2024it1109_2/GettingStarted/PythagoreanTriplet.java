import java.util.*;

import java.util.*;

public class PythagoreanTriplet{
  
    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();

      if(a*a+b*b==c*c || a*a+c*c==b*b || c*c+b*b==a*a)
      System.out.println("Pythagorean Triplet");
      else 
      System.out.println("Not");
      sc.close();
    }
}
