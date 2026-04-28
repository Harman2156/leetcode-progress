class Solution {
    public int celebrity(int mat[][]) {
        // code here
    int n = mat[0].length;
    int ans = -1;
    for(int i = 0;i<mat.length;i++){
        int cnt  =  0;
        int cnt1 = 0;
        for(int j = 0;j<mat[0].length;j++){
            if(i != j && mat[i][j] == 0){
                cnt++;
            }
        }
        if(cnt == n - 1){
            for(int k = 0;k < mat.length;k++){
                if(mat[k][i] == 1 && k != i){
                    cnt1++;
                }
            }
            if(cnt1 == mat.length - 1){
            ans = i;
        }
        }
        
    }
    
    return ans;
        
    }
}
