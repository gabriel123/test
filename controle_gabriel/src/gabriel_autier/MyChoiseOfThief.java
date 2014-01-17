package gabriel_autier;

import specifications.ChoiceOfThief;

public class MyChoiseOfThief implements ChoiceOfThief {
	
	private int nbObjects;
	private int limit;
	private int weight;
	

	

	@Override
	public void setNbObjects(int nbObjects) {
		this.nbObjects = nbObjects;
		
	}

	@Override
	public void addObject(int weight) {
		this.weight = weight;
		
	}

	@Override
	public void setLimit(int limit) {
		this.limit = limit ; 
		
	}

	@Override
	public int getFirstObject() {
	
		return 0;
	}

	@Override
	public int getSecondObject() {
		// TODO Auto-generated method stub
		return 0;
	}

}
