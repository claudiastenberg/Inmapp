
package inlämningsuppgift1;

import javax.swing.JOptionPane;

public class Orm extends Djur implements ISkrivUt {
    
    public Orm (String namn, String sort, double vikt){
       super (namn,sort, vikt);
    }
    
    public double getDjurfodervikt() {
    return 20; 
    }

    @Override
    public void printMe() {
        JOptionPane.showMessageDialog(null, getNamn() + " är en " + getSort() 
                + " som ska ha ormpellets, mängd: " + getDjurfodervikt() + " gram");
    }
}
