package QuestionsJava.ConstructorChaining;

class AAA{
    AAA(){
        System.out.println("Class AAA");
    }
}
class BBB extends AAA{
    BBB(){
        System.out.println("Class BBB");
    }
}
class CCC extends BBB{
    CCC(){
        AAA a1 = new AAA();
        System.out.println("Class CCC");
    }
}

public class ConstructorInheritance {
    public static void main(String[] args) {
        CCC c1 = new CCC();
    }
}
