class A
{
    int i,j;
    public void show ()
    {
        
        System.out.println("i="+i);
        System.out.println("j="+j);
    }
    
}
 class B extends A
{
    int k;
    public void dispaly()
    {
        System.out.println("k="+k);
        System.out.println("i="+i);
        System.out.println("j="+j);
    }
}
/**
 * kuch
 */
public class kuch {

 public static void main(String[] args) {
    B b1 = new B();
    b1.i= 12;
    b1.j=14;
    b1.k=19;
    b1.show();
    b1.dispaly();
    
 }   
}

