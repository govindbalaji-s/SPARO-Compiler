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
