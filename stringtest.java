import java.io.*;
import java.util.Scanner;
public class stringtest {
    public static void main(String[]args){
        int p,pos,pd,posd;
        int ch;
        String user_string;
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the string: ");
        StringBuilder sb=new StringBuilder(scan.nextLine());
        System.out.println("String :"+sb.toString());
        int len=sb.length();
        System.out.println("Length:"+len);
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Type 1 to insert or type 2 to delete: ");
    try{
         ch=Integer.parseInt(br.readLine());
         switch(ch){
            case 1:
                try{
                    System.out.println("Enter the location you want to insert:");
                    p=Integer.parseInt(br.readLine());
                    System.out.println("Enter the string you want to insert: ");
                    user_string=br.readLine();
                    pos=p-1;
                    sb.insert(pos, user_string);
                    
                    
                   }catch(Exception e){
                    System.out.println(e);
                   }
                   break;
            case 2:
                try{
                    System.out.println("enter the starting location of string deletion: ");
                    pd=Integer.parseInt(br.readLine());
                    System.out.println("Enter the end location of string deletion: ");
                    posd=Integer.parseInt(br.readLine());
                    sb.delete(pd, posd);
                   }catch(Exception e){
                    System.out.println(e);
                    }
                    break;
            default:
                System.out.println("enter correct input");
                
         }
             int len2=sb.length();
             System.out.println("new string: "+sb);
             System.out.println("new length"+len2);
       }catch(IOException e1){
         System.out.println(e1);
        }
    }
    
}
