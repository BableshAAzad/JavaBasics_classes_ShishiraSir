class Ex1StaticandNonStatic {
    int a = 10; 
    static int b = 5;
    public static void main(String[] args) {
    Ex1StaticandNonStatic.staticMeth(); //access direct or using class name
    Ex1StaticandNonStatic ns = new Ex1StaticandNonStatic();
    ns.nonStaticMeth(); //can not access direct non-static method required object ref
    }
    static void staticMeth() {
        System.out.println(b); // can not access their a var, only access static var
    }
    void nonStaticMeth() {
        System.out.println(a + " " + b); // access static or non static both value
    }
}
