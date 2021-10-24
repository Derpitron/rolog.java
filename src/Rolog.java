public class Rolog {
    public static void main(String[] args) {
        ProcessHandle robloxHandle = ProcessHandle.();

        System.out.println(robloxHandle.info().arguments());
    }
}