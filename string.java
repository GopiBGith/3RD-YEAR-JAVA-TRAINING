import java.util.Scanner;

public class string {
    public static void main (String[]args){
        Scanner dog = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String a = dog.nextLine();
       // String a="jayaseelan";
        String b="";
    for(int i = a.length()-1 ;i>=0;i--){
        b=b+ a.charAt(i);
    }
    int car=a.length();


        int vowels = 0;
        int consonants = 0;

    
        for (int i = 0; i < a.length(); i++) {
            char ch = Character.toLowerCase(a.charAt(i));

            if (Character.isLetter(ch)) {
                if (ch == 'a' || ch == 'e' || ch == 'i'
                        || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

    
        System.out.println("total words: " + a.length());
        System.out.println("V: " + vowels);
        System.out.println("C: " + consonants);

        
        String cleaned = a.replaceAll("s+", "")
                            .toLowerCase();

        String reversed = new StringBuilder(cleaned)
                            .reverse().toString();

        if (cleaned.equals(reversed)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }


    System.out.println("count of name:"+car);
    System.out.println("reveres word:"+b);

    }}
