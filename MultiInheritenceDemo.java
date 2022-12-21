class Animal //grand parent 
{
    public void display()
    {
        System.out.println("Animal");
    }
}
class Dog extends Animal //parent 
{
    public void dog()
    {
        System.out.println("Dog is barking...");
    }
}
class Puppy extends Dog // child
{
    public void puppy()
    {
        System.out.println("Child is Dog");
    }
}
public class MultiInheritenceDemo
{
    public static void main(String args[])
    {
        Puppy puppy=new Puppy();
        puppy.display();
        puppy.dog();
        puppy.puppy();
    }
}