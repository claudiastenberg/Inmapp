
package inlämningsuppgift1;

public abstract class Djur { 
//Abstrakt, denna klass kan INTE skapa NYA objekt nu när den är abstrakt. Används som en mall för subklasser. 
    
    protected String namn; // Inkapsling sida 148
    protected String sort;
    protected double vikt; 
    
    Djur (String namn, String sort,double vikt) {
        this.namn = namn;
        this.sort = sort;
        this.vikt = vikt; 
    }    
    
    public String getNamn () { // genom dessa publica metoder kommer vi åt protected variablerna 
        return namn; 
    }
    public String getSort (){
        return sort; 
    } 
    
    public double getVikt (){
        return vikt; 
    } 
  
}
