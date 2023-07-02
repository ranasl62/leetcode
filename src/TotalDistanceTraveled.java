public class TotalDistanceTraveled {
    public int distanceTraveled(int mainTank, int additionalTank) {
        int toltalDistance = 0;
        while (additionalTank > 0 && mainTank > 4) {
            toltalDistance += 50;
            mainTank -= 4;
            additionalTank--;
        }
        return toltalDistance + mainTank * 10;
    }

    public static void main(String[] args) {
        System.out.println(new TotalDistanceTraveled().distanceTraveled(4, 1));
        System.out.println(new TotalDistanceTraveled().distanceTraveled(9, 2));
        System.out.println(new TotalDistanceTraveled().distanceTraveled(13, 3));
        System.out.println(new TotalDistanceTraveled().distanceTraveled(6, 1));
        System.out.println(new TotalDistanceTraveled().distanceTraveled(14, 3));
        System.out.println(new TotalDistanceTraveled().distanceTraveled(29, 7));
    }
}
