class Solution {
    public int characterReplacement(String s, int k) {
        int freq[]= new int[26];
        int left=0;
        int maxWindow=0;
        int maxFreq=0;
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'A']++;
            maxFreq= Math.max(maxFreq,freq[s.charAt(i)-'A']);

            int windowlength = i-left+1;
            if(windowlength-maxFreq > k){
                freq[s.charAt(left)-'A']--;
                left++;
            }
            windowlength = i-left +1;
            maxWindow =Math.max(maxWindow,windowlength);
        }
        return maxWindow;
    }
}
