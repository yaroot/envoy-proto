
ENVOY_PROTOS = $(shell find src/ -type f -name '*.proto')

all: clean base gen-java gen-python dist-python

clean:
	rm -rf gen

base:
	mkdir -p gen/python gen/java gen/go

gen:
	./build.sh

# gen-go:
# 	protoc --proto_path=src --go_out=gen/go --go_opt=paths=source_relative ${ENVOY_PROTOS}

# install-protoc-gen-go:
# 	echo 'See https://github.com/protocolbuffers/protobuf-go'

dist-python:
	cd dist/python && ./build.sh

.PHONY: all clean base gen-java gen-python gen-go install-protoc-gen-go dist-python
