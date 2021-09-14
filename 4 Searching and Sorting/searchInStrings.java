public class searchInStrings {
    public static void main(String[] args) {
        String name = "rajib mondal";
        char target = ' ';
        System.out.println(searchString2(name, target));
    }

    static boolean searchString(String str, char target) {
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

    //Enhanced forEach loop
    static boolean searchString2(String str, char target) {
        if (str.length() == 0) {
            return false;
        }
        for (char ch : str.toCharArray()) {
            if (ch == target) {
                return true;
            }
        }
        return false;
    }
}
