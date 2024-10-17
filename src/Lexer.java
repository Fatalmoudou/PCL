package src;
import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Lexer {
    private BufferedReader readerfile;// pour lire le fichier
    private StringBuilder currentline;// pour stocker la ligne courante
    private int currentpos;// position du caractère lu
    private char currentchar;// caractère courant
    int line;
    int colum;
    public Lexer(String codepath){
        try{
        this.readerfile = new BufferedReader(new FileReader(codepath));
        this.currentline= new StringBuilder();
        this.currentpos=0;
        this.line=1;
        this.colum=1;
        
    }
    catch (IOException e){
        e.printStackTrace();
    }
    }
    public void  readNextChar() throws IOException{
        
            int  next =readerfile.read();
            if(next==-1){
                return '0';// on pourra gérer autrement la fin du fichier
            }
            currentchar= (char) next;
            
            if( currentchar=='\n'){
                line++;// incrémenter line
                colum=1;// réinitialiser la colonne lorsqu'on passe à une nouvelle ligne
            }
            else{
                colum++;
               
            }
            currentpos++;
        
    
    }
    
// autres méthodes utilisées dans l'identification d'un token
//peekNextChar par exemple pour connaitre le prochain caractère sans avancer dans le flux
// getCurrentPosition position actuelle du lexer (ligne , colonne , currentPos ) est ce nécessaire?
// et après on pourra coder les méthodes pour reconnaitre les différents tokens


}