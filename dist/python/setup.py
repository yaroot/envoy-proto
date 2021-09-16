from setuptools import setup, find_packages
from os import path
from io import open

here = path.abspath(path.dirname(__file__))

setup(
    name='envoy-proto',
    version='20210916.2',

    # You can just specify package directories manually here if your project is
    # simple. Or you can use find_packages().
    #
    # Alternatively, if you just want to distribute a single Python file, use
    # the `py_modules` argument instead as follows, which will expect a file
    # called `my_module.py` to exist:
    #
    #   py_modules=["my_module"],

    packages=find_packages(exclude=['test']),
    py_modules=['metrics_pb2'],

    install_requires=[
        'protobuf',
    ],
    extras_require={
        'grpc': ['grpcio'],
    },
)
