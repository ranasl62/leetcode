public class IncreasingTripletSubsequence {

    public boolean increasingTriplet(int[] nums) {
        int first_num = Integer.MAX_VALUE, second_num = first_num;
        for (int n : nums) {
            if (n <= first_num) {
                first_num = n; // update the first number
            } else if (n <= second_num) {
                second_num = n; // update the second number
            } else {
                return true; // we already find the last one too
            }
        }
        return false;
    }


    public static void main(String[] args) {
        System.out.println(new IncreasingTripletSubsequence().increasingTriplet(new int[]{6, 4, 1, 8, 9}));
        System.out.println(new IncreasingTripletSubsequence().increasingTriplet(new int[]{20, 100, 10, 12, 5, 11, 1}));
        System.out.println(new IncreasingTripletSubsequence().increasingTriplet(new int[]{2, 1, 5, 0, 4, 6}));
        System.out.println(new IncreasingTripletSubsequence().increasingTriplet(new int[]{1, -8, 9, 4, 1, 6, -2}));
        System.out.println(new IncreasingTripletSubsequence().increasingTriplet(new int[]{-90, -80, -1, 0, -90, -100, 8, -9, -80}));
    }
}
