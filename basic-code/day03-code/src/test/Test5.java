package test;

public class Test5 {
    public static void main(String[] args) {
        int height1 = 150;
        int height2 = 210;
        int height3 = 165;
        int tmp = height1 > height2 ? height1 : height2;
        int max = tmp > height3 ? tmp : height3;
        System.out.println(max);
    }
}
