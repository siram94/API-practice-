public class Palindrom {

    public static void main (String []args){

        String palindrome ="madam";
        int start = 0;
        int end = palindrome.length ()-1 ;
    int n =0;
        System.out.println(palindrome);
        for ( int i = 0; i<=palindrome.length();i++) {

        }
            if (palindrome.charAt(start) == palindrome.charAt( end)) {

                System.out.println(palindrome + " it's a palindrom");
            }else {

            System.out.println(palindrome + "it's not a palindrom");
        }

}}
