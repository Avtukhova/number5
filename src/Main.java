public class Main {
    public static void main(String[] args) {

        int balans = 100;
        int replenishment = 1100;
        int bonus = replenishment / 100;
        int total;

        if (replenishment > 1000) {
            total = replenishment + bonus + balans;
        } else {
            total = balans + replenishment;

        }


        System.out.println(total);

    }

    {

    }

}