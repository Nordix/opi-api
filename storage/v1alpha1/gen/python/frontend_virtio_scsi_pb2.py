# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: frontend_virtio_scsi.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


import opicommon_pb2 as opicommon__pb2
import object_key_pb2 as object__key__pb2
from google.api import client_pb2 as google_dot_api_dot_client__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.protobuf import empty_pb2 as google_dot_protobuf_dot_empty__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.protobuf import field_mask_pb2 as google_dot_protobuf_dot_field__mask__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x1a\x66rontend_virtio_scsi.proto\x12\x12opi_api.storage.v1\x1a\x0fopicommon.proto\x1a\x10object_key.proto\x1a\x17google/api/client.proto\x1a\x19google/api/resource.proto\x1a\x1bgoogle/protobuf/empty.proto\x1a\x1cgoogle/api/annotations.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a google/protobuf/field_mask.proto\"N\n\x10VirtioScsiTarget\x12(\n\x02id\x18\x01 \x01(\x0b\x32\x1c.opi_api.common.v1.ObjectKey\x12\x10\n\x08max_luns\x18\x02 \x01(\x05\"\xd4\x01\n\x14VirtioScsiController\x12(\n\x02id\x18\x01 \x01(\x0b\x32\x1c.opi_api.common.v1.ObjectKey\x12\x30\n\x07pcie_id\x18\x02 \x01(\x0b\x32\x1f.opi_api.storage.v1.PciEndpoint\x12/\n\tmin_limit\x18\x03 \x01(\x0b\x32\x1c.opi_api.storage.v1.QosLimit\x12/\n\tmax_limit\x18\x04 \x01(\x0b\x32\x1c.opi_api.storage.v1.QosLimit\"\x9b\x01\n\rVirtioScsiLun\x12(\n\x02id\x18\x01 \x01(\x0b\x32\x1c.opi_api.common.v1.ObjectKey\x12/\n\ttarget_id\x18\x02 \x01(\x0b\x32\x1c.opi_api.common.v1.ObjectKey\x12/\n\tvolume_id\x18\x03 \x01(\x0b\x32\x1c.opi_api.common.v1.ObjectKey\"\xc2\x01\n\x1d\x43reateVirtioScsiTargetRequest\x12;\n\x06parent\x18\x01 \x01(\tB+\xe0\x41\x02\xfa\x41%\n#opi_api.storage.v1/VirtioScsiTarget\x12\x45\n\x12virtio_scsi_target\x18\x02 \x01(\x0b\x32$.opi_api.storage.v1.VirtioScsiTargetB\x03\xe0\x41\x02\x12\x1d\n\x15virtio_scsi_target_id\x18\x03 \x01(\t\"q\n\x1d\x44\x65leteVirtioScsiTargetRequest\x12\x39\n\x04name\x18\x01 \x01(\tB+\xe0\x41\x02\xfa\x41%\n#opi_api.storage.v1/VirtioScsiTarget\x12\x15\n\rallow_missing\x18\x02 \x01(\x08\"\x92\x01\n\x1dUpdateVirtioScsiTargetRequest\x12@\n\x12virtio_scsi_target\x18\x01 \x01(\x0b\x32$.opi_api.storage.v1.VirtioScsiTarget\x12/\n\x0bupdate_mask\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.FieldMask\"\x82\x01\n\x1cListVirtioScsiTargetsRequest\x12;\n\x06parent\x18\x01 \x01(\tB+\xe0\x41\x02\xfa\x41%\n#opi_api.storage.v1/VirtioScsiTarget\x12\x11\n\tpage_size\x18\x02 \x01(\x05\x12\x12\n\npage_token\x18\x03 \x01(\t\"{\n\x1dListVirtioScsiTargetsResponse\x12\x41\n\x13virtio_scsi_targets\x18\x01 \x03(\x0b\x32$.opi_api.storage.v1.VirtioScsiTarget\x12\x17\n\x0fnext_page_token\x18\x02 \x01(\t\"W\n\x1aGetVirtioScsiTargetRequest\x12\x39\n\x04name\x18\x01 \x01(\tB+\xe0\x41\x02\xfa\x41%\n#opi_api.storage.v1/VirtioScsiTarget\"O\n\x1cVirtioScsiTargetStatsRequest\x12/\n\ttarget_id\x18\x01 \x01(\x0b\x32\x1c.opi_api.common.v1.ObjectKey\"y\n\x1dVirtioScsiTargetStatsResponse\x12(\n\x02id\x18\x01 \x01(\x0b\x32\x1c.opi_api.common.v1.ObjectKey\x12.\n\x05stats\x18\x02 \x01(\x0b\x32\x1f.opi_api.storage.v1.VolumeStats\"\xd6\x01\n!CreateVirtioScsiControllerRequest\x12?\n\x06parent\x18\x01 \x01(\tB/\xe0\x41\x02\xfa\x41)\n\'opi_api.storage.v1/VirtioScsiController\x12M\n\x16virtio_scsi_controller\x18\x02 \x01(\x0b\x32(.opi_api.storage.v1.VirtioScsiControllerB\x03\xe0\x41\x02\x12!\n\x19virtio_scsi_controller_id\x18\x03 \x01(\t\"y\n!DeleteVirtioScsiControllerRequest\x12=\n\x04name\x18\x01 \x01(\tB/\xe0\x41\x02\xfa\x41)\n\'opi_api.storage.v1/VirtioScsiController\x12\x15\n\rallow_missing\x18\x02 \x01(\x08\"\x9e\x01\n!UpdateVirtioScsiControllerRequest\x12H\n\x16virtio_scsi_controller\x18\x01 \x01(\x0b\x32(.opi_api.storage.v1.VirtioScsiController\x12/\n\x0bupdate_mask\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.FieldMask\"\x8a\x01\n ListVirtioScsiControllersRequest\x12?\n\x06parent\x18\x01 \x01(\tB/\xe0\x41\x02\xfa\x41)\n\'opi_api.storage.v1/VirtioScsiController\x12\x11\n\tpage_size\x18\x02 \x01(\x05\x12\x12\n\npage_token\x18\x03 \x01(\t\"\x87\x01\n!ListVirtioScsiControllersResponse\x12I\n\x17virtio_scsi_controllers\x18\x01 \x03(\x0b\x32(.opi_api.storage.v1.VirtioScsiController\x12\x17\n\x0fnext_page_token\x18\x02 \x01(\t\"_\n\x1eGetVirtioScsiControllerRequest\x12=\n\x04name\x18\x01 \x01(\tB/\xe0\x41\x02\xfa\x41)\n\'opi_api.storage.v1/VirtioScsiController\"W\n VirtioScsiControllerStatsRequest\x12\x33\n\rcontroller_id\x18\x01 \x01(\x0b\x32\x1c.opi_api.common.v1.ObjectKey\"}\n!VirtioScsiControllerStatsResponse\x12(\n\x02id\x18\x01 \x01(\x0b\x32\x1c.opi_api.common.v1.ObjectKey\x12.\n\x05stats\x18\x02 \x01(\x0b\x32\x1f.opi_api.storage.v1.VolumeStats\"\xb3\x01\n\x1a\x43reateVirtioScsiLunRequest\x12\x38\n\x06parent\x18\x01 \x01(\tB(\xe0\x41\x02\xfa\x41\"\n opi_api.storage.v1/VirtioScsiLun\x12?\n\x0fvirtio_scsi_lun\x18\x02 \x01(\x0b\x32!.opi_api.storage.v1.VirtioScsiLunB\x03\xe0\x41\x02\x12\x1a\n\x12virtio_scsi_lun_id\x18\x03 \x01(\t\"k\n\x1a\x44\x65leteVirtioScsiLunRequest\x12\x36\n\x04name\x18\x01 \x01(\tB(\xe0\x41\x02\xfa\x41\"\n opi_api.storage.v1/VirtioScsiLun\x12\x15\n\rallow_missing\x18\x02 \x01(\x08\"\x89\x01\n\x1aUpdateVirtioScsiLunRequest\x12:\n\x0fvirtio_scsi_lun\x18\x01 \x01(\x0b\x32!.opi_api.storage.v1.VirtioScsiLun\x12/\n\x0bupdate_mask\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.FieldMask\"|\n\x19ListVirtioScsiLunsRequest\x12\x38\n\x06parent\x18\x01 \x01(\tB(\xe0\x41\x02\xfa\x41\"\n opi_api.storage.v1/VirtioScsiLun\x12\x11\n\tpage_size\x18\x02 \x01(\x05\x12\x12\n\npage_token\x18\x03 \x01(\t\"r\n\x1aListVirtioScsiLunsResponse\x12;\n\x10virtio_scsi_luns\x18\x01 \x03(\x0b\x32!.opi_api.storage.v1.VirtioScsiLun\x12\x17\n\x0fnext_page_token\x18\x02 \x01(\t\"Q\n\x17GetVirtioScsiLunRequest\x12\x36\n\x04name\x18\x01 \x01(\tB(\xe0\x41\x02\xfa\x41\"\n opi_api.storage.v1/VirtioScsiLun\"~\n\x19VirtioScsiLunStatsRequest\x12\x33\n\rcontroller_id\x18\x01 \x01(\x0b\x32\x1c.opi_api.common.v1.ObjectKey\x12,\n\x06lun_id\x18\x02 \x01(\x0b\x32\x1c.opi_api.common.v1.ObjectKey\"v\n\x1aVirtioScsiLunStatsResponse\x12(\n\x02id\x18\x01 \x01(\x0b\x32\x1c.opi_api.common.v1.ObjectKey\x12.\n\x05stats\x18\x02 \x01(\x0b\x32\x1f.opi_api.storage.v1.VolumeStats2\xa1\x19\n\x19\x46rontendVirtioScsiService\x12\xd8\x01\n\x16\x43reateVirtioScsiTarget\x12\x31.opi_api.storage.v1.CreateVirtioScsiTargetRequest\x1a$.opi_api.storage.v1.VirtioScsiTarget\"e\x82\xd3\xe4\x93\x02-\"\x17/v1/{parent=subsystems}:\x12virtio_scsi_target\xda\x41/parent,virtio_scsi_target,virtio_scsi_target_id\x12\x9c\x01\n\x16\x44\x65leteVirtioScsiTarget\x12\x31.opi_api.storage.v1.DeleteVirtioScsiTargetRequest\x1a\x16.google.protobuf.Empty\"7\x82\xd3\xe4\x93\x02**(/v1/{name=subsystems}/{virtioscsitarget}\xda\x41\x04name\x12\xd8\x01\n\x16UpdateVirtioScsiTarget\x12\x31.opi_api.storage.v1.UpdateVirtioScsiTargetRequest\x1a$.opi_api.storage.v1.VirtioScsiTarget\"e\x82\xd3\xe4\x93\x02>2(/v1/{virtio_scsi_target.name=subsystems}:\x12virtio_scsi_target\xda\x41\x1evirtio_scsi_target,update_mask\x12\xa6\x01\n\x15ListVirtioScsiTargets\x12\x30.opi_api.storage.v1.ListVirtioScsiTargetsRequest\x1a\x31.opi_api.storage.v1.ListVirtioScsiTargetsResponse\"(\x82\xd3\xe4\x93\x02\x19\x12\x17/v1/{parent=subsystems}\xda\x41\x06parent\x12\xa4\x01\n\x13GetVirtioScsiTarget\x12..opi_api.storage.v1.GetVirtioScsiTargetRequest\x1a$.opi_api.storage.v1.VirtioScsiTarget\"7\x82\xd3\xe4\x93\x02*\x12(/v1/{name=subsystems}/{virtioscsitarget}\xda\x41\x04name\x12~\n\x15VirtioScsiTargetStats\x12\x30.opi_api.storage.v1.VirtioScsiTargetStatsRequest\x1a\x31.opi_api.storage.v1.VirtioScsiTargetStatsResponse\"\x00\x12\xf0\x01\n\x1a\x43reateVirtioScsiController\x12\x35.opi_api.storage.v1.CreateVirtioScsiControllerRequest\x1a(.opi_api.storage.v1.VirtioScsiController\"q\x82\xd3\xe4\x93\x02\x31\"\x17/v1/{parent=subsystems}:\x16virtio_scsi_controller\xda\x41\x37parent,virtio_scsi_controller,virtio_scsi_controller_id\x12\xa7\x01\n\x1a\x44\x65leteVirtioScsiController\x12\x35.opi_api.storage.v1.DeleteVirtioScsiControllerRequest\x1a\x16.google.protobuf.Empty\":\x82\xd3\xe4\x93\x02-*+/v1/{name=virtioscsictrls}/{virtioscsictrl}\xda\x41\x04name\x12\xf0\x01\n\x1aUpdateVirtioScsiController\x12\x35.opi_api.storage.v1.UpdateVirtioScsiControllerRequest\x1a(.opi_api.storage.v1.VirtioScsiController\"q\x82\xd3\xe4\x93\x02\x46\x32,/v1/{virtio_scsi_controller.name=subsystems}:\x16virtio_scsi_controller\xda\x41\"virtio_scsi_controller,update_mask\x12\xb2\x01\n\x19ListVirtioScsiControllers\x12\x34.opi_api.storage.v1.ListVirtioScsiControllersRequest\x1a\x35.opi_api.storage.v1.ListVirtioScsiControllersResponse\"(\x82\xd3\xe4\x93\x02\x19\x12\x17/v1/{parent=subsystems}\xda\x41\x06parent\x12\xae\x01\n\x17GetVirtioScsiController\x12\x32.opi_api.storage.v1.GetVirtioScsiControllerRequest\x1a(.opi_api.storage.v1.VirtioScsiController\"5\x82\xd3\xe4\x93\x02(\x12&/v1/{name=subsystems}/{virtioscsictrl}\xda\x41\x04name\x12\x8a\x01\n\x19VirtioScsiControllerStats\x12\x34.opi_api.storage.v1.VirtioScsiControllerStatsRequest\x1a\x35.opi_api.storage.v1.VirtioScsiControllerStatsResponse\"\x00\x12\xc6\x01\n\x13\x43reateVirtioScsiLun\x12..opi_api.storage.v1.CreateVirtioScsiLunRequest\x1a!.opi_api.storage.v1.VirtioScsiLun\"\\\x82\xd3\xe4\x93\x02*\"\x17/v1/{parent=subsystems}:\x0fvirtio_scsi_lun\xda\x41)parent,virtio_scsi_lun,virtio_scsi_lun_id\x12\x97\x01\n\x13\x44\x65leteVirtioScsiLun\x12..opi_api.storage.v1.DeleteVirtioScsiLunRequest\x1a\x16.google.protobuf.Empty\"8\x82\xd3\xe4\x93\x02+*)/v1/{name=virtioscsiluns}/{virtioscsilun}\xda\x41\x04name\x12\xc6\x01\n\x13UpdateVirtioScsiLun\x12..opi_api.storage.v1.UpdateVirtioScsiLunRequest\x1a!.opi_api.storage.v1.VirtioScsiLun\"\\\x82\xd3\xe4\x93\x02\x38\x32%/v1/{virtio_scsi_lun.name=subsystems}:\x0fvirtio_scsi_lun\xda\x41\x1bvirtio_scsi_lun,update_mask\x12\x9d\x01\n\x12ListVirtioScsiLuns\x12-.opi_api.storage.v1.ListVirtioScsiLunsRequest\x1a..opi_api.storage.v1.ListVirtioScsiLunsResponse\"(\x82\xd3\xe4\x93\x02\x19\x12\x17/v1/{parent=subsystems}\xda\x41\x06parent\x12\x98\x01\n\x10GetVirtioScsiLun\x12+.opi_api.storage.v1.GetVirtioScsiLunRequest\x1a!.opi_api.storage.v1.VirtioScsiLun\"4\x82\xd3\xe4\x93\x02\'\x12%/v1/{name=subsystems}/{virtioscsilun}\xda\x41\x04name\x12u\n\x12VirtioScsiLunStats\x12-.opi_api.storage.v1.VirtioScsiLunStatsRequest\x1a..opi_api.storage.v1.VirtioScsiLunStatsResponse\"\x00\x42\x66\n\x12opi_api.storage.v1B\x17\x46rontendVirtioScsiProtoP\x01Z5github.com/opiproject/opi-api/storage/v1alpha1/gen/gob\x06proto3')



_VIRTIOSCSITARGET = DESCRIPTOR.message_types_by_name['VirtioScsiTarget']
_VIRTIOSCSICONTROLLER = DESCRIPTOR.message_types_by_name['VirtioScsiController']
_VIRTIOSCSILUN = DESCRIPTOR.message_types_by_name['VirtioScsiLun']
_CREATEVIRTIOSCSITARGETREQUEST = DESCRIPTOR.message_types_by_name['CreateVirtioScsiTargetRequest']
_DELETEVIRTIOSCSITARGETREQUEST = DESCRIPTOR.message_types_by_name['DeleteVirtioScsiTargetRequest']
_UPDATEVIRTIOSCSITARGETREQUEST = DESCRIPTOR.message_types_by_name['UpdateVirtioScsiTargetRequest']
_LISTVIRTIOSCSITARGETSREQUEST = DESCRIPTOR.message_types_by_name['ListVirtioScsiTargetsRequest']
_LISTVIRTIOSCSITARGETSRESPONSE = DESCRIPTOR.message_types_by_name['ListVirtioScsiTargetsResponse']
_GETVIRTIOSCSITARGETREQUEST = DESCRIPTOR.message_types_by_name['GetVirtioScsiTargetRequest']
_VIRTIOSCSITARGETSTATSREQUEST = DESCRIPTOR.message_types_by_name['VirtioScsiTargetStatsRequest']
_VIRTIOSCSITARGETSTATSRESPONSE = DESCRIPTOR.message_types_by_name['VirtioScsiTargetStatsResponse']
_CREATEVIRTIOSCSICONTROLLERREQUEST = DESCRIPTOR.message_types_by_name['CreateVirtioScsiControllerRequest']
_DELETEVIRTIOSCSICONTROLLERREQUEST = DESCRIPTOR.message_types_by_name['DeleteVirtioScsiControllerRequest']
_UPDATEVIRTIOSCSICONTROLLERREQUEST = DESCRIPTOR.message_types_by_name['UpdateVirtioScsiControllerRequest']
_LISTVIRTIOSCSICONTROLLERSREQUEST = DESCRIPTOR.message_types_by_name['ListVirtioScsiControllersRequest']
_LISTVIRTIOSCSICONTROLLERSRESPONSE = DESCRIPTOR.message_types_by_name['ListVirtioScsiControllersResponse']
_GETVIRTIOSCSICONTROLLERREQUEST = DESCRIPTOR.message_types_by_name['GetVirtioScsiControllerRequest']
_VIRTIOSCSICONTROLLERSTATSREQUEST = DESCRIPTOR.message_types_by_name['VirtioScsiControllerStatsRequest']
_VIRTIOSCSICONTROLLERSTATSRESPONSE = DESCRIPTOR.message_types_by_name['VirtioScsiControllerStatsResponse']
_CREATEVIRTIOSCSILUNREQUEST = DESCRIPTOR.message_types_by_name['CreateVirtioScsiLunRequest']
_DELETEVIRTIOSCSILUNREQUEST = DESCRIPTOR.message_types_by_name['DeleteVirtioScsiLunRequest']
_UPDATEVIRTIOSCSILUNREQUEST = DESCRIPTOR.message_types_by_name['UpdateVirtioScsiLunRequest']
_LISTVIRTIOSCSILUNSREQUEST = DESCRIPTOR.message_types_by_name['ListVirtioScsiLunsRequest']
_LISTVIRTIOSCSILUNSRESPONSE = DESCRIPTOR.message_types_by_name['ListVirtioScsiLunsResponse']
_GETVIRTIOSCSILUNREQUEST = DESCRIPTOR.message_types_by_name['GetVirtioScsiLunRequest']
_VIRTIOSCSILUNSTATSREQUEST = DESCRIPTOR.message_types_by_name['VirtioScsiLunStatsRequest']
_VIRTIOSCSILUNSTATSRESPONSE = DESCRIPTOR.message_types_by_name['VirtioScsiLunStatsResponse']
VirtioScsiTarget = _reflection.GeneratedProtocolMessageType('VirtioScsiTarget', (_message.Message,), {
  'DESCRIPTOR' : _VIRTIOSCSITARGET,
  '__module__' : 'frontend_virtio_scsi_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.VirtioScsiTarget)
  })
_sym_db.RegisterMessage(VirtioScsiTarget)

VirtioScsiController = _reflection.GeneratedProtocolMessageType('VirtioScsiController', (_message.Message,), {
  'DESCRIPTOR' : _VIRTIOSCSICONTROLLER,
  '__module__' : 'frontend_virtio_scsi_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.VirtioScsiController)
  })
_sym_db.RegisterMessage(VirtioScsiController)

VirtioScsiLun = _reflection.GeneratedProtocolMessageType('VirtioScsiLun', (_message.Message,), {
  'DESCRIPTOR' : _VIRTIOSCSILUN,
  '__module__' : 'frontend_virtio_scsi_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.VirtioScsiLun)
  })
_sym_db.RegisterMessage(VirtioScsiLun)

CreateVirtioScsiTargetRequest = _reflection.GeneratedProtocolMessageType('CreateVirtioScsiTargetRequest', (_message.Message,), {
  'DESCRIPTOR' : _CREATEVIRTIOSCSITARGETREQUEST,
  '__module__' : 'frontend_virtio_scsi_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.CreateVirtioScsiTargetRequest)
  })
_sym_db.RegisterMessage(CreateVirtioScsiTargetRequest)

DeleteVirtioScsiTargetRequest = _reflection.GeneratedProtocolMessageType('DeleteVirtioScsiTargetRequest', (_message.Message,), {
  'DESCRIPTOR' : _DELETEVIRTIOSCSITARGETREQUEST,
  '__module__' : 'frontend_virtio_scsi_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.DeleteVirtioScsiTargetRequest)
  })
_sym_db.RegisterMessage(DeleteVirtioScsiTargetRequest)

UpdateVirtioScsiTargetRequest = _reflection.GeneratedProtocolMessageType('UpdateVirtioScsiTargetRequest', (_message.Message,), {
  'DESCRIPTOR' : _UPDATEVIRTIOSCSITARGETREQUEST,
  '__module__' : 'frontend_virtio_scsi_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.UpdateVirtioScsiTargetRequest)
  })
_sym_db.RegisterMessage(UpdateVirtioScsiTargetRequest)

ListVirtioScsiTargetsRequest = _reflection.GeneratedProtocolMessageType('ListVirtioScsiTargetsRequest', (_message.Message,), {
  'DESCRIPTOR' : _LISTVIRTIOSCSITARGETSREQUEST,
  '__module__' : 'frontend_virtio_scsi_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.ListVirtioScsiTargetsRequest)
  })
_sym_db.RegisterMessage(ListVirtioScsiTargetsRequest)

ListVirtioScsiTargetsResponse = _reflection.GeneratedProtocolMessageType('ListVirtioScsiTargetsResponse', (_message.Message,), {
  'DESCRIPTOR' : _LISTVIRTIOSCSITARGETSRESPONSE,
  '__module__' : 'frontend_virtio_scsi_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.ListVirtioScsiTargetsResponse)
  })
_sym_db.RegisterMessage(ListVirtioScsiTargetsResponse)

GetVirtioScsiTargetRequest = _reflection.GeneratedProtocolMessageType('GetVirtioScsiTargetRequest', (_message.Message,), {
  'DESCRIPTOR' : _GETVIRTIOSCSITARGETREQUEST,
  '__module__' : 'frontend_virtio_scsi_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.GetVirtioScsiTargetRequest)
  })
_sym_db.RegisterMessage(GetVirtioScsiTargetRequest)

VirtioScsiTargetStatsRequest = _reflection.GeneratedProtocolMessageType('VirtioScsiTargetStatsRequest', (_message.Message,), {
  'DESCRIPTOR' : _VIRTIOSCSITARGETSTATSREQUEST,
  '__module__' : 'frontend_virtio_scsi_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.VirtioScsiTargetStatsRequest)
  })
_sym_db.RegisterMessage(VirtioScsiTargetStatsRequest)

VirtioScsiTargetStatsResponse = _reflection.GeneratedProtocolMessageType('VirtioScsiTargetStatsResponse', (_message.Message,), {
  'DESCRIPTOR' : _VIRTIOSCSITARGETSTATSRESPONSE,
  '__module__' : 'frontend_virtio_scsi_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.VirtioScsiTargetStatsResponse)
  })
_sym_db.RegisterMessage(VirtioScsiTargetStatsResponse)

CreateVirtioScsiControllerRequest = _reflection.GeneratedProtocolMessageType('CreateVirtioScsiControllerRequest', (_message.Message,), {
  'DESCRIPTOR' : _CREATEVIRTIOSCSICONTROLLERREQUEST,
  '__module__' : 'frontend_virtio_scsi_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.CreateVirtioScsiControllerRequest)
  })
_sym_db.RegisterMessage(CreateVirtioScsiControllerRequest)

DeleteVirtioScsiControllerRequest = _reflection.GeneratedProtocolMessageType('DeleteVirtioScsiControllerRequest', (_message.Message,), {
  'DESCRIPTOR' : _DELETEVIRTIOSCSICONTROLLERREQUEST,
  '__module__' : 'frontend_virtio_scsi_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.DeleteVirtioScsiControllerRequest)
  })
_sym_db.RegisterMessage(DeleteVirtioScsiControllerRequest)

UpdateVirtioScsiControllerRequest = _reflection.GeneratedProtocolMessageType('UpdateVirtioScsiControllerRequest', (_message.Message,), {
  'DESCRIPTOR' : _UPDATEVIRTIOSCSICONTROLLERREQUEST,
  '__module__' : 'frontend_virtio_scsi_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.UpdateVirtioScsiControllerRequest)
  })
_sym_db.RegisterMessage(UpdateVirtioScsiControllerRequest)

ListVirtioScsiControllersRequest = _reflection.GeneratedProtocolMessageType('ListVirtioScsiControllersRequest', (_message.Message,), {
  'DESCRIPTOR' : _LISTVIRTIOSCSICONTROLLERSREQUEST,
  '__module__' : 'frontend_virtio_scsi_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.ListVirtioScsiControllersRequest)
  })
_sym_db.RegisterMessage(ListVirtioScsiControllersRequest)

ListVirtioScsiControllersResponse = _reflection.GeneratedProtocolMessageType('ListVirtioScsiControllersResponse', (_message.Message,), {
  'DESCRIPTOR' : _LISTVIRTIOSCSICONTROLLERSRESPONSE,
  '__module__' : 'frontend_virtio_scsi_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.ListVirtioScsiControllersResponse)
  })
_sym_db.RegisterMessage(ListVirtioScsiControllersResponse)

GetVirtioScsiControllerRequest = _reflection.GeneratedProtocolMessageType('GetVirtioScsiControllerRequest', (_message.Message,), {
  'DESCRIPTOR' : _GETVIRTIOSCSICONTROLLERREQUEST,
  '__module__' : 'frontend_virtio_scsi_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.GetVirtioScsiControllerRequest)
  })
_sym_db.RegisterMessage(GetVirtioScsiControllerRequest)

VirtioScsiControllerStatsRequest = _reflection.GeneratedProtocolMessageType('VirtioScsiControllerStatsRequest', (_message.Message,), {
  'DESCRIPTOR' : _VIRTIOSCSICONTROLLERSTATSREQUEST,
  '__module__' : 'frontend_virtio_scsi_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.VirtioScsiControllerStatsRequest)
  })
_sym_db.RegisterMessage(VirtioScsiControllerStatsRequest)

VirtioScsiControllerStatsResponse = _reflection.GeneratedProtocolMessageType('VirtioScsiControllerStatsResponse', (_message.Message,), {
  'DESCRIPTOR' : _VIRTIOSCSICONTROLLERSTATSRESPONSE,
  '__module__' : 'frontend_virtio_scsi_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.VirtioScsiControllerStatsResponse)
  })
_sym_db.RegisterMessage(VirtioScsiControllerStatsResponse)

CreateVirtioScsiLunRequest = _reflection.GeneratedProtocolMessageType('CreateVirtioScsiLunRequest', (_message.Message,), {
  'DESCRIPTOR' : _CREATEVIRTIOSCSILUNREQUEST,
  '__module__' : 'frontend_virtio_scsi_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.CreateVirtioScsiLunRequest)
  })
_sym_db.RegisterMessage(CreateVirtioScsiLunRequest)

DeleteVirtioScsiLunRequest = _reflection.GeneratedProtocolMessageType('DeleteVirtioScsiLunRequest', (_message.Message,), {
  'DESCRIPTOR' : _DELETEVIRTIOSCSILUNREQUEST,
  '__module__' : 'frontend_virtio_scsi_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.DeleteVirtioScsiLunRequest)
  })
_sym_db.RegisterMessage(DeleteVirtioScsiLunRequest)

UpdateVirtioScsiLunRequest = _reflection.GeneratedProtocolMessageType('UpdateVirtioScsiLunRequest', (_message.Message,), {
  'DESCRIPTOR' : _UPDATEVIRTIOSCSILUNREQUEST,
  '__module__' : 'frontend_virtio_scsi_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.UpdateVirtioScsiLunRequest)
  })
_sym_db.RegisterMessage(UpdateVirtioScsiLunRequest)

ListVirtioScsiLunsRequest = _reflection.GeneratedProtocolMessageType('ListVirtioScsiLunsRequest', (_message.Message,), {
  'DESCRIPTOR' : _LISTVIRTIOSCSILUNSREQUEST,
  '__module__' : 'frontend_virtio_scsi_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.ListVirtioScsiLunsRequest)
  })
_sym_db.RegisterMessage(ListVirtioScsiLunsRequest)

ListVirtioScsiLunsResponse = _reflection.GeneratedProtocolMessageType('ListVirtioScsiLunsResponse', (_message.Message,), {
  'DESCRIPTOR' : _LISTVIRTIOSCSILUNSRESPONSE,
  '__module__' : 'frontend_virtio_scsi_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.ListVirtioScsiLunsResponse)
  })
_sym_db.RegisterMessage(ListVirtioScsiLunsResponse)

GetVirtioScsiLunRequest = _reflection.GeneratedProtocolMessageType('GetVirtioScsiLunRequest', (_message.Message,), {
  'DESCRIPTOR' : _GETVIRTIOSCSILUNREQUEST,
  '__module__' : 'frontend_virtio_scsi_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.GetVirtioScsiLunRequest)
  })
_sym_db.RegisterMessage(GetVirtioScsiLunRequest)

VirtioScsiLunStatsRequest = _reflection.GeneratedProtocolMessageType('VirtioScsiLunStatsRequest', (_message.Message,), {
  'DESCRIPTOR' : _VIRTIOSCSILUNSTATSREQUEST,
  '__module__' : 'frontend_virtio_scsi_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.VirtioScsiLunStatsRequest)
  })
_sym_db.RegisterMessage(VirtioScsiLunStatsRequest)

VirtioScsiLunStatsResponse = _reflection.GeneratedProtocolMessageType('VirtioScsiLunStatsResponse', (_message.Message,), {
  'DESCRIPTOR' : _VIRTIOSCSILUNSTATSRESPONSE,
  '__module__' : 'frontend_virtio_scsi_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.VirtioScsiLunStatsResponse)
  })
_sym_db.RegisterMessage(VirtioScsiLunStatsResponse)

_FRONTENDVIRTIOSCSISERVICE = DESCRIPTOR.services_by_name['FrontendVirtioScsiService']
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\022opi_api.storage.v1B\027FrontendVirtioScsiProtoP\001Z5github.com/opiproject/opi-api/storage/v1alpha1/gen/go'
  _CREATEVIRTIOSCSITARGETREQUEST.fields_by_name['parent']._options = None
  _CREATEVIRTIOSCSITARGETREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A%\n#opi_api.storage.v1/VirtioScsiTarget'
  _CREATEVIRTIOSCSITARGETREQUEST.fields_by_name['virtio_scsi_target']._options = None
  _CREATEVIRTIOSCSITARGETREQUEST.fields_by_name['virtio_scsi_target']._serialized_options = b'\340A\002'
  _DELETEVIRTIOSCSITARGETREQUEST.fields_by_name['name']._options = None
  _DELETEVIRTIOSCSITARGETREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A%\n#opi_api.storage.v1/VirtioScsiTarget'
  _LISTVIRTIOSCSITARGETSREQUEST.fields_by_name['parent']._options = None
  _LISTVIRTIOSCSITARGETSREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A%\n#opi_api.storage.v1/VirtioScsiTarget'
  _GETVIRTIOSCSITARGETREQUEST.fields_by_name['name']._options = None
  _GETVIRTIOSCSITARGETREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A%\n#opi_api.storage.v1/VirtioScsiTarget'
  _CREATEVIRTIOSCSICONTROLLERREQUEST.fields_by_name['parent']._options = None
  _CREATEVIRTIOSCSICONTROLLERREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A)\n\'opi_api.storage.v1/VirtioScsiController'
  _CREATEVIRTIOSCSICONTROLLERREQUEST.fields_by_name['virtio_scsi_controller']._options = None
  _CREATEVIRTIOSCSICONTROLLERREQUEST.fields_by_name['virtio_scsi_controller']._serialized_options = b'\340A\002'
  _DELETEVIRTIOSCSICONTROLLERREQUEST.fields_by_name['name']._options = None
  _DELETEVIRTIOSCSICONTROLLERREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A)\n\'opi_api.storage.v1/VirtioScsiController'
  _LISTVIRTIOSCSICONTROLLERSREQUEST.fields_by_name['parent']._options = None
  _LISTVIRTIOSCSICONTROLLERSREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A)\n\'opi_api.storage.v1/VirtioScsiController'
  _GETVIRTIOSCSICONTROLLERREQUEST.fields_by_name['name']._options = None
  _GETVIRTIOSCSICONTROLLERREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A)\n\'opi_api.storage.v1/VirtioScsiController'
  _CREATEVIRTIOSCSILUNREQUEST.fields_by_name['parent']._options = None
  _CREATEVIRTIOSCSILUNREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A\"\n opi_api.storage.v1/VirtioScsiLun'
  _CREATEVIRTIOSCSILUNREQUEST.fields_by_name['virtio_scsi_lun']._options = None
  _CREATEVIRTIOSCSILUNREQUEST.fields_by_name['virtio_scsi_lun']._serialized_options = b'\340A\002'
  _DELETEVIRTIOSCSILUNREQUEST.fields_by_name['name']._options = None
  _DELETEVIRTIOSCSILUNREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A\"\n opi_api.storage.v1/VirtioScsiLun'
  _LISTVIRTIOSCSILUNSREQUEST.fields_by_name['parent']._options = None
  _LISTVIRTIOSCSILUNSREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A\"\n opi_api.storage.v1/VirtioScsiLun'
  _GETVIRTIOSCSILUNREQUEST.fields_by_name['name']._options = None
  _GETVIRTIOSCSILUNREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A\"\n opi_api.storage.v1/VirtioScsiLun'
  _FRONTENDVIRTIOSCSISERVICE.methods_by_name['CreateVirtioScsiTarget']._options = None
  _FRONTENDVIRTIOSCSISERVICE.methods_by_name['CreateVirtioScsiTarget']._serialized_options = b'\202\323\344\223\002-\"\027/v1/{parent=subsystems}:\022virtio_scsi_target\332A/parent,virtio_scsi_target,virtio_scsi_target_id'
  _FRONTENDVIRTIOSCSISERVICE.methods_by_name['DeleteVirtioScsiTarget']._options = None
  _FRONTENDVIRTIOSCSISERVICE.methods_by_name['DeleteVirtioScsiTarget']._serialized_options = b'\202\323\344\223\002**(/v1/{name=subsystems}/{virtioscsitarget}\332A\004name'
  _FRONTENDVIRTIOSCSISERVICE.methods_by_name['UpdateVirtioScsiTarget']._options = None
  _FRONTENDVIRTIOSCSISERVICE.methods_by_name['UpdateVirtioScsiTarget']._serialized_options = b'\202\323\344\223\002>2(/v1/{virtio_scsi_target.name=subsystems}:\022virtio_scsi_target\332A\036virtio_scsi_target,update_mask'
  _FRONTENDVIRTIOSCSISERVICE.methods_by_name['ListVirtioScsiTargets']._options = None
  _FRONTENDVIRTIOSCSISERVICE.methods_by_name['ListVirtioScsiTargets']._serialized_options = b'\202\323\344\223\002\031\022\027/v1/{parent=subsystems}\332A\006parent'
  _FRONTENDVIRTIOSCSISERVICE.methods_by_name['GetVirtioScsiTarget']._options = None
  _FRONTENDVIRTIOSCSISERVICE.methods_by_name['GetVirtioScsiTarget']._serialized_options = b'\202\323\344\223\002*\022(/v1/{name=subsystems}/{virtioscsitarget}\332A\004name'
  _FRONTENDVIRTIOSCSISERVICE.methods_by_name['CreateVirtioScsiController']._options = None
  _FRONTENDVIRTIOSCSISERVICE.methods_by_name['CreateVirtioScsiController']._serialized_options = b'\202\323\344\223\0021\"\027/v1/{parent=subsystems}:\026virtio_scsi_controller\332A7parent,virtio_scsi_controller,virtio_scsi_controller_id'
  _FRONTENDVIRTIOSCSISERVICE.methods_by_name['DeleteVirtioScsiController']._options = None
  _FRONTENDVIRTIOSCSISERVICE.methods_by_name['DeleteVirtioScsiController']._serialized_options = b'\202\323\344\223\002-*+/v1/{name=virtioscsictrls}/{virtioscsictrl}\332A\004name'
  _FRONTENDVIRTIOSCSISERVICE.methods_by_name['UpdateVirtioScsiController']._options = None
  _FRONTENDVIRTIOSCSISERVICE.methods_by_name['UpdateVirtioScsiController']._serialized_options = b'\202\323\344\223\002F2,/v1/{virtio_scsi_controller.name=subsystems}:\026virtio_scsi_controller\332A\"virtio_scsi_controller,update_mask'
  _FRONTENDVIRTIOSCSISERVICE.methods_by_name['ListVirtioScsiControllers']._options = None
  _FRONTENDVIRTIOSCSISERVICE.methods_by_name['ListVirtioScsiControllers']._serialized_options = b'\202\323\344\223\002\031\022\027/v1/{parent=subsystems}\332A\006parent'
  _FRONTENDVIRTIOSCSISERVICE.methods_by_name['GetVirtioScsiController']._options = None
  _FRONTENDVIRTIOSCSISERVICE.methods_by_name['GetVirtioScsiController']._serialized_options = b'\202\323\344\223\002(\022&/v1/{name=subsystems}/{virtioscsictrl}\332A\004name'
  _FRONTENDVIRTIOSCSISERVICE.methods_by_name['CreateVirtioScsiLun']._options = None
  _FRONTENDVIRTIOSCSISERVICE.methods_by_name['CreateVirtioScsiLun']._serialized_options = b'\202\323\344\223\002*\"\027/v1/{parent=subsystems}:\017virtio_scsi_lun\332A)parent,virtio_scsi_lun,virtio_scsi_lun_id'
  _FRONTENDVIRTIOSCSISERVICE.methods_by_name['DeleteVirtioScsiLun']._options = None
  _FRONTENDVIRTIOSCSISERVICE.methods_by_name['DeleteVirtioScsiLun']._serialized_options = b'\202\323\344\223\002+*)/v1/{name=virtioscsiluns}/{virtioscsilun}\332A\004name'
  _FRONTENDVIRTIOSCSISERVICE.methods_by_name['UpdateVirtioScsiLun']._options = None
  _FRONTENDVIRTIOSCSISERVICE.methods_by_name['UpdateVirtioScsiLun']._serialized_options = b'\202\323\344\223\00282%/v1/{virtio_scsi_lun.name=subsystems}:\017virtio_scsi_lun\332A\033virtio_scsi_lun,update_mask'
  _FRONTENDVIRTIOSCSISERVICE.methods_by_name['ListVirtioScsiLuns']._options = None
  _FRONTENDVIRTIOSCSISERVICE.methods_by_name['ListVirtioScsiLuns']._serialized_options = b'\202\323\344\223\002\031\022\027/v1/{parent=subsystems}\332A\006parent'
  _FRONTENDVIRTIOSCSISERVICE.methods_by_name['GetVirtioScsiLun']._options = None
  _FRONTENDVIRTIOSCSISERVICE.methods_by_name['GetVirtioScsiLun']._serialized_options = b'\202\323\344\223\002\'\022%/v1/{name=subsystems}/{virtioscsilun}\332A\004name'
  _VIRTIOSCSITARGET._serialized_start=263
  _VIRTIOSCSITARGET._serialized_end=341
  _VIRTIOSCSICONTROLLER._serialized_start=344
  _VIRTIOSCSICONTROLLER._serialized_end=556
  _VIRTIOSCSILUN._serialized_start=559
  _VIRTIOSCSILUN._serialized_end=714
  _CREATEVIRTIOSCSITARGETREQUEST._serialized_start=717
  _CREATEVIRTIOSCSITARGETREQUEST._serialized_end=911
  _DELETEVIRTIOSCSITARGETREQUEST._serialized_start=913
  _DELETEVIRTIOSCSITARGETREQUEST._serialized_end=1026
  _UPDATEVIRTIOSCSITARGETREQUEST._serialized_start=1029
  _UPDATEVIRTIOSCSITARGETREQUEST._serialized_end=1175
  _LISTVIRTIOSCSITARGETSREQUEST._serialized_start=1178
  _LISTVIRTIOSCSITARGETSREQUEST._serialized_end=1308
  _LISTVIRTIOSCSITARGETSRESPONSE._serialized_start=1310
  _LISTVIRTIOSCSITARGETSRESPONSE._serialized_end=1433
  _GETVIRTIOSCSITARGETREQUEST._serialized_start=1435
  _GETVIRTIOSCSITARGETREQUEST._serialized_end=1522
  _VIRTIOSCSITARGETSTATSREQUEST._serialized_start=1524
  _VIRTIOSCSITARGETSTATSREQUEST._serialized_end=1603
  _VIRTIOSCSITARGETSTATSRESPONSE._serialized_start=1605
  _VIRTIOSCSITARGETSTATSRESPONSE._serialized_end=1726
  _CREATEVIRTIOSCSICONTROLLERREQUEST._serialized_start=1729
  _CREATEVIRTIOSCSICONTROLLERREQUEST._serialized_end=1943
  _DELETEVIRTIOSCSICONTROLLERREQUEST._serialized_start=1945
  _DELETEVIRTIOSCSICONTROLLERREQUEST._serialized_end=2066
  _UPDATEVIRTIOSCSICONTROLLERREQUEST._serialized_start=2069
  _UPDATEVIRTIOSCSICONTROLLERREQUEST._serialized_end=2227
  _LISTVIRTIOSCSICONTROLLERSREQUEST._serialized_start=2230
  _LISTVIRTIOSCSICONTROLLERSREQUEST._serialized_end=2368
  _LISTVIRTIOSCSICONTROLLERSRESPONSE._serialized_start=2371
  _LISTVIRTIOSCSICONTROLLERSRESPONSE._serialized_end=2506
  _GETVIRTIOSCSICONTROLLERREQUEST._serialized_start=2508
  _GETVIRTIOSCSICONTROLLERREQUEST._serialized_end=2603
  _VIRTIOSCSICONTROLLERSTATSREQUEST._serialized_start=2605
  _VIRTIOSCSICONTROLLERSTATSREQUEST._serialized_end=2692
  _VIRTIOSCSICONTROLLERSTATSRESPONSE._serialized_start=2694
  _VIRTIOSCSICONTROLLERSTATSRESPONSE._serialized_end=2819
  _CREATEVIRTIOSCSILUNREQUEST._serialized_start=2822
  _CREATEVIRTIOSCSILUNREQUEST._serialized_end=3001
  _DELETEVIRTIOSCSILUNREQUEST._serialized_start=3003
  _DELETEVIRTIOSCSILUNREQUEST._serialized_end=3110
  _UPDATEVIRTIOSCSILUNREQUEST._serialized_start=3113
  _UPDATEVIRTIOSCSILUNREQUEST._serialized_end=3250
  _LISTVIRTIOSCSILUNSREQUEST._serialized_start=3252
  _LISTVIRTIOSCSILUNSREQUEST._serialized_end=3376
  _LISTVIRTIOSCSILUNSRESPONSE._serialized_start=3378
  _LISTVIRTIOSCSILUNSRESPONSE._serialized_end=3492
  _GETVIRTIOSCSILUNREQUEST._serialized_start=3494
  _GETVIRTIOSCSILUNREQUEST._serialized_end=3575
  _VIRTIOSCSILUNSTATSREQUEST._serialized_start=3577
  _VIRTIOSCSILUNSTATSREQUEST._serialized_end=3703
  _VIRTIOSCSILUNSTATSRESPONSE._serialized_start=3705
  _VIRTIOSCSILUNSTATSRESPONSE._serialized_end=3823
  _FRONTENDVIRTIOSCSISERVICE._serialized_start=3826
  _FRONTENDVIRTIOSCSISERVICE._serialized_end=7059
# @@protoc_insertion_point(module_scope)
