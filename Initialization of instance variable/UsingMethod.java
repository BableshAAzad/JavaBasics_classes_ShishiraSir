class UsingMethod {
    void studentDetails(String name, int id){
        System.out.println(name + " " +id);
    }
    public static void main(String[] args) {
        UsingMethod um1 = new UsingMethod();
        um1.studentDetails("Bablesh", 1);
        um1.studentDetails("AAzad", 2);
    }
}
