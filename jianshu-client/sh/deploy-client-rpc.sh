#!/bin/bash
cd "$(dirname "$0")"/../jianshu-client-rpc
mvn clean install -DskipTests=true
