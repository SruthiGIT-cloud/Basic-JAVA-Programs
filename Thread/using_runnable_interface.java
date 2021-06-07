class A implements Runnable 
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
class B implements Runnable
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
		A obj1=new A();//NORMAL OBJ CREATION OF CLASS 
		Thread t1=new Thread(obj1);//in implements need to create object for THREAD CLASS ALSO AND PASS OBJ
		t1.start();//CAN USE run() ALSO BUT TAKES TIME ONLY DIFFRES
		B obj2=new B();
		Thread t2=new Thread(obj2);
		t2.start();
		
	}
}
/* OUTPUT :-
Hi starts
Hi ends


...Program finished with exit code 0
Press ENTER to exit console.
*/
