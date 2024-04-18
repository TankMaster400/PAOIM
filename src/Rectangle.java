public class Rectangle extends Figura implements Print{

        double a,b;
        public double CalculateArea()
        {
            return a*b;
        }

        public double CalculatePerimeter()
        {
            return (a+b)*2;
        }
        Rectangle(double d1, double d2)
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
            System.out.println(" Prostokat wymiary: "+ a + " x " +  b);
            System.out.println(" Pole: "+ CalculateArea());
            System.out.println(" Obwod: " +CalculatePerimeter() );

        };


}
