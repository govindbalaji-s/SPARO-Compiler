#!/bin/bash

# Test cases dir
input="../../Sample_programs"
# Correct output dir
lexerans="./lexer-ans"
parserans="./parser-ans"

path=$1
name="${path##*/}"
./lexer.sh $path > $lexerans/$name.ans
./parser.sh $path > $parserans/$name.ans
