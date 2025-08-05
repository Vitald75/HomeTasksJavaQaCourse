public class onlineCoding01 {
    public static void main(String[] args) {
        String s = "aqweratyaftujaduhgafa";
        char ch = 'a';

        System.out.println("String: " + s + " contains " + calcHowManySymbols(s,ch) + " symbols " + ch);
    }

    public static int calcHowManySymbols(String str, Character ch) {
        int counter = 0;
        for (int i=0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                counter ++;
            }
        }
        return counter;
    }
}
