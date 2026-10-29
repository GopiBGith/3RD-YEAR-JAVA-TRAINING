public class string {
    public static void main(String[] args) {
        String name = "s u c c e s f u l.";
        int[] freq = new int[26];

        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                freq[ch-'a']++;
            }
        }

        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) {
                System.out.println((char) (i + 'a') + " : " + freq[i]);
            }
        }
    }
}