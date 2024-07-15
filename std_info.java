public class std_info
{
    int roll_no;
    String name;
    int percentage;
    String Grade;

    public void getdata()
    {
      roll_no=106;
      name="tsunade";
      percentage=100;
      Grade = "A";
    }
    public void display()
    {
        System.out.println("roll no="+roll_no);
        System.out.println("name="+name);
        System.out.println("percentag="+percentage);
        System.out.println("Grade="+Grade);
    }
    public static void main(String args[])
    {
        emp e1=new emp();
        e1.getdata();
        e1.display();

    }
}
