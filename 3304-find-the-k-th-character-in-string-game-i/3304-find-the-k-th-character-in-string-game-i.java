class Solution {
    String word = "a";
    public char kthCharacter(int k) {
        if(word.length() > k) {
            char[] charArray = word.toCharArray();
            return charArray[k-1];
        }
        String newWord = "";
        for(char ch: word.toCharArray()) {
            newWord = newWord + (char) (ch +1);
        }
         word = word + newWord;
         return kthCharacter(k);
    }
}
