class CustomerT {
    void takeTicket(){
       System.out.println("Customer takeTicket method call");
       MoneyT m1 = new MoneyT();
       System.out.println(m1);
       CashierT cs1 = new CashierT();
       cs1.issueToken(m1);
    }
}
