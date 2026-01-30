class Solution {
    public static void bfs(int n , boolean vist[] , int[][] isConnected){
    Queue<Integer> m = new LinkedList<>();
    int y = isConnected.length;
    vist[n] = true;
    m.add(n);
    while(!m.isEmpty()){
        int h = m.poll();
        for(int j = 0;j<y;j++){
            if(isConnected[h][j] == 1 && !vist[j]){
                m.add(j);
                vist[j] = true;
            }
        }
        vist[h] = true;
    }
    }
    public int findCircleNum(int[][] isConnected) {
    int n = isConnected.length;
    int count = 0;
    boolean vist[] = new boolean[n];
    for(int i = 0;i < n;i++){
        if(!vist[i]){
            count++;
            bfs(i , vist , isConnected);
        }
    }

    return count;
    }
}
