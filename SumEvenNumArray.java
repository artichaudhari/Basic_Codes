import java.util.Scanner;
public class SumEvenNumArray{
    public static void main (String []args){
        Scanner sa = new Scanner(System.in);
        int n = sa.nextInt();
        int []arr = new int[n];

        for (int i = 0; i<n ;i++)
            arr[i] = sa.nextInt();

        int sum = 0;
        for(int i = 0; i<n; i++){
            if(arr[i]%2==0){
                sum+=arr[i];
            }
        }
        System.out.println(sum);
    }
}
