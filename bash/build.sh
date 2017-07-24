#!/usr/bin/env bash

mvn='/home/misha/workspace/apache-maven-3.5.0/bin/mvn'
app='abstract-factory'
cd ../
${mvn} clean install
cd target
chmod 'a+x' ${app}.jar
java -jar ${app}.jar