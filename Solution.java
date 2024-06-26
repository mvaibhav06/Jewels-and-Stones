class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Map<Character,Integer> temp = new HashMap<>();

        for(int i=0; i<stones.length(); i++){
            char ch = stones.charAt(i);
            temp.put(ch, temp.getOrDefault(ch,0)+1);
        }
        int out = 0;
        for(int i=0; i<jewels.length(); i++){
            char ch = jewels.charAt(i);
            out += temp.getOrDefault(ch,0);
        }
        return out;
    }
}
