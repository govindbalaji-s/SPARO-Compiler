Compiler for the SPARO language

To build lexer and parser:
Install antlr-4.7.1-complete.jar into /usr/local/lib.
```
$ cd lexer-parser
$ make
```
To test the lexer-parser:
```
$ cd lexer-parser/test
$ ./auto-lexer.sh
$ ./auto-parser.sh
```
The above just runs diff for outputs of `Sample_programs/` against the outputs saved at `lexer-parser/test/lexer-ans/` or `lexer-parser/test/parser-ans`.

To add a new test case or update the saved correct output:
```
$ cd lexer-parser/test
$ ./add-test.sh ../../Sample_programs/file.sp
```

To see the output of lexer on a particular file:
```
$ cd lexer-parser/test
./lexer.sh ../../Sample_programs/file.sp
```
To see the output of parser(gui) on a particular file:
```
$ cd lexer-parser/test
$ java -Xmx500M -cp "/usr/local/lib/antlr-4.7.1-complete.jar:../java" org.antlr.v4.gui.TestRig sparo.Sparo program -gui ../../Sample_programs/file.sp
```
