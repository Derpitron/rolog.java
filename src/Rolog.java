public class Rolog {
    public static void main(String[] args) {
        ProcessHandle processHandle = ProcessHandle.current();

        System.out.println(processHandle.info().arguments());
    }
}