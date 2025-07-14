public class Main {
    public static void main(String[] args) {
        int account = 100;
        int replenishment = 1100;
        int bonus = replenishment / 100;
        int total = account + replenishment + bonus;

        if (replenishment > 1000) {
            System.out.println("total: " + total);
            System.out.println("bonus amount: " + bonus);
        } else {
            System.out.println(account + replenishment);
        }

    }
}