public class Main {
    public static void main(String[] args) {
        int account = 100;
        int replenishment = 1100;
        int bonus = replenishment / 100;

        if (replenishment >= 1000) {
            System.out.println(account + replenishment + bonus);
        } else {
            System.out.println(account + replenishment);
        }

    }
}