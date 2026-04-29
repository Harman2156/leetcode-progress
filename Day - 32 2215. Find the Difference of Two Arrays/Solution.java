class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
    HashSet<Integer> mp = new HashSet<>();
    HashSet<Integer> po = new HashSet<>();
    List<Integer> m = new ArrayList<>();
    List<Integer> n = new ArrayList<>();
    List<List<Integer>> ans = new ArrayList<>();

    for(int d : nums1){
        mp.add(d);
    }
    
    for(int j : nums2){
        po.add(j);
    }
    for(int val : mp){
    if(!po.contains(val)){
        m.add(val);
    }
}

for(int val : po){
    if(!mp.contains(val)){
        n.add(val);
    }
}
    ans.add(m);
    ans.add(n);

    return ans;


    }
}
