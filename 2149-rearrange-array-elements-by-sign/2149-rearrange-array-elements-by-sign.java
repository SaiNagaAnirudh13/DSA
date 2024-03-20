class Solution {
    public int[] rearrangeArray(int[] nums) {
          int[] pos = new int[nums.length / 2];
    int[] neg = new int[nums.length / 2];
    int index = 0;
    int in = 0;
    for (int i : nums) {
        if (i > 0) {
            pos[index++] = i;
        }
    }
    for (int i : nums) {
        if (i < 0) {
            neg[in++] = i;
        }
    }
    int[] arr = new int[nums.length];
    int d = 0;
    int k = 0;
    for (int i = 0; i < nums.length; i += 2) {
        arr[i] = pos[d++];
        arr[i + 1] = neg[k++];
    }
    return arr;

    }
}