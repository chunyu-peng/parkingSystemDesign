import java.util.List;
import java.util.Queue;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    protected static Queue<Vehicle> pq = new PriorityQueue<>(new DistComparator());
    protected static int floorEntranceX;
    protected static int floorEntranceY;
    protected static int parkingLotRows;
    protected static int parkingLotCols;
    protected static List<Integer> parkingSpotX;
    protected static List<Integer> parkingSpotY;
    protected int vehicleParked = 0;

    public static int menu() {
        System.out.println("Choose an option:");
        System.out.println("1. Park your car");
        System.out.println("2. Exit your car");
        System.out.println("3. Quit");
        System.out.print("Your choice: ");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        if (choice == 1) {
            park();
            return 0;
        } else if (choice == 2) {
            exit();
            return 0;
        } else if (choice == 3) {
            return 0;
        } else {
            System.out.println("Invalid choice");
            return -1;
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter the num of rows and cols of the parking lot");
        Scanner sc = new Scanner(System.in);
        parkingLotRows = sc.nextInt();
        parkingLotCols = sc.nextInt();
        for (int i = 1; i <= parkingLotRows; i++) {
            for (int j = 1; j <= parkingLotCols; j++) {
                parkingSpotX.add(i);
                parkingSpotY.add(j);
            }
        }

        floorEntranceX = sc.nextInt();
        floorEntranceY = sc.nextInt();
        for (int i = 0; i < parkingLotRows * parkingLotCols; i++) {
            Vehicle slot = new Vehicle(parkingSpotX.get(i), parkingSpotY.get(i));
            pq.offer(slot);
        }

        System.out.println("Welcome to parking lot system");
        int res = menu();
        while (res < 0) {
            res = menu();
        }
    }
}
