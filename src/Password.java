/*Write java program where user will enter loginid and password as input.
        The password should be 8 digit containing one digit and one special symbol.
        If user enter valid password satisfying above criteria then show “Login Successful Message”.
        If user enter invalid Password then create InvalidPasswordException stating Please enter valid
        password of length 8 containing one digit and one Special Symbol.*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class Password
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int psw[]=new int[7];
        int i;
        System.out.println("Enter password ");
        for(i=0;i<7;i++)
        {
            psw[i]=sc.nextInt();
        }
        try
        {
            if(psw[i]>=65&&psw[i]<=90 || (psw[i]>=97&&psw[i]<=122)|| (psw[i]>=48&&psw[i]<=57))
            {
                InputMismatchException e= new InputMismatchException("Please enter valid password of length 8 containing one digit and one Special Symbol");
            }
        }catch(InputMismatchException IE )
        {
            System.out.println("Enter valid password of length 8 containing one digit and one special symbol ");
        }
    }
}
