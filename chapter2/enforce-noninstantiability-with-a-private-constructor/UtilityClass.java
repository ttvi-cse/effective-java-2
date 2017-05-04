// Noninstantiable utility class
public class UtilityClass {
    // Suppress default constructore for noninstantiability
    private UtilityClass() {
        throw new AsssertionError();
    }
}
