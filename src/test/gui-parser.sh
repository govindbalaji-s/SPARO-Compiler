#!/bin/bash
java -Xmx500M -cp "/usr/local/lib/antlr-4.7.1-complete.jar:../java" org.antlr.v4.gui.TestRig sparo.Sparo program -gui $1
