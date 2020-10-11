cd "$(dirname "$0")"
cd ..

# 一键修改复项目的 version 和子项目中 <parent> 标签的 version
NEW_VERSION="1.0.0-SNAPSHOT"
mvn versions:set -DnewVersion=$NEW_VERSION

# 本工程的子项目和父项目 version 一致

# 也就是说以后更新 version 时
# 1. 运行这个脚本
# 2. 修改父项目 pom.xml 中 properties 的 <project.version>标签