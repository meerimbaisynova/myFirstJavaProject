package variables;

public class ZelleApp {
    public static void main(String[] args) {
        ZelleAccaunt user1 = new ZelleAccaunt("James Bond", "773773-8888", "Chase");

        user1.depositMoney(2000);
        user1.info();
        user1.transferMoney("7739090900" ,200);
        user1.info();

        ZelleAccaunt user2 = new ZelleAccaunt("Kate", "34802442", "Boa");
        user2.depositMoney(5000);
        user2.info();
        user1.depositMoney(4500);
        ZelleAccaunt.customerService();
        ZelleAccaunt.zelleInfo();
    }

    }

