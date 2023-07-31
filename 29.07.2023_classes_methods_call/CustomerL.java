class CustomerL {
    void takeTokenL(){
        MoneyL m = new MoneyL();
        CashierL c = new CashierL();
        System.out.println("Customer give to money to cahier "+ m);
        TokenL t = c.issueTokenL(m);
        System.out.println("Cutomer got taken from cashier " + t);
    }
}
