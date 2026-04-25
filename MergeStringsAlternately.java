//Leetcode-75ques
//Q1-Merge Strings Alternatively
class Solution {
    public String mergeAlternately(String word1, String word2) {
       int l1=word1.length();
        int l2=word2.length();
        int l=l1>l2? l1:l2;
        String merge="";
        for (int i=0;i<l;i++)
        {
            if(i<l1)
            {
                merge+=word1.charAt(i);
            }
            if(i<l2)
            {
                merge+=word2.charAt(i);
            }
        }
        return merge;
    }
}
