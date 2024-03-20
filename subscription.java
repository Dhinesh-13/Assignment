package mr.cooper;

import java.util.Date;

public class subscription extends mr_broadband{
	public static void id()
	{
		System.out.print("Enter the user id :");
		String a=in.next();
		System.out.print("Enter the password :");
		String a1=in.next();
		Date aa=new Date(); 
		for(int i=0;i<user.size();i++)
		{
			if(user.get(i).equals(a))
			{
				
				if(subscriptionss.get(i).equals("Active"))
					
				{
					System.out.println("Status  :"+subscriptionss.get(i));
					System.out.println("subscription id"+subscription.get(i));
					System.out.println(aa);
				}
			}
		}
		enter();
	}
}
