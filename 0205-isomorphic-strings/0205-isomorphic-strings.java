import java.util.*;
class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Integer,Integer> hm= new HashMap<>();
        HashSet<Integer> h =  new HashSet<>();
        if(s.length()!= t.length()){
            return false;
        }
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            char as = t.charAt(i);
            if(hm.getOrDefault((int)ch,0)==0){
                if(h.contains((int)as)){
                    return false;
                }
                hm.put((int)ch,(int)as);
                h.add((int)as);
            }
            else{
                if(hm.getOrDefault((int)ch,0)!=(int)as){
                    return false;
                }
            }
        }
        return true;
    }
}