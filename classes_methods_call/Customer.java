class Customer {
    void takeToken(){
        Money m = new Money();
        Cashier c = new Cashier();
        System.out.println("Customer give to money to cahier "+ m);
        Token t = c.issueToken(m);
        System.out.println("Cutomer got taken from cashier " + t);
    }
}
