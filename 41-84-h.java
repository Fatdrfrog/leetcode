class Solution {

    public int largestRectangleArea(int[] heights) {

        if(heights.length == 1) return heights[0];

        Stack<Integer> st1 = new Stack<Integer>();
        Stack<Integer> st2 = new Stack<Integer>();

        int[] left = new int[heights.length];
        int[] right = new int[heights.length];

        st1.push(-1);
        st1.push(0);
        st2.push(heights.length);

        for(int i = 0; i < heights.length; i++){  
            while (!st1.empty() && st1.peek() >= 0 && heights[st1.peek()] >= heights[i]){
                st1.pop(); 
            } 
             left[i] = st1.peek();
             st1.push(i);   
        }

        for(int i = heights.length - 1; i >= 0; i--){   
            while (!st2.empty() && st2.peek() < heights.length && heights[st2.peek()] >= heights[i]){
                st2.pop(); 
            } 
              right[i] = st2.peek();
              st2.push(i);
        }

        int result = 0;
        
        for(int i = 0; i < heights.length; i++){
            result = Math.max((right[i] - left[i] - 1) * heights[i],result);
        }

        return result;
    }
}