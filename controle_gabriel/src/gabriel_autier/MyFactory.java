package gabriel_autier;

import moulinette.Moulinette;
import specifications.ChoiceOfThief;
import specifications.CursedTable;
import specifications.Factory;
import specifications.PathOfDoom;
import specifications.WheelOfDeath;

public class MyFactory implements Factory {
	private String NOM ="gabriel autier";
	
	@Override
	public String getNom() {
		// TODO Auto-generated method stub
		return NOM;
	}

	@Override
	public ChoiceOfThief getChoiceOfThief() {
		MyChoiseOfThief a = new MyChoiseOfThief();
		return a;
	}

	@Override
	public WheelOfDeath getWheelOfDeath() {
		MyWheelOfDeath b = new MyWheelOfDeath();
		return b;
	}

	@Override
	public PathOfDoom getPathOfDoom() {
		MyPathOfDoom c = new MyPathOfDoom() ;
		return c;
	}

	@Override
	public CursedTable getCursedTable() {
		MyCursedTable d = new MyCursedTable() ;
		return d;
	}
	
	public static void main(String[] args)
	{
		Moulinette m = new Moulinette();
		//Pour executer la moulinette, placez votre factory en parametre
		m.addFactory(new gabriel_autier.MyFactory());
		m.run();
	}

}
