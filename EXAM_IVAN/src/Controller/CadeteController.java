package Controller;

import java.util.ArrayList;

import Model.Cadete;
import Model.ModeloCadete;

public class CadeteController {

	private ModeloCadete mc;
	
	public CadeteController() {
		// TODO Auto-generated constructor stub
		mc = new ModeloCadete();
	}
	
	public ArrayList<Cadete> loadCadetes(){
		return mc.load();
	}
	
	public Cadete loadMiCadete(){
		return mc.loadMiCadete();
	}

}
