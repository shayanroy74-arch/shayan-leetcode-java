class Solution {
    public int romanToInt(String s) {
        String str = s;
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0; i<str.length();i++){
            char x = str.charAt(i);
            switch(x){
                case 'I':
                    arr.add(1);
                    break;
                case 'V':
                    arr.add(5);
                    break;
                case 'X':
                    arr.add(10);
                    break;
                case 'L':
                    arr.add(50);
                    break;
                case 'C':
                    arr.add(100);
                    break;
                case 'D':
                    arr.add(500);
                    break;
                case 'M':
                    arr.add(1000);
                    break;
            }   
        }
        int f=0;
        for(int i=0;i<arr.size();i++){
            if(i + 1 < arr.size() && arr.get(i+1)>arr.get(i)){
                f= f+ arr.get(i+1)- arr.get(i);
                i++;
            }
            else{
                f=f+arr.get(i);
            }
        }
        return f;
    }
}