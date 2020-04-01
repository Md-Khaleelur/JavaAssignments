import java.util.Scanner;

public class StringCheckMain {

        public static void main(String[] args)
        {
            String message;
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the string");
            message=sc.nextLine();

            StringCheck hc =new StringCheck(message);

            if(hc.hashcheck())
            {
                System.out.println("Given string contains all the alphabets");
            }
            else
            {
                System.out.println("String does not contain all the alphabets");
            }
        }


}
