public class ThreeDim extends Figura implements Print
{

    double h, p , obw;

    public double CalculateArea()
    {
        return 2*p + obw *h;
    }
    public double CalculatePerimeter()
    {
        return 0;
    }
    public    double CalculateVolume()
    {
        return p*h;

    }
    ThreeDim(double d1, double d2 , double d3)
    {
        if( d1 > 0 && d1 >0 && d2 >0)
        {
            h =d1;
            p =d2;
            obw =d3;

        }
        else
        {
            System.out.println(" Podano bledne wymiary ");
            h =0;
            p =0;
            obw =0;

        }
    }

    public void Print()
    {
        System.out.println(" Wyskosc: " + h);
        System.out.println(" Pole calkowite: "+ CalculateArea());
        System.out.println(" Objetosc: " +CalculateVolume());
    };
}
