
public class Cheers {
        public static void main(String[] args) {
            String input = args[0].toUpperCase(); // נהפוך לאותיות גדולות
            int count = Integer.parseInt(args[1]); // המרת המספר
    
            for (int i = 0; i < input.length(); i++) {
                char ch = input.charAt(i);
                if (isVowelOrSpecial(ch)) {
                    System.out.println("Give me an " + ch + ": " + ch + "!");
                } else {
                    System.out.println("Give me a " + ch + ": " + ch + "!");
                }
            }
    
            for (int i = 0; i < count; i++) {
                System.out.println(input + "!!!");
            }
        }
    
   
        public static boolean isVowelOrSpecial(char ch) {
            String specialLetters = "AEFHILMNORSX"; 
            return specialLetters.indexOf(ch) >= 0; 
        }
    }
    