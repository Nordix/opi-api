// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: l3_xpu_infra_mgr.proto

package opi_api.network.evpn_gw.v1alpha1;

/**
 * <pre>
 * Vrf network configuration
 * </pre>
 *
 * Protobuf type {@code opi_api.network.evpn_gw.v1alpha1.VrfSpec}
 */
public final class VrfSpec extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:opi_api.network.evpn_gw.v1alpha1.VrfSpec)
    VrfSpecOrBuilder {
private static final long serialVersionUID = 0L;
  // Use VrfSpec.newBuilder() to construct.
  private VrfSpec(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private VrfSpec() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new VrfSpec();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private VrfSpec(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {
            bitField0_ |= 0x00000001;
            vni_ = input.readUInt32();
            break;
          }
          case 18: {
            opi_api.network.opinetcommon.v1alpha1.IPPrefix.Builder subBuilder = null;
            if (loopbackIpPrefix_ != null) {
              subBuilder = loopbackIpPrefix_.toBuilder();
            }
            loopbackIpPrefix_ = input.readMessage(opi_api.network.opinetcommon.v1alpha1.IPPrefix.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(loopbackIpPrefix_);
              loopbackIpPrefix_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            opi_api.network.opinetcommon.v1alpha1.IPPrefix.Builder subBuilder = null;
            if (vtepIpPrefix_ != null) {
              subBuilder = vtepIpPrefix_.toBuilder();
            }
            vtepIpPrefix_ = input.readMessage(opi_api.network.opinetcommon.v1alpha1.IPPrefix.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(vtepIpPrefix_);
              vtepIpPrefix_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return opi_api.network.evpn_gw.v1alpha1.L3XpuInfraMgrProto.internal_static_opi_api_network_evpn_gw_v1alpha1_VrfSpec_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return opi_api.network.evpn_gw.v1alpha1.L3XpuInfraMgrProto.internal_static_opi_api_network_evpn_gw_v1alpha1_VrfSpec_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            opi_api.network.evpn_gw.v1alpha1.VrfSpec.class, opi_api.network.evpn_gw.v1alpha1.VrfSpec.Builder.class);
  }

  private int bitField0_;
  public static final int VNI_FIELD_NUMBER = 1;
  private int vni_;
  /**
   * <pre>
   * VXLAN VNI for L3 EVPN. Also used as EVPN route target
   * (-- api-linter: core::0141::forbidden-types=disabled
   *     aip.dev/not-precedent: vni cannot be negative number. --)
   * </pre>
   *
   * <code>optional uint32 vni = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the vni field is set.
   */
  @java.lang.Override
  public boolean hasVni() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * VXLAN VNI for L3 EVPN. Also used as EVPN route target
   * (-- api-linter: core::0141::forbidden-types=disabled
   *     aip.dev/not-precedent: vni cannot be negative number. --)
   * </pre>
   *
   * <code>optional uint32 vni = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The vni.
   */
  @java.lang.Override
  public int getVni() {
    return vni_;
  }

  public static final int LOOPBACK_IP_PREFIX_FIELD_NUMBER = 2;
  private opi_api.network.opinetcommon.v1alpha1.IPPrefix loopbackIpPrefix_;
  /**
   * <pre>
   * IPv4 or IPv6 loopback address prefix. Also serves as basis for RD in FRR
   * </pre>
   *
   * <code>.opi_api.network.opinetcommon.v1alpha1.IPPrefix loopback_ip_prefix = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the loopbackIpPrefix field is set.
   */
  @java.lang.Override
  public boolean hasLoopbackIpPrefix() {
    return loopbackIpPrefix_ != null;
  }
  /**
   * <pre>
   * IPv4 or IPv6 loopback address prefix. Also serves as basis for RD in FRR
   * </pre>
   *
   * <code>.opi_api.network.opinetcommon.v1alpha1.IPPrefix loopback_ip_prefix = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The loopbackIpPrefix.
   */
  @java.lang.Override
  public opi_api.network.opinetcommon.v1alpha1.IPPrefix getLoopbackIpPrefix() {
    return loopbackIpPrefix_ == null ? opi_api.network.opinetcommon.v1alpha1.IPPrefix.getDefaultInstance() : loopbackIpPrefix_;
  }
  /**
   * <pre>
   * IPv4 or IPv6 loopback address prefix. Also serves as basis for RD in FRR
   * </pre>
   *
   * <code>.opi_api.network.opinetcommon.v1alpha1.IPPrefix loopback_ip_prefix = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public opi_api.network.opinetcommon.v1alpha1.IPPrefixOrBuilder getLoopbackIpPrefixOrBuilder() {
    return getLoopbackIpPrefix();
  }

  public static final int VTEP_IP_PREFIX_FIELD_NUMBER = 3;
  private opi_api.network.opinetcommon.v1alpha1.IPPrefix vtepIpPrefix_;
  /**
   * <pre>
   * IPv4 or IPv6 IP address prefix for the VXLAN TEP
   * </pre>
   *
   * <code>.opi_api.network.opinetcommon.v1alpha1.IPPrefix vtep_ip_prefix = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the vtepIpPrefix field is set.
   */
  @java.lang.Override
  public boolean hasVtepIpPrefix() {
    return vtepIpPrefix_ != null;
  }
  /**
   * <pre>
   * IPv4 or IPv6 IP address prefix for the VXLAN TEP
   * </pre>
   *
   * <code>.opi_api.network.opinetcommon.v1alpha1.IPPrefix vtep_ip_prefix = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The vtepIpPrefix.
   */
  @java.lang.Override
  public opi_api.network.opinetcommon.v1alpha1.IPPrefix getVtepIpPrefix() {
    return vtepIpPrefix_ == null ? opi_api.network.opinetcommon.v1alpha1.IPPrefix.getDefaultInstance() : vtepIpPrefix_;
  }
  /**
   * <pre>
   * IPv4 or IPv6 IP address prefix for the VXLAN TEP
   * </pre>
   *
   * <code>.opi_api.network.opinetcommon.v1alpha1.IPPrefix vtep_ip_prefix = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  @java.lang.Override
  public opi_api.network.opinetcommon.v1alpha1.IPPrefixOrBuilder getVtepIpPrefixOrBuilder() {
    return getVtepIpPrefix();
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeUInt32(1, vni_);
    }
    if (loopbackIpPrefix_ != null) {
      output.writeMessage(2, getLoopbackIpPrefix());
    }
    if (vtepIpPrefix_ != null) {
      output.writeMessage(3, getVtepIpPrefix());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(1, vni_);
    }
    if (loopbackIpPrefix_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getLoopbackIpPrefix());
    }
    if (vtepIpPrefix_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getVtepIpPrefix());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof opi_api.network.evpn_gw.v1alpha1.VrfSpec)) {
      return super.equals(obj);
    }
    opi_api.network.evpn_gw.v1alpha1.VrfSpec other = (opi_api.network.evpn_gw.v1alpha1.VrfSpec) obj;

    if (hasVni() != other.hasVni()) return false;
    if (hasVni()) {
      if (getVni()
          != other.getVni()) return false;
    }
    if (hasLoopbackIpPrefix() != other.hasLoopbackIpPrefix()) return false;
    if (hasLoopbackIpPrefix()) {
      if (!getLoopbackIpPrefix()
          .equals(other.getLoopbackIpPrefix())) return false;
    }
    if (hasVtepIpPrefix() != other.hasVtepIpPrefix()) return false;
    if (hasVtepIpPrefix()) {
      if (!getVtepIpPrefix()
          .equals(other.getVtepIpPrefix())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasVni()) {
      hash = (37 * hash) + VNI_FIELD_NUMBER;
      hash = (53 * hash) + getVni();
    }
    if (hasLoopbackIpPrefix()) {
      hash = (37 * hash) + LOOPBACK_IP_PREFIX_FIELD_NUMBER;
      hash = (53 * hash) + getLoopbackIpPrefix().hashCode();
    }
    if (hasVtepIpPrefix()) {
      hash = (37 * hash) + VTEP_IP_PREFIX_FIELD_NUMBER;
      hash = (53 * hash) + getVtepIpPrefix().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static opi_api.network.evpn_gw.v1alpha1.VrfSpec parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.network.evpn_gw.v1alpha1.VrfSpec parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.network.evpn_gw.v1alpha1.VrfSpec parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.network.evpn_gw.v1alpha1.VrfSpec parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.network.evpn_gw.v1alpha1.VrfSpec parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.network.evpn_gw.v1alpha1.VrfSpec parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.network.evpn_gw.v1alpha1.VrfSpec parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.network.evpn_gw.v1alpha1.VrfSpec parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.network.evpn_gw.v1alpha1.VrfSpec parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static opi_api.network.evpn_gw.v1alpha1.VrfSpec parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.network.evpn_gw.v1alpha1.VrfSpec parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.network.evpn_gw.v1alpha1.VrfSpec parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(opi_api.network.evpn_gw.v1alpha1.VrfSpec prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Vrf network configuration
   * </pre>
   *
   * Protobuf type {@code opi_api.network.evpn_gw.v1alpha1.VrfSpec}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:opi_api.network.evpn_gw.v1alpha1.VrfSpec)
      opi_api.network.evpn_gw.v1alpha1.VrfSpecOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return opi_api.network.evpn_gw.v1alpha1.L3XpuInfraMgrProto.internal_static_opi_api_network_evpn_gw_v1alpha1_VrfSpec_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return opi_api.network.evpn_gw.v1alpha1.L3XpuInfraMgrProto.internal_static_opi_api_network_evpn_gw_v1alpha1_VrfSpec_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              opi_api.network.evpn_gw.v1alpha1.VrfSpec.class, opi_api.network.evpn_gw.v1alpha1.VrfSpec.Builder.class);
    }

    // Construct using opi_api.network.evpn_gw.v1alpha1.VrfSpec.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      vni_ = 0;
      bitField0_ = (bitField0_ & ~0x00000001);
      if (loopbackIpPrefixBuilder_ == null) {
        loopbackIpPrefix_ = null;
      } else {
        loopbackIpPrefix_ = null;
        loopbackIpPrefixBuilder_ = null;
      }
      if (vtepIpPrefixBuilder_ == null) {
        vtepIpPrefix_ = null;
      } else {
        vtepIpPrefix_ = null;
        vtepIpPrefixBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return opi_api.network.evpn_gw.v1alpha1.L3XpuInfraMgrProto.internal_static_opi_api_network_evpn_gw_v1alpha1_VrfSpec_descriptor;
    }

    @java.lang.Override
    public opi_api.network.evpn_gw.v1alpha1.VrfSpec getDefaultInstanceForType() {
      return opi_api.network.evpn_gw.v1alpha1.VrfSpec.getDefaultInstance();
    }

    @java.lang.Override
    public opi_api.network.evpn_gw.v1alpha1.VrfSpec build() {
      opi_api.network.evpn_gw.v1alpha1.VrfSpec result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public opi_api.network.evpn_gw.v1alpha1.VrfSpec buildPartial() {
      opi_api.network.evpn_gw.v1alpha1.VrfSpec result = new opi_api.network.evpn_gw.v1alpha1.VrfSpec(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.vni_ = vni_;
        to_bitField0_ |= 0x00000001;
      }
      if (loopbackIpPrefixBuilder_ == null) {
        result.loopbackIpPrefix_ = loopbackIpPrefix_;
      } else {
        result.loopbackIpPrefix_ = loopbackIpPrefixBuilder_.build();
      }
      if (vtepIpPrefixBuilder_ == null) {
        result.vtepIpPrefix_ = vtepIpPrefix_;
      } else {
        result.vtepIpPrefix_ = vtepIpPrefixBuilder_.build();
      }
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof opi_api.network.evpn_gw.v1alpha1.VrfSpec) {
        return mergeFrom((opi_api.network.evpn_gw.v1alpha1.VrfSpec)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(opi_api.network.evpn_gw.v1alpha1.VrfSpec other) {
      if (other == opi_api.network.evpn_gw.v1alpha1.VrfSpec.getDefaultInstance()) return this;
      if (other.hasVni()) {
        setVni(other.getVni());
      }
      if (other.hasLoopbackIpPrefix()) {
        mergeLoopbackIpPrefix(other.getLoopbackIpPrefix());
      }
      if (other.hasVtepIpPrefix()) {
        mergeVtepIpPrefix(other.getVtepIpPrefix());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      opi_api.network.evpn_gw.v1alpha1.VrfSpec parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (opi_api.network.evpn_gw.v1alpha1.VrfSpec) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int vni_ ;
    /**
     * <pre>
     * VXLAN VNI for L3 EVPN. Also used as EVPN route target
     * (-- api-linter: core::0141::forbidden-types=disabled
     *     aip.dev/not-precedent: vni cannot be negative number. --)
     * </pre>
     *
     * <code>optional uint32 vni = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return Whether the vni field is set.
     */
    @java.lang.Override
    public boolean hasVni() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * VXLAN VNI for L3 EVPN. Also used as EVPN route target
     * (-- api-linter: core::0141::forbidden-types=disabled
     *     aip.dev/not-precedent: vni cannot be negative number. --)
     * </pre>
     *
     * <code>optional uint32 vni = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return The vni.
     */
    @java.lang.Override
    public int getVni() {
      return vni_;
    }
    /**
     * <pre>
     * VXLAN VNI for L3 EVPN. Also used as EVPN route target
     * (-- api-linter: core::0141::forbidden-types=disabled
     *     aip.dev/not-precedent: vni cannot be negative number. --)
     * </pre>
     *
     * <code>optional uint32 vni = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param value The vni to set.
     * @return This builder for chaining.
     */
    public Builder setVni(int value) {
      bitField0_ |= 0x00000001;
      vni_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * VXLAN VNI for L3 EVPN. Also used as EVPN route target
     * (-- api-linter: core::0141::forbidden-types=disabled
     *     aip.dev/not-precedent: vni cannot be negative number. --)
     * </pre>
     *
     * <code>optional uint32 vni = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return This builder for chaining.
     */
    public Builder clearVni() {
      bitField0_ = (bitField0_ & ~0x00000001);
      vni_ = 0;
      onChanged();
      return this;
    }

    private opi_api.network.opinetcommon.v1alpha1.IPPrefix loopbackIpPrefix_;
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.network.opinetcommon.v1alpha1.IPPrefix, opi_api.network.opinetcommon.v1alpha1.IPPrefix.Builder, opi_api.network.opinetcommon.v1alpha1.IPPrefixOrBuilder> loopbackIpPrefixBuilder_;
    /**
     * <pre>
     * IPv4 or IPv6 loopback address prefix. Also serves as basis for RD in FRR
     * </pre>
     *
     * <code>.opi_api.network.opinetcommon.v1alpha1.IPPrefix loopback_ip_prefix = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the loopbackIpPrefix field is set.
     */
    public boolean hasLoopbackIpPrefix() {
      return loopbackIpPrefixBuilder_ != null || loopbackIpPrefix_ != null;
    }
    /**
     * <pre>
     * IPv4 or IPv6 loopback address prefix. Also serves as basis for RD in FRR
     * </pre>
     *
     * <code>.opi_api.network.opinetcommon.v1alpha1.IPPrefix loopback_ip_prefix = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The loopbackIpPrefix.
     */
    public opi_api.network.opinetcommon.v1alpha1.IPPrefix getLoopbackIpPrefix() {
      if (loopbackIpPrefixBuilder_ == null) {
        return loopbackIpPrefix_ == null ? opi_api.network.opinetcommon.v1alpha1.IPPrefix.getDefaultInstance() : loopbackIpPrefix_;
      } else {
        return loopbackIpPrefixBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * IPv4 or IPv6 loopback address prefix. Also serves as basis for RD in FRR
     * </pre>
     *
     * <code>.opi_api.network.opinetcommon.v1alpha1.IPPrefix loopback_ip_prefix = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setLoopbackIpPrefix(opi_api.network.opinetcommon.v1alpha1.IPPrefix value) {
      if (loopbackIpPrefixBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        loopbackIpPrefix_ = value;
        onChanged();
      } else {
        loopbackIpPrefixBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * IPv4 or IPv6 loopback address prefix. Also serves as basis for RD in FRR
     * </pre>
     *
     * <code>.opi_api.network.opinetcommon.v1alpha1.IPPrefix loopback_ip_prefix = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setLoopbackIpPrefix(
        opi_api.network.opinetcommon.v1alpha1.IPPrefix.Builder builderForValue) {
      if (loopbackIpPrefixBuilder_ == null) {
        loopbackIpPrefix_ = builderForValue.build();
        onChanged();
      } else {
        loopbackIpPrefixBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * IPv4 or IPv6 loopback address prefix. Also serves as basis for RD in FRR
     * </pre>
     *
     * <code>.opi_api.network.opinetcommon.v1alpha1.IPPrefix loopback_ip_prefix = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeLoopbackIpPrefix(opi_api.network.opinetcommon.v1alpha1.IPPrefix value) {
      if (loopbackIpPrefixBuilder_ == null) {
        if (loopbackIpPrefix_ != null) {
          loopbackIpPrefix_ =
            opi_api.network.opinetcommon.v1alpha1.IPPrefix.newBuilder(loopbackIpPrefix_).mergeFrom(value).buildPartial();
        } else {
          loopbackIpPrefix_ = value;
        }
        onChanged();
      } else {
        loopbackIpPrefixBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * IPv4 or IPv6 loopback address prefix. Also serves as basis for RD in FRR
     * </pre>
     *
     * <code>.opi_api.network.opinetcommon.v1alpha1.IPPrefix loopback_ip_prefix = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearLoopbackIpPrefix() {
      if (loopbackIpPrefixBuilder_ == null) {
        loopbackIpPrefix_ = null;
        onChanged();
      } else {
        loopbackIpPrefix_ = null;
        loopbackIpPrefixBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * IPv4 or IPv6 loopback address prefix. Also serves as basis for RD in FRR
     * </pre>
     *
     * <code>.opi_api.network.opinetcommon.v1alpha1.IPPrefix loopback_ip_prefix = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public opi_api.network.opinetcommon.v1alpha1.IPPrefix.Builder getLoopbackIpPrefixBuilder() {
      
      onChanged();
      return getLoopbackIpPrefixFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * IPv4 or IPv6 loopback address prefix. Also serves as basis for RD in FRR
     * </pre>
     *
     * <code>.opi_api.network.opinetcommon.v1alpha1.IPPrefix loopback_ip_prefix = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public opi_api.network.opinetcommon.v1alpha1.IPPrefixOrBuilder getLoopbackIpPrefixOrBuilder() {
      if (loopbackIpPrefixBuilder_ != null) {
        return loopbackIpPrefixBuilder_.getMessageOrBuilder();
      } else {
        return loopbackIpPrefix_ == null ?
            opi_api.network.opinetcommon.v1alpha1.IPPrefix.getDefaultInstance() : loopbackIpPrefix_;
      }
    }
    /**
     * <pre>
     * IPv4 or IPv6 loopback address prefix. Also serves as basis for RD in FRR
     * </pre>
     *
     * <code>.opi_api.network.opinetcommon.v1alpha1.IPPrefix loopback_ip_prefix = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.network.opinetcommon.v1alpha1.IPPrefix, opi_api.network.opinetcommon.v1alpha1.IPPrefix.Builder, opi_api.network.opinetcommon.v1alpha1.IPPrefixOrBuilder> 
        getLoopbackIpPrefixFieldBuilder() {
      if (loopbackIpPrefixBuilder_ == null) {
        loopbackIpPrefixBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            opi_api.network.opinetcommon.v1alpha1.IPPrefix, opi_api.network.opinetcommon.v1alpha1.IPPrefix.Builder, opi_api.network.opinetcommon.v1alpha1.IPPrefixOrBuilder>(
                getLoopbackIpPrefix(),
                getParentForChildren(),
                isClean());
        loopbackIpPrefix_ = null;
      }
      return loopbackIpPrefixBuilder_;
    }

    private opi_api.network.opinetcommon.v1alpha1.IPPrefix vtepIpPrefix_;
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.network.opinetcommon.v1alpha1.IPPrefix, opi_api.network.opinetcommon.v1alpha1.IPPrefix.Builder, opi_api.network.opinetcommon.v1alpha1.IPPrefixOrBuilder> vtepIpPrefixBuilder_;
    /**
     * <pre>
     * IPv4 or IPv6 IP address prefix for the VXLAN TEP
     * </pre>
     *
     * <code>.opi_api.network.opinetcommon.v1alpha1.IPPrefix vtep_ip_prefix = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return Whether the vtepIpPrefix field is set.
     */
    public boolean hasVtepIpPrefix() {
      return vtepIpPrefixBuilder_ != null || vtepIpPrefix_ != null;
    }
    /**
     * <pre>
     * IPv4 or IPv6 IP address prefix for the VXLAN TEP
     * </pre>
     *
     * <code>.opi_api.network.opinetcommon.v1alpha1.IPPrefix vtep_ip_prefix = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return The vtepIpPrefix.
     */
    public opi_api.network.opinetcommon.v1alpha1.IPPrefix getVtepIpPrefix() {
      if (vtepIpPrefixBuilder_ == null) {
        return vtepIpPrefix_ == null ? opi_api.network.opinetcommon.v1alpha1.IPPrefix.getDefaultInstance() : vtepIpPrefix_;
      } else {
        return vtepIpPrefixBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * IPv4 or IPv6 IP address prefix for the VXLAN TEP
     * </pre>
     *
     * <code>.opi_api.network.opinetcommon.v1alpha1.IPPrefix vtep_ip_prefix = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public Builder setVtepIpPrefix(opi_api.network.opinetcommon.v1alpha1.IPPrefix value) {
      if (vtepIpPrefixBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        vtepIpPrefix_ = value;
        onChanged();
      } else {
        vtepIpPrefixBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * IPv4 or IPv6 IP address prefix for the VXLAN TEP
     * </pre>
     *
     * <code>.opi_api.network.opinetcommon.v1alpha1.IPPrefix vtep_ip_prefix = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public Builder setVtepIpPrefix(
        opi_api.network.opinetcommon.v1alpha1.IPPrefix.Builder builderForValue) {
      if (vtepIpPrefixBuilder_ == null) {
        vtepIpPrefix_ = builderForValue.build();
        onChanged();
      } else {
        vtepIpPrefixBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * IPv4 or IPv6 IP address prefix for the VXLAN TEP
     * </pre>
     *
     * <code>.opi_api.network.opinetcommon.v1alpha1.IPPrefix vtep_ip_prefix = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public Builder mergeVtepIpPrefix(opi_api.network.opinetcommon.v1alpha1.IPPrefix value) {
      if (vtepIpPrefixBuilder_ == null) {
        if (vtepIpPrefix_ != null) {
          vtepIpPrefix_ =
            opi_api.network.opinetcommon.v1alpha1.IPPrefix.newBuilder(vtepIpPrefix_).mergeFrom(value).buildPartial();
        } else {
          vtepIpPrefix_ = value;
        }
        onChanged();
      } else {
        vtepIpPrefixBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * IPv4 or IPv6 IP address prefix for the VXLAN TEP
     * </pre>
     *
     * <code>.opi_api.network.opinetcommon.v1alpha1.IPPrefix vtep_ip_prefix = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public Builder clearVtepIpPrefix() {
      if (vtepIpPrefixBuilder_ == null) {
        vtepIpPrefix_ = null;
        onChanged();
      } else {
        vtepIpPrefix_ = null;
        vtepIpPrefixBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * IPv4 or IPv6 IP address prefix for the VXLAN TEP
     * </pre>
     *
     * <code>.opi_api.network.opinetcommon.v1alpha1.IPPrefix vtep_ip_prefix = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public opi_api.network.opinetcommon.v1alpha1.IPPrefix.Builder getVtepIpPrefixBuilder() {
      
      onChanged();
      return getVtepIpPrefixFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * IPv4 or IPv6 IP address prefix for the VXLAN TEP
     * </pre>
     *
     * <code>.opi_api.network.opinetcommon.v1alpha1.IPPrefix vtep_ip_prefix = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public opi_api.network.opinetcommon.v1alpha1.IPPrefixOrBuilder getVtepIpPrefixOrBuilder() {
      if (vtepIpPrefixBuilder_ != null) {
        return vtepIpPrefixBuilder_.getMessageOrBuilder();
      } else {
        return vtepIpPrefix_ == null ?
            opi_api.network.opinetcommon.v1alpha1.IPPrefix.getDefaultInstance() : vtepIpPrefix_;
      }
    }
    /**
     * <pre>
     * IPv4 or IPv6 IP address prefix for the VXLAN TEP
     * </pre>
     *
     * <code>.opi_api.network.opinetcommon.v1alpha1.IPPrefix vtep_ip_prefix = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.network.opinetcommon.v1alpha1.IPPrefix, opi_api.network.opinetcommon.v1alpha1.IPPrefix.Builder, opi_api.network.opinetcommon.v1alpha1.IPPrefixOrBuilder> 
        getVtepIpPrefixFieldBuilder() {
      if (vtepIpPrefixBuilder_ == null) {
        vtepIpPrefixBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            opi_api.network.opinetcommon.v1alpha1.IPPrefix, opi_api.network.opinetcommon.v1alpha1.IPPrefix.Builder, opi_api.network.opinetcommon.v1alpha1.IPPrefixOrBuilder>(
                getVtepIpPrefix(),
                getParentForChildren(),
                isClean());
        vtepIpPrefix_ = null;
      }
      return vtepIpPrefixBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:opi_api.network.evpn_gw.v1alpha1.VrfSpec)
  }

  // @@protoc_insertion_point(class_scope:opi_api.network.evpn_gw.v1alpha1.VrfSpec)
  private static final opi_api.network.evpn_gw.v1alpha1.VrfSpec DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new opi_api.network.evpn_gw.v1alpha1.VrfSpec();
  }

  public static opi_api.network.evpn_gw.v1alpha1.VrfSpec getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VrfSpec>
      PARSER = new com.google.protobuf.AbstractParser<VrfSpec>() {
    @java.lang.Override
    public VrfSpec parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new VrfSpec(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<VrfSpec> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VrfSpec> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public opi_api.network.evpn_gw.v1alpha1.VrfSpec getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

