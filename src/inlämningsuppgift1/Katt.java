
package inlämningsuppgift1;

import javax.swing.JOptionPane;

public class Katt extends Djur implements ISkrivUt {
    
    public Katt (String namn, String sort, double vikt){
       super (namn,sort, vikt);
    }
   
   public double getDjurfodervikt(){
   return (int)vikt/150; 
   }
    
   @Override //dynamisk bildning. När metoden anropas. Vid anrop hamnar den här, träff på första försöket, sedan går den uppåt 
   // i metoderna, de är dynamisk dindning. 
    public void printMe() {
        JOptionPane.showMessageDialog(null, getNamn() + " är en " + getSort() 
                + " som ska ha kattfoder, mängd: " + getDjurfodervikt() + " gram");
    }
    
}