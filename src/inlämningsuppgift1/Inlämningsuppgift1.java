// OBS KOLLA SLIDE 11,12,13 i pp GIT. 
package inlämningsuppgift1;

import javax.swing.JOptionPane;

public class Inlämningsuppgift1 {
    
    public static void skrivDjur(ISkrivUt dj){ // Vi anropar printMe, måste skapas för att vi i case kan använda oss av SkrivUt
       dj.printMe();
    }
    
    Inlämningsuppgift1(){
    Djur Sixten = new Hund("Sixten", "hund",5000);  // Polymorfism. Vi refererar Djur. Vi kan inte skapa new Djur, eftersom djur är abstrakt.
    // Sedan skapar vi en hund, som ör en klass i djur. Samma anrop ger olika resultat beroende på metoden. 
    Djur Dogge = new Hund ("Dogge", "hund",10000); 
    Katt Venus = new Katt("Venus", "katt", 3000);
    Katt Ove = new Katt("Ove", "katt", 2000);
    Orm Hypno = new Orm("Hypno", "orm", 1000);
    
    String o = JOptionPane.showInputDialog(null, "Vem ska du mata?"); 
        
        switch (o) {
            case "Hypno":
                skrivDjur(Hypno);
                break;
            case "Venus":
                skrivDjur(Venus);
                break;
            case "Ove":
                skrivDjur(Ove);
                break;
            case "Sixten": 
                skrivDjur((ISkrivUt) Sixten); // Polymorfism 
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
