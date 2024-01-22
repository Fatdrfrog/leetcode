class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<Integer>();

        for (int i = 0; i < tokens.length; i++){
            if(!tokens[i].equals("+") && !tokens[i].equals("-") && !tokens[i].equals("*") && !tokens[i].equals("/")){
                st.push(Integer.parseInt(tokens[i]));
            }
            else if(st.peek() != null){

                int r = st.pop();
                int l = st.pop();

                if(tokens[i].equals("+")){
                    st.push(l + r);
                }else if(tokens[i].equals("-")){
                    st.push(l - r);
                }else if(tokens[i].equals("*")){
                    st.push(l * r);
                }else if(tokens[i].equals("/")){
                    st.push(l / r);
                }
            }
        }

        return st.pop();
    }
}