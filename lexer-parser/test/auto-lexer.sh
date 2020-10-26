#!/bin/bash

# Test cases dir
input="../../Sample_programs"
# Correct output dir
ans="./lexer-ans"
# Temp output dir
output="./.lexer-output"

rm -rf $output
mkdir $output

for path in $input/*.sp; do
  name="${path##*/}"
  ./lexer.sh $path > $output/$name.out
done

for path in $input/*.sp; do
  name="${path##*/}"
  echo $name;
  diff $ans/$name.ans $output/$name.out
done
