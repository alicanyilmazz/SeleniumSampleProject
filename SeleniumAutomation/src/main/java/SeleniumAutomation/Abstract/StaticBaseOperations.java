package SeleniumAutomation.Abstract;

import java.util.Random;

public final class StaticBaseOperations {

    static String[]  numberofproduct={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15"};
    static Random rnd=new Random();

    public static String takeRandomProduct(){


        return  numberofproduct[ rnd.nextInt(15)];

    }
}
