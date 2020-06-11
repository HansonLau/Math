
public class questions2 {
	
	private String type;
	private int amt;
	private problem2[] question;
	private double[] key;
	
	public questions2(String type, int amt){
		
		this.type = type;
		this.amt = amt;
		question = new problem2[amt];
		key = new double[amt];
		
		for(int i = 0; i < amt; i++) {
			problem2 temp = new problem2(type);
			question[i] = temp;	
		}
		
		for(int i = 0; i < amt; i++) {
			
			key[i] = question[i].getAnswer();
			
		}
		
	}
	public problem2[] getQuestion() {
		return question;
	}
	public void setQuestion(problem2[] question) {
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
