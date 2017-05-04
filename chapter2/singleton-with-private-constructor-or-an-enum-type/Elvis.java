public class Elvis {
    public static final Elvis INSTANCE = new Elvis();
    private Elvis() {}
    public void leaveTheBuilding() {}
}
// Singleton with static factory
class Elvis2 {
    public static final Elvis INSTANCE = new Elvis();
    private Elvis() {}
    public static Elvis getInstance() { return INSTANCE; }
    public void leaveTheBuilding() {}
}
public enum Elvis3 {
    INSTANCE;
    public void leaveTheBuilding() {}
