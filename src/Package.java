public class Package {
    private Address origin;
    private Address destination;
    private double pounds;
    private double length;
    private double height;
    private double width;

    public Package(Address origin, Address destination, double pounds, double length, double height, double width){
        this.origin=origin;
        this.destination=destination;
        this.pounds=pounds;
        this.length=length;
        this.height=height;
        this.width=width;
    }

    public Address getOrigin() {
        return origin;
    }

    public Address getDestination() {
        return destination;
    }

    public double getPounds() {
        return pounds;
    }

    public double getLength() {
        return length;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }
}
