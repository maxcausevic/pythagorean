import java.lang.Math;
public class PythagoreanTest {
    public static void main(String[] args) {
        Pythagorean baby = new Pythagorean();
        double hypotenuse = baby.calculateHypotenuse(10,12);
        System.out.println("The hypotenuse is:" + hypotenuse);
    }
}
