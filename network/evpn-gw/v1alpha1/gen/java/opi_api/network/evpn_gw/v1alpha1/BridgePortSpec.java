// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: l2_xpu_infra_mgr.proto

package opi_api.network.evpn_gw.v1alpha1;

/**
 * <pre>
 * Bridge Port network configuration
 * </pre>
 *
 * Protobuf type {@code opi_api.network.evpn_gw.v1alpha1.BridgePortSpec}
 */
public final class BridgePortSpec extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:opi_api.network.evpn_gw.v1alpha1.BridgePortSpec)
    BridgePortSpecOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BridgePortSpec.newBuilder() to construct.
  private BridgePortSpec(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BridgePortSpec() {
    macAddress_ = com.google.protobuf.ByteString.EMPTY;
    ptype_ = 0;
    logicalBridges_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BridgePortSpec();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private BridgePortSpec(
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
          case 10: {

            macAddress_ = input.readBytes();
            break;
          }
          case 16: {
            int rawValue = input.readEnum();

            ptype_ = rawValue;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              logicalBridges_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            logicalBridges_.add(s);
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
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        logicalBridges_ = logicalBridges_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return opi_api.network.evpn_gw.v1alpha1.L2XpuInfraMgrProto.internal_static_opi_api_network_evpn_gw_v1alpha1_BridgePortSpec_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return opi_api.network.evpn_gw.v1alpha1.L2XpuInfraMgrProto.internal_static_opi_api_network_evpn_gw_v1alpha1_BridgePortSpec_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            opi_api.network.evpn_gw.v1alpha1.BridgePortSpec.class, opi_api.network.evpn_gw.v1alpha1.BridgePortSpec.Builder.class);
  }

  public static final int MAC_ADDRESS_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString macAddress_;
  /**
   * <pre>
   * Bridge Port's MAC address.
   * </pre>
   *
   * <code>bytes mac_address = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The macAddress.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getMacAddress() {
    return macAddress_;
  }

  public static final int PTYPE_FIELD_NUMBER = 2;
  private int ptype_;
  /**
   * <pre>
   * Type of Bridge Port
   * </pre>
   *
   * <code>.opi_api.network.evpn_gw.v1alpha1.BridgePortType ptype = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The enum numeric value on the wire for ptype.
   */
  @java.lang.Override public int getPtypeValue() {
    return ptype_;
  }
  /**
   * <pre>
   * Type of Bridge Port
   * </pre>
   *
   * <code>.opi_api.network.evpn_gw.v1alpha1.BridgePortType ptype = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The ptype.
   */
  @java.lang.Override public opi_api.network.evpn_gw.v1alpha1.BridgePortType getPtype() {
    @SuppressWarnings("deprecation")
    opi_api.network.evpn_gw.v1alpha1.BridgePortType result = opi_api.network.evpn_gw.v1alpha1.BridgePortType.valueOf(ptype_);
    return result == null ? opi_api.network.evpn_gw.v1alpha1.BridgePortType.UNRECOGNIZED : result;
  }

  public static final int LOGICAL_BRIDGES_FIELD_NUMBER = 3;
  private com.google.protobuf.LazyStringList logicalBridges_;
  /**
   * <pre>
   * List of Logical Bridges this Bridge Port will attach.
   * This will define the VLANs that will be enabled in this Bridge Port
   * </pre>
   *
   * <code>repeated string logical_bridges = 3;</code>
   * @return A list containing the logicalBridges.
   */
  public com.google.protobuf.ProtocolStringList
      getLogicalBridgesList() {
    return logicalBridges_;
  }
  /**
   * <pre>
   * List of Logical Bridges this Bridge Port will attach.
   * This will define the VLANs that will be enabled in this Bridge Port
   * </pre>
   *
   * <code>repeated string logical_bridges = 3;</code>
   * @return The count of logicalBridges.
   */
  public int getLogicalBridgesCount() {
    return logicalBridges_.size();
  }
  /**
   * <pre>
   * List of Logical Bridges this Bridge Port will attach.
   * This will define the VLANs that will be enabled in this Bridge Port
   * </pre>
   *
   * <code>repeated string logical_bridges = 3;</code>
   * @param index The index of the element to return.
   * @return The logicalBridges at the given index.
   */
  public java.lang.String getLogicalBridges(int index) {
    return logicalBridges_.get(index);
  }
  /**
   * <pre>
   * List of Logical Bridges this Bridge Port will attach.
   * This will define the VLANs that will be enabled in this Bridge Port
   * </pre>
   *
   * <code>repeated string logical_bridges = 3;</code>
   * @param index The index of the value to return.
   * @return The bytes of the logicalBridges at the given index.
   */
  public com.google.protobuf.ByteString
      getLogicalBridgesBytes(int index) {
    return logicalBridges_.getByteString(index);
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
    if (!macAddress_.isEmpty()) {
      output.writeBytes(1, macAddress_);
    }
    if (ptype_ != opi_api.network.evpn_gw.v1alpha1.BridgePortType.UNKNOWN.getNumber()) {
      output.writeEnum(2, ptype_);
    }
    for (int i = 0; i < logicalBridges_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, logicalBridges_.getRaw(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!macAddress_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(1, macAddress_);
    }
    if (ptype_ != opi_api.network.evpn_gw.v1alpha1.BridgePortType.UNKNOWN.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, ptype_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < logicalBridges_.size(); i++) {
        dataSize += computeStringSizeNoTag(logicalBridges_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getLogicalBridgesList().size();
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
    if (!(obj instanceof opi_api.network.evpn_gw.v1alpha1.BridgePortSpec)) {
      return super.equals(obj);
    }
    opi_api.network.evpn_gw.v1alpha1.BridgePortSpec other = (opi_api.network.evpn_gw.v1alpha1.BridgePortSpec) obj;

    if (!getMacAddress()
        .equals(other.getMacAddress())) return false;
    if (ptype_ != other.ptype_) return false;
    if (!getLogicalBridgesList()
        .equals(other.getLogicalBridgesList())) return false;
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
    hash = (37 * hash) + MAC_ADDRESS_FIELD_NUMBER;
    hash = (53 * hash) + getMacAddress().hashCode();
    hash = (37 * hash) + PTYPE_FIELD_NUMBER;
    hash = (53 * hash) + ptype_;
    if (getLogicalBridgesCount() > 0) {
      hash = (37 * hash) + LOGICAL_BRIDGES_FIELD_NUMBER;
      hash = (53 * hash) + getLogicalBridgesList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static opi_api.network.evpn_gw.v1alpha1.BridgePortSpec parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.network.evpn_gw.v1alpha1.BridgePortSpec parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.network.evpn_gw.v1alpha1.BridgePortSpec parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.network.evpn_gw.v1alpha1.BridgePortSpec parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.network.evpn_gw.v1alpha1.BridgePortSpec parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.network.evpn_gw.v1alpha1.BridgePortSpec parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.network.evpn_gw.v1alpha1.BridgePortSpec parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.network.evpn_gw.v1alpha1.BridgePortSpec parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.network.evpn_gw.v1alpha1.BridgePortSpec parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static opi_api.network.evpn_gw.v1alpha1.BridgePortSpec parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.network.evpn_gw.v1alpha1.BridgePortSpec parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.network.evpn_gw.v1alpha1.BridgePortSpec parseFrom(
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
  public static Builder newBuilder(opi_api.network.evpn_gw.v1alpha1.BridgePortSpec prototype) {
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
   * Bridge Port network configuration
   * </pre>
   *
   * Protobuf type {@code opi_api.network.evpn_gw.v1alpha1.BridgePortSpec}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:opi_api.network.evpn_gw.v1alpha1.BridgePortSpec)
      opi_api.network.evpn_gw.v1alpha1.BridgePortSpecOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return opi_api.network.evpn_gw.v1alpha1.L2XpuInfraMgrProto.internal_static_opi_api_network_evpn_gw_v1alpha1_BridgePortSpec_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return opi_api.network.evpn_gw.v1alpha1.L2XpuInfraMgrProto.internal_static_opi_api_network_evpn_gw_v1alpha1_BridgePortSpec_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              opi_api.network.evpn_gw.v1alpha1.BridgePortSpec.class, opi_api.network.evpn_gw.v1alpha1.BridgePortSpec.Builder.class);
    }

    // Construct using opi_api.network.evpn_gw.v1alpha1.BridgePortSpec.newBuilder()
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
      macAddress_ = com.google.protobuf.ByteString.EMPTY;

      ptype_ = 0;

      logicalBridges_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return opi_api.network.evpn_gw.v1alpha1.L2XpuInfraMgrProto.internal_static_opi_api_network_evpn_gw_v1alpha1_BridgePortSpec_descriptor;
    }

    @java.lang.Override
    public opi_api.network.evpn_gw.v1alpha1.BridgePortSpec getDefaultInstanceForType() {
      return opi_api.network.evpn_gw.v1alpha1.BridgePortSpec.getDefaultInstance();
    }

    @java.lang.Override
    public opi_api.network.evpn_gw.v1alpha1.BridgePortSpec build() {
      opi_api.network.evpn_gw.v1alpha1.BridgePortSpec result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public opi_api.network.evpn_gw.v1alpha1.BridgePortSpec buildPartial() {
      opi_api.network.evpn_gw.v1alpha1.BridgePortSpec result = new opi_api.network.evpn_gw.v1alpha1.BridgePortSpec(this);
      int from_bitField0_ = bitField0_;
      result.macAddress_ = macAddress_;
      result.ptype_ = ptype_;
      if (((bitField0_ & 0x00000001) != 0)) {
        logicalBridges_ = logicalBridges_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.logicalBridges_ = logicalBridges_;
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
      if (other instanceof opi_api.network.evpn_gw.v1alpha1.BridgePortSpec) {
        return mergeFrom((opi_api.network.evpn_gw.v1alpha1.BridgePortSpec)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(opi_api.network.evpn_gw.v1alpha1.BridgePortSpec other) {
      if (other == opi_api.network.evpn_gw.v1alpha1.BridgePortSpec.getDefaultInstance()) return this;
      if (other.getMacAddress() != com.google.protobuf.ByteString.EMPTY) {
        setMacAddress(other.getMacAddress());
      }
      if (other.ptype_ != 0) {
        setPtypeValue(other.getPtypeValue());
      }
      if (!other.logicalBridges_.isEmpty()) {
        if (logicalBridges_.isEmpty()) {
          logicalBridges_ = other.logicalBridges_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureLogicalBridgesIsMutable();
          logicalBridges_.addAll(other.logicalBridges_);
        }
        onChanged();
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
      opi_api.network.evpn_gw.v1alpha1.BridgePortSpec parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (opi_api.network.evpn_gw.v1alpha1.BridgePortSpec) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.ByteString macAddress_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <pre>
     * Bridge Port's MAC address.
     * </pre>
     *
     * <code>bytes mac_address = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The macAddress.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getMacAddress() {
      return macAddress_;
    }
    /**
     * <pre>
     * Bridge Port's MAC address.
     * </pre>
     *
     * <code>bytes mac_address = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The macAddress to set.
     * @return This builder for chaining.
     */
    public Builder setMacAddress(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      macAddress_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Bridge Port's MAC address.
     * </pre>
     *
     * <code>bytes mac_address = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearMacAddress() {
      
      macAddress_ = getDefaultInstance().getMacAddress();
      onChanged();
      return this;
    }

    private int ptype_ = 0;
    /**
     * <pre>
     * Type of Bridge Port
     * </pre>
     *
     * <code>.opi_api.network.evpn_gw.v1alpha1.BridgePortType ptype = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The enum numeric value on the wire for ptype.
     */
    @java.lang.Override public int getPtypeValue() {
      return ptype_;
    }
    /**
     * <pre>
     * Type of Bridge Port
     * </pre>
     *
     * <code>.opi_api.network.evpn_gw.v1alpha1.BridgePortType ptype = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The enum numeric value on the wire for ptype to set.
     * @return This builder for chaining.
     */
    public Builder setPtypeValue(int value) {
      
      ptype_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Type of Bridge Port
     * </pre>
     *
     * <code>.opi_api.network.evpn_gw.v1alpha1.BridgePortType ptype = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The ptype.
     */
    @java.lang.Override
    public opi_api.network.evpn_gw.v1alpha1.BridgePortType getPtype() {
      @SuppressWarnings("deprecation")
      opi_api.network.evpn_gw.v1alpha1.BridgePortType result = opi_api.network.evpn_gw.v1alpha1.BridgePortType.valueOf(ptype_);
      return result == null ? opi_api.network.evpn_gw.v1alpha1.BridgePortType.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Type of Bridge Port
     * </pre>
     *
     * <code>.opi_api.network.evpn_gw.v1alpha1.BridgePortType ptype = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The ptype to set.
     * @return This builder for chaining.
     */
    public Builder setPtype(opi_api.network.evpn_gw.v1alpha1.BridgePortType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      ptype_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Type of Bridge Port
     * </pre>
     *
     * <code>.opi_api.network.evpn_gw.v1alpha1.BridgePortType ptype = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearPtype() {
      
      ptype_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList logicalBridges_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureLogicalBridgesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        logicalBridges_ = new com.google.protobuf.LazyStringArrayList(logicalBridges_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <pre>
     * List of Logical Bridges this Bridge Port will attach.
     * This will define the VLANs that will be enabled in this Bridge Port
     * </pre>
     *
     * <code>repeated string logical_bridges = 3;</code>
     * @return A list containing the logicalBridges.
     */
    public com.google.protobuf.ProtocolStringList
        getLogicalBridgesList() {
      return logicalBridges_.getUnmodifiableView();
    }
    /**
     * <pre>
     * List of Logical Bridges this Bridge Port will attach.
     * This will define the VLANs that will be enabled in this Bridge Port
     * </pre>
     *
     * <code>repeated string logical_bridges = 3;</code>
     * @return The count of logicalBridges.
     */
    public int getLogicalBridgesCount() {
      return logicalBridges_.size();
    }
    /**
     * <pre>
     * List of Logical Bridges this Bridge Port will attach.
     * This will define the VLANs that will be enabled in this Bridge Port
     * </pre>
     *
     * <code>repeated string logical_bridges = 3;</code>
     * @param index The index of the element to return.
     * @return The logicalBridges at the given index.
     */
    public java.lang.String getLogicalBridges(int index) {
      return logicalBridges_.get(index);
    }
    /**
     * <pre>
     * List of Logical Bridges this Bridge Port will attach.
     * This will define the VLANs that will be enabled in this Bridge Port
     * </pre>
     *
     * <code>repeated string logical_bridges = 3;</code>
     * @param index The index of the value to return.
     * @return The bytes of the logicalBridges at the given index.
     */
    public com.google.protobuf.ByteString
        getLogicalBridgesBytes(int index) {
      return logicalBridges_.getByteString(index);
    }
    /**
     * <pre>
     * List of Logical Bridges this Bridge Port will attach.
     * This will define the VLANs that will be enabled in this Bridge Port
     * </pre>
     *
     * <code>repeated string logical_bridges = 3;</code>
     * @param index The index to set the value at.
     * @param value The logicalBridges to set.
     * @return This builder for chaining.
     */
    public Builder setLogicalBridges(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureLogicalBridgesIsMutable();
      logicalBridges_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * List of Logical Bridges this Bridge Port will attach.
     * This will define the VLANs that will be enabled in this Bridge Port
     * </pre>
     *
     * <code>repeated string logical_bridges = 3;</code>
     * @param value The logicalBridges to add.
     * @return This builder for chaining.
     */
    public Builder addLogicalBridges(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureLogicalBridgesIsMutable();
      logicalBridges_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * List of Logical Bridges this Bridge Port will attach.
     * This will define the VLANs that will be enabled in this Bridge Port
     * </pre>
     *
     * <code>repeated string logical_bridges = 3;</code>
     * @param values The logicalBridges to add.
     * @return This builder for chaining.
     */
    public Builder addAllLogicalBridges(
        java.lang.Iterable<java.lang.String> values) {
      ensureLogicalBridgesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, logicalBridges_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * List of Logical Bridges this Bridge Port will attach.
     * This will define the VLANs that will be enabled in this Bridge Port
     * </pre>
     *
     * <code>repeated string logical_bridges = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearLogicalBridges() {
      logicalBridges_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * List of Logical Bridges this Bridge Port will attach.
     * This will define the VLANs that will be enabled in this Bridge Port
     * </pre>
     *
     * <code>repeated string logical_bridges = 3;</code>
     * @param value The bytes of the logicalBridges to add.
     * @return This builder for chaining.
     */
    public Builder addLogicalBridgesBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureLogicalBridgesIsMutable();
      logicalBridges_.add(value);
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:opi_api.network.evpn_gw.v1alpha1.BridgePortSpec)
  }

  // @@protoc_insertion_point(class_scope:opi_api.network.evpn_gw.v1alpha1.BridgePortSpec)
  private static final opi_api.network.evpn_gw.v1alpha1.BridgePortSpec DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new opi_api.network.evpn_gw.v1alpha1.BridgePortSpec();
  }

  public static opi_api.network.evpn_gw.v1alpha1.BridgePortSpec getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BridgePortSpec>
      PARSER = new com.google.protobuf.AbstractParser<BridgePortSpec>() {
    @java.lang.Override
    public BridgePortSpec parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new BridgePortSpec(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<BridgePortSpec> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BridgePortSpec> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public opi_api.network.evpn_gw.v1alpha1.BridgePortSpec getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

