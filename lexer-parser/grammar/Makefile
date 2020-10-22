ANTLR = java -jar $(ANTLR_JAR)
ANTLR_OUT_DIR = ../java
ANTLR_FLAGS = -no-listener -visitor -package $(PACKAGE)
LEXER = sparo_lexer
PARSER = sparo_parser

%: all

all:
	$(ANTLR) $(ANTLR_FLAGS) -o $(ANTLR_OUT_DIR)/$(PACKAGE)/ $(PARSER).g4

clean:
	rm -rf ../java/$(PACKAGE)/*.class
	rm -rf ../java/$(PACKAGE)/$(PARSER)*.java
	rm -rf ../java/$(PACKAGE)/*.tokens
