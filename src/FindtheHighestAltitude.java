public class FindtheHighestAltitude {

    public int largestAltitude(int[] gain) {

        int altitude = 0, max = 0;
        for (int g : gain) {
            altitude = g + altitude;
            max = Math.max(max, altitude);
        }
        return max;
    }
}
