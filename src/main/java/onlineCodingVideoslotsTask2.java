public class onlineCodingVideoslotsTask2 {
    public static void main(String[] args) {
        System.out.println(checkIfStringPalindrom("NSN"));

    }
    public static boolean checkIfStringPalindrom(String s) {
        boolean result = true;
        for (int i = 0; i < s.length()/2; i++) {
            if (s.charAt(i) != s.charAt(s.length()-i-1)) {
                return false;
            }
        }
        return result;
    }
}
