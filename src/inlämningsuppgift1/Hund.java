
package inlämningsuppgift1;

import javax.swing.JOptionPane;

public class Hund extends Djur implements ISkrivUt {
   
    public Hund (String namn, String sort, double vikt){
       super (namn,sort,vikt);
    }
    
    public double getDjurfodervikt() { //Metod
    return (int)vikt/100; 
    }
    
    @Override // 
    public void printMe() {
        JOptionPane.showMessageDialog(null, getNamn() + " är en " + getSort() 
                + " som ska ha hundfoder, mängd: " + getDjurfodervikt() + " gram");
    } 
}