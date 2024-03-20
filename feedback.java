package mr.cooper;

public class feedback extends mr_broadband {
	public static void des()
	{
		System.out.print("Enter the user id :");
		String a=in.next();
		System.out.print("Enter the password :");
		String a1=in.next();
		for(int i=0;i<user.size();i++)
		{
			
			if(a.equals(user.get(i))&&  a1.equals(userpassword.get(i)))
			{
				System.out.println("1.Excellent");
				System.out.println("2.Very Good");
				System.out.println("3.Good");
				System.out.println("3.Not Bad");
				System.out.println("4.Poor");
				int k=in.nextInt();
				if(k>=1 && k<=4)
				{
					System.out.println("Thanks for your feedback");
				}
				else
				{
					System.out.println("Invalid selection");
				}
			}
		}
		enter();
	}
}
