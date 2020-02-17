
package beginerjava;

import java.util.Scanner;

public class EvenOddSum {
    public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
    int m,n,sum=0,i,sum1=0;
        System.out.print("Enter first number :"); 
        m=input.nextInt();
        System.out.print("Enter second number :");
        n=input.nextInt();
        for(i=m;i<=n;i++){
        if(i%2==0){
            sum=sum+i;
            System.out.print(" "+i);
        }
        }
        for(i=m;i<=n;i++){
        if(i%2!=0){
            sum1=sum1+i;
            System.out.print(" "+i);}
        }
        
   
        System.out.println(" ");
        System.out.println("sum of even :"+sum);
        System.out.println("sum of odd :"+sum1);
       
    }
            
            
            

    }
    
     
    
    

