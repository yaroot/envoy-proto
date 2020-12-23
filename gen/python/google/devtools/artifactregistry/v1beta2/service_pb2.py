# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/devtools/artifactregistry/v1beta2/service.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.api import client_pb2 as google_dot_api_dot_client__pb2
from google.devtools.artifactregistry.v1beta2 import file_pb2 as google_dot_devtools_dot_artifactregistry_dot_v1beta2_dot_file__pb2
from google.devtools.artifactregistry.v1beta2 import package_pb2 as google_dot_devtools_dot_artifactregistry_dot_v1beta2_dot_package__pb2
from google.devtools.artifactregistry.v1beta2 import repository_pb2 as google_dot_devtools_dot_artifactregistry_dot_v1beta2_dot_repository__pb2
from google.devtools.artifactregistry.v1beta2 import tag_pb2 as google_dot_devtools_dot_artifactregistry_dot_v1beta2_dot_tag__pb2
from google.devtools.artifactregistry.v1beta2 import version_pb2 as google_dot_devtools_dot_artifactregistry_dot_v1beta2_dot_version__pb2
from google.iam.v1 import iam_policy_pb2 as google_dot_iam_dot_v1_dot_iam__policy__pb2
from google.iam.v1 import policy_pb2 as google_dot_iam_dot_v1_dot_policy__pb2
from google.longrunning import operations_pb2 as google_dot_longrunning_dot_operations__pb2
from google.protobuf import empty_pb2 as google_dot_protobuf_dot_empty__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/devtools/artifactregistry/v1beta2/service.proto',
  package='google.devtools.artifactregistry.v1beta2',
  syntax='proto3',
  serialized_options=b'\n,com.google.devtools.artifactregistry.v1beta2B\014ServiceProtoP\001ZXgoogle.golang.org/genproto/googleapis/devtools/artifactregistry/v1beta2;artifactregistry\252\002%Google.Cloud.ArtifactRegistry.V1Beta2\312\002%Google\\Cloud\\ArtifactRegistry\\V1beta2\352\002(Google::Cloud::ArtifactRegistry::V1beta2',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n6google/devtools/artifactregistry/v1beta2/service.proto\x12(google.devtools.artifactregistry.v1beta2\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\x1a\x33google/devtools/artifactregistry/v1beta2/file.proto\x1a\x36google/devtools/artifactregistry/v1beta2/package.proto\x1a\x39google/devtools/artifactregistry/v1beta2/repository.proto\x1a\x32google/devtools/artifactregistry/v1beta2/tag.proto\x1a\x36google/devtools/artifactregistry/v1beta2/version.proto\x1a\x1egoogle/iam/v1/iam_policy.proto\x1a\x1agoogle/iam/v1/policy.proto\x1a#google/longrunning/operations.proto\x1a\x1bgoogle/protobuf/empty.proto\"\x13\n\x11OperationMetadata2\xee$\n\x10\x41rtifactRegistry\x12\xe1\x01\n\x10ListRepositories\x12\x41.google.devtools.artifactregistry.v1beta2.ListRepositoriesRequest\x1a\x42.google.devtools.artifactregistry.v1beta2.ListRepositoriesResponse\"F\x82\xd3\xe4\x93\x02\x37\x12\x35/v1beta2/{parent=projects/*/locations/*}/repositories\xda\x41\x06parent\x12\xcb\x01\n\rGetRepository\x12>.google.devtools.artifactregistry.v1beta2.GetRepositoryRequest\x1a\x34.google.devtools.artifactregistry.v1beta2.Repository\"D\x82\xd3\xe4\x93\x02\x37\x12\x35/v1beta2/{name=projects/*/locations/*/repositories/*}\xda\x41\x04name\x12\x84\x02\n\x10\x43reateRepository\x12\x41.google.devtools.artifactregistry.v1beta2.CreateRepositoryRequest\x1a\x1d.google.longrunning.Operation\"\x8d\x01\x82\xd3\xe4\x93\x02\x43\"5/v1beta2/{parent=projects/*/locations/*}/repositories:\nrepository\xda\x41\x1fparent,repository,repository_id\xca\x41\x1f\n\nRepository\x12\x11OperationMetadata\x12\xfa\x01\n\x10UpdateRepository\x12\x41.google.devtools.artifactregistry.v1beta2.UpdateRepositoryRequest\x1a\x34.google.devtools.artifactregistry.v1beta2.Repository\"m\x82\xd3\xe4\x93\x02N2@/v1beta2/{repository.name=projects/*/locations/*/repositories/*}:\nrepository\xda\x41\x16repository,update_mask\x12\xe7\x01\n\x10\x44\x65leteRepository\x12\x41.google.devtools.artifactregistry.v1beta2.DeleteRepositoryRequest\x1a\x1d.google.longrunning.Operation\"q\x82\xd3\xe4\x93\x02\x37*5/v1beta2/{name=projects/*/locations/*/repositories/*}\xda\x41\x04name\xca\x41*\n\x15google.protobuf.Empty\x12\x11OperationMetadata\x12\xe0\x01\n\x0cListPackages\x12=.google.devtools.artifactregistry.v1beta2.ListPackagesRequest\x1a>.google.devtools.artifactregistry.v1beta2.ListPackagesResponse\"Q\x82\xd3\xe4\x93\x02\x42\x12@/v1beta2/{parent=projects/*/locations/*/repositories/*}/packages\xda\x41\x06parent\x12\xcd\x01\n\nGetPackage\x12;.google.devtools.artifactregistry.v1beta2.GetPackageRequest\x1a\x31.google.devtools.artifactregistry.v1beta2.Package\"O\x82\xd3\xe4\x93\x02\x42\x12@/v1beta2/{name=projects/*/locations/*/repositories/*/packages/*}\xda\x41\x04name\x12\xec\x01\n\rDeletePackage\x12>.google.devtools.artifactregistry.v1beta2.DeletePackageRequest\x1a\x1d.google.longrunning.Operation\"|\x82\xd3\xe4\x93\x02\x42*@/v1beta2/{name=projects/*/locations/*/repositories/*/packages/*}\xda\x41\x04name\xca\x41*\n\x15google.protobuf.Empty\x12\x11OperationMetadata\x12\xeb\x01\n\x0cListVersions\x12=.google.devtools.artifactregistry.v1beta2.ListVersionsRequest\x1a>.google.devtools.artifactregistry.v1beta2.ListVersionsResponse\"\\\x82\xd3\xe4\x93\x02M\x12K/v1beta2/{parent=projects/*/locations/*/repositories/*/packages/*}/versions\xda\x41\x06parent\x12\xd8\x01\n\nGetVersion\x12;.google.devtools.artifactregistry.v1beta2.GetVersionRequest\x1a\x31.google.devtools.artifactregistry.v1beta2.Version\"Z\x82\xd3\xe4\x93\x02M\x12K/v1beta2/{name=projects/*/locations/*/repositories/*/packages/*/versions/*}\xda\x41\x04name\x12\xf8\x01\n\rDeleteVersion\x12>.google.devtools.artifactregistry.v1beta2.DeleteVersionRequest\x1a\x1d.google.longrunning.Operation\"\x87\x01\x82\xd3\xe4\x93\x02M*K/v1beta2/{name=projects/*/locations/*/repositories/*/packages/*/versions/*}\xda\x41\x04name\xca\x41*\n\x15google.protobuf.Empty\x12\x11OperationMetadata\x12\xd4\x01\n\tListFiles\x12:.google.devtools.artifactregistry.v1beta2.ListFilesRequest\x1a;.google.devtools.artifactregistry.v1beta2.ListFilesResponse\"N\x82\xd3\xe4\x93\x02?\x12=/v1beta2/{parent=projects/*/locations/*/repositories/*}/files\xda\x41\x06parent\x12\xc2\x01\n\x07GetFile\x12\x38.google.devtools.artifactregistry.v1beta2.GetFileRequest\x1a..google.devtools.artifactregistry.v1beta2.File\"M\x82\xd3\xe4\x93\x02@\x12>/v1beta2/{name=projects/*/locations/*/repositories/*/files/**}\xda\x41\x04name\x12\xdb\x01\n\x08ListTags\x12\x39.google.devtools.artifactregistry.v1beta2.ListTagsRequest\x1a:.google.devtools.artifactregistry.v1beta2.ListTagsResponse\"X\x82\xd3\xe4\x93\x02I\x12G/v1beta2/{parent=projects/*/locations/*/repositories/*/packages/*}/tags\xda\x41\x06parent\x12\xc8\x01\n\x06GetTag\x12\x37.google.devtools.artifactregistry.v1beta2.GetTagRequest\x1a-.google.devtools.artifactregistry.v1beta2.Tag\"V\x82\xd3\xe4\x93\x02I\x12G/v1beta2/{name=projects/*/locations/*/repositories/*/packages/*/tags/*}\xda\x41\x04name\x12\xe0\x01\n\tCreateTag\x12:.google.devtools.artifactregistry.v1beta2.CreateTagRequest\x1a-.google.devtools.artifactregistry.v1beta2.Tag\"h\x82\xd3\xe4\x93\x02N\"G/v1beta2/{parent=projects/*/locations/*/repositories/*/packages/*}/tags:\x03tag\xda\x41\x11parent,tag,tag_id\x12\xe2\x01\n\tUpdateTag\x12:.google.devtools.artifactregistry.v1beta2.UpdateTagRequest\x1a-.google.devtools.artifactregistry.v1beta2.Tag\"j\x82\xd3\xe4\x93\x02R2K/v1beta2/{tag.name=projects/*/locations/*/repositories/*/packages/*/tags/*}:\x03tag\xda\x41\x0ftag,update_mask\x12\xb7\x01\n\tDeleteTag\x12:.google.devtools.artifactregistry.v1beta2.DeleteTagRequest\x1a\x16.google.protobuf.Empty\"V\x82\xd3\xe4\x93\x02I*G/v1beta2/{name=projects/*/locations/*/repositories/*/packages/*/tags/*}\xda\x41\x04name\x12\x9c\x01\n\x0cSetIamPolicy\x12\".google.iam.v1.SetIamPolicyRequest\x1a\x15.google.iam.v1.Policy\"Q\x82\xd3\xe4\x93\x02K\"F/v1beta2/{resource=projects/*/locations/*/repositories/*}:setIamPolicy:\x01*\x12\x99\x01\n\x0cGetIamPolicy\x12\".google.iam.v1.GetIamPolicyRequest\x1a\x15.google.iam.v1.Policy\"N\x82\xd3\xe4\x93\x02H\x12\x46/v1beta2/{resource=projects/*/locations/*/repositories/*}:getIamPolicy\x12\xc2\x01\n\x12TestIamPermissions\x12(.google.iam.v1.TestIamPermissionsRequest\x1a).google.iam.v1.TestIamPermissionsResponse\"W\x82\xd3\xe4\x93\x02Q\"L/v1beta2/{resource=projects/*/locations/*/repositories/*}:testIamPermissions:\x01*\x1a\x8c\x01\xca\x41\x1f\x61rtifactregistry.googleapis.com\xd2\x41ghttps://www.googleapis.com/auth/cloud-platform,https://www.googleapis.com/auth/cloud-platform.read-onlyB\x93\x02\n,com.google.devtools.artifactregistry.v1beta2B\x0cServiceProtoP\x01ZXgoogle.golang.org/genproto/googleapis/devtools/artifactregistry/v1beta2;artifactregistry\xaa\x02%Google.Cloud.ArtifactRegistry.V1Beta2\xca\x02%Google\\Cloud\\ArtifactRegistry\\V1beta2\xea\x02(Google::Cloud::ArtifactRegistry::V1beta2b\x06proto3'
  ,
  dependencies=[google_dot_api_dot_annotations__pb2.DESCRIPTOR,google_dot_api_dot_client__pb2.DESCRIPTOR,google_dot_devtools_dot_artifactregistry_dot_v1beta2_dot_file__pb2.DESCRIPTOR,google_dot_devtools_dot_artifactregistry_dot_v1beta2_dot_package__pb2.DESCRIPTOR,google_dot_devtools_dot_artifactregistry_dot_v1beta2_dot_repository__pb2.DESCRIPTOR,google_dot_devtools_dot_artifactregistry_dot_v1beta2_dot_tag__pb2.DESCRIPTOR,google_dot_devtools_dot_artifactregistry_dot_v1beta2_dot_version__pb2.DESCRIPTOR,google_dot_iam_dot_v1_dot_iam__policy__pb2.DESCRIPTOR,google_dot_iam_dot_v1_dot_policy__pb2.DESCRIPTOR,google_dot_longrunning_dot_operations__pb2.DESCRIPTOR,google_dot_protobuf_dot_empty__pb2.DESCRIPTOR,])




_OPERATIONMETADATA = _descriptor.Descriptor(
  name='OperationMetadata',
  full_name='google.devtools.artifactregistry.v1beta2.OperationMetadata',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=557,
  serialized_end=576,
)

DESCRIPTOR.message_types_by_name['OperationMetadata'] = _OPERATIONMETADATA
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

OperationMetadata = _reflection.GeneratedProtocolMessageType('OperationMetadata', (_message.Message,), {
  'DESCRIPTOR' : _OPERATIONMETADATA,
  '__module__' : 'google.devtools.artifactregistry.v1beta2.service_pb2'
  # @@protoc_insertion_point(class_scope:google.devtools.artifactregistry.v1beta2.OperationMetadata)
  })
_sym_db.RegisterMessage(OperationMetadata)


DESCRIPTOR._options = None

_ARTIFACTREGISTRY = _descriptor.ServiceDescriptor(
  name='ArtifactRegistry',
  full_name='google.devtools.artifactregistry.v1beta2.ArtifactRegistry',
  file=DESCRIPTOR,
  index=0,
  serialized_options=b'\312A\037artifactregistry.googleapis.com\322Aghttps://www.googleapis.com/auth/cloud-platform,https://www.googleapis.com/auth/cloud-platform.read-only',
  create_key=_descriptor._internal_create_key,
  serialized_start=579,
  serialized_end=5297,
  methods=[
  _descriptor.MethodDescriptor(
    name='ListRepositories',
    full_name='google.devtools.artifactregistry.v1beta2.ArtifactRegistry.ListRepositories',
    index=0,
    containing_service=None,
    input_type=google_dot_devtools_dot_artifactregistry_dot_v1beta2_dot_repository__pb2._LISTREPOSITORIESREQUEST,
    output_type=google_dot_devtools_dot_artifactregistry_dot_v1beta2_dot_repository__pb2._LISTREPOSITORIESRESPONSE,
    serialized_options=b'\202\323\344\223\0027\0225/v1beta2/{parent=projects/*/locations/*}/repositories\332A\006parent',
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='GetRepository',
    full_name='google.devtools.artifactregistry.v1beta2.ArtifactRegistry.GetRepository',
    index=1,
    containing_service=None,
    input_type=google_dot_devtools_dot_artifactregistry_dot_v1beta2_dot_repository__pb2._GETREPOSITORYREQUEST,
    output_type=google_dot_devtools_dot_artifactregistry_dot_v1beta2_dot_repository__pb2._REPOSITORY,
    serialized_options=b'\202\323\344\223\0027\0225/v1beta2/{name=projects/*/locations/*/repositories/*}\332A\004name',
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='CreateRepository',
    full_name='google.devtools.artifactregistry.v1beta2.ArtifactRegistry.CreateRepository',
    index=2,
    containing_service=None,
    input_type=google_dot_devtools_dot_artifactregistry_dot_v1beta2_dot_repository__pb2._CREATEREPOSITORYREQUEST,
    output_type=google_dot_longrunning_dot_operations__pb2._OPERATION,
    serialized_options=b'\202\323\344\223\002C\"5/v1beta2/{parent=projects/*/locations/*}/repositories:\nrepository\332A\037parent,repository,repository_id\312A\037\n\nRepository\022\021OperationMetadata',
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='UpdateRepository',
    full_name='google.devtools.artifactregistry.v1beta2.ArtifactRegistry.UpdateRepository',
    index=3,
    containing_service=None,
    input_type=google_dot_devtools_dot_artifactregistry_dot_v1beta2_dot_repository__pb2._UPDATEREPOSITORYREQUEST,
    output_type=google_dot_devtools_dot_artifactregistry_dot_v1beta2_dot_repository__pb2._REPOSITORY,
    serialized_options=b'\202\323\344\223\002N2@/v1beta2/{repository.name=projects/*/locations/*/repositories/*}:\nrepository\332A\026repository,update_mask',
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='DeleteRepository',
    full_name='google.devtools.artifactregistry.v1beta2.ArtifactRegistry.DeleteRepository',
    index=4,
    containing_service=None,
    input_type=google_dot_devtools_dot_artifactregistry_dot_v1beta2_dot_repository__pb2._DELETEREPOSITORYREQUEST,
    output_type=google_dot_longrunning_dot_operations__pb2._OPERATION,
    serialized_options=b'\202\323\344\223\0027*5/v1beta2/{name=projects/*/locations/*/repositories/*}\332A\004name\312A*\n\025google.protobuf.Empty\022\021OperationMetadata',
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='ListPackages',
    full_name='google.devtools.artifactregistry.v1beta2.ArtifactRegistry.ListPackages',
    index=5,
    containing_service=None,
    input_type=google_dot_devtools_dot_artifactregistry_dot_v1beta2_dot_package__pb2._LISTPACKAGESREQUEST,
    output_type=google_dot_devtools_dot_artifactregistry_dot_v1beta2_dot_package__pb2._LISTPACKAGESRESPONSE,
    serialized_options=b'\202\323\344\223\002B\022@/v1beta2/{parent=projects/*/locations/*/repositories/*}/packages\332A\006parent',
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='GetPackage',
    full_name='google.devtools.artifactregistry.v1beta2.ArtifactRegistry.GetPackage',
    index=6,
    containing_service=None,
    input_type=google_dot_devtools_dot_artifactregistry_dot_v1beta2_dot_package__pb2._GETPACKAGEREQUEST,
    output_type=google_dot_devtools_dot_artifactregistry_dot_v1beta2_dot_package__pb2._PACKAGE,
    serialized_options=b'\202\323\344\223\002B\022@/v1beta2/{name=projects/*/locations/*/repositories/*/packages/*}\332A\004name',
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='DeletePackage',
    full_name='google.devtools.artifactregistry.v1beta2.ArtifactRegistry.DeletePackage',
    index=7,
    containing_service=None,
    input_type=google_dot_devtools_dot_artifactregistry_dot_v1beta2_dot_package__pb2._DELETEPACKAGEREQUEST,
    output_type=google_dot_longrunning_dot_operations__pb2._OPERATION,
    serialized_options=b'\202\323\344\223\002B*@/v1beta2/{name=projects/*/locations/*/repositories/*/packages/*}\332A\004name\312A*\n\025google.protobuf.Empty\022\021OperationMetadata',
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='ListVersions',
    full_name='google.devtools.artifactregistry.v1beta2.ArtifactRegistry.ListVersions',
    index=8,
    containing_service=None,
    input_type=google_dot_devtools_dot_artifactregistry_dot_v1beta2_dot_version__pb2._LISTVERSIONSREQUEST,
    output_type=google_dot_devtools_dot_artifactregistry_dot_v1beta2_dot_version__pb2._LISTVERSIONSRESPONSE,
    serialized_options=b'\202\323\344\223\002M\022K/v1beta2/{parent=projects/*/locations/*/repositories/*/packages/*}/versions\332A\006parent',
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='GetVersion',
    full_name='google.devtools.artifactregistry.v1beta2.ArtifactRegistry.GetVersion',
    index=9,
    containing_service=None,
    input_type=google_dot_devtools_dot_artifactregistry_dot_v1beta2_dot_version__pb2._GETVERSIONREQUEST,
    output_type=google_dot_devtools_dot_artifactregistry_dot_v1beta2_dot_version__pb2._VERSION,
    serialized_options=b'\202\323\344\223\002M\022K/v1beta2/{name=projects/*/locations/*/repositories/*/packages/*/versions/*}\332A\004name',
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='DeleteVersion',
    full_name='google.devtools.artifactregistry.v1beta2.ArtifactRegistry.DeleteVersion',
    index=10,
    containing_service=None,
    input_type=google_dot_devtools_dot_artifactregistry_dot_v1beta2_dot_version__pb2._DELETEVERSIONREQUEST,
    output_type=google_dot_longrunning_dot_operations__pb2._OPERATION,
    serialized_options=b'\202\323\344\223\002M*K/v1beta2/{name=projects/*/locations/*/repositories/*/packages/*/versions/*}\332A\004name\312A*\n\025google.protobuf.Empty\022\021OperationMetadata',
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='ListFiles',
    full_name='google.devtools.artifactregistry.v1beta2.ArtifactRegistry.ListFiles',
    index=11,
    containing_service=None,
    input_type=google_dot_devtools_dot_artifactregistry_dot_v1beta2_dot_file__pb2._LISTFILESREQUEST,
    output_type=google_dot_devtools_dot_artifactregistry_dot_v1beta2_dot_file__pb2._LISTFILESRESPONSE,
    serialized_options=b'\202\323\344\223\002?\022=/v1beta2/{parent=projects/*/locations/*/repositories/*}/files\332A\006parent',
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='GetFile',
    full_name='google.devtools.artifactregistry.v1beta2.ArtifactRegistry.GetFile',
    index=12,
    containing_service=None,
    input_type=google_dot_devtools_dot_artifactregistry_dot_v1beta2_dot_file__pb2._GETFILEREQUEST,
    output_type=google_dot_devtools_dot_artifactregistry_dot_v1beta2_dot_file__pb2._FILE,
    serialized_options=b'\202\323\344\223\002@\022>/v1beta2/{name=projects/*/locations/*/repositories/*/files/**}\332A\004name',
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='ListTags',
    full_name='google.devtools.artifactregistry.v1beta2.ArtifactRegistry.ListTags',
    index=13,
    containing_service=None,
    input_type=google_dot_devtools_dot_artifactregistry_dot_v1beta2_dot_tag__pb2._LISTTAGSREQUEST,
    output_type=google_dot_devtools_dot_artifactregistry_dot_v1beta2_dot_tag__pb2._LISTTAGSRESPONSE,
    serialized_options=b'\202\323\344\223\002I\022G/v1beta2/{parent=projects/*/locations/*/repositories/*/packages/*}/tags\332A\006parent',
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='GetTag',
    full_name='google.devtools.artifactregistry.v1beta2.ArtifactRegistry.GetTag',
    index=14,
    containing_service=None,
    input_type=google_dot_devtools_dot_artifactregistry_dot_v1beta2_dot_tag__pb2._GETTAGREQUEST,
    output_type=google_dot_devtools_dot_artifactregistry_dot_v1beta2_dot_tag__pb2._TAG,
    serialized_options=b'\202\323\344\223\002I\022G/v1beta2/{name=projects/*/locations/*/repositories/*/packages/*/tags/*}\332A\004name',
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='CreateTag',
    full_name='google.devtools.artifactregistry.v1beta2.ArtifactRegistry.CreateTag',
    index=15,
    containing_service=None,
    input_type=google_dot_devtools_dot_artifactregistry_dot_v1beta2_dot_tag__pb2._CREATETAGREQUEST,
    output_type=google_dot_devtools_dot_artifactregistry_dot_v1beta2_dot_tag__pb2._TAG,
    serialized_options=b'\202\323\344\223\002N\"G/v1beta2/{parent=projects/*/locations/*/repositories/*/packages/*}/tags:\003tag\332A\021parent,tag,tag_id',
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='UpdateTag',
    full_name='google.devtools.artifactregistry.v1beta2.ArtifactRegistry.UpdateTag',
    index=16,
    containing_service=None,
    input_type=google_dot_devtools_dot_artifactregistry_dot_v1beta2_dot_tag__pb2._UPDATETAGREQUEST,
    output_type=google_dot_devtools_dot_artifactregistry_dot_v1beta2_dot_tag__pb2._TAG,
    serialized_options=b'\202\323\344\223\002R2K/v1beta2/{tag.name=projects/*/locations/*/repositories/*/packages/*/tags/*}:\003tag\332A\017tag,update_mask',
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='DeleteTag',
    full_name='google.devtools.artifactregistry.v1beta2.ArtifactRegistry.DeleteTag',
    index=17,
    containing_service=None,
    input_type=google_dot_devtools_dot_artifactregistry_dot_v1beta2_dot_tag__pb2._DELETETAGREQUEST,
    output_type=google_dot_protobuf_dot_empty__pb2._EMPTY,
    serialized_options=b'\202\323\344\223\002I*G/v1beta2/{name=projects/*/locations/*/repositories/*/packages/*/tags/*}\332A\004name',
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='SetIamPolicy',
    full_name='google.devtools.artifactregistry.v1beta2.ArtifactRegistry.SetIamPolicy',
    index=18,
    containing_service=None,
    input_type=google_dot_iam_dot_v1_dot_iam__policy__pb2._SETIAMPOLICYREQUEST,
    output_type=google_dot_iam_dot_v1_dot_policy__pb2._POLICY,
    serialized_options=b'\202\323\344\223\002K\"F/v1beta2/{resource=projects/*/locations/*/repositories/*}:setIamPolicy:\001*',
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='GetIamPolicy',
    full_name='google.devtools.artifactregistry.v1beta2.ArtifactRegistry.GetIamPolicy',
    index=19,
    containing_service=None,
    input_type=google_dot_iam_dot_v1_dot_iam__policy__pb2._GETIAMPOLICYREQUEST,
    output_type=google_dot_iam_dot_v1_dot_policy__pb2._POLICY,
    serialized_options=b'\202\323\344\223\002H\022F/v1beta2/{resource=projects/*/locations/*/repositories/*}:getIamPolicy',
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='TestIamPermissions',
    full_name='google.devtools.artifactregistry.v1beta2.ArtifactRegistry.TestIamPermissions',
    index=20,
    containing_service=None,
    input_type=google_dot_iam_dot_v1_dot_iam__policy__pb2._TESTIAMPERMISSIONSREQUEST,
    output_type=google_dot_iam_dot_v1_dot_iam__policy__pb2._TESTIAMPERMISSIONSRESPONSE,
    serialized_options=b'\202\323\344\223\002Q\"L/v1beta2/{resource=projects/*/locations/*/repositories/*}:testIamPermissions:\001*',
    create_key=_descriptor._internal_create_key,
  ),
])
_sym_db.RegisterServiceDescriptor(_ARTIFACTREGISTRY)

DESCRIPTOR.services_by_name['ArtifactRegistry'] = _ARTIFACTREGISTRY

# @@protoc_insertion_point(module_scope)
