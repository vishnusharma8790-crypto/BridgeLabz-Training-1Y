//LC 387
class Solution {
    public int firstUniqChar(String s) {
        for (int i = 0; i <= s.length() - 1; i++) {
            char ch = s.charAt(i);

            if (s.indexOf(ch) == s.lastIndexOf(ch)) {
                return i;
            }
        }

        return -1;
    }
}