class WaterBottle {
    int l;
    int b;
    int h;
    public int getVolume() {
        return l * b * h;
    }
}
class Testing {
    public static void main (String args[]) {
        WaterBottle w1 = new WaterBottle();
        w1.l = 2;
        w1.b = 3;
        w1.h = 5;
        int vol = w1.getVolume();
        System.out.println(vol);
    }
}