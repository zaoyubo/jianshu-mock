#!/bin/bash
PROJECT="jianshu-rpc"
SIMPLE_PATH="rpc"
PACKAGE="com/zhaoyubo/jianshu/$SIMPLE_PATH"

echo $PROJECT
echo $SIMPLE_PATH
echo $PACKAGE
#重新生成mybatis需要的东西
cd "$(dirname "$0")"
cd ../$PROJECT-dao
rm -rf pre/*
mkdir -p pre/main/java
mkdir -p pre/main/resources
mkdir -p src/main/java/$PACKAGE/dao/
mkdir -p src/main/resources/mybatis/$SIMPLE_PATH/
mkdir -p ../$PROJECT-domain/src/main/java/$PACKAGE/domain/
mvn clean mybatis-generator:generate
mv pre/main/java/$PACKAGE/dao/*.java src/main/java/$PACKAGE/dao/
mv pre/main/resources/mapper/*.xml src/main/resources/mybatis/$SIMPLE_PATH/
mv pre/main/java/$PACKAGE/domain/*.java ../$PROJECT-domain/src/main/java/$PACKAGE/domain/
rm -rf pre/
