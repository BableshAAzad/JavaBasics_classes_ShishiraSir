class NonStatic_Method{
    int valueX;
    void setValue(int newValue){    //non Static Method 1
    this.valueX = newValue;
    }
    int getValue(){                 //non Static Method 2
        return valueX;
    }
    void printValue(){              //non Static Method 3
        System.out.println("Print Value : " +valueX);
    }
    public static void main(String[] args) {
        NonStatic_Method obj = new NonStatic_Method();

        obj.setValue(28); // Set the value to 28
        obj.printValue();   //Print Value : 28

        int rv = obj.getValue();
        System.out.println("GetValue value : "+ rv); //GetValue value : 28
    }
}