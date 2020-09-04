#!/bin/sh

rm -rf target && mkdir target # target/metrics_pb2
cp -r ../../gen/python/* target/
#mv target/metrics_pb2.py target/metrics_pb2/__init__.py

# setuptools need this __init__.py file
for f in `find target -type d`; do
    touch $f/__init__.py
done

cp setup.py VERSION target/

pushd target/ > /dev/null
python setup.py sdist bdist_wheel
