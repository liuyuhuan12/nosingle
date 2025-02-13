package 第十四周作业;

import java.util.HashMap;

public class Utility
{
		private static DBUtils instance = null;
		private HashMap<String, User> user = new HashMap<String, User>();

		private DBUtils()
		{
			User a = new User();
			a.setCardID("410482222222222222");
			a.setUserName("Huang Zhichao");
			a.setCall("17656319795");
			a.setCardpassword("ahudiwehdohoa");
			a.setAccount(999999999);
			user.put(a.getCardID(), a);
			User b = new User();
			a.setCardID("410482222200000000");
			a.setUserName("Ao Teman");
			a.setCall("17656319794");
			a.setCardpassword("123");
			a.setAccount(12345699999);
			User c = new User();
			a.setCardID("410482200011111111");
			a.setUserName("Di Jia");
			a.setCall("18237209999");
			a.setCardpassword("123456");
			a.setAccount(9999);
		}

		public static DBUtils getInstance()
		{
			if (instance == null)
			{
				synchronized (DBUtils.class)
				{
					if (instance == null)
					{
						instance = new DBUtils();
					}
				}
			}
			return instance;
		}

		public User getUser(String cardID)
		{
			User user = (User) user.get(cardID);
			return user;
		}

		public HashMap<String, User> getUsers()
		{
			return user;
		}
}