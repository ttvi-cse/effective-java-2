public class Main {
    // Potential security hole!
    public static final Thing[] VALUES = {};
    
    private static final Thing[] PRIVATE_VALUES = {};
    public static final List<Thing> VALUES = 
        Collections.unmodifiableList(Arrays.asList(PRIVATE_VALUES));

    private static final Thing[] PRIVATE_VALUES = {};
    public static final Thing[] values() {
        return PRIVATE_VALUES.clone();
    }

    public static void main(String[] args) {
       
    }
}
