#!/bin/bash

pushd deps

git clone --depth=1 https://github.com/envoyproxy/data-plane-api.git
git clone --depth=1 https://github.com/googleapis/googleapis.git
git clone --depth=1 https://github.com/grafeas/grafeas.git
git clone --depth=1 https://github.com/census-instrumentation/opencensus-proto.git
git clone --depth=1 https://github.com/open-telemetry/opentelemetry-proto.git
git clone --depth=1 https://github.com/envoyproxy/protoc-gen-validate.git
git clone --depth=1 https://github.com/cncf/udpa.git
git clone --depth=1 https://github.com/cncf/xds.git

popd


