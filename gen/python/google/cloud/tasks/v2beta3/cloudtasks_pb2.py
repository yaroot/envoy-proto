# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/tasks/v2beta3/cloudtasks.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.api import client_pb2 as google_dot_api_dot_client__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.cloud.tasks.v2beta3 import queue_pb2 as google_dot_cloud_dot_tasks_dot_v2beta3_dot_queue__pb2
from google.cloud.tasks.v2beta3 import task_pb2 as google_dot_cloud_dot_tasks_dot_v2beta3_dot_task__pb2
from google.iam.v1 import iam_policy_pb2 as google_dot_iam_dot_v1_dot_iam__policy__pb2
from google.iam.v1 import policy_pb2 as google_dot_iam_dot_v1_dot_policy__pb2
from google.protobuf import empty_pb2 as google_dot_protobuf_dot_empty__pb2
from google.protobuf import field_mask_pb2 as google_dot_protobuf_dot_field__mask__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n+google/cloud/tasks/v2beta3/cloudtasks.proto\x12\x1agoogle.cloud.tasks.v2beta3\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a&google/cloud/tasks/v2beta3/queue.proto\x1a%google/cloud/tasks/v2beta3/task.proto\x1a\x1egoogle/iam/v1/iam_policy.proto\x1a\x1agoogle/iam/v1/policy.proto\x1a\x1bgoogle/protobuf/empty.proto\x1a google/protobuf/field_mask.proto\"\xb7\x01\n\x11ListQueuesRequest\x12\x37\n\x06parent\x18\x01 \x01(\tB\'\xe0\x41\x02\xfa\x41!\x12\x1f\x63loudtasks.googleapis.com/Queue\x12\x0e\n\x06\x66ilter\x18\x02 \x01(\t\x12\x11\n\tpage_size\x18\x03 \x01(\x05\x12\x12\n\npage_token\x18\x04 \x01(\t\x12\x32\n\tread_mask\x18\x05 \x01(\x0b\x32\x1a.google.protobuf.FieldMaskB\x03\xe0\x41\x01\"`\n\x12ListQueuesResponse\x12\x31\n\x06queues\x18\x01 \x03(\x0b\x32!.google.cloud.tasks.v2beta3.Queue\x12\x17\n\x0fnext_page_token\x18\x02 \x01(\t\"|\n\x0fGetQueueRequest\x12\x35\n\x04name\x18\x01 \x01(\tB\'\xe0\x41\x02\xfa\x41!\n\x1f\x63loudtasks.googleapis.com/Queue\x12\x32\n\tread_mask\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.FieldMaskB\x03\xe0\x41\x01\"\x84\x01\n\x12\x43reateQueueRequest\x12\x37\n\x06parent\x18\x01 \x01(\tB\'\xe0\x41\x02\xfa\x41!\x12\x1f\x63loudtasks.googleapis.com/Queue\x12\x35\n\x05queue\x18\x02 \x01(\x0b\x32!.google.cloud.tasks.v2beta3.QueueB\x03\xe0\x41\x02\"|\n\x12UpdateQueueRequest\x12\x35\n\x05queue\x18\x01 \x01(\x0b\x32!.google.cloud.tasks.v2beta3.QueueB\x03\xe0\x41\x02\x12/\n\x0bupdate_mask\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.FieldMask\"K\n\x12\x44\x65leteQueueRequest\x12\x35\n\x04name\x18\x01 \x01(\tB\'\xe0\x41\x02\xfa\x41!\n\x1f\x63loudtasks.googleapis.com/Queue\"J\n\x11PurgeQueueRequest\x12\x35\n\x04name\x18\x01 \x01(\tB\'\xe0\x41\x02\xfa\x41!\n\x1f\x63loudtasks.googleapis.com/Queue\"J\n\x11PauseQueueRequest\x12\x35\n\x04name\x18\x01 \x01(\tB\'\xe0\x41\x02\xfa\x41!\n\x1f\x63loudtasks.googleapis.com/Queue\"K\n\x12ResumeQueueRequest\x12\x35\n\x04name\x18\x01 \x01(\tB\'\xe0\x41\x02\xfa\x41!\n\x1f\x63loudtasks.googleapis.com/Queue\"\xaf\x01\n\x10ListTasksRequest\x12\x36\n\x06parent\x18\x01 \x01(\tB&\xe0\x41\x02\xfa\x41 \x12\x1e\x63loudtasks.googleapis.com/Task\x12<\n\rresponse_view\x18\x02 \x01(\x0e\x32%.google.cloud.tasks.v2beta3.Task.View\x12\x11\n\tpage_size\x18\x03 \x01(\x05\x12\x12\n\npage_token\x18\x04 \x01(\t\"]\n\x11ListTasksResponse\x12/\n\x05tasks\x18\x01 \x03(\x0b\x32 .google.cloud.tasks.v2beta3.Task\x12\x17\n\x0fnext_page_token\x18\x02 \x01(\t\"\x84\x01\n\x0eGetTaskRequest\x12\x34\n\x04name\x18\x01 \x01(\tB&\xe0\x41\x02\xfa\x41 \n\x1e\x63loudtasks.googleapis.com/Task\x12<\n\rresponse_view\x18\x02 \x01(\x0e\x32%.google.cloud.tasks.v2beta3.Task.View\"\xbe\x01\n\x11\x43reateTaskRequest\x12\x36\n\x06parent\x18\x01 \x01(\tB&\xe0\x41\x02\xfa\x41 \x12\x1e\x63loudtasks.googleapis.com/Task\x12\x33\n\x04task\x18\x02 \x01(\x0b\x32 .google.cloud.tasks.v2beta3.TaskB\x03\xe0\x41\x02\x12<\n\rresponse_view\x18\x03 \x01(\x0e\x32%.google.cloud.tasks.v2beta3.Task.View\"I\n\x11\x44\x65leteTaskRequest\x12\x34\n\x04name\x18\x01 \x01(\tB&\xe0\x41\x02\xfa\x41 \n\x1e\x63loudtasks.googleapis.com/Task\"\x84\x01\n\x0eRunTaskRequest\x12\x34\n\x04name\x18\x01 \x01(\tB&\xe0\x41\x02\xfa\x41 \n\x1e\x63loudtasks.googleapis.com/Task\x12<\n\rresponse_view\x18\x02 \x01(\x0e\x32%.google.cloud.tasks.v2beta3.Task.View2\xa5\x16\n\nCloudTasks\x12\xad\x01\n\nListQueues\x12-.google.cloud.tasks.v2beta3.ListQueuesRequest\x1a..google.cloud.tasks.v2beta3.ListQueuesResponse\"@\x82\xd3\xe4\x93\x02\x31\x12//v2beta3/{parent=projects/*/locations/*}/queues\xda\x41\x06parent\x12\x9a\x01\n\x08GetQueue\x12+.google.cloud.tasks.v2beta3.GetQueueRequest\x1a!.google.cloud.tasks.v2beta3.Queue\">\x82\xd3\xe4\x93\x02\x31\x12//v2beta3/{name=projects/*/locations/*/queues/*}\xda\x41\x04name\x12\xaf\x01\n\x0b\x43reateQueue\x12..google.cloud.tasks.v2beta3.CreateQueueRequest\x1a!.google.cloud.tasks.v2beta3.Queue\"M\x82\xd3\xe4\x93\x02\x38\"//v2beta3/{parent=projects/*/locations/*}/queues:\x05queue\xda\x41\x0cparent,queue\x12\xba\x01\n\x0bUpdateQueue\x12..google.cloud.tasks.v2beta3.UpdateQueueRequest\x1a!.google.cloud.tasks.v2beta3.Queue\"X\x82\xd3\xe4\x93\x02>25/v2beta3/{queue.name=projects/*/locations/*/queues/*}:\x05queue\xda\x41\x11queue,update_mask\x12\x95\x01\n\x0b\x44\x65leteQueue\x12..google.cloud.tasks.v2beta3.DeleteQueueRequest\x1a\x16.google.protobuf.Empty\">\x82\xd3\xe4\x93\x02\x31*//v2beta3/{name=projects/*/locations/*/queues/*}\xda\x41\x04name\x12\xa7\x01\n\nPurgeQueue\x12-.google.cloud.tasks.v2beta3.PurgeQueueRequest\x1a!.google.cloud.tasks.v2beta3.Queue\"G\x82\xd3\xe4\x93\x02:\"5/v2beta3/{name=projects/*/locations/*/queues/*}:purge:\x01*\xda\x41\x04name\x12\xa7\x01\n\nPauseQueue\x12-.google.cloud.tasks.v2beta3.PauseQueueRequest\x1a!.google.cloud.tasks.v2beta3.Queue\"G\x82\xd3\xe4\x93\x02:\"5/v2beta3/{name=projects/*/locations/*/queues/*}:pause:\x01*\xda\x41\x04name\x12\xaa\x01\n\x0bResumeQueue\x12..google.cloud.tasks.v2beta3.ResumeQueueRequest\x1a!.google.cloud.tasks.v2beta3.Queue\"H\x82\xd3\xe4\x93\x02;\"6/v2beta3/{name=projects/*/locations/*/queues/*}:resume:\x01*\xda\x41\x04name\x12\xa1\x01\n\x0cGetIamPolicy\x12\".google.iam.v1.GetIamPolicyRequest\x1a\x15.google.iam.v1.Policy\"V\x82\xd3\xe4\x93\x02\x45\"@/v2beta3/{resource=projects/*/locations/*/queues/*}:getIamPolicy:\x01*\xda\x41\x08resource\x12\xa8\x01\n\x0cSetIamPolicy\x12\".google.iam.v1.SetIamPolicyRequest\x1a\x15.google.iam.v1.Policy\"]\x82\xd3\xe4\x93\x02\x45\"@/v2beta3/{resource=projects/*/locations/*/queues/*}:setIamPolicy:\x01*\xda\x41\x0fresource,policy\x12\xd3\x01\n\x12TestIamPermissions\x12(.google.iam.v1.TestIamPermissionsRequest\x1a).google.iam.v1.TestIamPermissionsResponse\"h\x82\xd3\xe4\x93\x02K\"F/v2beta3/{resource=projects/*/locations/*/queues/*}:testIamPermissions:\x01*\xda\x41\x14resource,permissions\x12\xb2\x01\n\tListTasks\x12,.google.cloud.tasks.v2beta3.ListTasksRequest\x1a-.google.cloud.tasks.v2beta3.ListTasksResponse\"H\x82\xd3\xe4\x93\x02\x39\x12\x37/v2beta3/{parent=projects/*/locations/*/queues/*}/tasks\xda\x41\x06parent\x12\x9f\x01\n\x07GetTask\x12*.google.cloud.tasks.v2beta3.GetTaskRequest\x1a .google.cloud.tasks.v2beta3.Task\"F\x82\xd3\xe4\x93\x02\x39\x12\x37/v2beta3/{name=projects/*/locations/*/queues/*/tasks/*}\xda\x41\x04name\x12\xaf\x01\n\nCreateTask\x12-.google.cloud.tasks.v2beta3.CreateTaskRequest\x1a .google.cloud.tasks.v2beta3.Task\"P\x82\xd3\xe4\x93\x02<\"7/v2beta3/{parent=projects/*/locations/*/queues/*}/tasks:\x01*\xda\x41\x0bparent,task\x12\x9b\x01\n\nDeleteTask\x12-.google.cloud.tasks.v2beta3.DeleteTaskRequest\x1a\x16.google.protobuf.Empty\"F\x82\xd3\xe4\x93\x02\x39*7/v2beta3/{name=projects/*/locations/*/queues/*/tasks/*}\xda\x41\x04name\x12\xa6\x01\n\x07RunTask\x12*.google.cloud.tasks.v2beta3.RunTaskRequest\x1a .google.cloud.tasks.v2beta3.Task\"M\x82\xd3\xe4\x93\x02@\";/v2beta3/{name=projects/*/locations/*/queues/*/tasks/*}:run:\x01*\xda\x41\x04name\x1aM\xca\x41\x19\x63loudtasks.googleapis.com\xd2\x41.https://www.googleapis.com/auth/cloud-platformB|\n\x1e\x63om.google.cloud.tasks.v2beta3B\x0f\x43loudTasksProtoP\x01Z?google.golang.org/genproto/googleapis/cloud/tasks/v2beta3;tasks\xa2\x02\x05TASKSb\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.tasks.v2beta3.cloudtasks_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\036com.google.cloud.tasks.v2beta3B\017CloudTasksProtoP\001Z?google.golang.org/genproto/googleapis/cloud/tasks/v2beta3;tasks\242\002\005TASKS'
  _LISTQUEUESREQUEST.fields_by_name['parent']._options = None
  _LISTQUEUESREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A!\022\037cloudtasks.googleapis.com/Queue'
  _LISTQUEUESREQUEST.fields_by_name['read_mask']._options = None
  _LISTQUEUESREQUEST.fields_by_name['read_mask']._serialized_options = b'\340A\001'
  _GETQUEUEREQUEST.fields_by_name['name']._options = None
  _GETQUEUEREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A!\n\037cloudtasks.googleapis.com/Queue'
  _GETQUEUEREQUEST.fields_by_name['read_mask']._options = None
  _GETQUEUEREQUEST.fields_by_name['read_mask']._serialized_options = b'\340A\001'
  _CREATEQUEUEREQUEST.fields_by_name['parent']._options = None
  _CREATEQUEUEREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A!\022\037cloudtasks.googleapis.com/Queue'
  _CREATEQUEUEREQUEST.fields_by_name['queue']._options = None
  _CREATEQUEUEREQUEST.fields_by_name['queue']._serialized_options = b'\340A\002'
  _UPDATEQUEUEREQUEST.fields_by_name['queue']._options = None
  _UPDATEQUEUEREQUEST.fields_by_name['queue']._serialized_options = b'\340A\002'
  _DELETEQUEUEREQUEST.fields_by_name['name']._options = None
  _DELETEQUEUEREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A!\n\037cloudtasks.googleapis.com/Queue'
  _PURGEQUEUEREQUEST.fields_by_name['name']._options = None
  _PURGEQUEUEREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A!\n\037cloudtasks.googleapis.com/Queue'
  _PAUSEQUEUEREQUEST.fields_by_name['name']._options = None
  _PAUSEQUEUEREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A!\n\037cloudtasks.googleapis.com/Queue'
  _RESUMEQUEUEREQUEST.fields_by_name['name']._options = None
  _RESUMEQUEUEREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A!\n\037cloudtasks.googleapis.com/Queue'
  _LISTTASKSREQUEST.fields_by_name['parent']._options = None
  _LISTTASKSREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A \022\036cloudtasks.googleapis.com/Task'
  _GETTASKREQUEST.fields_by_name['name']._options = None
  _GETTASKREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A \n\036cloudtasks.googleapis.com/Task'
  _CREATETASKREQUEST.fields_by_name['parent']._options = None
  _CREATETASKREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A \022\036cloudtasks.googleapis.com/Task'
  _CREATETASKREQUEST.fields_by_name['task']._options = None
  _CREATETASKREQUEST.fields_by_name['task']._serialized_options = b'\340A\002'
  _DELETETASKREQUEST.fields_by_name['name']._options = None
  _DELETETASKREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A \n\036cloudtasks.googleapis.com/Task'
  _RUNTASKREQUEST.fields_by_name['name']._options = None
  _RUNTASKREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A \n\036cloudtasks.googleapis.com/Task'
  _CLOUDTASKS._options = None
  _CLOUDTASKS._serialized_options = b'\312A\031cloudtasks.googleapis.com\322A.https://www.googleapis.com/auth/cloud-platform'
  _CLOUDTASKS.methods_by_name['ListQueues']._options = None
  _CLOUDTASKS.methods_by_name['ListQueues']._serialized_options = b'\202\323\344\223\0021\022//v2beta3/{parent=projects/*/locations/*}/queues\332A\006parent'
  _CLOUDTASKS.methods_by_name['GetQueue']._options = None
  _CLOUDTASKS.methods_by_name['GetQueue']._serialized_options = b'\202\323\344\223\0021\022//v2beta3/{name=projects/*/locations/*/queues/*}\332A\004name'
  _CLOUDTASKS.methods_by_name['CreateQueue']._options = None
  _CLOUDTASKS.methods_by_name['CreateQueue']._serialized_options = b'\202\323\344\223\0028\"//v2beta3/{parent=projects/*/locations/*}/queues:\005queue\332A\014parent,queue'
  _CLOUDTASKS.methods_by_name['UpdateQueue']._options = None
  _CLOUDTASKS.methods_by_name['UpdateQueue']._serialized_options = b'\202\323\344\223\002>25/v2beta3/{queue.name=projects/*/locations/*/queues/*}:\005queue\332A\021queue,update_mask'
  _CLOUDTASKS.methods_by_name['DeleteQueue']._options = None
  _CLOUDTASKS.methods_by_name['DeleteQueue']._serialized_options = b'\202\323\344\223\0021*//v2beta3/{name=projects/*/locations/*/queues/*}\332A\004name'
  _CLOUDTASKS.methods_by_name['PurgeQueue']._options = None
  _CLOUDTASKS.methods_by_name['PurgeQueue']._serialized_options = b'\202\323\344\223\002:\"5/v2beta3/{name=projects/*/locations/*/queues/*}:purge:\001*\332A\004name'
  _CLOUDTASKS.methods_by_name['PauseQueue']._options = None
  _CLOUDTASKS.methods_by_name['PauseQueue']._serialized_options = b'\202\323\344\223\002:\"5/v2beta3/{name=projects/*/locations/*/queues/*}:pause:\001*\332A\004name'
  _CLOUDTASKS.methods_by_name['ResumeQueue']._options = None
  _CLOUDTASKS.methods_by_name['ResumeQueue']._serialized_options = b'\202\323\344\223\002;\"6/v2beta3/{name=projects/*/locations/*/queues/*}:resume:\001*\332A\004name'
  _CLOUDTASKS.methods_by_name['GetIamPolicy']._options = None
  _CLOUDTASKS.methods_by_name['GetIamPolicy']._serialized_options = b'\202\323\344\223\002E\"@/v2beta3/{resource=projects/*/locations/*/queues/*}:getIamPolicy:\001*\332A\010resource'
  _CLOUDTASKS.methods_by_name['SetIamPolicy']._options = None
  _CLOUDTASKS.methods_by_name['SetIamPolicy']._serialized_options = b'\202\323\344\223\002E\"@/v2beta3/{resource=projects/*/locations/*/queues/*}:setIamPolicy:\001*\332A\017resource,policy'
  _CLOUDTASKS.methods_by_name['TestIamPermissions']._options = None
  _CLOUDTASKS.methods_by_name['TestIamPermissions']._serialized_options = b'\202\323\344\223\002K\"F/v2beta3/{resource=projects/*/locations/*/queues/*}:testIamPermissions:\001*\332A\024resource,permissions'
  _CLOUDTASKS.methods_by_name['ListTasks']._options = None
  _CLOUDTASKS.methods_by_name['ListTasks']._serialized_options = b'\202\323\344\223\0029\0227/v2beta3/{parent=projects/*/locations/*/queues/*}/tasks\332A\006parent'
  _CLOUDTASKS.methods_by_name['GetTask']._options = None
  _CLOUDTASKS.methods_by_name['GetTask']._serialized_options = b'\202\323\344\223\0029\0227/v2beta3/{name=projects/*/locations/*/queues/*/tasks/*}\332A\004name'
  _CLOUDTASKS.methods_by_name['CreateTask']._options = None
  _CLOUDTASKS.methods_by_name['CreateTask']._serialized_options = b'\202\323\344\223\002<\"7/v2beta3/{parent=projects/*/locations/*/queues/*}/tasks:\001*\332A\013parent,task'
  _CLOUDTASKS.methods_by_name['DeleteTask']._options = None
  _CLOUDTASKS.methods_by_name['DeleteTask']._serialized_options = b'\202\323\344\223\0029*7/v2beta3/{name=projects/*/locations/*/queues/*/tasks/*}\332A\004name'
  _CLOUDTASKS.methods_by_name['RunTask']._options = None
  _CLOUDTASKS.methods_by_name['RunTask']._serialized_options = b'\202\323\344\223\002@\";/v2beta3/{name=projects/*/locations/*/queues/*/tasks/*}:run:\001*\332A\004name'
  _LISTQUEUESREQUEST._serialized_start=393
  _LISTQUEUESREQUEST._serialized_end=576
  _LISTQUEUESRESPONSE._serialized_start=578
  _LISTQUEUESRESPONSE._serialized_end=674
  _GETQUEUEREQUEST._serialized_start=676
  _GETQUEUEREQUEST._serialized_end=800
  _CREATEQUEUEREQUEST._serialized_start=803
  _CREATEQUEUEREQUEST._serialized_end=935
  _UPDATEQUEUEREQUEST._serialized_start=937
  _UPDATEQUEUEREQUEST._serialized_end=1061
  _DELETEQUEUEREQUEST._serialized_start=1063
  _DELETEQUEUEREQUEST._serialized_end=1138
  _PURGEQUEUEREQUEST._serialized_start=1140
  _PURGEQUEUEREQUEST._serialized_end=1214
  _PAUSEQUEUEREQUEST._serialized_start=1216
  _PAUSEQUEUEREQUEST._serialized_end=1290
  _RESUMEQUEUEREQUEST._serialized_start=1292
  _RESUMEQUEUEREQUEST._serialized_end=1367
  _LISTTASKSREQUEST._serialized_start=1370
  _LISTTASKSREQUEST._serialized_end=1545
  _LISTTASKSRESPONSE._serialized_start=1547
  _LISTTASKSRESPONSE._serialized_end=1640
  _GETTASKREQUEST._serialized_start=1643
  _GETTASKREQUEST._serialized_end=1775
  _CREATETASKREQUEST._serialized_start=1778
  _CREATETASKREQUEST._serialized_end=1968
  _DELETETASKREQUEST._serialized_start=1970
  _DELETETASKREQUEST._serialized_end=2043
  _RUNTASKREQUEST._serialized_start=2046
  _RUNTASKREQUEST._serialized_end=2178
  _CLOUDTASKS._serialized_start=2181
  _CLOUDTASKS._serialized_end=5034
# @@protoc_insertion_point(module_scope)
