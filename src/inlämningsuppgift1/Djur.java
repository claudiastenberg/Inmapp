
package inlämningsuppgift1;

 abstract class Djur implements ISkrivUt { 

    
    private String namn; //  Inkapsling, Vi använder private. I subklassen kommer vi sedan behöva anropa metodennamn för att använda dessa
    //variabler. 
    private String sort;  
    private double vikt; 
    
    Djur () {}
    
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
    
    @Override
    public void printMe() {}
}
