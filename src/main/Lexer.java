package src;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Lexer {
    private BufferedReader readerfile;// pour lire le fichier
    private StringBuilder currentline;// pour stocker la ligne courante
    private char currentchar;// caractère courant
    int numline;
    int numcolum;
    public Lexer(String codepath){
        try{
        this.readerfile = new BufferedReader(new FileReader(codepath));
        this.currentline= new StringBuilder();
        this.numline=1;
        this.numcolum=1;
         // Lire la première ligne du fichier
         String firstline = this.readerfile.readLine();
         if (firstline != null) {
             this.currentline.append(firstline);
         }
        
    }
    catch (IOException e){
        e.printStackTrace();
    }
    }
    public void  readNextChar() throws IOException, EndOfFileException{
        
            int  next = this.readerfile.read();
            if(next==-1){
                throw new EndOfFileException("Fin du fichier atteinte.");
            }
            this.currentchar = (char) next;
            
            if (this.currentchar=='\n'){
                this.numline++;// incrémenter line
                this.numcolum = 1;// réinitialiser la colonne lorsqu'on passe à une nouvelle ligne
                String newline = this.readerfile.readLine();// lire la ligne suivante
                this.currentline.setLength(0);// réinitialiser 
                if(newline!=null){
                    this.currentline.append(newline);}// ajouter  la nouvelle ligne dans currentline
            }
            else{
                this.numcolum++;
               
            }
            
        
    
    }
    

//peekNextChar par exemple pour connaitre le prochain caractère sans avancer dans le flux , utile pour savoir si on a un mot clé ou un identificateur , ou si on a un opérateur simple ou double

public char peekNextChar() throws IOException, EndOfFileException{
    this.readerfile.mark(1); // Marquer la position actuelle dans le flux de lecture
    int nextChar = this.readerfile.read(); // Lire le caractère suivant
    
    if (nextChar == -1) {
        throw new EndOfFileException("Fin du fichier atteinte.") ; // Retourner '\0' pour indiquer la fin de fichier
    }
    
    this.readerfile.reset(); // Réinitialiser à la position marquée
    return (char) nextChar; // Retourner le prochain caractère sans avancer dans le fichier

}
public String getCurrentPosition() {
    return "Line: " + this.numline + ", Column: " + this.numcolum;
}
// Exception personnalisée pour signaler la fin du fichier
public class EndOfFileException extends Exception {
    public EndOfFileException(String message) {
        super(message);
    }
}

}