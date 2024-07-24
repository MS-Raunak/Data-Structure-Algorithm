package strings;

public class P7_ToCaps {
    public static void main(String[] args) {
        String s = "Chhaya";
        convertToCaps(s);
        int a = 'a';
        int z = 'z';
        int A = 'A';
        int Z = 'Z';
        System.out.println(A + "," + Z + ", " + a + "," + z);
    }

    private static void convertToCaps(String s) {
        String temp = "";
        for (int i=0; i<s.length(); i++){
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'){
                char ch = (char) (s.charAt(i) + 32);
                temp +=ch;
            }
            else temp +=s.charAt(i);
        }
        System.out.println(temp);
    }
}
