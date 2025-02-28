public class lengthOfLastWord {
    public int lengthofLastWord(String s) {
        String m = s.trim();
        System.out.println(m);
        int count = 0;
        for (int i = m.length() - 1; i >= 0; i--) {
            if (m.charAt(i) == ' ') {
                break;
            }
            count++;
        }
        return count;
    }
}
