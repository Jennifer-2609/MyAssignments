package week1.assignments;

public class Mobile {
	
	public void makeCall() {
		String mobileModel ="One plus";
		float mobileWeight = 2.5f;
		System.out.println(mobileModel);
		System.out.println(mobileWeight);

	}

	public void sendMsg() {
		int mobileCost = 25000;
		boolean isFullCharged = true;
		System.out.println(mobileCost);
		System.out.println(isFullCharged);

	}
	
	public static void main(String[] args) {
		Mobile obj = new Mobile();
		obj.makeCall();
		obj.sendMsg();
		System.out.println("This is my mobile");
		
	}
}
