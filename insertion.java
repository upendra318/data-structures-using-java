
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

class insertion{
    public int inser(int arr[]) {
        int j, temp;
        for (int i=1; i<a; i++ ){
            j=i-1;
                while(j>=0 && arr[j]>arr[i]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    j-=1;
                }
            }
            return arr;
        }
    
    public static void main(String[] args)throws Exception {
        InputStreamReader r=new InputStreamReader(System.in); 
        BufferedReader br = new BufferedReader(r);
        String s =br.readLine();
        String[] ss= s.trim().split("\\s+");
        int num= ss.length;
        int[] aa1= new int[num];
        for (int i=0; i<num; i++){
            aa1[i]=Integer.parseInt(ss[i]);
        }
        insertion in1 = new insertion();
         in1.inser(aa1);
        System.out.print(Arrays.toString(aa1));
    } 
}