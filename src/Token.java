package src;
 public enum Token{
    NOTHING (-1),
    AND_TOKEN(0),
    IN_TOKEN(1),
    DEF_TOKEN(2),
    NOT_TOKEN(3),
    ELSE_TOKEN(4),
    OR_TOKEN(5),
    FOR_TOKEN(6),
    PRINT_TOKEN(7),
    IF_TOKEN(8),
    RETURN_TOKEN(9),
    TRUE_TOKEN(10),
    NONE_TOKEN(11),
    FALSE_TOKEN(12),
    EQUAL_TOKEN(13),
    PLUS_TOKEN(14),
    SUBSTRACT_TOKEN(15),
    MULTIPLY_TOKEN(16),
    DIVIDE_TOKEN(17),
    DOUBLE_EQUAL_TOKEN(18),
    GREATER_TOKEN(19),
    GREATER_EQUAL_TOKEN(20),
    LESS_TOKEN(21),
    LESS_EQUAL_TOKEN(22),
    CLOSE_PARENTHESIS_TOKEN(23),
    OPEN_PARENTHESIS_TOKEN(24),
    DEUXPOINTS_TOKEN(25),
    DIVISION_FLOOR_TOKEN(25),
    MODULO_TOKEN(26),
    OPEN_BRACKETS_TOKEN(27),
    CLOSE_BRACKETS_TOKEN(28),
    NOT_EQUAL_TOKEN(29),
    INTEGER_TOKEN(30),
    STRING_TOKEN(31),
    SEPARATOR_TOKEN(32),
    ID_TOKEN(33),

    ERROR(34),
    EOF(35)

    private int value;

    private Token(int value){
        this.value=value;
    }


//public class Token{
//    private TokenType type;
 //   private int line;
  //  private int colum;
   // private String value;
   // public Token(TokenType type , String value, int line , int colum){
     //   this.type=type;
      //  this.line=line;
      //  this.colum=colum;
      //  this.value=value;
   // }
   // public TokenType getTokenType(){
    //    return this.type;
   // }
   // public String getValue(){
    //    return this.value;
    //}
   // public int getLine(){
     //   return this.line;
   // }
   // public int getColum(){
    //    return this.colum;
    //}
   // @Override
    public String toString() {
        return "Token(" + "type=" + type + ", value='" + value + '\'' + ')';
    }
}