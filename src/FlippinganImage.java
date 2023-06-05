import java.util.Arrays;

public class FlippinganImage {
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image[0].length;
        int start, end, temp;
        for (int i = 0; i < n; i++) {
            start = 0;
            end = n - 1;
            while (start <= end) {
                temp = invert(image[i][start]);
                image[i][start] = invert(image[i][end]);
                image[i][end] = temp;
                start++;
                end--;
            }
        }
        return image;
    }

    private int invert(int img) {
        return img == 1 ? 0 : 1;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(new FlippinganImage().flipAndInvertImage(new int[][]{{1, 1, 0}, {1, 0, 1}, {0, 0, 0}})));
    }
}
