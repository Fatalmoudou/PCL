package src;
enum TokenType{
    IDENTIFIER,
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
    private String value;
    public Token(TokenType type , String value, int line , int colum){
        this.type=type;
    }
    public TokenType getTokenType(){
        return this.type;
    }
    public String getValue(){
        return this.value;
    }
    
    @Override
    public String toString() {
        return "Token(" + "type=" + type + ", value='" + value + '\'' + ')';
    }
}