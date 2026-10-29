public class alp {
    public static void main(string[]args){
        String name="sir.frances.joshwa.paul.david.daniel";
int[] freq = new int[100];

for (int i = 0; i < name.length(); i++) {
    freq[name.charAt(i) - 'a']++;
}

for (int i = 0; i < 26; i++) {
    if (freq[i] > 0) {
        System.out.println((char) (i + 'a') + " : " + freq[i]);
    }
}
    }
}
