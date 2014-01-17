package gabriel_autier;

import specifications.CursedTable;

public class MyCursedTable implements CursedTable {
	private int nbGuests;

	@Override
	public void setNbGuests(int nbGuests) {
		this.nbGuests = nbGuests;
		
	}

	@Override
	public void addToast(int guest1, int guest2) {
		guest1 = 1;
		guest2= 3;
		
	}

	@Override
	public int getNbCrossings() {
		// TODO Auto-generated method stub
		return 1;
	}

}
