public class plaindromestring {
    public static boolean palindromeString(String str){
        str = str.toLowerCase().trim();//strings are immutable in nature you need to define the value in a variable

        int left = 0;
        int right = str.length()-1;//length function me string variale leney pe bracket lagta ha
        while(left<right) {
           if(str.charAt(left) != str.charAt(right)){
               return false;
           }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String args[]){
        String str ="aabbaa";
        boolean palindromeString = palindromeString(str);
        System.out.print("palindrome String = "+palindromeString);

    }
}
