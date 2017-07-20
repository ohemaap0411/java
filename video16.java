import java.util.Scanner;

class video16{
    public static void main(String args[]){
       Scanner input = new Scanner(System.in);
       vid16 vid16Object = new vid16();
       System.out.println("Enter name of first gf here: ");
       String temp = input.nextLine();
       vid16Object.setName(temp);
       vid16Object.saying();
    }
}