class Solution {
    public String minWindow(String s, String t) {
        int [] count = new int[128];
        for(char ch : t.toCharArray()) count[ch]++;
        int l=0,r=0,start=0,minlen=Integer.MAX_VALUE,required=t.length();
        for(;r<s.length();r++){
            char ch = s.charAt(r);
            if(count[ch]>0) required--;
            count[ch]--;
            while(required==0){
                if(r-l+1 <minlen){
                    minlen = r-l+1;
                    start = l;
                }
                char leftchar= s.charAt(l);
                count[leftchar]++;
                if(count[leftchar]>0) required++;
                l++;
            }
        }
        return minlen == Integer.MAX_VALUE? "":s.substring(start,start+minlen);
    }
}
