package P;

import P1.*;
import P2.*;
public class Main {
    public static void main(String[] args) {
        TwoDim ref;
        ref = new TwoDim(8, 12);
        System.out.println(ref);
        ref = new ThreeDim(6, 9, 18);
        System.out.println(ref);
    }
}