import java.util.Scanner;
public class OddNoPrint{
    public static void main (String [] args){
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    scanner.close();
    int i = 1;
    while(n-->0){

        System.out.print(i+ " ");
        i+=2;
    }
}


}