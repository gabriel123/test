package gabriel_autier;

public class MyWheelOfDeath implements specifications.WheelOfDeath{

	private int limit;
	private int range;
	private int result;
	int score = 0;
	
	@Override
	public void setLimit(int limit) {
		this.limit =limit;
		
	}

	@Override
	public void setRange(int range) {
		this.range = range;
		
	}

	@Override
	public void setLastResult(int result) {
		score += result ;
		
	}

	@Override
	public boolean playAgain() {
		
		
		return score + range <= limit;
	}

}
