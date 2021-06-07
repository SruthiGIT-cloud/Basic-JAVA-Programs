class A extends Thread 
{
    public void run()
    {
        System.out.println("Hi starts");
        try 
        {
           Thread.sleep(1000); 
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
class B extends Thread 
{
    public void run()
    {
        System.out.println("Hi ends");
        try 
        {
           Thread.sleep(1000); 
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
public class Main
{
	public static void main(String[] args)
	{
		A obj1=new A();
		B obj2 =new B();
		obj1.start();
		obj2.start();
		
	}
}
// OUTPUT :-
/* Hi starts
   Hi ends
//QUICKLY EXECUTES

...Program finished with exit code 0
Press ENTER to exit console.*/
