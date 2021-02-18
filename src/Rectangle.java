
public class Rectangle {
	private double largeur;
	private double hauteur;
	
	public double surface()
	{
		return hauteur*largeur;
	}
	
	public void setHauteur(double h)
	{
		this.hauteur = h;
		
	}
	
	public void setLargeur(double l)
	{
		this.largeur = l;
	}
	
	public double getHauteur()
	{
		return hauteur;
	}
	
	public double getLargeur()
	{
		return largeur;
	}
}
