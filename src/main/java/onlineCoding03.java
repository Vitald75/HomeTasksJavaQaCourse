public class onlineCoding03 {

    public static void main(String[] args) {
        String str = "A111s5FG67jdfhJ";
        String replacedString = str.replaceAll("[0-9]", "=");
        String replacedString2 = replacedString.replaceAll("[a-zA-Z]", "1");
        String replacedString3 = replacedString2.replaceAll("=", "A");

        System.out.println(str);
        System.out.println(replacedString3);

    }


}
