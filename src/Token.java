package src;
 public enum TokenType{
    IDENTIFIER
    KEYWORD,
    INTEGER,
    STRING,
    SPECIAL_CHARACTER,
    SIMPLE_OPERATOR,
    DOUBLE_OPERATEUR,
    ERROR,
    EOF

}

public class Token{
    private TokenType type;
    private int line;
    private int colum;
    private String value;
    public Token(TokenType type , String value, int line , int colum){
        this.type=type;
        this.line=line;
        this.colum=colum;
        this.value=value;
    }
    public TokenType getTokenType(){
        return this.type;
    }
    public String getValue(){
        return this.value;
    }
    public int getLine(){
        return this.line;
    }
    public int getColum(){
        return this.colum;
    }
    @Override
    public String toString() {
        return "Token(" + "type=" + type + ", value='" + value + '\'' + ')';
    }
}