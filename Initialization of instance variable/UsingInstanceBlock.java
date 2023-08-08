class UsingInstanceBlock {
    String color;
    {
        color = "Red";
    }
    public static void main(String[] args) {
        UsingInstanceBlock uib = new UsingInstanceBlock();
        System.out.println(uib.color);
    }
}
