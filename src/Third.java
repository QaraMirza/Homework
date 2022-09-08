public class Third {
    public static void main(String[] args) {
        fuzzySearch("car", "ca6$$#_rtwheel"); // true
        fuzzySearch("cwhl", "cartwheel"); // true
        fuzzySearch("cwhee", "cartwheel"); // true
        fuzzySearch("cartwheel", "cartwheel"); // true
        fuzzySearch("cwheeel", "cartwheel"); // false
        fuzzySearch("lw", "cartwheel"); // false
    }

    static void fuzzySearch(String str1, String str2) {
        int coincidece = 0;
        int i = 0;
        char[] symb2 = str2.toCharArray();
        for (char symb1 : str1.toCharArray()) {
            for (; i < str2.length(); i++) {
                if (symb1 == symb2[i]) {
                    coincidece++;
                    i++;
                    break;
                }
            }
            if (coincidece == str1.length()) {
                System.out.println(true);
                return;
            }
        }
        System.out.println(false);
    }
}
