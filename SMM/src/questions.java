
public class questions {
	
	private String type;
	private int amt;
	private problem[] question;
	private double[] key;
	
	public questions(String type, int amt){
		
		this.type = type;
		this.amt = amt;
		
		for(int i = 0; i < amt; i++) {
			
			question[i] = new problem(type);
			key[i] = question[i].getAnswer();
			
		}
		
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
