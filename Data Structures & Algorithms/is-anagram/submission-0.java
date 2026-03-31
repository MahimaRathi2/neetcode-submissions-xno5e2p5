class Solution {
    public boolean isAnagram(String s, String t) {
     s = s.toLowerCase();
     t= t.toLowerCase();
     if(s.length()==t.length()){
        char[] scharArrays = s.toCharArray();
        char[] tcharArrays = t.toCharArray();

        Arrays.sort(scharArrays);
        Arrays.sort(tcharArrays);

    boolean result =Arrays.equals(scharArrays,tcharArrays);
    if(result)  return true;
    }
    return false;
    }
}
