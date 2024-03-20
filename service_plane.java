package mr.cooper;

public class service_plane extends mr_broadband {
	public static void plane()
	{
		
		System.out.print("Enter the user id :");
		String a=in.next();
		System.out.print("Enter the password :");
		String a1=in.next();
		int j=0;
		int k=0;
		for(int i=0;i<user.size();i++)
		{
			
			if(a.equals(user.get(i))&&  a1.equals(userpassword.get(i)))
			{
				 j=i; k=1;
			System.out.println("1.\"₹599 +GST\" , \"6/12 months plans available for new customers \", \"Data Unlimited Data @30 Mbps\"");
			System.out.println("2.\"₹899 +GST\" , \"10/12 months plans available for new customers \", \"Data Unlimited Data @30 Mbps\"");
			System.out.println("3.\"₹999 +GST\" , \"6/12 months plans available for new customers \", \"Data Unlimited Data @60 Mbps\"");
			System.out.println("4.\"₹1299 +GST\" , \"6/12 months plans available for new customers \", \"Data Unlimited Data @90 Mbps\"");
			System.out.println("5.\"₹1599 +GST\" , \"10/12 months plans available for new customers \", \"Data Unlimited Data @90 Mbps\"");
			int n=in.nextInt();
			subscription o=new subscription();
			mr_broadband o1=new mr_broadband();
			switch(n)
			{
				case 1:
					System.out.println("------------Your Recharge Succesfull------------");
					subscriptionss.set(j, "Active");
					System.out.println("Status  :"+subscriptionss.get(j));
					o1.enter();
					//break;
				case 2:
					System.out.println("------------Your Recharge Succesfull------------");
					subscriptionss.set(j, "Active");
					System.out.println("Status  :"+subscriptionss.get(j));
					o1.enter();
					//break;
				case 3:
					System.out.println("------------Your Recharge Succesfull------------");
					subscriptionss.set(j, "Active");
					System.out.println("Status  :"+subscriptionss.get(j));
					o1.enter();
					//break;
				case 4:
					System.out.println("------------Your Recharge Succesfull------------");
					subscriptionss.set(j, "Active");
					System.out.println("Status  :"+subscriptionss.get(j));
					o1.enter();
					//break;
				case 5:
					System.out.println("------------Your Recharge Succesfull------------");
					subscriptionss.set(j, "Active");
					System.out.println("Status  :"+subscriptionss.get(j));
					o1.enter();
					//break;
			}
		}
			
		}
	
	
	if(k!=1)
	{
		System.err.println("Invalid user id or password");
		System.out.println();
	}
  
}



	
}
