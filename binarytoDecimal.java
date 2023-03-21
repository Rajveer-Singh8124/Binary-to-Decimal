import java.util.*;
public class binarytoDecimal {

    public static void binary_to_decimal(int n) {
        int power = 0;
        int decimal = 0;
        
        while(n > 0){

            // for last digit we need to find it reminder by divided by 10
            // for more detail check below psedo code
            int lastDigit = n % 10;

            decimal = decimal + lastDigit * (int) (Math.pow(2, power));
            
            // for Remove the last digit we need to take it single divide by 10
            // for more detail check below psedo code
            n /= 10;
            
            power++;

        }
        System.out.println(decimal);
        
        
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        
        System.out.print("Binary Number : ");    
        int n = sc.nextInt();
        binary_to_decimal(n);
        sc.close();
    }
}

/*  
e.g. let's binary number (n) = 100 in decimal it is 4 
after call the function 
  
1 st loop
    100 > 0  is True
    lastdigit = 100 % 10 = 0
    decimal = 0 + 0 * (2 to the power 0) = 0
    n = 100 / 10 = 10
    power = 0 + 1 = 1

2 nd loop
    now n = 10
    10 > 0 is True
    lastdigit = 10 % 10 = 0
    decimal = 0 + 0 * (2 to the power 1) = 0
    n = 10 / 10 = 1
    power = 1 + 1 = 2

3 rd loop
    Now n = 1
    1 > 0 is True
    lastdigit = 1 % 10 = 1
    decimal = 0 + 1 * (2 to the power 2) = 4
    n = 1 / 10 = 0
    power = 2 + 1 = 3
    
final loop
    Now n = 0
    0>0 is False

So decimal number  = 4

 */
 
