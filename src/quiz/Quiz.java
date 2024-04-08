package quiz;

public class Quiz {

	public static void main(String[] args) {
		QuestionsCaller quizz = new QuestionsCaller();
		quizz.playQuiz();
		System.out.println("points out of 3: "+quizz.mark());
	}

}
