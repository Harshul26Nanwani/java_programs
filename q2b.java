import java.util.Scanner;
interface Area{
    public abstract void compute_area();
}
class rectangle implements Area{
    protected double l,b;
    public void input(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter length"); l=s.nextDouble();
        System.out.println("Enter breadth"); b=s.nextDouble();

    }
    public void output(){
        System.out.println("Length="+l+"Breadth="+b);
    }
    public void compute_area(){
        System.out.println("Area of rectagle="+l*b);
    }
}
class circle implements Area{
    private double d;
    public void input(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Diameter");
        d=s.nextDouble();
    }
    public void output(){
        System.out.println("Diameter="+d);
    }
    public void compute_area(){
        double r=d/2;
        double area=Math.PI*r*r;
        System.out.println("Area of circle="+area);
    }
}
class cuboid extends rectangle implements Area{
    private double h;
    public void input(){
        super.input();
        Scanner s= new Scanner(System.in);
        System.out.println("Enetr height");
        h=s.nextDouble();
    }
    public void output(){
        super.output();
        System.out.println("Height="+h);

    }
    public void compute_area(){
        System.out.println("Area of cuboid="+2*(l*b+b*h+h*l));
    }
}
public class q2b {
    public static void main(String args[]){
        rectangle a= new rectangle();
        circle c= new circle();
        cuboid cu=new cuboid();
        a.input(); c.input(); cu.input();
        a.output(); c.output(); cu.output();
        a.compute_area(); c.compute_area(); cu.compute_area();
        Area ar;
        ar=a;
        ar.compute_area();
    }
}
