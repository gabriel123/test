package gabriel_autier;

public class MyPathOfDoom implements specifications.PathOfDoom {

	private int length;
	private int indice = 0;
	private int[] path;
	
	@Override
	public void setLength(int length) {
		path = new int[length];
		
	}
	
	

	@Override
	public void addStep(int direction) {
    path [indice]= direction;
    indice ++;
		
	}

	@Override
	public int[] path() {
		//
		return null;
		
	}

}
