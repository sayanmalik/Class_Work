class ParentBank
{
    public void loanInterest()
    {
        System.out.println("9% interest");
    }
}

class ChildSbi extends ParentBank
{
    public void loanInterest()
    {
        System.out.println("7.5% interest");
    }
}
class ChildAxis extends ParentBank
{
    public void loanInterest()
    {
        System.out.println("7% interest");
    }
}
class ChildHdfc extends ParentBank
{
    public void loanInterest()
    {
        System.out.println("12% interest");
    }
}
public class MethodOverridingDemo {
    public static void main(String args[])
    {
        // ChildSbi sbi=new ChildSbi();
        // sbi.loanInterest();
        // ChildHdfc hdfc=new ChildHdfc();
        // hdfc.loanInterest();
        ParentBank pb;
        pb=new ChildSbi(); //upcasting
        System.out.println("");
    }
    
}
