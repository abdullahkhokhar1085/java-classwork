// interface  using multiple inheritence
public class interface3
{
    public static void main(String args[])
    {
        calculator c1=new calculator();
        c1.add();
        c1.mul();
        c1.sub();
        c1.div();
        c1.percentage();
    }

    
}
interface addition
{
    void add();
} 
interface multiple
{
    void mul();
}

interface subtraction
{
    void sub();
}
interface division
{
    void div();
}
interface Percentage
{
    void percentage();
}

class calculator implements addition,multiple,subtraction,division,Percentage
{
    public void add()
    {
        int c;
        c=10+20;
        System.out.println("addition="+c);

    }
    
    public void mul ()
    {
        int m;
        m=10*30;
        System.out.println("multiplication="+m);
    }
    public void sub()
    {
        int n;
        n=10-6;
        System.out.println("subtraction="+n);
    }
    public void div()
    {
        double o;
        o=67.0 / 98.0;
        System.out.println("division="+o);

    }
    public void percentage()
    {
        double x;
        x=(365/400)*100;
        System.out.println("percentage="+x);
    }


}