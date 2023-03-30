package test0330;

public class ShopService {
		private static ShopService shopservice = new ShopService();
		
		private ShopService() {
			
		}
		public static ShopService getInstance() {
			return shopservice;
		}
		
//private static 싱글톤 singleton = new 싱글톤 ();
//private 싱글톤(){}
//static 싱글톤 getInstance(){}
		//return singleton;
}
