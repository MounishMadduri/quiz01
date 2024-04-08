package quiz;

import java.util.Arrays;
import java.util.Scanner;

public class QuestionsCaller {
	Questions[] questions = new Questions[3];
	String[] userSelection = new String[3];
	public QuestionsCaller() {
		questions[0] = new Questions(1, "who won 2011 wc?", "india", "aus", "pak", "eng", "india");
		questions[1] = new Questions(2, "who won 2015?", "india", "aus", "pak", "eng", "aus");
		questions[2] = new Questions(3, "who won 2019?", "india", "aus", "pak", "eng", "aus");
	}
	public void playQuiz() {
		int i = 0;
		for(Questions q: questions) {
			System.out.println("question no : "+ q.getId());
			System.out.println("Q) "+q.getQuestion());
			System.out.println(q.getOpt1());
			System.out.println(q.getOpt2());
			System.out.println(q.getOpt3());
			Scanner sc = new Scanner(System.in);
			String userSelected = sc.nextLine();
			userSelection[i] = userSelected;
			i++;
			
		}
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(questions);
		result = prime * result + Arrays.hashCode(userSelection);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		QuestionsCaller other = (QuestionsCaller) obj;
		return Arrays.equals(questions, other.questions) && Arrays.equals(userSelection, other.userSelection);
	}

	public int mark() {
		int i = 0;
		int c = 0;
		for(Questions q : questions) {
			System.out.println(q.getAns()+ " "+ userSelection[i]);
			if(q.getAns().equals(userSelection[i])) {
				c++;				
			}
			i++;
			
		}
		
		return c;
		
	}
	
	
}
