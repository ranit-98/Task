import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class array {
    public static void main(String[]args){
        int arr[]=new int[10];
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the elements of array:");
    try{ 
        for(int i=0;i<arr.length;i++){
           
            arr[i]=Integer.parseInt(br.readLine());
            
            
        }
        System.out.println("Entered Array is:");
        for(int j=0;j<arr.length;j++){
            System.out.print(arr[j]+" ");
        }
        System.out.println(" ");
        System.out.println("After Sorting this Array we get: ");
        int l=arr.length;
        for(int i=0;i<l;i++){
            for(int j=0;j<l-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    
                }
            }
        }
        for(int k=0;k<l;k++){
            System.out.print(arr[k]+" ");
        }
        System.out.println("For searching k th largest element");
        System.out.println("----------------------------------");
        System.out.println("Enter the value of k:");
        int k=Integer.parseInt(br.readLine());
        System.out.println("the"+k+"th largest element is: ");
        for(int i=0;i<l-1;i++){
            for(int j=i+1;j<l;j++){
                if(arr[i]>arr[j]){
                    int big=arr[i];
                    arr[i]=arr[j];
                    arr[j]=big;
                }
            }
            if(i==k){
                System.out.println(arr[l-i]+" ");
                break;
            }
        }
        
       }catch(Exception e){
           System.out.println(e);
       }
    }
    
}
