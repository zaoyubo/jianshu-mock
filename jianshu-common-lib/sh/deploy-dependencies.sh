#!/bin/bash
cd "$(dirname "$0")"/../jianshu-common-lib-dependencies
mvn clean install -DskipTests=true -pl jianshu-common-lib-dependencies -am -f ../pom.xml
