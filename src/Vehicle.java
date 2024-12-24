enum VehicleSize {
    Motorcycle,
    Compact,
    Large
}

public abstract class Vehicle {
    protected int spotsNeeded;
    protected VehicleSize size;
    protected String licensePlate;
    protected int floorCorX;
    protected int floorCorY;
    protected int floorEntranceX;
    protected int floorEntranceY;

    public double dist() {
        return Math.abs((floorEntranceX - floorCorX) * (floorEntranceX - floorCorX) + (floorEntranceY - floorCorY) * (floorEntranceY - floorCorY));
    }

    public void print() {
        System.out.println("Your car can be parked at " + floorCorX + ", " + floorCorY);
    }
}
