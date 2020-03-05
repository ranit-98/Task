
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.InputStreamReader;
import java.io.BufferedReader;
  public class file_creation  {
    public static void main(String[] args) {
       int ch;
       System.out.print("Enter 1 to create new file or enter 2 to write to existing File or 3 to read the file or 4 to delete any file: ");
    try{
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       ch=Integer.parseInt(br.readLine());
       switch(ch){
           case 1:
       
      //initialize File constructor
          String s1="C:\\Users\\Ranit\\Desktop\\java_prog\\";
          String s2;
          System.out.print("Enter the file name and then add .txt: ");
          s2=br.readLine();
          String F=s1.concat(s2);
          File file = new File(F);
      
             boolean createFile = file.createNewFile();
            if (createFile) {
              System.out.println("New File is created.");
            }else {
              System.out.println("File already exists.");
            }
       
            break;
            
           case 2:
             String FM;
             System.out.println("Enter the file name in .txt format: ");
             FM=br.readLine();
             FileWriter myWriter = new FileWriter(FM);
             String content;
             System.out.println("Enter the contents you want to write in a file");
             content=br.readLine();
             myWriter.write(content);
             myWriter.close();
             System.out.println("Successfully wrote to the file.");
             break;
             
           case 3:
             String FM1;
             System.out.println("Enter the file name in .txt format: ");
             FM1=br.readLine();
             File myObj = new File(FM1);
             Scanner myReader = new Scanner(myObj);
             while (myReader.hasNextLine()) {
              String data = myReader.nextLine();
              System.out.println(data);
            }
            myReader.close();
            break;
            
           case 4:
                String FM2;
                 System.out.println("Enter the file name in .txt format: ");
                FM2=br.readLine();
                File myObj1 = new File(FM2); 
                if (myObj1.delete()) { 
                System.out.println("Deleted the file: " + myObj1.getName());
                } else {
                         System.out.println("Failed to delete the file.");
                        } 
                break;
           default : System.out.print("Enter a valid choice");
    }
      } catch (IOException e) {
        e.printStackTrace();
      }
   

    }
  }