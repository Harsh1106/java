public class MinimumRecolorstoGetKConsecutiveBlackBlocks {
    public static int minimumRecolors(String blocks, int k) {
        int count = 0, ans = Integer.MAX_VALUE;
        for (int i = 0; i < blocks.length(); i++) {
            if (i - k >= 0 && blocks.charAt(i - k) == 'B') count--;
            if (blocks.charAt(i) == 'B') count++;
            ans = Math.min(ans, k - count);
        }
        return ans;
    }
    public static void main(String[] args) {
        String blocks = "WBBWWBBWBW";
        int k = 7;
        System.out.println(minimumRecolors(blocks, k));
    }
}
