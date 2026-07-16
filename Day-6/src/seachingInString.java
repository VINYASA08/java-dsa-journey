public class seachingInString {

    static void main(String[] args) {
        String str = "abc";
        char target = 'a';
        System.out.println(searchInString(str,target));
    }

    static boolean searchInString(String str, char target) {
        if (str.length() == 0) {
            return false;
        }
        for (int i = 0; i < str.length(); i++)
            if (str.charAt(i) == target) {
                return true;
            }
        return false;
    }
}

