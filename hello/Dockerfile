FROM alpine:3.7

COPY hello/bin hello/bin
COPY hello/lib hello/lib
COPY hello/config hello/config
WORKDIR /hello

ENTRYPOINT [ "java", "-classpath", "/hello/bin/*:/hello/lib/*", "hello" ]
