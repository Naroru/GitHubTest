public class Cat implements Pet{

    @Override
    public void Sound()
    {
        System.out.println("meow-meow");
    }

    public void eat()
    {
        System.out.println("Cat is not eating");
    }
    public void run()
    {
        System.out.println("Cat is not running");
    }
       public void sleeping()
    {
        System.out.println("Cat is not sleeping");
    }
    
    public void makeAnAction()
    {
        System.out.println("Cat caught a mouse");
    }
}
