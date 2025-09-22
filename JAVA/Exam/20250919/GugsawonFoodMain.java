package study1;

public class GugsawonFoodMain {

	public static void main(String[] args) {
		
		GugsawonFoodDAO dao = new GugsawonFoodDAO();
		GugsawonService service = new GugsawonService(dao );
		GugsawonFoodController controller = new GugsawonFoodController(service );
		
		controller.run();
	}

}
