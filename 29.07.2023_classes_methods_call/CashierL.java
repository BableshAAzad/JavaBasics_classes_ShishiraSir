
class CashierL {
    TokenL issueTokenL(MoneyL m){
        System.out.println("Cashier recieve money from customer " + m);
        TokenL t = new TokenL();
        System.out.println("Cashier issue token to customer " + t);
        return t;
    }
}
