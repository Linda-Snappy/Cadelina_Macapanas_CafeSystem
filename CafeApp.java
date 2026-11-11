public class CafeApp {

    public static void main(String[] args) {

        Customer Elyza = new Customer(" Elyza Macapanas", true);
        Customer Sam = new Customer(" Sameryishin Cadelina", false);

        Beverage icedCoke = new Beverage(" Iced Coke", 95.0, "B-01", "L");
        Pastry StrawberryCupCake = new Pastry(" StrawberryCupCake", 45.0, "P-01", true);
        Meal ChickenAlfredo = new Meal(" Chicken w/ Pasta", 110.0, "M-01", true, 1);
        Pastry ChocolateLavaCake = new Pastry(" Cake w/ chocolate filling", 25.0, "P-02", false);

        Order order1 = new Order("1001", Elyza);
        order1.addItem(icedCoke);
        order1.addItem(StrawberryCupCake);
        order1.addItem(ChickenAlfredo);
        order1.addItem(ChocolateLavaCake);

        order1.printReceipt();

        Beverage testBeverage = new Beverage();
        testBeverage.setBaseprice(-5.0);
        testBeverage.setBaseprice(80.0);


        Beverage IcedCoke = new Beverage();
        IcedCoke.setName(" Iced Coke");
        IcedCoke.setItemCode("B-02");
        IcedCoke.setBaseprice(50.0);
        IcedCoke.setSize("M");

        Meal ClubHouseSandwich = new Meal(" ClubHouseSandwich", 130.0, "M-02", false, 0);

        Order order2 = new Order("1002", Sam);
        order2.addItem(IcedCoke);
        order2.addItem(ClubHouseSandwich);

        order2.printReceipt(20.0);
    }
}
