public class DesignParkingSystem {

    int[] limit;
    int[] current;

    public DesignParkingSystem(int big, int medium, int small) {
        limit = new int[]{big, medium, small};
        current = new int[]{0, 0, 0};
    }

    public boolean addCar(int carType) {
        if (limit[carType - 1] > current[carType - 1]) {
            current[carType - 1]++;
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        DesignParkingSystem parkingSystem = new DesignParkingSystem(1, 1, 0);
        System.out.println(parkingSystem.addCar(1));
        System.out.println(parkingSystem.addCar(2));
        System.out.println(parkingSystem.addCar(3));
        System.out.println(parkingSystem.addCar(1));
    }
}

/**
 * Your DesignParkingSystem object will be instantiated and called as such:
 * DesignParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */