package quiz;

public class Questions {
	private int id;
	private String question;
	private String opt1, opt2, opt3, opt4;
	private String ans;
	public Questions(int id, String question, String opt1, String opt2, String opt3, String opt4, String ans) {
		super();
		this.id = id;
		this.question = question;
		this.opt1 = opt1;
		this.opt2 = opt2;
		this.opt3 = opt3;
		this.opt4 = opt4;
		this.ans = ans;
	}
	public int getId() {
		return id;
	}
	public String getQuestion() {
		return question;
	}
	public String getOpt1() {
		return opt1;
	}
	public String getOpt2() {
		return opt2;
	}
	public String getOpt3() {
		return opt3;
	}
	public String getOpt4() {
		return opt4;
	}
	public String getAns() {
		return ans;
	}
	@Override
	public String toString() {
		return "Questions [id=" + id + ", question=" + question + ", opt1=" + opt1 + ", opt2=" + opt2 + ", opt3=" + opt3
				+ ", opt4=" + opt4 + ", ans=" + ans + ", getId()=" + getId() + ", getQuestion()=" + getQuestion()
				+ ", getOpt1()=" + getOpt1() + ", getOpt2()=" + getOpt2() + ", getOpt3()=" + getOpt3() + ", getOpt4()="
				+ getOpt4() + ", getAns()=" + getAns() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
}
