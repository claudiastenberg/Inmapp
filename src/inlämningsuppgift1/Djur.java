
package inlämningsuppgift1;

 abstract public class Djur { 

    
    protected String namn; //  Inkapsling, Vi använder protected eftersom vi vill att de ska vara synliga i subklasserna också. 
    protected String sort;  
    protected double vikt; 
    
    Djur (String namn, String sort,double vikt) {
        this.namn = namn;
        this.sort = sort;
        this.vikt = vikt; 
    }    
    
    public String getNamn () { 
        return namn; 
    }
    public String getSort (){
        return sort; 
    } 
    
    public double getVikt (){
        return vikt; 
    } 
  
    abstract public void printMe();
}
