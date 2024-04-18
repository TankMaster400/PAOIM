public class Triangle
{
    double a,b,c;
    public double CalculateArea()
    {
        double p = CalculatePerimeter()/2.;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

    public double CalculatePerimeter()
    {
        return a+b+c;
    }
    Triangle(double d1, double d2,double d3) {

        if(d1 + d2 >  d3 &&  d1 + d3 > d2 && d3 + d2 > d1 )
        {
            a =d1; b =d2; c =d3;
        }
        else
        {
            System.out.println(" Podano bledne wymiary ");
            a = 0;
            b = 0;
            c = 0;
        }

    }
    public void Print()
    {
        System.out.println(" Trojak wymiary bokow: "+ a+ " x " +  b + " x " +  c);
        System.out.println(" Pole: "+ CalculateArea());
        System.out.println(" Obwod: " +CalculatePerimeter() );

    };
}
