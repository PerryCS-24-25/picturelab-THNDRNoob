/**
 * This class contains class (static) methods that will help you test the
 * Picture class methods. Uncomment the methods and the code in the main to
 * test.
 *
 * @author Barbara Ericson
 */
public class PictureTester {

    /**
     * Method to test the PictureExplorer
     */
    public static void testExplorer() {
        Picture p = new Picture("myPicture.jpg");
        Picture smallP = p.scale(0.25,0.25);
        smallP.write("smallMyPicture.jpg");
    }

    /**
     * Method to test zeroBlue
     */
    public static void testZeroBlue() {
        Picture beach = new Picture("beach.jpg");
        beach.explore();
        beach.zeroBlue();
        beach.explore();
    }

    /**
     * Method to test mirrorVertical
     */
    public static void testMirrorVertical() {
        Picture caterpillar = new Picture("caterpillar.jpg");
        caterpillar.explore();
        caterpillar.mirrorVertical();
        caterpillar.explore();
    }

    public static void testMirrorVerticalRightToLeft() {
        Picture caterpillar = new Picture("caterpillar.jpg");
        caterpillar.explore();
        caterpillar.mirrorVerticalRightToLeft();
        caterpillar.explore();
    }

    /**
     * Method to test mirrorTemple
     */
    public static void testMirrorTemple() {
        Picture temple = new Picture("temple.jpg");
        temple.explore();
        temple.mirrorTemple();
        temple.explore();
    }

    /**
     * Method to test edgeDetection
     */
    public static void testEdgeDetection() {
        Picture swan = new Picture("swan.jpg");
        swan.edgeDetection(10);
        swan.explore();
    }

    /**
     * Method to test scaling a picture
     */
    public static void testScale() {
        Picture temple = new Picture("temple.jpg");
        temple.explore();
        Picture temple2 = temple.scale(0.5, 0.5);
        temple2.explore();
    }

    public static void testKeepOnlyBlue() {
        Picture temple = new Picture("temple.jpg");
        temple.keepOnlyBlue();
        temple.explore();
    }
    
    public static void testKeepOnlyRed() {
        Picture temple = new Picture("temple.jpg");
        temple.keepOnlyRed();
        temple.explore();
    }

    public static void testKeepOnlyGreen() {
        Picture temple = new Picture("temple.jpg");
        temple.keepOnlyGreen();
        temple.explore();
    }

    public static void testNegate() {
        Picture temple = new Picture("temple.jpg");
        temple.negate();
        temple.explore();
    }

    public static void testGrayscale() {
        Picture temple = new Picture("temple.jpg");
        temple.grayscale();
        temple.explore();
    }

    public static void testFixUnderwater() {
        Picture water = new Picture("water.jpg");
        water.fixUnderwater();
        water.explore();
    }

    public static void testMirrorHotizontal() {
        Picture water = new Picture("caterpillar.jpg");
        water.mirrorHorizontal();
        water.explore();
    }

    public static void testMirrorHotizontalBotToTop() {
        Picture water = new Picture("caterpillar.jpg");
        water.mirrorHorizontalBotToTop();
        water.explore();
    }

    /**
     * Main method for testing. Every class can have a main method in Java
     */
    public static void main(String[] args) {
        // uncomment a call here to run a test
        // and comment out the ones you don't want
        // to run

        //testExplorer();
        //testScale();
        //testZeroBlue();
        //testKeepOnlyBlue();
        //testKeepOnlyRed();
        //testKeepOnlyGreen();
        //testNegate();
        //testGrayscale();
        //testFixUnderwater();
        //testMirrorVertical();
        //testMirrorVerticalRightToLeft();
        //testMirrorHotizontal();
        //testMirrorHotizontalBotToTop();
        //testMirrorTemple();
        //testMirrorArms();
        //testMirrorGull();
        //testMirrorDiagonal();
        //testCollage();
        //testCopy();
        //testEdgeDetection();
        //testEdgeDetection2();
        //testChromakey();
        //testEncodeAndDecode();
        //testGetCountRedOverValue(250);
        //testSetRedToHalfValueInTopHalf();
        //testClearBlueOverValue(200);
        //testGetAverageForColumn(0);
    }
}
