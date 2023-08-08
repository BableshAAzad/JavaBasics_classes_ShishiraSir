class Static_Method {
    static int value;
    static void setValue(int newValue) { // Static method
        value = newValue;
    }
    static int getValue() { // Static method
        return value;
    }
    public static void printValue() { // Static method
        System.out.println("PrintValue: " + value);
    }
    public static void main(String[] args) {
        Static_Method.setValue(42); // Set the value to 42
        Static_Method.printValue(); // Output: Value: 42

        int rv = Static_Method.getValue(); // Get the value (rv = 42)
        System.out.println("GetValue: " + rv);
    }
}
