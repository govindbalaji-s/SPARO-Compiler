Compiler for the SPARO language

To build lexer and parser:
Install antlr-4.7.1-complete.jar into /usr/local/lib.
    $ cd lexer-parser
    $ make

To test the lexer-parser on a file:
    $ alias grun='java -Xmx500M -cp "/usr/local/lib/antlr-4.7.1-complete.jar:$CLASSPATH" org.antlr.v4.gui.TestRig'
    $ cd lexer-parser/java
    $ grun grun sparo.Sparo program input-file.sp

