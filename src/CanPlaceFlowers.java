public class CanPlaceFlowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int oneCount = 0;
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0) {
                boolean left = i == 0 || (flowerbed[i - 1] == 0);
                boolean right = i == flowerbed.length - 1 || (flowerbed[i + 1] == 0);
                if (left && right) {
                    oneCount++;
                    flowerbed[i] = 1;
                    if (oneCount >= n) {
                        return true;
                    }
                }
            }
        }
        return oneCount >= n;
    }

    public static void main(String[] args) {
        System.out.println(new CanPlaceFlowers().canPlaceFlowers(new int[]{1, 0, 0, 0, 1}, 1));
        System.out.println(new CanPlaceFlowers().canPlaceFlowers(new int[]{0, 1, 0}, 1));
    }
}
