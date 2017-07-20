import java.util.Scanner;

class video15{
    public static void main(String args[]){
        
        Scanner input = new Scanner(System.in);
        vid15 vid15Object = new vid15 ();
        
        System.out.println("Enter your name here: ");
        String name = input.nextLine();
        
        vid15Object.simpleMessage(name);
    }
}