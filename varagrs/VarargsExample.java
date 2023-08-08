class VarargsExample {
    void cars(int... car) {
        for (int ca : car) {
            System.out.println(ca);
        }
    }

    public static void main(String[] args) {
        VarargsExample vrg = new VarargsExample();
        vrg.cars(10, 20); // 10 20
        vrg.cars(30, 40, 50, 60); // 10 20 30 40 50 60
        vrg.cars(70, 80, 90, 100); // 10 20 30 40 50 60 70 80 90 100  only one line will be execute and 
        // other lines will be added because on constructor

    }
}