package solid.lsp;
/**
 * @author nayanava
 */

import solid.lsp.factory.RectangleFactory;

import java.io.*;

public class LSPDemo {
    public static void main(String[] args) {
        lspViolatedApproach();
        System.out.println();
        lspApproach();
    }

    private static void lspApproach() {
        Rectangle rc = new Rectangle(4, 5);
        int width = 5, height = 4;
        findArea(rc);
        validateOnLSP(rc, width, height);
        rc = new Square(5);
        width = rc.getWidth();
        rc.setHeight(10);
        validateOnLSP(rc, width, height);
    }

    private static void lspViolatedApproach() {
        Rectangle rc = new Rectangle(4, 5);
        int width = 5, height = 4;
        validateOnViolatedLSP(rc, width, height);
        rc = new Rectangle(5, 5);
        width = rc.getWidth();
        rc.setHeight(10);
        validateOnViolatedLSP(rc, width, height);
    }
    private static int findArea(Rectangle rc) {
        return AreaCalculator.calculateArea(rc);

    }

    private static void validateOnViolatedLSP(Rectangle rc, int width, int height) {
        System.out.println( "expected: " + width * height + " actual: " + findArea(rc));
    }
    private static void validateOnLSP(Rectangle rc, int width, int height) {
        if(rc.isSquare()) {
            width = rc.getWidth();
            height = rc.getHeight();
        }
        System.out.println( "expected: " + width * height + " actual: " + findArea(rc));
    }
}
