# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/channel/v1/entitlements.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.cloud.channel.v1 import common_pb2 as google_dot_cloud_dot_channel_dot_v1_dot_common__pb2
from google.cloud.channel.v1 import offers_pb2 as google_dot_cloud_dot_channel_dot_v1_dot_offers__pb2
from google.cloud.channel.v1 import products_pb2 as google_dot_cloud_dot_channel_dot_v1_dot_products__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2
from google.protobuf import wrappers_pb2 as google_dot_protobuf_dot_wrappers__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/cloud/channel/v1/entitlements.proto',
  package='google.cloud.channel.v1',
  syntax='proto3',
  serialized_options=b'\n\033com.google.cloud.channel.v1B\021EntitlementsProtoP\001Z>google.golang.org/genproto/googleapis/cloud/channel/v1;channel',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n*google/cloud/channel/v1/entitlements.proto\x12\x17google.cloud.channel.v1\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a$google/cloud/channel/v1/common.proto\x1a$google/cloud/channel/v1/offers.proto\x1a&google/cloud/channel/v1/products.proto\x1a\x1fgoogle/protobuf/timestamp.proto\x1a\x1egoogle/protobuf/wrappers.proto\x1a\x1cgoogle/api/annotations.proto\"\xdd\x08\n\x0b\x45ntitlement\x12\x11\n\x04name\x18\x01 \x01(\tB\x03\xe0\x41\x03\x12\x34\n\x0b\x63reate_time\x18\x05 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12\x34\n\x0bupdate_time\x18\x06 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12\x38\n\x05offer\x18\x08 \x01(\tB)\xe0\x41\x02\xfa\x41#\n!cloudchannel.googleapis.com/Offer\x12H\n\x13\x63ommitment_settings\x18\x0c \x01(\x0b\x32+.google.cloud.channel.v1.CommitmentSettings\x12W\n\x12provisioning_state\x18\r \x01(\x0e\x32\x36.google.cloud.channel.v1.Entitlement.ProvisioningStateB\x03\xe0\x41\x03\x12M\n\x13provisioned_service\x18\x10 \x01(\x0b\x32+.google.cloud.channel.v1.ProvisionedServiceB\x03\xe0\x41\x03\x12V\n\x12suspension_reasons\x18\x12 \x03(\x0e\x32\x35.google.cloud.channel.v1.Entitlement.SuspensionReasonB\x03\xe0\x41\x03\x12\x1e\n\x11purchase_order_id\x18\x13 \x01(\tB\x03\xe0\x41\x01\x12\x43\n\x0etrial_settings\x18\x15 \x01(\x0b\x32&.google.cloud.channel.v1.TrialSettingsB\x03\xe0\x41\x03\x12\x42\n\x10\x61ssociation_info\x18\x17 \x01(\x0b\x32(.google.cloud.channel.v1.AssociationInfo\x12\x36\n\nparameters\x18\x1a \x03(\x0b\x32\".google.cloud.channel.v1.Parameter\"R\n\x11ProvisioningState\x12\"\n\x1ePROVISIONING_STATE_UNSPECIFIED\x10\x00\x12\n\n\x06\x41\x43TIVE\x10\x01\x12\r\n\tSUSPENDED\x10\x05\"\xa3\x01\n\x10SuspensionReason\x12!\n\x1dSUSPENSION_REASON_UNSPECIFIED\x10\x00\x12\x16\n\x12RESELLER_INITIATED\x10\x01\x12\x0f\n\x0bTRIAL_ENDED\x10\x02\x12\x1c\n\x18RENEWAL_WITH_TYPE_CANCEL\x10\x03\x12\x1a\n\x16PENDING_TOS_ACCEPTANCE\x10\x04\x12\t\n\x05OTHER\x10\x64:p\xea\x41m\n\'cloudchannel.googleapis.com/Entitlement\x12\x42\x61\x63\x63ounts/{account}/customers/{customer}/entitlements/{entitlement}\"_\n\tParameter\x12\x0c\n\x04name\x18\x01 \x01(\t\x12-\n\x05value\x18\x02 \x01(\x0b\x32\x1e.google.cloud.channel.v1.Value\x12\x15\n\x08\x65\x64itable\x18\x03 \x01(\x08\x42\x03\xe0\x41\x03\"Y\n\x0f\x41ssociationInfo\x12\x46\n\x10\x62\x61se_entitlement\x18\x01 \x01(\tB,\xfa\x41)\n\'cloudchannel.googleapis.com/Entitlement\"`\n\x12ProvisionedService\x12\x1c\n\x0fprovisioning_id\x18\x01 \x01(\tB\x03\xe0\x41\x03\x12\x17\n\nproduct_id\x18\x02 \x01(\tB\x03\xe0\x41\x03\x12\x13\n\x06sku_id\x18\x03 \x01(\tB\x03\xe0\x41\x03\"\xc5\x01\n\x12\x43ommitmentSettings\x12\x33\n\nstart_time\x18\x01 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12\x31\n\x08\x65nd_time\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12G\n\x10renewal_settings\x18\x04 \x01(\x0b\x32(.google.cloud.channel.v1.RenewalSettingsB\x03\xe0\x41\x01\"\xb8\x01\n\x0fRenewalSettings\x12\x16\n\x0e\x65nable_renewal\x18\x01 \x01(\x08\x12\x19\n\x11resize_unit_count\x18\x02 \x01(\x08\x12:\n\x0cpayment_plan\x18\x05 \x01(\x0e\x32$.google.cloud.channel.v1.PaymentPlan\x12\x36\n\rpayment_cycle\x18\x06 \x01(\x0b\x32\x1f.google.cloud.channel.v1.Period\"L\n\rTrialSettings\x12\r\n\x05trial\x18\x01 \x01(\x08\x12,\n\x08\x65nd_time\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\"\xf9\x01\n\x0fTransferableSku\x12\x31\n\ris_commitment\x18\x06 \x01(\x0b\x32\x1a.google.protobuf.BoolValue\x12<\n\x18\x63ommitment_end_timestamp\x18\x07 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12J\n\x14transfer_eligibility\x18\t \x01(\x0b\x32,.google.cloud.channel.v1.TransferEligibility\x12)\n\x03sku\x18\x0b \x01(\x0b\x32\x1c.google.cloud.channel.v1.Sku\"\xf9\x01\n\x13TransferEligibility\x12\x13\n\x0bis_eligible\x18\x01 \x01(\x08\x12\x13\n\x0b\x64\x65scription\x18\x02 \x01(\t\x12Q\n\x14ineligibility_reason\x18\x03 \x01(\x0e\x32\x33.google.cloud.channel.v1.TransferEligibility.Reason\"e\n\x06Reason\x12\x16\n\x12REASON_UNSPECIFIED\x10\x00\x12\x1a\n\x16PENDING_TOS_ACCEPTANCE\x10\x01\x12\x14\n\x10SKU_NOT_ELIGIBLE\x10\x02\x12\x11\n\rSKU_SUSPENDED\x10\x03\x42r\n\x1b\x63om.google.cloud.channel.v1B\x11\x45ntitlementsProtoP\x01Z>google.golang.org/genproto/googleapis/cloud/channel/v1;channelb\x06proto3'
  ,
  dependencies=[google_dot_api_dot_field__behavior__pb2.DESCRIPTOR,google_dot_api_dot_resource__pb2.DESCRIPTOR,google_dot_cloud_dot_channel_dot_v1_dot_common__pb2.DESCRIPTOR,google_dot_cloud_dot_channel_dot_v1_dot_offers__pb2.DESCRIPTOR,google_dot_cloud_dot_channel_dot_v1_dot_products__pb2.DESCRIPTOR,google_dot_protobuf_dot_timestamp__pb2.DESCRIPTOR,google_dot_protobuf_dot_wrappers__pb2.DESCRIPTOR,google_dot_api_dot_annotations__pb2.DESCRIPTOR,])



_ENTITLEMENT_PROVISIONINGSTATE = _descriptor.EnumDescriptor(
  name='ProvisioningState',
  full_name='google.cloud.channel.v1.Entitlement.ProvisioningState',
  filename=None,
  file=DESCRIPTOR,
  create_key=_descriptor._internal_create_key,
  values=[
    _descriptor.EnumValueDescriptor(
      name='PROVISIONING_STATE_UNSPECIFIED', index=0, number=0,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='ACTIVE', index=1, number=1,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='SUSPENDED', index=2, number=5,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=1098,
  serialized_end=1180,
)
_sym_db.RegisterEnumDescriptor(_ENTITLEMENT_PROVISIONINGSTATE)

_ENTITLEMENT_SUSPENSIONREASON = _descriptor.EnumDescriptor(
  name='SuspensionReason',
  full_name='google.cloud.channel.v1.Entitlement.SuspensionReason',
  filename=None,
  file=DESCRIPTOR,
  create_key=_descriptor._internal_create_key,
  values=[
    _descriptor.EnumValueDescriptor(
      name='SUSPENSION_REASON_UNSPECIFIED', index=0, number=0,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='RESELLER_INITIATED', index=1, number=1,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='TRIAL_ENDED', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='RENEWAL_WITH_TYPE_CANCEL', index=3, number=3,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='PENDING_TOS_ACCEPTANCE', index=4, number=4,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='OTHER', index=5, number=100,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=1183,
  serialized_end=1346,
)
_sym_db.RegisterEnumDescriptor(_ENTITLEMENT_SUSPENSIONREASON)

_TRANSFERELIGIBILITY_REASON = _descriptor.EnumDescriptor(
  name='Reason',
  full_name='google.cloud.channel.v1.TransferEligibility.Reason',
  filename=None,
  file=DESCRIPTOR,
  create_key=_descriptor._internal_create_key,
  values=[
    _descriptor.EnumValueDescriptor(
      name='REASON_UNSPECIFIED', index=0, number=0,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='PENDING_TOS_ACCEPTANCE', index=1, number=1,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='SKU_NOT_ELIGIBLE', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='SKU_SUSPENDED', index=3, number=3,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=2614,
  serialized_end=2715,
)
_sym_db.RegisterEnumDescriptor(_TRANSFERELIGIBILITY_REASON)


_ENTITLEMENT = _descriptor.Descriptor(
  name='Entitlement',
  full_name='google.cloud.channel.v1.Entitlement',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='name', full_name='google.cloud.channel.v1.Entitlement.name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='create_time', full_name='google.cloud.channel.v1.Entitlement.create_time', index=1,
      number=5, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='update_time', full_name='google.cloud.channel.v1.Entitlement.update_time', index=2,
      number=6, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='offer', full_name='google.cloud.channel.v1.Entitlement.offer', index=3,
      number=8, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002\372A#\n!cloudchannel.googleapis.com/Offer', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='commitment_settings', full_name='google.cloud.channel.v1.Entitlement.commitment_settings', index=4,
      number=12, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='provisioning_state', full_name='google.cloud.channel.v1.Entitlement.provisioning_state', index=5,
      number=13, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='provisioned_service', full_name='google.cloud.channel.v1.Entitlement.provisioned_service', index=6,
      number=16, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='suspension_reasons', full_name='google.cloud.channel.v1.Entitlement.suspension_reasons', index=7,
      number=18, type=14, cpp_type=8, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='purchase_order_id', full_name='google.cloud.channel.v1.Entitlement.purchase_order_id', index=8,
      number=19, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='trial_settings', full_name='google.cloud.channel.v1.Entitlement.trial_settings', index=9,
      number=21, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='association_info', full_name='google.cloud.channel.v1.Entitlement.association_info', index=10,
      number=23, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='parameters', full_name='google.cloud.channel.v1.Entitlement.parameters', index=11,
      number=26, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
    _ENTITLEMENT_PROVISIONINGSTATE,
    _ENTITLEMENT_SUSPENSIONREASON,
  ],
  serialized_options=b'\352Am\n\'cloudchannel.googleapis.com/Entitlement\022Baccounts/{account}/customers/{customer}/entitlements/{entitlement}',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=343,
  serialized_end=1460,
)


_PARAMETER = _descriptor.Descriptor(
  name='Parameter',
  full_name='google.cloud.channel.v1.Parameter',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='name', full_name='google.cloud.channel.v1.Parameter.name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='value', full_name='google.cloud.channel.v1.Parameter.value', index=1,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='editable', full_name='google.cloud.channel.v1.Parameter.editable', index=2,
      number=3, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=1462,
  serialized_end=1557,
)


_ASSOCIATIONINFO = _descriptor.Descriptor(
  name='AssociationInfo',
  full_name='google.cloud.channel.v1.AssociationInfo',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='base_entitlement', full_name='google.cloud.channel.v1.AssociationInfo.base_entitlement', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\372A)\n\'cloudchannel.googleapis.com/Entitlement', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=1559,
  serialized_end=1648,
)


_PROVISIONEDSERVICE = _descriptor.Descriptor(
  name='ProvisionedService',
  full_name='google.cloud.channel.v1.ProvisionedService',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='provisioning_id', full_name='google.cloud.channel.v1.ProvisionedService.provisioning_id', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='product_id', full_name='google.cloud.channel.v1.ProvisionedService.product_id', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='sku_id', full_name='google.cloud.channel.v1.ProvisionedService.sku_id', index=2,
      number=3, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=1650,
  serialized_end=1746,
)


_COMMITMENTSETTINGS = _descriptor.Descriptor(
  name='CommitmentSettings',
  full_name='google.cloud.channel.v1.CommitmentSettings',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='start_time', full_name='google.cloud.channel.v1.CommitmentSettings.start_time', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='end_time', full_name='google.cloud.channel.v1.CommitmentSettings.end_time', index=1,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='renewal_settings', full_name='google.cloud.channel.v1.CommitmentSettings.renewal_settings', index=2,
      number=4, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=1749,
  serialized_end=1946,
)


_RENEWALSETTINGS = _descriptor.Descriptor(
  name='RenewalSettings',
  full_name='google.cloud.channel.v1.RenewalSettings',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='enable_renewal', full_name='google.cloud.channel.v1.RenewalSettings.enable_renewal', index=0,
      number=1, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='resize_unit_count', full_name='google.cloud.channel.v1.RenewalSettings.resize_unit_count', index=1,
      number=2, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='payment_plan', full_name='google.cloud.channel.v1.RenewalSettings.payment_plan', index=2,
      number=5, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='payment_cycle', full_name='google.cloud.channel.v1.RenewalSettings.payment_cycle', index=3,
      number=6, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=1949,
  serialized_end=2133,
)


_TRIALSETTINGS = _descriptor.Descriptor(
  name='TrialSettings',
  full_name='google.cloud.channel.v1.TrialSettings',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='trial', full_name='google.cloud.channel.v1.TrialSettings.trial', index=0,
      number=1, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='end_time', full_name='google.cloud.channel.v1.TrialSettings.end_time', index=1,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=2135,
  serialized_end=2211,
)


_TRANSFERABLESKU = _descriptor.Descriptor(
  name='TransferableSku',
  full_name='google.cloud.channel.v1.TransferableSku',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='is_commitment', full_name='google.cloud.channel.v1.TransferableSku.is_commitment', index=0,
      number=6, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='commitment_end_timestamp', full_name='google.cloud.channel.v1.TransferableSku.commitment_end_timestamp', index=1,
      number=7, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='transfer_eligibility', full_name='google.cloud.channel.v1.TransferableSku.transfer_eligibility', index=2,
      number=9, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='sku', full_name='google.cloud.channel.v1.TransferableSku.sku', index=3,
      number=11, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=2214,
  serialized_end=2463,
)


_TRANSFERELIGIBILITY = _descriptor.Descriptor(
  name='TransferEligibility',
  full_name='google.cloud.channel.v1.TransferEligibility',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='is_eligible', full_name='google.cloud.channel.v1.TransferEligibility.is_eligible', index=0,
      number=1, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='description', full_name='google.cloud.channel.v1.TransferEligibility.description', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='ineligibility_reason', full_name='google.cloud.channel.v1.TransferEligibility.ineligibility_reason', index=2,
      number=3, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
    _TRANSFERELIGIBILITY_REASON,
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=2466,
  serialized_end=2715,
)

_ENTITLEMENT.fields_by_name['create_time'].message_type = google_dot_protobuf_dot_timestamp__pb2._TIMESTAMP
_ENTITLEMENT.fields_by_name['update_time'].message_type = google_dot_protobuf_dot_timestamp__pb2._TIMESTAMP
_ENTITLEMENT.fields_by_name['commitment_settings'].message_type = _COMMITMENTSETTINGS
_ENTITLEMENT.fields_by_name['provisioning_state'].enum_type = _ENTITLEMENT_PROVISIONINGSTATE
_ENTITLEMENT.fields_by_name['provisioned_service'].message_type = _PROVISIONEDSERVICE
_ENTITLEMENT.fields_by_name['suspension_reasons'].enum_type = _ENTITLEMENT_SUSPENSIONREASON
_ENTITLEMENT.fields_by_name['trial_settings'].message_type = _TRIALSETTINGS
_ENTITLEMENT.fields_by_name['association_info'].message_type = _ASSOCIATIONINFO
_ENTITLEMENT.fields_by_name['parameters'].message_type = _PARAMETER
_ENTITLEMENT_PROVISIONINGSTATE.containing_type = _ENTITLEMENT
_ENTITLEMENT_SUSPENSIONREASON.containing_type = _ENTITLEMENT
_PARAMETER.fields_by_name['value'].message_type = google_dot_cloud_dot_channel_dot_v1_dot_common__pb2._VALUE
_COMMITMENTSETTINGS.fields_by_name['start_time'].message_type = google_dot_protobuf_dot_timestamp__pb2._TIMESTAMP
_COMMITMENTSETTINGS.fields_by_name['end_time'].message_type = google_dot_protobuf_dot_timestamp__pb2._TIMESTAMP
_COMMITMENTSETTINGS.fields_by_name['renewal_settings'].message_type = _RENEWALSETTINGS
_RENEWALSETTINGS.fields_by_name['payment_plan'].enum_type = google_dot_cloud_dot_channel_dot_v1_dot_offers__pb2._PAYMENTPLAN
_RENEWALSETTINGS.fields_by_name['payment_cycle'].message_type = google_dot_cloud_dot_channel_dot_v1_dot_offers__pb2._PERIOD
_TRIALSETTINGS.fields_by_name['end_time'].message_type = google_dot_protobuf_dot_timestamp__pb2._TIMESTAMP
_TRANSFERABLESKU.fields_by_name['is_commitment'].message_type = google_dot_protobuf_dot_wrappers__pb2._BOOLVALUE
_TRANSFERABLESKU.fields_by_name['commitment_end_timestamp'].message_type = google_dot_protobuf_dot_timestamp__pb2._TIMESTAMP
_TRANSFERABLESKU.fields_by_name['transfer_eligibility'].message_type = _TRANSFERELIGIBILITY
_TRANSFERABLESKU.fields_by_name['sku'].message_type = google_dot_cloud_dot_channel_dot_v1_dot_products__pb2._SKU
_TRANSFERELIGIBILITY.fields_by_name['ineligibility_reason'].enum_type = _TRANSFERELIGIBILITY_REASON
_TRANSFERELIGIBILITY_REASON.containing_type = _TRANSFERELIGIBILITY
DESCRIPTOR.message_types_by_name['Entitlement'] = _ENTITLEMENT
DESCRIPTOR.message_types_by_name['Parameter'] = _PARAMETER
DESCRIPTOR.message_types_by_name['AssociationInfo'] = _ASSOCIATIONINFO
DESCRIPTOR.message_types_by_name['ProvisionedService'] = _PROVISIONEDSERVICE
DESCRIPTOR.message_types_by_name['CommitmentSettings'] = _COMMITMENTSETTINGS
DESCRIPTOR.message_types_by_name['RenewalSettings'] = _RENEWALSETTINGS
DESCRIPTOR.message_types_by_name['TrialSettings'] = _TRIALSETTINGS
DESCRIPTOR.message_types_by_name['TransferableSku'] = _TRANSFERABLESKU
DESCRIPTOR.message_types_by_name['TransferEligibility'] = _TRANSFERELIGIBILITY
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

Entitlement = _reflection.GeneratedProtocolMessageType('Entitlement', (_message.Message,), {
  'DESCRIPTOR' : _ENTITLEMENT,
  '__module__' : 'google.cloud.channel.v1.entitlements_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.channel.v1.Entitlement)
  })
_sym_db.RegisterMessage(Entitlement)

Parameter = _reflection.GeneratedProtocolMessageType('Parameter', (_message.Message,), {
  'DESCRIPTOR' : _PARAMETER,
  '__module__' : 'google.cloud.channel.v1.entitlements_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.channel.v1.Parameter)
  })
_sym_db.RegisterMessage(Parameter)

AssociationInfo = _reflection.GeneratedProtocolMessageType('AssociationInfo', (_message.Message,), {
  'DESCRIPTOR' : _ASSOCIATIONINFO,
  '__module__' : 'google.cloud.channel.v1.entitlements_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.channel.v1.AssociationInfo)
  })
_sym_db.RegisterMessage(AssociationInfo)

ProvisionedService = _reflection.GeneratedProtocolMessageType('ProvisionedService', (_message.Message,), {
  'DESCRIPTOR' : _PROVISIONEDSERVICE,
  '__module__' : 'google.cloud.channel.v1.entitlements_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.channel.v1.ProvisionedService)
  })
_sym_db.RegisterMessage(ProvisionedService)

CommitmentSettings = _reflection.GeneratedProtocolMessageType('CommitmentSettings', (_message.Message,), {
  'DESCRIPTOR' : _COMMITMENTSETTINGS,
  '__module__' : 'google.cloud.channel.v1.entitlements_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.channel.v1.CommitmentSettings)
  })
_sym_db.RegisterMessage(CommitmentSettings)

RenewalSettings = _reflection.GeneratedProtocolMessageType('RenewalSettings', (_message.Message,), {
  'DESCRIPTOR' : _RENEWALSETTINGS,
  '__module__' : 'google.cloud.channel.v1.entitlements_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.channel.v1.RenewalSettings)
  })
_sym_db.RegisterMessage(RenewalSettings)

TrialSettings = _reflection.GeneratedProtocolMessageType('TrialSettings', (_message.Message,), {
  'DESCRIPTOR' : _TRIALSETTINGS,
  '__module__' : 'google.cloud.channel.v1.entitlements_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.channel.v1.TrialSettings)
  })
_sym_db.RegisterMessage(TrialSettings)

TransferableSku = _reflection.GeneratedProtocolMessageType('TransferableSku', (_message.Message,), {
  'DESCRIPTOR' : _TRANSFERABLESKU,
  '__module__' : 'google.cloud.channel.v1.entitlements_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.channel.v1.TransferableSku)
  })
_sym_db.RegisterMessage(TransferableSku)

TransferEligibility = _reflection.GeneratedProtocolMessageType('TransferEligibility', (_message.Message,), {
  'DESCRIPTOR' : _TRANSFERELIGIBILITY,
  '__module__' : 'google.cloud.channel.v1.entitlements_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.channel.v1.TransferEligibility)
  })
_sym_db.RegisterMessage(TransferEligibility)


DESCRIPTOR._options = None
_ENTITLEMENT.fields_by_name['name']._options = None
_ENTITLEMENT.fields_by_name['create_time']._options = None
_ENTITLEMENT.fields_by_name['update_time']._options = None
_ENTITLEMENT.fields_by_name['offer']._options = None
_ENTITLEMENT.fields_by_name['provisioning_state']._options = None
_ENTITLEMENT.fields_by_name['provisioned_service']._options = None
_ENTITLEMENT.fields_by_name['suspension_reasons']._options = None
_ENTITLEMENT.fields_by_name['purchase_order_id']._options = None
_ENTITLEMENT.fields_by_name['trial_settings']._options = None
_ENTITLEMENT._options = None
_PARAMETER.fields_by_name['editable']._options = None
_ASSOCIATIONINFO.fields_by_name['base_entitlement']._options = None
_PROVISIONEDSERVICE.fields_by_name['provisioning_id']._options = None
_PROVISIONEDSERVICE.fields_by_name['product_id']._options = None
_PROVISIONEDSERVICE.fields_by_name['sku_id']._options = None
_COMMITMENTSETTINGS.fields_by_name['start_time']._options = None
_COMMITMENTSETTINGS.fields_by_name['end_time']._options = None
_COMMITMENTSETTINGS.fields_by_name['renewal_settings']._options = None
# @@protoc_insertion_point(module_scope)