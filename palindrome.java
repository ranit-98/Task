import java.util.Scanner;
public class palindrome {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        if(str.equals(sb.toString())){
            System.out.println("It is a palindrome");
        }
        else
            System.out.print("It is not a palindrome");
        
    }
       
}
