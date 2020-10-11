# Description
jianshu-rpc 工程的作用是，对 article、 user 等表做增删改查逻辑，通过 rpc 接口暴露，供 jianshu-cms 和 jianshu-api 工程使用。

jianshu-cms 和 jianshu-api 工程都会对数据库进行操作，统一通过 jianshu-rpc 工程进行调用可以减少并发产生的问题。