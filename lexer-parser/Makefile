MAKE = make
export ANTLR_JAR = /usr/local/lib/antlr-4.7.1-complete.jar
export PACKAGE = sparo

%: build

build:
	$(MAKE) -C ./grammar -f Makefile
	$(MAKE) -C ./java -f Makefile

clean:
	$(MAKE) -C ./grammar -f Makefile clean
	$(MAKE) -C ./java -f Makefile clean
