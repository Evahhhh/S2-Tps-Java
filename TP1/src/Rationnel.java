/**
 * This class for representing and manipulating rational numbers.
 * @author Eve-Anne Offredi
 */
public class Rationnel{
	//numérateur
	private int numerateur;
	
	//dénominateur
	private int denominateur;
	
	/**
	 * Check that the denominator is &gt;0, =0 and if it is &lt;0, the sign of the numerator will be changed
	 * @param n - numerator
	 * @param d - denomiantor
	 */
	public Rationnel(int n,int d){
		
		//d n'est pas égal à 0
		if(d==0){
			System.err.println("Le dénominateur est égal à 0");
			this.denominateur = 1;
			this.numerateur = n;
		}
		else if(d<0){
			this.numerateur = (-1)*n;
			this.denominateur = (-1)*d;
		}
		else{
			this.numerateur = n;
			this.denominateur = d;
		}
		
		//Appel de la méthode reduit pour obtenir une fraction irréductible
		this.reduit();
	}
	
	/**
	 * Get the numerator
	 * @return the numerator
	 */
	public int getNumerateur(){
		return this.numerateur;
	}
	
	/**
	 * Set the numerator
	 * @param numerateur - integer numerator
	 */
	public void setNumerateur(int numerateur){
		this.numerateur = numerateur;
	}
	 
	 /**
	  * Get the denominator
	  * @return the denominator
	  */
	 public int getDenominateur(){
		 return this.denominateur;
	 }
	 
	 /**
	 * Set the denominator
	 * @param denominateur - integer denominator
	 */
	public void setDenominateur(int denominateur){
		this.denominateur = denominateur;
	}
	
	/**
	 * Reverses the denominator and numerator
	 * @return ret a rational
	 */
	public Rationnel inverse(){
		Rationnel ret = new Rationnel(this.denominateur, this.numerateur);
		return ret;
	}
	
	/**
	 * Add a rational to another
	 *@param unNR - a rational
	 *@return ret - the result
	 */
	public Rationnel ajoute(Rationnel unNR){
		if(unNR == null)return null;
		else{
			int l1a = unNR.getNumerateur() * this.denominateur;
			int l1b = unNR.getDenominateur() * this.numerateur;
			int l1 = l1a + l1b;
			int l2 = unNR.getDenominateur() * this.denominateur;
			
			Rationnel ret = new Rationnel(l1,l2);
			return ret;
		}
	}
	
	/**
	 * Soustract the current rational to another
	 *@param unNR - a rational
	 *@return ret - the result
	 */
	public Rationnel soustrait(Rationnel unNR){
		if(unNR == null)return null;
		else{
			int l1a = unNR.getNumerateur() * this.denominateur;
			int l1b = unNR.getDenominateur() * this.numerateur;
			int l1 = l1a - l1b;
			int l2 = unNR.getDenominateur() * this.denominateur;
			
			Rationnel ret = new Rationnel(l1,l2);
			return ret;
		}
	}
	
	/**
	 * Multiply 2 rational together
	 * @param unNR - a rational
	 * @return ret - the result
	 */
	public Rationnel multiplie(Rationnel unNR){
		if(unNR == null)return null;
		else{
			int num = unNR.getNumerateur() * this.numerateur;
			int denom = unNR.getDenominateur() * this.denominateur;
			
			Rationnel ret = new Rationnel(num,denom);
			return ret;
		}
	}
	
	/**
	 * Verify if 2 rational are equal
	 * @param another - a rational
	 * @return ret - the response
	 */
	public Boolean egale(Rationnel another){
		if(another == null)return null;
		else{
			Boolean ret = false;
			
			//vérification du numérateur
			if(another.getNumerateur() == this.numerateur) ret = true;
			
			//vérification du dénominateur
			if(another.getDenominateur() != this.denominateur) ret = false;
			
			return ret;
		}
	}
	
	/**
	 * A private method that calculates de greatest common divisor of two integers and returns the result.
	 *@param a positive integer
	 *@param b positive integer
	 *@return greatest common divisor of a and b
	 */
	 private int pgcd(int a,int b){
		int r = a;
		while(r != 0){
			r= a%b;
			a=b;
			b=r;
		}
		 return (Math.abs(a));
	 }
	 
	 /**
	  * Does the reduction of the fraction by dividing the numerator by the greatest common divisor
	  */
	 private void reduit(){
		 int div = 0;
		 if(this.numerateur==0){
			 div = this.pgcd(this.numerateur,this.denominateur);
			
		 }else{
			 div = this.pgcd(-this.numerateur,this.denominateur);
		 }
		 this.numerateur = this.numerateur/div;
		 this.denominateur = this.denominateur/div;
	 }
	 
	/**
	 * return a string containing a printable form of the object
	 * @return ret 
	 */
	public String toString(){
		String ret = ""+this.numerateur+"/"+this.denominateur;
		return ret;
	}
}
