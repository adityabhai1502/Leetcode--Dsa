class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> result = new ArrayList<>();
        int i = num.length - 1;

        while (i >= 0 || k > 0) {
            int digit = (i >= 0) ? num[i] : 0;
            int sum = digit + k % 10;
            k /= 10;

            if (sum >= 10) {
                sum -= 10;
                k += 1;
            }

            result.add(sum);
            i--;
        }

        Collections.reverse(result);
        return result;
    }
}