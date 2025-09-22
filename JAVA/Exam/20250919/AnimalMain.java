package study1;

public class AnimalMain {
	/* 
	 * 정말 스바라시 합니다 !
	 */
	public static void main(String[] args) {
		
		AnimalDAO dao = new AnimalDAO();
		AnimalService service = new AnimalService(dao);
		AnimalController controller = new AnimalController(service);
		
		controller.run();
	}
}
