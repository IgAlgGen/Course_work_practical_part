package My.Tests.Two;

public class Main {

    public static void main(String[] args) {
        String string = new String("dkjhasdgjfsa0");

        System.out.println(stringSeparator(string));

        System.out.println(string.substring(0,string.length()/2));
        System.out.println(string.substring(string.length()/2));


    }

    public static String stringSeparator(String string) {
        char[] charsOfString = string.toCharArray();
        StringBuilder newString1 = new StringBuilder();
        for (int i = 0; i < string.length() / 2; i++) {
            newString1.append(charsOfString[i]);
        }
        StringBuilder newString2 = new StringBuilder();
        for (int i = string.length() / 2; i < string.length(); i++) {
            newString2.append(charsOfString[i]);
        }
        return newString1 + "___" + newString2;

    }
}