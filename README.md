Compiler for the SPARO language

## Prerequisites
Install antlr-4.7.1-complete.jar into /usr/local/lib.

If you don't have antlr-4.7.1 , get it from following:
https://github.com/antlr/antlr4/blob/master/doc/getting-started.md

## Building
```
$ cd src
$ make
```

## To test the lexer-parser:
```
$ cd src/test
$ ./auto-lexer.sh
$ ./auto-parser.sh
```
The above just runs diff for outputs of `Sample_programs/` against the outputs saved at `src/test/lexer-ans/` or `src/test/parser-ans`.

To add a new test case or update the saved correct output:
```
$ cd src/test
$ ./add-test.sh ../../Sample_programs/file.sp
```

To see the output of lexer on a particular file:
```
$ cd src/test
./lexer.sh ../../Sample_programs/file.sp
```
To see the output of parser(gui) on a particular file:
```
$ cd src/test
$ java -Xmx500M -cp "/usr/local/lib/antlr-4.7.1-complete.jar:../java" org.antlr.v4.gui.TestRig sparo.Sparo program -gui ../../Sample_programs/file.sp
```

## To test Semantic Analyzer(a subset):
```
$ cd src/test
$ ./semantic.sh ../../Sample_programs/file.sp
```
