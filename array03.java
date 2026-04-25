//Array Quest 03
//Max Consecutive ones
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int l=nums.length;
        int c=0;
        int m_c=0;
        for(int i=0;i<l;i++)
        {
            if(nums[i]==1)
            {
                c+=1;
                if(c>m_c)
                {
                    m_c=c;
                }
            }
            else if(nums[i]==0)
            {
                c=0;
            }
        }
        return m_c;
    }
}
