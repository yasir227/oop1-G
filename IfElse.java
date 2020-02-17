
package beginerjava;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.println("Enter any integer number:");
        num = input.nextInt();
        
        if(num>0){
        System.out.println("positive");
    }
        else if(num<0){
        System.out.println("negetive");
    }
        else{
        System.out.println("equal zero");}
    
    }
            
    
}
