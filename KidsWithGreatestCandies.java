//Leetcode-75 ques-02
//Kids With Greatest Number of Candies
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n=candies.length;
       List<Boolean> result = new ArrayList<>();
        int m=candies[0];
        for(int i=0;i<n;i++)
        {
            if(candies[i]>m)
            {
                m=candies[i];
            }
        }
        int i=0;
        while(i<n)
        {
            if((candies[i]+extraCandies)>=m)
            {
            result.add(true);
            }
            else
            {
            result.add(false);
            }
            i++;
        }
        return result;
    }
}
