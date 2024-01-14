class Solution {

    class MaxStack {
        LinkedList<Integer> s;
        LinkedList<Integer> smax;
        public MaxStack() {
            s = new LinkedList<Integer>();
            smax = new LinkedList<Integer>();
            smax.addLast(Integer.MIN_VALUE);
        }

        public void push(int x) {
            s.addLast(x);
            smax.addLast(Math.max(smax.getLast(), x));
        }

        public int pop() {
            int val = s.getLast();
            s.removeLast();
            smax.removeLast();
            return val;
        }

        public boolean empty() {
            return s.size() == 0;
        }

        int getMax() {
            return smax.getLast();
        }
    }

    MaxStack s1 = new MaxStack();
    MaxStack s2 = new MaxStack();

    public void add(int x) {
        s2.push(x);
    }

    public void remove() {
        if (s1.empty()) {
            while (!s2.empty()) {
                s1.push(s2.pop());
            }
        }
        s1.pop();
    }

    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] result = new int[n-k+1];

        int idx = 0;
        //init s2
        for (int i = 0; i < k; i++) {
            s2.push(nums[i]);
        }
        result[idx++] = s2.getMax(); 

        //adding and removing elements
        for (int i = k; i < n; i++) {
            add(nums[i]);
            remove();
            result[idx++] = s1.empty() ? s2.getMax() : Math.max(s1.getMax(), s2.getMax());
        }

        return result;
    }
}