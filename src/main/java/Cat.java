public class Cat implements Pet{

    @Override
    public void Sound()
    {
        System.out.println("meow-meow");
    }

    public void makeAnAction()
    {
        System.out.println("Cat caught a mouse");
    }
}
