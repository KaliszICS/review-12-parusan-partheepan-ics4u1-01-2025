public class PracticeProblem {

    public static void main(String args[]) {

    }

//Question 1
public static boolean isPalindrome(String word) {
    word = word.toLowerCase().replace(" ", "");
    String rev = "";
    for (int i = word.length() - 1; i >= 0; i--) {
        rev = rev + word.charAt(i);
    }
            return word.equals(rev);

}
//Question 2
public static int getAge(String[] names, int[] ages, String name) {
    for (int i = 0; i < names.length; i++) {
        if (names[i].equalsIgnoreCase(name)) {
            return ages[i];
        }
    }
    return -1;
}
//Question 3
public static int countWords(String s1, char c1) {
    int count = 0;
    String[] words = s1.split(" ");
    for (String word : words) {
        if(word.toLowerCase().indexOf(Character.toLowerCase(c1)) != -1) { 
            count++;
    }
}
return count;
}
}