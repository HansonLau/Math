
public class questions {
	
	private String type;
	private int amt;
	private problem[] question;
	private double[] key;
	
	public questions(String type, int amt){
		
		this.type = type;
		this.amt = amt;
		question = new problem[amt];
		key = new double[amt];
		
		for(int i = 0; i < amt; i++) {
			problem temp = new problem(type);
			question[i] = temp;
			key[i] = question[i].getAnswer();	
		}
		
	}
	public problem[] getQuestion() {
		return question;
	}
	public void setQuestion(problem[] question) {
		this.question = question;
	}
	public double[] getKey() {
		return key;
	}
	public void setKey(double[] key) {
		this.key = key;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getAmt() {
		return amt;
	}
	public void setAmt(int amt) {
		this.amt = amt;
	}
	


}
