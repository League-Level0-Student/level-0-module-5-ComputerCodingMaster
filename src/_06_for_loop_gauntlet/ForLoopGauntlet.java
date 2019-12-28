package _06_for_loop_gauntlet;

public class ForLoopGauntlet {
    public static void main(String[] args) {
// for (int x=0;x<=100;x++) {
// System.out.println(x);
// }
// for (int y=100; y>=0; y--) {
//  System.out.println(y);
// }
// for (int z = 2; z <= 100; z++) {
// if (z % 2==0) {
// System.out.println(z);
// }
// }
// for (int w = 1; w <= 99; w++) {
// if (w % 2 == 1) {
// System.out.println(w);
// for (int w = 1; w <= 500; w++) {
// if (w % 2 == 1) {
// System.out.print(w);
// System.out.println(" odd");
// } else {
// System.out.print(w);
// System.out.println(" even");
// for (int x = 7; x <= 777; x++) {
// if (x % 7 == 0) {
// System.out.println(x);
// }
// }
//int y = 0;
//for (int x = 2006; x <= 2019; x++) {
//y = x - 2006;
//System.out.println("In " + x + " I was " + y + " year(s) old.")//
//}
// for (int x = 0; x < 3; x++) {
// for (int y = 0; y < 3; y++) {
// System.out.println(Integer.toString(x)+" "+Integer.toString(y));
// }
// }
        for (int x = 1; x < 4; x++) {
            for (int y = 4; y < 7; y++) {
                for (int z = 7; z < 10; z++) {
                System.out.print(Integer. toString(x)+" "+Integer.toString(y)+" "+Integer.toString(z));
                }
            }
        }
    }
}
