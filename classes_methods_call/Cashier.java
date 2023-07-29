
class Cashier {
    Token issueToken(Money m){
        System.out.println("Cashier recieve money from customer " + m);
        Token t = new Token();
        System.out.println("Cashier issue token to customer " + t);
        return t;
    }
}
