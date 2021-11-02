public class Home
{
public static void main(String[] args)
{
Home boy = new Home();
int balance = boy.buyVeg();
	System.out.println(balance);
	boy.save(balance);
}
	public void save (int bal)
	{
	System.out.println("I saved" + bal);
	}
public int buyVeg()
{
System.out.println("Got Vegetables");
	return 10;
}
}