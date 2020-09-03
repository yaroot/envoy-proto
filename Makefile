
ENVOY_PROTOS = $(shell find src/envoy -type f -name '*.proto')

all: clean base gen-java gen-python gen-go

clean:
	rm -rf gen

base:
	mkdir -p gen/python gen/java gen/go

gen-java:
	protoc --proto_path=src --python_out=gen/java ${ENVOY_PROTOS}

gen-python:
	protoc --proto_path=src --python_out=gen/python ${ENVOY_PROTOS}

gen-go:
	protoc --proto_path=src --go_out=gen/go --go_opt=paths=source_relative ${ENVOY_PROTOS}

install-protoc-gen-go:
	go get github.com/golang/protobuf/protoc-gen-go


.PHONY: all clean base gen-java gen-python gen-go install-protoc-gen-go
