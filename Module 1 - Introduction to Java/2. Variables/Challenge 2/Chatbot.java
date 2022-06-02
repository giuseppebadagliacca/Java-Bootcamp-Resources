import java.util.Scanner;

public class Chatbot {
    public static void main(String[] args) {
        
        //set up scanner. 
        Scanner scan = new Scanner(System.in);

        System.out.println("Hello. What is your name?");
        String name = scan.nextLine();
                           
        System.out.println("\nHi "+name+"! I'm Javabot. Where are you from?");
        String city = scan.nextLine(); 
                        

        System.out.println("\nI hear it's beautiful at "+city+"! I'm from a place called Oracle");
        System.out.println("\nHow old are you?");
        int age = scan.nextInt();

        scan.nextLine();
        System.out.println("\nSo you're "+age+", cool! I'm 400 years old.");
        System.out.println("\nThis means I'm "+(400/age)+" times older than you.");
        System.out.println("\nEnough about me. What's your favourite language? (just don't say Python)");
        String language = scan.nextLine();

        System.out.println("\n"+language+", that's great! Nice chatting with you "+name+". I have to log off now. See ya!");
        
        scan.close();

        
    }
}
