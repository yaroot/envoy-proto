#!/bin/zsh

set -x

pushd deps


git clone --depth=1 https://github.com/protocolbuffers/protobuf
git clone --depth=1 https://github.com/census-instrumentation/opencensus-proto
git clone --depth=1 https://github.com/cncf/udpa
git clone --depth=1 https://github.com/cncf/xds
git clone --depth=1 https://github.com/envoyproxy/data-plane-api
git clone --depth=1 https://github.com/envoyproxy/protoc-gen-validate
git clone --depth=1 https://github.com/googleapis/googleapis
git clone --depth=1 https://github.com/grafeas/grafeas
git clone --depth=1 https://github.com/open-telemetry/opentelemetry-proto
git clone --depth=1 https://github.com/prometheus/client_model


popd

rm -rf gen
mkdir -p gen/{go,python,java}


protoc \
  -Ideps/protobuf/src \
  -Ideps/data-plane-api \
  -Ideps/googleapis \
  -Ideps/grafeas \
  -Ideps/opencensus-proto/src \
  -Ideps/opentelemetry-proto \
  -Ideps/protoc-gen-validate \
  -Ideps/xds \
  -Ideps/client_model \
  --python_out=gen/python \
  --java_out=gen/java \
  deps/data-plane-api/envoy/**/*.proto \
  deps/client_model/io/**/*.proto \
  deps/googleapis/google/**/*.proto \
  deps/googleapis/grafeas/**/*.proto \
  deps/opencensus-proto/src/opencensus/proto/**/*.proto \
  deps/opentelemetry-proto/opentelemetry/proto/**/*.proto \
  deps/protoc-gen-validate/validate/*.proto \
  deps/xds/udpa/**/*.proto \
  deps/xds/xds/**/*.proto



# --go_out=gen/go
# --go_opt=paths=source_relative
