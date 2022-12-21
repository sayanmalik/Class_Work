class Bank 
{
    public void loaninterest()
    {
        System.out.println("9% interest");
    }
}
// SBI is subclass which inherit parent class Bank
class SBI extends Bank{
    public void SBIloan()
    {
        System.out.println("For SBI");
    }
}
// HDFC is subclass which inherit parent class Bank
class HDFC extends Bank{
    public void HDFCloan()
    {
        System.out.println("For HDFC");
    }
}
// Axis is subclass which inherit parent class Bank
class Axis extends Bank{
    public void Axisloan()
    {
        System.out.println("For Axis");
    }
}
public class HeirarchicalDemo {
    public static void main(String args[])
    {
        Axis ax=new Axis();
        ax.Axisloan();
        ax.loaninterest();
        HDFC hdfc=new HDFC();
        hdfc.HDFCloan();
        hdfc.loaninterest();
        SBI sbi=new SBI();
        sbi.SBIloan();
        sbi.loaninterest();
    }
}
