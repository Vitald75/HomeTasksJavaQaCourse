// Дана строка s, состоящая из слов и пробелов. Верните длину последнего слова в строке.

public class Task14 {
    public static void main(String[] args) {
        String initialString = " Начальная    строка   с пробелами       ";
        System.out.println("Длина последнего слова: " + getLengthOfLastWord(initialString));
    }

    public static int getLengthOfLastWord(String s){
        String s1 = s.trim();
        if (s1.length() == 0) {
            System.out.println("В исходной строке нет слов");
            return 0;
        } else {  //строка содержит слова
            int indexOfLastSpace = s1.lastIndexOf(" ");
            s1 = s1.substring(indexOfLastSpace + 1);
            System.out.println("Последнее слово:" + s1);
            return s1.length();
        }
    }
}




