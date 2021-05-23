#!/bin/bash
cd "$(dirname "$0")"/../jianshu-common-lib-common
mvn clean install -DskipTests=true -e