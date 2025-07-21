public class Hello {
    public static void main(String[] args) {
        // area of circle
        double pi = 3.14;
        int rad = 5;
        double result = pi * rad * rad;
        System.out.println("Area of Circle is : "+ result);

        // area of triangle
        int base = 3;
        int height = 10;
        double Area = 0.5 * (base * height);
        System.out.println("Area of Triangle is : "+ Area);

        // area of rectangle 
        int base1 = 3;
        int height1 = 10;
        int Area1 = (base * height);
        System.out.println("Area of rectangle is : "+ Area1);

        // area of square
        int side = 3;
        int Area2 = (side*side);
        System.out.println("Area of square is : "+ Area1);

        // area of hemisphere (2 *pi* r * r)+(pi*r*r)
        int radius = 10 ;
        System.out.println("Area of hemisphere is : "+ (double)(3*pi*radius*radius));
        
        // area of cone (pi * r * l) + (pi * r * r )

        int cone_r = 10;
        int cone_l = 50;
        double cone_area = (pi * cone_r * cone_l) + (pi * cone_r * cone_r );
        System.out.println("Area of cone is : "+ cone_area);

        // area of cylinder TSA=2πr(r+h)
        int cyl_r = 15;
        int cyl_h = 20;
        double cyl_area = (2*pi* cyl_r *(cyl_r+cyl_h));
        System.out.println("Area of cylinder is : "+ cyl_area);

        // volume of cylinder Volume=π*r*r*h
        int cyl_vol_r = 15;
        int cyl_vol_h = 20;
        double cyl_vol = (pi*cyl_vol_r*cyl_vol_r*cyl_vol_h);
        System.out.println("volume of cylinder is : "+ cyl_vol);

        // area of trapezium 

        int trap_a = 15;
        int trap_b = 20;
        int trap_h = 20;
        double trap_area = (0.5 * (trap_a=trap_b) * trap_h);
        System.out.println("area of trapezium is : "+ trap_area);

        // area of parallelogram

        

 

        
    }
}
