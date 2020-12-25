/**
 * Project: LinearRegression
 * Package: PACKAGE_NAME
 * <p>
 * User: Nguyen Vi
 * Date: 12/1/2020
 * Time: 10:32 AM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
public class RealEstate {


/*
 x2: house age
 X3 distance to the nearest MRT station
 X4 number of convenience stores
 X5 latitude
 X6 longitude
 Y house price of unit area
  */

    private double x2;
    private double x3;
    private int x4;
    private double x5;
    private double x6;
    private double y;

    public RealEstate() {
    }

    public RealEstate(double x2, double x3, int x4, double x5, double x6, double y) {
        this.x2 = x2;
        this.x3 = x3;
        this.x4 = x4;
        this.x5 = x5;
        this.x6 = x6;
        this.y = y;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public double getX3() {
        return x3;
    }

    public void setX3(double x3) {
        this.x3 = x3;
    }

    public int getX4() {
        return x4;
    }

    public void setX4(int x4) {
        this.x4 = x4;
    }

    public double getX5() {
        return x5;
    }

    public void setX5(double x5) {
        this.x5 = x5;
    }

    public double getX6() {
        return x6;
    }

    public void setX6(double x6) {
        this.x6 = x6;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "RealEstate{" +
                "house age=" + x2 +
                ", distance to the nearest MRT station=" + x3 +
                ", number of convenience stores=" + x4 +
                ", latitude=" + x5 +
                ", longitude=" + x6 +
                ", y=" + y +
                '}';
    }
}
