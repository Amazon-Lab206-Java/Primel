public class Pythagorean {
    public double calculateHypotenuse(int legA, int legB) {
        // the hypotenuse is the side across the right angle. 
        double c = Math.sqrt(legA*legA + legB*legB);
        // calculate the value of c given legA and legB
        return c;
    }
}