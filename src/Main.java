import java.util.ArrayList;
import java.util.List;

/**
 * Project: LinearRegression
 * Package: PACKAGE_NAME
 * <p>
 * User: Nguyen Vi
 * Date: 12/1/2020
 * Time: 9:50 AM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
public class Main {


    public static void main(String[] args) {


//        CVSReader cs = new CVSReader();
//        String fileName  = "C:\\Users\\nguye\\Downloads\\testData.csv";
//        cs.readFromCSV(fileName);
//        cs.printOut();
//

        System.out.println("This is test ! Working properly Okay ");

    }

    // Build Model
    // Return a list for first compute
    // set default value for all of them
        // B  = 1;
        // w0 = 1;
   public static List<Double> test(List<RealEstate> list)
   {
       // Y = b + w0+xi + w1+xi + ..... + wi.xi

            // The mission to find out b,w0,w1,w2,w3,w4
       //After sum and divide
       double result = 0;


       double w0,w1,w2,w3,w4,x2,x3,x4,x5,x6;
       x2 = 0;
       x3 = 0;
       x4 = 0;
       x5 = 0;
       x6 = 0;

       //     y = b + w0.x2 + w1.x3 + w2.x4 + w3.x5 + w4.x6

       // This will store residual (actual predicted)
       List<Double> residualActualPredicted = new ArrayList<>();

       for(RealEstate rs : list)
       {
           x2 = rs.getX2();
           x3 = rs.getX3();
           x4 = rs.getX4();
           x5 = rs.getX5();
           x6 = rs.getX6();

           residualActualPredicted.add(getY(x2,x3,x4,x5,x6));


       }

       return residualActualPredicted;
   }


   public static List<Double> residualSquareList(List<Double> residualActualPredicted, List<RealEstate> realEstates)
   {
       // After square
       List<Double> residualSquare = new ArrayList<>();
       for (int i = 0; i < residualActualPredicted.size(); i++) {
           double y = Math.pow(realEstates.get(i).getY() - residualActualPredicted.get(i),2);
           residualSquare.add(y);
       }
       return  residualSquare;
   }
   public static double calculateResultAfterEachEpoch(List<Double> residualSquare)
   {

       double sum = 0;
       for (Double number : residualSquare)
       {
           sum = sum + number;
       }
       return (sum/(residualSquare.size()));
   }

   

//     1 epoch = 1 pass through data set
    // a = (1 / (1 + decayRate*epochNum))* a0
    // decayRate:Pick 1
    // a0 = 0.2
// Exponentially decay rate
    // a = (0.95^epoch)*a0



    // This is model
    public static double getY(double x2, double x3, double x4, double x5, double x6)
    {
        double b; // this is slope
        double w0,w1,w2,w3,w4;
        // set default
        b = 1;
        w0 = 1;
        w1 = 1;
        w2 = 1;
        w3 = 1;
        w4 = 1;
        double y = b + w0*x2 + w1*x3 + w2*x4 + w3*x5 + w4*x6;
        return y ;
    }

}
