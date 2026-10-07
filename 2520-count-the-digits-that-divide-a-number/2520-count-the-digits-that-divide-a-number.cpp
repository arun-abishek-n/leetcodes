class Solution {
public:
    int countDigits(int num) {
           int org=num;
        int count =0;
        while(org>0){
            int temp = org%10;
            if(temp !=0 && num%temp ==0){
                count++;
            }
            org/=10;
        }
        return count;
    }
};