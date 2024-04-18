public class Diamond extends Figura implements Print{

        double a,b;

    public double CalculateArea()
        {
            return a*b/2;
        }
    public    double CalculatePerimeter()
        {
            return 4 *(Math.sqrt(a*a + b*b));

        }
        Diamond(double d1, double d2 )
        {
            if( d1 > 0 && d2 >0)
           {
             a = d1;
             b = d2;
            }
            else
            {
             System.out.println(" Podano bledne wymiary ");
             a = 0;
             b = 0;
            }
         }

    public void Print()
    {
        System.out.println(" Romb wymiary przekatnych: "+ a + " x " +  b);
        System.out.println(" Pole: "+ CalculateArea());
        System.out.println(" Obwod: " +CalculatePerimeter());
    };
}
