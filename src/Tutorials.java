public class Tutorials {
    public static void main(String[] args) {
        Box b1 = new Box(10, 20);
        Box b2 = new Box(30, 40);
        Box b3 = new Box(b1);
        Box b4 = b2.duplicate();

        b1.display();
        b3.display();
        b2.display();
        b4.display();

        if (b1.isEqual(b2)) {
            System.out.println("b1 and b2 are equal");
        } else {
            System.out.println("b1 and b2 are not equal");
        }

        if (Box.areTwoObjectsEqual(b1, b3)) {
            System.out.println("b1 and b3 are equal");
        } else {
            System.out.println("b1 and b3 are not equal");
        }
    }
}
