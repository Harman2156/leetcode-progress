class Solution {
    public int romanToInt(String s) {
    HashMap<Character , Integer> mm = new HashMap<>();
    if(s == null || s.length() == 0) return 0;
    mm.put('I' , 1);
    mm.put('V' , 5);
    mm.put('X' , 10);
    mm.put('L' , 50);
    mm.put('C' , 100);
    mm.put('D' , 500);
    mm.put('M' , 1000);

    int result = mm.get(s.charAt(s.length() - 1));
    for(int i = s.length()-2;i>= 0;i--){
        if(mm.get(s.charAt(i)) < mm.get(s.charAt(i+1))){
        result = result - mm.get(s.charAt(i));
        }else{
            result = result + mm.get(s.charAt(i));
        }
    }

    return result;
    }
}
