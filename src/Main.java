import java.util.Scanner;
public class Main
{

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Witaj w programie \n Wybierz opcje:");
        int i = 0;
        while(true)
        {
          System.out.println(" 1 - Triangle");
          System.out.println(" 2 - Diamond ");
          System.out.println(" 3 - Rectangle ");
          System.out.println(" 4 - ThreeDim ");
          System.out.println(" 5 - Wyjdz z programu ");
          int myInt = scanner.nextInt();
            switch(myInt) {
                case 1:
                    System.out.println(" Podaj 3 boki trojkata");
                    double x = scanner.nextDouble();
                    double y = scanner.nextDouble();
                    double z = scanner.nextDouble();
                    Triangle T1 = new Triangle(x,y,z);
                    T1.Print();
                    break;
                case 2:
                    System.out.println(" Podaj przekatne rombu");
                    double e = scanner.nextDouble();
                    double f = scanner.nextDouble();
                    Diamond D1 = new Diamond(e,f);
                    D1.Print();
                    break;
                case 3:
                    System.out.println(" Podaj boki prostokata");
                    double xr = scanner.nextDouble();
                    double yr = scanner.nextDouble();
                    Rectangle R1 = new Rectangle(xr,yr);
                    R1.Print();
                    break;
                case 4:
                    int zmien = 0;
                    while(zmien ==0) {
                        System.out.println(" 1 - Triangle");
                        System.out.println(" 2 - Diamond ");
                        System.out.println(" 3 - Rectangle ");
                        int myInt2 = scanner.nextInt();
                        switch (myInt2) {
                            case 1:
                                System.out.println(" Podaj 3 boki trojkata");
                                double x2 = scanner.nextDouble();
                                double y2 = scanner.nextDouble();
                                double z2 = scanner.nextDouble();
                                Triangle T2 = new Triangle(x2, y2, z2);
                                System.out.println(" Podaj wysokosc");
                                double ht = scanner.nextDouble();
                                ThreeDim Dt = new ThreeDim(ht, T2.CalculateArea(), T2.CalculatePerimeter() );
                                Dt.Print();
                                zmien = 1;
                                break;
                            case 2:
                                System.out.println(" Podaj przekatne rombu");
                                double e2 = scanner.nextDouble();
                                double f2 = scanner.nextDouble();
                                Diamond D2 = new Diamond(e2, f2);
                                System.out.println(" Podaj wysokosc");
                                double hd = scanner.nextDouble();
                                ThreeDim Dd = new ThreeDim(hd, D2.CalculateArea(), D2.CalculatePerimeter() );
                                Dd.Print();
                                zmien = 1;
                                break;
                            case 3:
                                System.out.println(" Podaj boki prostokata");
                                double xr2 = scanner.nextDouble();
                                double yr2 = scanner.nextDouble();
                                Rectangle R2 = new Rectangle(xr2, yr2);
                                System.out.println(" Podaj wysokosc");
                                double hr = scanner.nextDouble();
                                ThreeDim Dr = new ThreeDim(hr, R2.CalculateArea(), R2.CalculatePerimeter() );
                                Dr.Print();
                                zmien = 1;
                                break;
                            default:
                                System.out.println(" Wpisano bledna wartosc, wybierz ponownie");
                        }
                    }
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println(" Wpisano bledna wartosc, wybierz ponownie");
            }

        }
    }
}
