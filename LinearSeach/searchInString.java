package LinearSeach;

public class searchInString {
    public static void main(String[] args) {
        String name = "Dharmen";
        char target = 'D';
        boolean ans = linearSearch(name, target);
        System.out.println(ans);
    }

    static boolean linearSearch(String str, char target){
        if (str.length() == 0) {
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)) {
                return true;
            }
        }
        return false;
    }
}
