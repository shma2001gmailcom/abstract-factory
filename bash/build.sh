#!/usr/bin/env bash

mvn='/usr/share/maven/bin/mvn'
app='abstract-factory'

${mvn} clean install
cd ../target
chmod 'a+x' ${app}.jar
java -jar ${app}.jar