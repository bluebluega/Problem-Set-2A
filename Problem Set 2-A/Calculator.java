//Sarah Wang
//September 29th, 2021
//Purpose: Problem Set 2-A, Calculator Class

class Calculator{

    //QUADRATIC FORMULA
    double a = 1;//a, b, and c are the coefficients of the polynomial
    double b = 5;
    double c = 6;
    
    //SLOPE AND MIDPOINT VARIABLES
    double x1 = 0;//x1 and y1 are coordinates of the 1st point
    double y1 = 0;
    double x2 = 2;//x2 and y2 are coordinates of the 2nd point
    double y2 = 3;

    //SUM OF ARITHMETIC SERIES VARIABLES
    int k = 5; //number of terms
    double a1 = 1; //first term
    double a2 = 5; //last term

    //SUM OF GEOMETRIC SERIES

    double k1 = 3; //number of terms
    double g = 3;  //first term
    double r = 2; //common ratio

    public void display(){
        
        //QUADRATIC
        System.out.println("QUADRATIC FORMULA");
        System.out.println("The solutions for " + (int)a + "x^2 + " + (int)b + "x + " + (int)c + " are " + qMinus(a,b,c) + " and " + qPlus(a,b,c));
        System.out.println();

        //SLOPE
        System.out.println("SLOPE FORMULA");
        System.out.println("A line connecting the points (" + (int)x1 + ", " + (int)y1 + ") and (" + (int)x2 + ", " + (int)y2 + ") has a slope of " + slope(x1,y1,x2,y2));
        System.out.println();

        //MIDPOINT
        System.out.println("MIDPOINT FORMULA");
        System.out.println("The midpoint between (" + (int)x1 + ", " + (int)y1 + ") and (" + (int)x2 + ", " + (int)y2 + ") is (" + mX(x1,x2) + ", " + mY(y1,y2) + ")");
        System.out.println();

        //SUM OF ARITHMETIC SERIES
        System.out.println("SUM OF AN ARITHMETIC SERIES");
        System.out.println("The sum of the first 5 terms of an arithemetic series that starts with " + a1 + " and increases by " + a1 + " is " + s(k,a1,a2));
        System.out.println();

        //SUM OF GEOMETRIC SERIES
        System.out.println("SUM OF A FINITE GEOMETRIC SERIES");
        System.out.println("The sum of the first 3 terms of a finite geometric series that starts with " + g + " and increases by a rate of " + r + " is " + S(k1,g,r));

    }

    //QUADRATIC (- discriminant) non-void method
    double qMinus(double a, double b, double c){
        return (-1*b-(Math.sqrt((b*b)-(4*a*c))))/(2*a);
    }
    
    //QUADRATIC (+ discriminant) non-void method
    double qPlus(double a, double b, double c){
        return (-1*b+(Math.sqrt((b*b)-(4*a*c))))/(2*a);
    }
    
    //SLOPE non-void method
    double slope(double x1, double y1, double x2, double y2){
        return (y2-y1)/(x2-x1);
    }

    //MIDPOINT x-value non-void method
    double mX(double x1, double x2){
        return ((x1+x2)/2);
    }

    //MIDPOINT y-value non-void method
    double mY(double y1, double y2){
        return ((y1+y2)/2);
    }

    //SUM OF ARITHMETIC SERIES non-void method
    double s(int k, double a1, double a2){
        return (k/2.0)*(a1+a2);
    }

    //SUM OF GEOMETRIC SERIES non-void method
    double S(double k1, double g, double r){
        return g*((1-Math.pow(r,k1))/(1-r));
    }
}