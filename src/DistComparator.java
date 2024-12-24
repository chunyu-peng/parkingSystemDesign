import java.util.Comparator;

class DistComparator implements Comparator<Vehicle> {
    public int compare(Vehicle v1, Vehicle v2) {
        if (v1.dist() == v2.dist()) {
            return 0;
        }
        return v1.dist() > v2.dist() ? 1 : -1;
    }
}
