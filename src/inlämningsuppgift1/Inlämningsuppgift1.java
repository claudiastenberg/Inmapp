// OBS KOLLA SLIDE 11,12,13 i pp GIT. 
package inlämningsuppgift1;

import javax.swing.JOptionPane;

public class Inlämningsuppgift1 {
    
    public static void skrivDjur(ISkrivUt dj){ 
       dj.printMe();
    }
    
    Inlämningsuppgift1(){
    Djur Sixten = new Hund("Sixten", "hund",5000);// Polymorfism. Vi refererar till Djur (superklass) men skapar en ny Hund (subklass). 
    Djur Dogge = new Hund ("Dogge", "hund",10000); 
    Djur Venus = new Katt("Venus", "katt", 5000);
    Djur Ove = new Katt("Ove", "katt", 3000);
    Djur Hypno = new Orm("Hypno", "orm", 1000);
    
    String o = JOptionPane.showInputDialog(null, "Vem ska du mata?"); 
        
        switch (o) {
            case "Hypno":
                skrivDjur((ISkrivUt) Hypno);
                break;
            case "Venus":
                skrivDjur((ISkrivUt) Venus);
                break;
            case "Ove":
                skrivDjur((ISkrivUt) Ove);
                break;
            case "Sixten": 
                skrivDjur((ISkrivUt) Sixten);
                break;
            case "Dogge": 
                skrivDjur((ISkrivUt) Dogge); 
                break;    
        }
    
    }
    
    public static void main(String[] args) {
        
    Inlämningsuppgift1 in1 = new Inlämningsuppgift1(); 
    
    }
    
}
