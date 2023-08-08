class UsingConstructor{
    double price;
    int id;
    String name;
    UsingConstructor(double p, int i, String n){
        this.price = p;
        this.id = i;
        this.name = n;
    }
    public static void main(String[] args) {
        UsingConstructor us = new UsingConstructor(20.12, 20, "Bablesh");
        System.out.println(us.price+ " " +us.id+ " " +us.name);
        UsingConstructor um = new UsingConstructor(25.12, 22, "AAzad");
        System.out.println(um.price+ " " +um.id+ " " +um.name);
    }
}