class Solution {
    public String removeOuterParentheses(String s) {
        
        Stack<Integer> pushDownAutomata = new Stack<Integer>();
        char[] sArray = s.toCharArray();
        HashSet<Integer>removeIndices = new HashSet<Integer>();
        for(int i = 0;i < sArray.length; i++) {
            int popPosition = 0;;
            switch(sArray[i]) {
                case '(' : {
                    pushDownAutomata.push(i);
                    break;
                }
                case ')' : {
                    popPosition = pushDownAutomata.pop();
                    break;
                }
                
            }
            
            if(pushDownAutomata.isEmpty()) {
                removeIndices.add(popPosition);
                removeIndices.add(i);
            }                    
            
        }
        
        
        char[] retArray = new char[sArray.length - removeIndices.size()];
        
        int i =0;
        int j = 0;
        while(i < sArray.length) {
            if(removeIndices.contains(i)) {
                i++;
                continue;
            }
            retArray[j++] = sArray[i++];
        }
        
        return new String(retArray);
        
        
    }
}