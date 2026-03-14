public class ValidPalendrome {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        
        while (left < right) {
            if (!Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            } else if (!Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            } else {
                if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                    return false; 
                }
                left++;
                right--;
            }
        }
        return true; 
    }

    public static void main(String[] args) {
        ValidPalendrome solution = new ValidPalendrome();
        
        String test1 = "A man, a plan, a canal: Panama";
        String test2 = "race a car";
        
        System.out.println("Input: \"" + test1 + "\" -> Is Palindrome? " + solution.isPalindrome(test1));
        System.out.println("Input: \"" + test2 + "\" -> Is Palindrome? " + solution.isPalindrome(test2));
    }
}