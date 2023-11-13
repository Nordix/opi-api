// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: component.proto

#include "component.pb.h"

#include <algorithm>

#include <google/protobuf/io/coded_stream.h>
#include <google/protobuf/extension_set.h>
#include <google/protobuf/wire_format_lite.h>
#include <google/protobuf/descriptor.h>
#include <google/protobuf/generated_message_reflection.h>
#include <google/protobuf/reflection_ops.h>
#include <google/protobuf/wire_format.h>
// @@protoc_insertion_point(includes)
#include <google/protobuf/port_def.inc>

PROTOBUF_PRAGMA_INIT_SEG

namespace _pb = ::PROTOBUF_NAMESPACE_ID;
namespace _pbi = _pb::internal;

namespace opi_api {
namespace network {
namespace evpn_gw {
namespace v1alpha1 {
PROTOBUF_CONSTEXPR Component::Component(
    ::_pbi::ConstantInitialized): _impl_{
    /*decltype(_impl_.name_)*/{&::_pbi::fixed_address_empty_string, ::_pbi::ConstantInitialized{}}
  , /*decltype(_impl_.details_)*/{&::_pbi::fixed_address_empty_string, ::_pbi::ConstantInitialized{}}
  , /*decltype(_impl_.status_)*/0
  , /*decltype(_impl_._cached_size_)*/{}} {}
struct ComponentDefaultTypeInternal {
  PROTOBUF_CONSTEXPR ComponentDefaultTypeInternal()
      : _instance(::_pbi::ConstantInitialized{}) {}
  ~ComponentDefaultTypeInternal() {}
  union {
    Component _instance;
  };
};
PROTOBUF_ATTRIBUTE_NO_DESTROY PROTOBUF_CONSTINIT PROTOBUF_ATTRIBUTE_INIT_PRIORITY1 ComponentDefaultTypeInternal _Component_default_instance_;
}  // namespace v1alpha1
}  // namespace evpn_gw
}  // namespace network
}  // namespace opi_api
static ::_pb::Metadata file_level_metadata_component_2eproto[1];
static const ::_pb::EnumDescriptor* file_level_enum_descriptors_component_2eproto[1];
static constexpr ::_pb::ServiceDescriptor const** file_level_service_descriptors_component_2eproto = nullptr;

const uint32_t TableStruct_component_2eproto::offsets[] PROTOBUF_SECTION_VARIABLE(protodesc_cold) = {
  ~0u,  // no _has_bits_
  PROTOBUF_FIELD_OFFSET(::opi_api::network::evpn_gw::v1alpha1::Component, _internal_metadata_),
  ~0u,  // no _extensions_
  ~0u,  // no _oneof_case_
  ~0u,  // no _weak_field_map_
  ~0u,  // no _inlined_string_donated_
  PROTOBUF_FIELD_OFFSET(::opi_api::network::evpn_gw::v1alpha1::Component, _impl_.name_),
  PROTOBUF_FIELD_OFFSET(::opi_api::network::evpn_gw::v1alpha1::Component, _impl_.status_),
  PROTOBUF_FIELD_OFFSET(::opi_api::network::evpn_gw::v1alpha1::Component, _impl_.details_),
};
static const ::_pbi::MigrationSchema schemas[] PROTOBUF_SECTION_VARIABLE(protodesc_cold) = {
  { 0, -1, -1, sizeof(::opi_api::network::evpn_gw::v1alpha1::Component)},
};

static const ::_pb::Message* const file_default_instances[] = {
  &::opi_api::network::evpn_gw::v1alpha1::_Component_default_instance_._instance,
};

const char descriptor_table_protodef_component_2eproto[] PROTOBUF_SECTION_VARIABLE(protodesc_cold) =
  "\n\017component.proto\022 opi_api.network.evpn_"
  "gw.v1alpha1\032\037google/api/field_behavior.p"
  "roto\"w\n\tComponent\022\021\n\004name\030\001 \001(\tB\003\340A\003\022A\n\006"
  "status\030\002 \001(\0162,.opi_api.network.evpn_gw.v"
  "1alpha1.CompStatusB\003\340A\003\022\024\n\007details\030\003 \001(\t"
  "B\003\340A\003*r\n\nCompStatus\022\033\n\027COMP_STATUS_UNSPE"
  "CIFIED\020\000\022\027\n\023COMP_STATUS_PENDING\020\001\022\027\n\023COM"
  "P_STATUS_SUCCESS\020\002\022\025\n\021COMP_STATUS_ERROR\020"
  "\003Bs\n opi_api.network.evpn_gw.v1alpha1B\016C"
  "omponentProtoP\001Z=github.com/opiproject/o"
  "pi-api/network/evpn-gw/v1alpha1/gen/gob\006"
  "proto3"
  ;
static const ::_pbi::DescriptorTable* const descriptor_table_component_2eproto_deps[1] = {
  &::descriptor_table_google_2fapi_2ffield_5fbehavior_2eproto,
};
static ::_pbi::once_flag descriptor_table_component_2eproto_once;
const ::_pbi::DescriptorTable descriptor_table_component_2eproto = {
    false, false, 446, descriptor_table_protodef_component_2eproto,
    "component.proto",
    &descriptor_table_component_2eproto_once, descriptor_table_component_2eproto_deps, 1, 1,
    schemas, file_default_instances, TableStruct_component_2eproto::offsets,
    file_level_metadata_component_2eproto, file_level_enum_descriptors_component_2eproto,
    file_level_service_descriptors_component_2eproto,
};
PROTOBUF_ATTRIBUTE_WEAK const ::_pbi::DescriptorTable* descriptor_table_component_2eproto_getter() {
  return &descriptor_table_component_2eproto;
}

// Force running AddDescriptors() at dynamic initialization time.
PROTOBUF_ATTRIBUTE_INIT_PRIORITY2 static ::_pbi::AddDescriptorsRunner dynamic_init_dummy_component_2eproto(&descriptor_table_component_2eproto);
namespace opi_api {
namespace network {
namespace evpn_gw {
namespace v1alpha1 {
const ::PROTOBUF_NAMESPACE_ID::EnumDescriptor* CompStatus_descriptor() {
  ::PROTOBUF_NAMESPACE_ID::internal::AssignDescriptors(&descriptor_table_component_2eproto);
  return file_level_enum_descriptors_component_2eproto[0];
}
bool CompStatus_IsValid(int value) {
  switch (value) {
    case 0:
    case 1:
    case 2:
    case 3:
      return true;
    default:
      return false;
  }
}


// ===================================================================

class Component::_Internal {
 public:
};

Component::Component(::PROTOBUF_NAMESPACE_ID::Arena* arena,
                         bool is_message_owned)
  : ::PROTOBUF_NAMESPACE_ID::Message(arena, is_message_owned) {
  SharedCtor(arena, is_message_owned);
  // @@protoc_insertion_point(arena_constructor:opi_api.network.evpn_gw.v1alpha1.Component)
}
Component::Component(const Component& from)
  : ::PROTOBUF_NAMESPACE_ID::Message() {
  Component* const _this = this; (void)_this;
  new (&_impl_) Impl_{
      decltype(_impl_.name_){}
    , decltype(_impl_.details_){}
    , decltype(_impl_.status_){}
    , /*decltype(_impl_._cached_size_)*/{}};

  _internal_metadata_.MergeFrom<::PROTOBUF_NAMESPACE_ID::UnknownFieldSet>(from._internal_metadata_);
  _impl_.name_.InitDefault();
  #ifdef PROTOBUF_FORCE_COPY_DEFAULT_STRING
    _impl_.name_.Set("", GetArenaForAllocation());
  #endif // PROTOBUF_FORCE_COPY_DEFAULT_STRING
  if (!from._internal_name().empty()) {
    _this->_impl_.name_.Set(from._internal_name(), 
      _this->GetArenaForAllocation());
  }
  _impl_.details_.InitDefault();
  #ifdef PROTOBUF_FORCE_COPY_DEFAULT_STRING
    _impl_.details_.Set("", GetArenaForAllocation());
  #endif // PROTOBUF_FORCE_COPY_DEFAULT_STRING
  if (!from._internal_details().empty()) {
    _this->_impl_.details_.Set(from._internal_details(), 
      _this->GetArenaForAllocation());
  }
  _this->_impl_.status_ = from._impl_.status_;
  // @@protoc_insertion_point(copy_constructor:opi_api.network.evpn_gw.v1alpha1.Component)
}

inline void Component::SharedCtor(
    ::_pb::Arena* arena, bool is_message_owned) {
  (void)arena;
  (void)is_message_owned;
  new (&_impl_) Impl_{
      decltype(_impl_.name_){}
    , decltype(_impl_.details_){}
    , decltype(_impl_.status_){0}
    , /*decltype(_impl_._cached_size_)*/{}
  };
  _impl_.name_.InitDefault();
  #ifdef PROTOBUF_FORCE_COPY_DEFAULT_STRING
    _impl_.name_.Set("", GetArenaForAllocation());
  #endif // PROTOBUF_FORCE_COPY_DEFAULT_STRING
  _impl_.details_.InitDefault();
  #ifdef PROTOBUF_FORCE_COPY_DEFAULT_STRING
    _impl_.details_.Set("", GetArenaForAllocation());
  #endif // PROTOBUF_FORCE_COPY_DEFAULT_STRING
}

Component::~Component() {
  // @@protoc_insertion_point(destructor:opi_api.network.evpn_gw.v1alpha1.Component)
  if (auto *arena = _internal_metadata_.DeleteReturnArena<::PROTOBUF_NAMESPACE_ID::UnknownFieldSet>()) {
  (void)arena;
    return;
  }
  SharedDtor();
}

inline void Component::SharedDtor() {
  GOOGLE_DCHECK(GetArenaForAllocation() == nullptr);
  _impl_.name_.Destroy();
  _impl_.details_.Destroy();
}

void Component::SetCachedSize(int size) const {
  _impl_._cached_size_.Set(size);
}

void Component::Clear() {
// @@protoc_insertion_point(message_clear_start:opi_api.network.evpn_gw.v1alpha1.Component)
  uint32_t cached_has_bits = 0;
  // Prevent compiler warnings about cached_has_bits being unused
  (void) cached_has_bits;

  _impl_.name_.ClearToEmpty();
  _impl_.details_.ClearToEmpty();
  _impl_.status_ = 0;
  _internal_metadata_.Clear<::PROTOBUF_NAMESPACE_ID::UnknownFieldSet>();
}

const char* Component::_InternalParse(const char* ptr, ::_pbi::ParseContext* ctx) {
#define CHK_(x) if (PROTOBUF_PREDICT_FALSE(!(x))) goto failure
  while (!ctx->Done(&ptr)) {
    uint32_t tag;
    ptr = ::_pbi::ReadTag(ptr, &tag);
    switch (tag >> 3) {
      // string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
      case 1:
        if (PROTOBUF_PREDICT_TRUE(static_cast<uint8_t>(tag) == 10)) {
          auto str = _internal_mutable_name();
          ptr = ::_pbi::InlineGreedyStringParser(str, ptr, ctx);
          CHK_(ptr);
          CHK_(::_pbi::VerifyUTF8(str, "opi_api.network.evpn_gw.v1alpha1.Component.name"));
        } else
          goto handle_unusual;
        continue;
      // .opi_api.network.evpn_gw.v1alpha1.CompStatus status = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
      case 2:
        if (PROTOBUF_PREDICT_TRUE(static_cast<uint8_t>(tag) == 16)) {
          uint64_t val = ::PROTOBUF_NAMESPACE_ID::internal::ReadVarint64(&ptr);
          CHK_(ptr);
          _internal_set_status(static_cast<::opi_api::network::evpn_gw::v1alpha1::CompStatus>(val));
        } else
          goto handle_unusual;
        continue;
      // string details = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
      case 3:
        if (PROTOBUF_PREDICT_TRUE(static_cast<uint8_t>(tag) == 26)) {
          auto str = _internal_mutable_details();
          ptr = ::_pbi::InlineGreedyStringParser(str, ptr, ctx);
          CHK_(ptr);
          CHK_(::_pbi::VerifyUTF8(str, "opi_api.network.evpn_gw.v1alpha1.Component.details"));
        } else
          goto handle_unusual;
        continue;
      default:
        goto handle_unusual;
    }  // switch
  handle_unusual:
    if ((tag == 0) || ((tag & 7) == 4)) {
      CHK_(ptr);
      ctx->SetLastTag(tag);
      goto message_done;
    }
    ptr = UnknownFieldParse(
        tag,
        _internal_metadata_.mutable_unknown_fields<::PROTOBUF_NAMESPACE_ID::UnknownFieldSet>(),
        ptr, ctx);
    CHK_(ptr != nullptr);
  }  // while
message_done:
  return ptr;
failure:
  ptr = nullptr;
  goto message_done;
#undef CHK_
}

uint8_t* Component::_InternalSerialize(
    uint8_t* target, ::PROTOBUF_NAMESPACE_ID::io::EpsCopyOutputStream* stream) const {
  // @@protoc_insertion_point(serialize_to_array_start:opi_api.network.evpn_gw.v1alpha1.Component)
  uint32_t cached_has_bits = 0;
  (void) cached_has_bits;

  // string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
  if (!this->_internal_name().empty()) {
    ::PROTOBUF_NAMESPACE_ID::internal::WireFormatLite::VerifyUtf8String(
      this->_internal_name().data(), static_cast<int>(this->_internal_name().length()),
      ::PROTOBUF_NAMESPACE_ID::internal::WireFormatLite::SERIALIZE,
      "opi_api.network.evpn_gw.v1alpha1.Component.name");
    target = stream->WriteStringMaybeAliased(
        1, this->_internal_name(), target);
  }

  // .opi_api.network.evpn_gw.v1alpha1.CompStatus status = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
  if (this->_internal_status() != 0) {
    target = stream->EnsureSpace(target);
    target = ::_pbi::WireFormatLite::WriteEnumToArray(
      2, this->_internal_status(), target);
  }

  // string details = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
  if (!this->_internal_details().empty()) {
    ::PROTOBUF_NAMESPACE_ID::internal::WireFormatLite::VerifyUtf8String(
      this->_internal_details().data(), static_cast<int>(this->_internal_details().length()),
      ::PROTOBUF_NAMESPACE_ID::internal::WireFormatLite::SERIALIZE,
      "opi_api.network.evpn_gw.v1alpha1.Component.details");
    target = stream->WriteStringMaybeAliased(
        3, this->_internal_details(), target);
  }

  if (PROTOBUF_PREDICT_FALSE(_internal_metadata_.have_unknown_fields())) {
    target = ::_pbi::WireFormat::InternalSerializeUnknownFieldsToArray(
        _internal_metadata_.unknown_fields<::PROTOBUF_NAMESPACE_ID::UnknownFieldSet>(::PROTOBUF_NAMESPACE_ID::UnknownFieldSet::default_instance), target, stream);
  }
  // @@protoc_insertion_point(serialize_to_array_end:opi_api.network.evpn_gw.v1alpha1.Component)
  return target;
}

size_t Component::ByteSizeLong() const {
// @@protoc_insertion_point(message_byte_size_start:opi_api.network.evpn_gw.v1alpha1.Component)
  size_t total_size = 0;

  uint32_t cached_has_bits = 0;
  // Prevent compiler warnings about cached_has_bits being unused
  (void) cached_has_bits;

  // string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
  if (!this->_internal_name().empty()) {
    total_size += 1 +
      ::PROTOBUF_NAMESPACE_ID::internal::WireFormatLite::StringSize(
        this->_internal_name());
  }

  // string details = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
  if (!this->_internal_details().empty()) {
    total_size += 1 +
      ::PROTOBUF_NAMESPACE_ID::internal::WireFormatLite::StringSize(
        this->_internal_details());
  }

  // .opi_api.network.evpn_gw.v1alpha1.CompStatus status = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
  if (this->_internal_status() != 0) {
    total_size += 1 +
      ::_pbi::WireFormatLite::EnumSize(this->_internal_status());
  }

  return MaybeComputeUnknownFieldsSize(total_size, &_impl_._cached_size_);
}

const ::PROTOBUF_NAMESPACE_ID::Message::ClassData Component::_class_data_ = {
    ::PROTOBUF_NAMESPACE_ID::Message::CopyWithSourceCheck,
    Component::MergeImpl
};
const ::PROTOBUF_NAMESPACE_ID::Message::ClassData*Component::GetClassData() const { return &_class_data_; }


void Component::MergeImpl(::PROTOBUF_NAMESPACE_ID::Message& to_msg, const ::PROTOBUF_NAMESPACE_ID::Message& from_msg) {
  auto* const _this = static_cast<Component*>(&to_msg);
  auto& from = static_cast<const Component&>(from_msg);
  // @@protoc_insertion_point(class_specific_merge_from_start:opi_api.network.evpn_gw.v1alpha1.Component)
  GOOGLE_DCHECK_NE(&from, _this);
  uint32_t cached_has_bits = 0;
  (void) cached_has_bits;

  if (!from._internal_name().empty()) {
    _this->_internal_set_name(from._internal_name());
  }
  if (!from._internal_details().empty()) {
    _this->_internal_set_details(from._internal_details());
  }
  if (from._internal_status() != 0) {
    _this->_internal_set_status(from._internal_status());
  }
  _this->_internal_metadata_.MergeFrom<::PROTOBUF_NAMESPACE_ID::UnknownFieldSet>(from._internal_metadata_);
}

void Component::CopyFrom(const Component& from) {
// @@protoc_insertion_point(class_specific_copy_from_start:opi_api.network.evpn_gw.v1alpha1.Component)
  if (&from == this) return;
  Clear();
  MergeFrom(from);
}

bool Component::IsInitialized() const {
  return true;
}

void Component::InternalSwap(Component* other) {
  using std::swap;
  auto* lhs_arena = GetArenaForAllocation();
  auto* rhs_arena = other->GetArenaForAllocation();
  _internal_metadata_.InternalSwap(&other->_internal_metadata_);
  ::PROTOBUF_NAMESPACE_ID::internal::ArenaStringPtr::InternalSwap(
      &_impl_.name_, lhs_arena,
      &other->_impl_.name_, rhs_arena
  );
  ::PROTOBUF_NAMESPACE_ID::internal::ArenaStringPtr::InternalSwap(
      &_impl_.details_, lhs_arena,
      &other->_impl_.details_, rhs_arena
  );
  swap(_impl_.status_, other->_impl_.status_);
}

::PROTOBUF_NAMESPACE_ID::Metadata Component::GetMetadata() const {
  return ::_pbi::AssignDescriptors(
      &descriptor_table_component_2eproto_getter, &descriptor_table_component_2eproto_once,
      file_level_metadata_component_2eproto[0]);
}

// @@protoc_insertion_point(namespace_scope)
}  // namespace v1alpha1
}  // namespace evpn_gw
}  // namespace network
}  // namespace opi_api
PROTOBUF_NAMESPACE_OPEN
template<> PROTOBUF_NOINLINE ::opi_api::network::evpn_gw::v1alpha1::Component*
Arena::CreateMaybeMessage< ::opi_api::network::evpn_gw::v1alpha1::Component >(Arena* arena) {
  return Arena::CreateMessageInternal< ::opi_api::network::evpn_gw::v1alpha1::Component >(arena);
}
PROTOBUF_NAMESPACE_CLOSE

// @@protoc_insertion_point(global_scope)
#include <google/protobuf/port_undef.inc>
