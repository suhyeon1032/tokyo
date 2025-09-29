package week3Day5Exam;

public class DeliveryMain {

	public static void main(String[] args) {
		
		String filename = "DB/deliverys.csv";
		DeliveryDAO dao = new DeliveryDAO(filename);
		DeliveryService service = new DeliveryService(dao);
		DeliveryController controller = new DeliveryController(service);
		
		controller.run();
	}

}
