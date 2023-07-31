class DeliveryAgentC {
    void deliverProduct() {
        // System.out.println("Delivery agent goes to wherehouse");
        ManagerC mg = new ManagerC();
        // System.out.println("Delivery agent meet to manager");
        // Product p1 = new Product();
        ProductC p1 = mg.givenProduct();
        // System.out.println("Delivery agent got product from manager");
        CustomerC c2 = new CustomerC();
        // System.out.println("delivery agent goest to customer place");
        c2.receiveProduct(p1);
    }
}
