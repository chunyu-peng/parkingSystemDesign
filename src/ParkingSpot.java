public class ParkingSpot {
    private Vehicle vehicle;
    private VehicleSize spotSize;
    private int floorCorX;
    private int floorCorY;
    private int spotNumber;
    private Level level;

    public ParkingSpot(Level level, int floorCorX, int floorCorY, int spotNumber) {
        this.level = level;
        this.floorCorX = floorCorX;
        this.floorCorY = floorCorY;
        this.spotNumber = spotNumber;
    }

    public boolean isAvailable() {
        return vehicle == null;
    }

    public
}
