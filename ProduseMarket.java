public class ProduseMarket {
	private String nume;
	private String lot;
	private int stoc;
	private int pret;
	// constructor pentru clasa ProduseMarket
	public ProduseMarket (String nume,String lot, int stoc, int pret){
		this.nume = nume; // referinte catre obiectul curent
		this.lot = lot;
		this.stoc = stoc;
		this.pret = pret;
	}
	// denumirea obiectelor
	public String getNume (){ // interogarea campurilor
		return nume;
	}
	public String getLot (){
		return lot;
	}
	public int getStoc(){
		return stoc;
	}
	public int getPret(){
		return pret;
	}
	// metoda setter pentru a seta continutul obiectelor, nu returneaza nimic
	public void setNume(String nume){
		this.nume=nume;
	}
	public void setLot (String lot){
		this.lot = lot;
	}
	public void setStoc(int stoc){
		this.stoc=stoc;
	}
	public void setPret (int pret){
		this.pret=pret;
	}
	public ProduseMarket (ProduseMarket pr){
		nume = pr.nume;
		lot = pr.lot;
		stoc= pr.stoc;
		pret = pr.pret;
	}
}