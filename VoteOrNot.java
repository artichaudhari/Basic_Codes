import java.util.Scanner;
public class VoteOrNot{
    public static void main (String [] args){
        Scanner sa = new Scanner(System.in);
        int n = sa.nextInt();
        if (n>=18){
            System.out.println("Yes Vote");
        }
        else{
            System.out.println("Not Vote");
        }
    }


}