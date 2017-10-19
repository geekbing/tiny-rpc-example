# tiny-rpc-example

## 如何运行

1. 先本地启动ZooKeeper（这里为了方便，采用docker来启动）

```
docker run --rm -p 2181:2181 --name zookeeper zookeeper
```
2. 再启动服务端hello-server项目

3. 最后启动客户端hello-client项目
