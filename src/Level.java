public class Level {
    private int floor;
    private ParkingSpot[][] spots;
    private int availableSpots;

    public Level(int floor, ParkingSpot[][] spots, int rows, int cols) {
        this.spots = new ParkingSpot[rows][cols];
        this.floor = floor;
        this.availableSpots = rows * cols;
    }

    public boolean parkVehicle(Vehicle vehicle) {
        
    }
}
