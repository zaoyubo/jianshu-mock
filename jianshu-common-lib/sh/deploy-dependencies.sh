#!/bin/bash
cd "$(dirname "$0")"/../jianshu-common-lib-dependencies
mvn clean install -DskipTests=true
