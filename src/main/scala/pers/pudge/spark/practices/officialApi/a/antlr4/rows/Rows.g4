grammar Rows; // rename to distinguish from Expr.g4

@header{package pers.pudge.spark.practices.officialApi.a.antlr4.rows;}

@parser::members {
    int col;
    public RowsParser(TokenStream input, int col) {
        this(input);
        this.col = col;
    }
}

file: (row NL)+ ;

row
locals [int i=0]
    : ( STUFF
        {
        $i++;
        if ( $i == col ) System.out.println($STUFF.text);
        }
      )+
    ;

TAB:    '\t' -> skip;
NL:     '\r'? '\n';
STUFF:  ~[\t\r\n]+;