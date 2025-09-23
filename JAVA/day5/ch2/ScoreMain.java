package ch2;

public class ScoreMain {

	public static void main(String[] args) {
		
		ScoreDAO dao = new ScoreDAO();
		ScoreService service = new ScoreService(dao );
		ScoreController controller = new ScoreController(service);
		
		controller.run();
	}

}
