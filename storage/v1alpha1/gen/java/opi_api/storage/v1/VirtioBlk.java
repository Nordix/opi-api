// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: frontend_virtio_blk.proto

package opi_api.storage.v1;

/**
 * Protobuf type {@code opi_api.storage.v1.VirtioBlk}
 */
public final class VirtioBlk extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:opi_api.storage.v1.VirtioBlk)
    VirtioBlkOrBuilder {
private static final long serialVersionUID = 0L;
  // Use VirtioBlk.newBuilder() to construct.
  private VirtioBlk(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private VirtioBlk() {
    name_ = "";
    bdev_ = "";
    serialNumber_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new VirtioBlk();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private VirtioBlk(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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

            id_ = input.readInt64();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            name_ = s;
            break;
          }
          case 26: {
            opi_api.storage.v1.NvmeControllerPciId.Builder subBuilder = null;
            if (pcieId_ != null) {
              subBuilder = pcieId_.toBuilder();
            }
            pcieId_ = input.readMessage(opi_api.storage.v1.NvmeControllerPciId.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(pcieId_);
              pcieId_ = subBuilder.buildPartial();
            }

            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            bdev_ = s;
            break;
          }
          case 40: {

            maxIoQps_ = input.readInt64();
            break;
          }
          case 50: {
            java.lang.String s = input.readStringRequireUtf8();

            serialNumber_ = s;
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return opi_api.storage.v1.FrontendVirtioBlkProto.internal_static_opi_api_storage_v1_VirtioBlk_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return opi_api.storage.v1.FrontendVirtioBlkProto.internal_static_opi_api_storage_v1_VirtioBlk_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            opi_api.storage.v1.VirtioBlk.class, opi_api.storage.v1.VirtioBlk.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private long id_;
  /**
   * <code>int64 id = 1;</code>
   * @return The id.
   */
  @java.lang.Override
  public long getId() {
    return id_;
  }

  public static final int NAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object name_;
  /**
   * <code>string name = 2;</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <code>string name = 2;</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PCIE_ID_FIELD_NUMBER = 3;
  private opi_api.storage.v1.NvmeControllerPciId pcieId_;
  /**
   * <code>.opi_api.storage.v1.NvmeControllerPciId pcie_id = 3;</code>
   * @return Whether the pcieId field is set.
   */
  @java.lang.Override
  public boolean hasPcieId() {
    return pcieId_ != null;
  }
  /**
   * <code>.opi_api.storage.v1.NvmeControllerPciId pcie_id = 3;</code>
   * @return The pcieId.
   */
  @java.lang.Override
  public opi_api.storage.v1.NvmeControllerPciId getPcieId() {
    return pcieId_ == null ? opi_api.storage.v1.NvmeControllerPciId.getDefaultInstance() : pcieId_;
  }
  /**
   * <code>.opi_api.storage.v1.NvmeControllerPciId pcie_id = 3;</code>
   */
  @java.lang.Override
  public opi_api.storage.v1.NvmeControllerPciIdOrBuilder getPcieIdOrBuilder() {
    return getPcieId();
  }

  public static final int BDEV_FIELD_NUMBER = 4;
  private volatile java.lang.Object bdev_;
  /**
   * <code>string bdev = 4;</code>
   * @return The bdev.
   */
  @java.lang.Override
  public java.lang.String getBdev() {
    java.lang.Object ref = bdev_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      bdev_ = s;
      return s;
    }
  }
  /**
   * <code>string bdev = 4;</code>
   * @return The bytes for bdev.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getBdevBytes() {
    java.lang.Object ref = bdev_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      bdev_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MAX_IO_QPS_FIELD_NUMBER = 5;
  private long maxIoQps_;
  /**
   * <code>int64 max_io_qps = 5;</code>
   * @return The maxIoQps.
   */
  @java.lang.Override
  public long getMaxIoQps() {
    return maxIoQps_;
  }

  public static final int SERIAL_NUMBER_FIELD_NUMBER = 6;
  private volatile java.lang.Object serialNumber_;
  /**
   * <code>string serial_number = 6;</code>
   * @return The serialNumber.
   */
  @java.lang.Override
  public java.lang.String getSerialNumber() {
    java.lang.Object ref = serialNumber_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      serialNumber_ = s;
      return s;
    }
  }
  /**
   * <code>string serial_number = 6;</code>
   * @return The bytes for serialNumber.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSerialNumberBytes() {
    java.lang.Object ref = serialNumber_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      serialNumber_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (id_ != 0L) {
      output.writeInt64(1, id_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, name_);
    }
    if (pcieId_ != null) {
      output.writeMessage(3, getPcieId());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(bdev_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, bdev_);
    }
    if (maxIoQps_ != 0L) {
      output.writeInt64(5, maxIoQps_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(serialNumber_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 6, serialNumber_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (id_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, id_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, name_);
    }
    if (pcieId_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getPcieId());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(bdev_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, bdev_);
    }
    if (maxIoQps_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(5, maxIoQps_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(serialNumber_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, serialNumber_);
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
    if (!(obj instanceof opi_api.storage.v1.VirtioBlk)) {
      return super.equals(obj);
    }
    opi_api.storage.v1.VirtioBlk other = (opi_api.storage.v1.VirtioBlk) obj;

    if (getId()
        != other.getId()) return false;
    if (!getName()
        .equals(other.getName())) return false;
    if (hasPcieId() != other.hasPcieId()) return false;
    if (hasPcieId()) {
      if (!getPcieId()
          .equals(other.getPcieId())) return false;
    }
    if (!getBdev()
        .equals(other.getBdev())) return false;
    if (getMaxIoQps()
        != other.getMaxIoQps()) return false;
    if (!getSerialNumber()
        .equals(other.getSerialNumber())) return false;
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
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getId());
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    if (hasPcieId()) {
      hash = (37 * hash) + PCIE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getPcieId().hashCode();
    }
    hash = (37 * hash) + BDEV_FIELD_NUMBER;
    hash = (53 * hash) + getBdev().hashCode();
    hash = (37 * hash) + MAX_IO_QPS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getMaxIoQps());
    hash = (37 * hash) + SERIAL_NUMBER_FIELD_NUMBER;
    hash = (53 * hash) + getSerialNumber().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static opi_api.storage.v1.VirtioBlk parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.VirtioBlk parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.VirtioBlk parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.VirtioBlk parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.VirtioBlk parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.VirtioBlk parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.VirtioBlk parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.VirtioBlk parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.storage.v1.VirtioBlk parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.VirtioBlk parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.storage.v1.VirtioBlk parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.VirtioBlk parseFrom(
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
  public static Builder newBuilder(opi_api.storage.v1.VirtioBlk prototype) {
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
   * Protobuf type {@code opi_api.storage.v1.VirtioBlk}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:opi_api.storage.v1.VirtioBlk)
      opi_api.storage.v1.VirtioBlkOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return opi_api.storage.v1.FrontendVirtioBlkProto.internal_static_opi_api_storage_v1_VirtioBlk_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return opi_api.storage.v1.FrontendVirtioBlkProto.internal_static_opi_api_storage_v1_VirtioBlk_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              opi_api.storage.v1.VirtioBlk.class, opi_api.storage.v1.VirtioBlk.Builder.class);
    }

    // Construct using opi_api.storage.v1.VirtioBlk.newBuilder()
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
      id_ = 0L;

      name_ = "";

      if (pcieIdBuilder_ == null) {
        pcieId_ = null;
      } else {
        pcieId_ = null;
        pcieIdBuilder_ = null;
      }
      bdev_ = "";

      maxIoQps_ = 0L;

      serialNumber_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return opi_api.storage.v1.FrontendVirtioBlkProto.internal_static_opi_api_storage_v1_VirtioBlk_descriptor;
    }

    @java.lang.Override
    public opi_api.storage.v1.VirtioBlk getDefaultInstanceForType() {
      return opi_api.storage.v1.VirtioBlk.getDefaultInstance();
    }

    @java.lang.Override
    public opi_api.storage.v1.VirtioBlk build() {
      opi_api.storage.v1.VirtioBlk result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public opi_api.storage.v1.VirtioBlk buildPartial() {
      opi_api.storage.v1.VirtioBlk result = new opi_api.storage.v1.VirtioBlk(this);
      result.id_ = id_;
      result.name_ = name_;
      if (pcieIdBuilder_ == null) {
        result.pcieId_ = pcieId_;
      } else {
        result.pcieId_ = pcieIdBuilder_.build();
      }
      result.bdev_ = bdev_;
      result.maxIoQps_ = maxIoQps_;
      result.serialNumber_ = serialNumber_;
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
      if (other instanceof opi_api.storage.v1.VirtioBlk) {
        return mergeFrom((opi_api.storage.v1.VirtioBlk)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(opi_api.storage.v1.VirtioBlk other) {
      if (other == opi_api.storage.v1.VirtioBlk.getDefaultInstance()) return this;
      if (other.getId() != 0L) {
        setId(other.getId());
      }
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (other.hasPcieId()) {
        mergePcieId(other.getPcieId());
      }
      if (!other.getBdev().isEmpty()) {
        bdev_ = other.bdev_;
        onChanged();
      }
      if (other.getMaxIoQps() != 0L) {
        setMaxIoQps(other.getMaxIoQps());
      }
      if (!other.getSerialNumber().isEmpty()) {
        serialNumber_ = other.serialNumber_;
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
      opi_api.storage.v1.VirtioBlk parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (opi_api.storage.v1.VirtioBlk) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long id_ ;
    /**
     * <code>int64 id = 1;</code>
     * @return The id.
     */
    @java.lang.Override
    public long getId() {
      return id_;
    }
    /**
     * <code>int64 id = 1;</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(long value) {
      
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      
      id_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <code>string name = 2;</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string name = 2;</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string name = 2;</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string name = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <code>string name = 2;</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }

    private opi_api.storage.v1.NvmeControllerPciId pcieId_;
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.storage.v1.NvmeControllerPciId, opi_api.storage.v1.NvmeControllerPciId.Builder, opi_api.storage.v1.NvmeControllerPciIdOrBuilder> pcieIdBuilder_;
    /**
     * <code>.opi_api.storage.v1.NvmeControllerPciId pcie_id = 3;</code>
     * @return Whether the pcieId field is set.
     */
    public boolean hasPcieId() {
      return pcieIdBuilder_ != null || pcieId_ != null;
    }
    /**
     * <code>.opi_api.storage.v1.NvmeControllerPciId pcie_id = 3;</code>
     * @return The pcieId.
     */
    public opi_api.storage.v1.NvmeControllerPciId getPcieId() {
      if (pcieIdBuilder_ == null) {
        return pcieId_ == null ? opi_api.storage.v1.NvmeControllerPciId.getDefaultInstance() : pcieId_;
      } else {
        return pcieIdBuilder_.getMessage();
      }
    }
    /**
     * <code>.opi_api.storage.v1.NvmeControllerPciId pcie_id = 3;</code>
     */
    public Builder setPcieId(opi_api.storage.v1.NvmeControllerPciId value) {
      if (pcieIdBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        pcieId_ = value;
        onChanged();
      } else {
        pcieIdBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.opi_api.storage.v1.NvmeControllerPciId pcie_id = 3;</code>
     */
    public Builder setPcieId(
        opi_api.storage.v1.NvmeControllerPciId.Builder builderForValue) {
      if (pcieIdBuilder_ == null) {
        pcieId_ = builderForValue.build();
        onChanged();
      } else {
        pcieIdBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.opi_api.storage.v1.NvmeControllerPciId pcie_id = 3;</code>
     */
    public Builder mergePcieId(opi_api.storage.v1.NvmeControllerPciId value) {
      if (pcieIdBuilder_ == null) {
        if (pcieId_ != null) {
          pcieId_ =
            opi_api.storage.v1.NvmeControllerPciId.newBuilder(pcieId_).mergeFrom(value).buildPartial();
        } else {
          pcieId_ = value;
        }
        onChanged();
      } else {
        pcieIdBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.opi_api.storage.v1.NvmeControllerPciId pcie_id = 3;</code>
     */
    public Builder clearPcieId() {
      if (pcieIdBuilder_ == null) {
        pcieId_ = null;
        onChanged();
      } else {
        pcieId_ = null;
        pcieIdBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.opi_api.storage.v1.NvmeControllerPciId pcie_id = 3;</code>
     */
    public opi_api.storage.v1.NvmeControllerPciId.Builder getPcieIdBuilder() {
      
      onChanged();
      return getPcieIdFieldBuilder().getBuilder();
    }
    /**
     * <code>.opi_api.storage.v1.NvmeControllerPciId pcie_id = 3;</code>
     */
    public opi_api.storage.v1.NvmeControllerPciIdOrBuilder getPcieIdOrBuilder() {
      if (pcieIdBuilder_ != null) {
        return pcieIdBuilder_.getMessageOrBuilder();
      } else {
        return pcieId_ == null ?
            opi_api.storage.v1.NvmeControllerPciId.getDefaultInstance() : pcieId_;
      }
    }
    /**
     * <code>.opi_api.storage.v1.NvmeControllerPciId pcie_id = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.storage.v1.NvmeControllerPciId, opi_api.storage.v1.NvmeControllerPciId.Builder, opi_api.storage.v1.NvmeControllerPciIdOrBuilder> 
        getPcieIdFieldBuilder() {
      if (pcieIdBuilder_ == null) {
        pcieIdBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            opi_api.storage.v1.NvmeControllerPciId, opi_api.storage.v1.NvmeControllerPciId.Builder, opi_api.storage.v1.NvmeControllerPciIdOrBuilder>(
                getPcieId(),
                getParentForChildren(),
                isClean());
        pcieId_ = null;
      }
      return pcieIdBuilder_;
    }

    private java.lang.Object bdev_ = "";
    /**
     * <code>string bdev = 4;</code>
     * @return The bdev.
     */
    public java.lang.String getBdev() {
      java.lang.Object ref = bdev_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        bdev_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string bdev = 4;</code>
     * @return The bytes for bdev.
     */
    public com.google.protobuf.ByteString
        getBdevBytes() {
      java.lang.Object ref = bdev_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        bdev_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string bdev = 4;</code>
     * @param value The bdev to set.
     * @return This builder for chaining.
     */
    public Builder setBdev(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      bdev_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string bdev = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearBdev() {
      
      bdev_ = getDefaultInstance().getBdev();
      onChanged();
      return this;
    }
    /**
     * <code>string bdev = 4;</code>
     * @param value The bytes for bdev to set.
     * @return This builder for chaining.
     */
    public Builder setBdevBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      bdev_ = value;
      onChanged();
      return this;
    }

    private long maxIoQps_ ;
    /**
     * <code>int64 max_io_qps = 5;</code>
     * @return The maxIoQps.
     */
    @java.lang.Override
    public long getMaxIoQps() {
      return maxIoQps_;
    }
    /**
     * <code>int64 max_io_qps = 5;</code>
     * @param value The maxIoQps to set.
     * @return This builder for chaining.
     */
    public Builder setMaxIoQps(long value) {
      
      maxIoQps_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 max_io_qps = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearMaxIoQps() {
      
      maxIoQps_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object serialNumber_ = "";
    /**
     * <code>string serial_number = 6;</code>
     * @return The serialNumber.
     */
    public java.lang.String getSerialNumber() {
      java.lang.Object ref = serialNumber_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        serialNumber_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string serial_number = 6;</code>
     * @return The bytes for serialNumber.
     */
    public com.google.protobuf.ByteString
        getSerialNumberBytes() {
      java.lang.Object ref = serialNumber_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        serialNumber_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string serial_number = 6;</code>
     * @param value The serialNumber to set.
     * @return This builder for chaining.
     */
    public Builder setSerialNumber(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      serialNumber_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string serial_number = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearSerialNumber() {
      
      serialNumber_ = getDefaultInstance().getSerialNumber();
      onChanged();
      return this;
    }
    /**
     * <code>string serial_number = 6;</code>
     * @param value The bytes for serialNumber to set.
     * @return This builder for chaining.
     */
    public Builder setSerialNumberBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      serialNumber_ = value;
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


    // @@protoc_insertion_point(builder_scope:opi_api.storage.v1.VirtioBlk)
  }

  // @@protoc_insertion_point(class_scope:opi_api.storage.v1.VirtioBlk)
  private static final opi_api.storage.v1.VirtioBlk DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new opi_api.storage.v1.VirtioBlk();
  }

  public static opi_api.storage.v1.VirtioBlk getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VirtioBlk>
      PARSER = new com.google.protobuf.AbstractParser<VirtioBlk>() {
    @java.lang.Override
    public VirtioBlk parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new VirtioBlk(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<VirtioBlk> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VirtioBlk> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public opi_api.storage.v1.VirtioBlk getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

