class MainRail{
    public static void main(String[] args) {
        System.out.println("main method start");
        Passanger p1 = new Passanger();
        System.out.println(p1 + " Passanger_Object_Reference");
        p1.takeTicket();
    }
}