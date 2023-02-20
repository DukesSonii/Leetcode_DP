class Solution {
public:
    int numTilings(int n) {
        int m = 1e9+7;
        vector<long long> num(1001,0);
        num[1]=1;
        num[2]=2;
        num[3]=5;

        if(n<=3)
            return num[n];
        for(int i=4;i<=n;i++){
            num[i]=2*num[i-1]+num[i-3];
            num[i]=num[i]%m;    //mod bcoz value can be very large
        }    
        return num[n];
    }
};
