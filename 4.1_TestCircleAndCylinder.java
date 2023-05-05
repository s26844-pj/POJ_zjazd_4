public class TestCircleAndCylinder {
    public static void main(String[] args) {

        Circle c1 = new Circle();

        Circle c2 = new Circle(18);

        System.out.println(c1.toString());
        System.out.println(c2.toString());

        Cylinder cy1 = new Cylinder();

        Cylinder cy2 = new Cylinder(18);

        Cylinder cy3 = new Cylinder(23, 13);

        System.out.println("Volume of Cylinder nr 1: " + cy1.getVolume());
        System.out.println("Volume of Cylinder nr 2: " + cy2.getVolume());
        System.out.println("Volume of Cylinder nr 3: " + cy3.getVolume());

    }
}
