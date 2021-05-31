import java.util.Scanner;
import java.util.Arrays;
public class selection_sorting{
    public void sort(int a[]){
        for (int i=0; i<a.length; i++){
            for (int j=0; j<a.length; j++){
                if (a[j]>a[i]){
                    int temp= a[j];
                    a[j]=a[i];
                    a[i]=temp;
                                }
            }
        }
    }
    
        public static void main(String args[]){
    int a[]={2, 9, 4, 3, 1};
    selection_sorting ss= new selection_sorting();
    ss.sort(a);
    System.out.print(Arrays.toString(a)); 
    }
    } 
