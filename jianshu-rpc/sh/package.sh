#!/bin/bash
cd "$(dirname "$0")"
mvn clean install -D skipTests=true -f ../pom.xml -P dev -U
