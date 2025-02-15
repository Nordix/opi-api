// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: middleend_qos_volume.proto

package opi_api.storage.v1;

/**
 * <pre>
 * Represents a request to create an QoS Volume.
 * </pre>
 *
 * Protobuf type {@code opi_api.storage.v1.CreateQosVolumeRequest}
 */
public final class CreateQosVolumeRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:opi_api.storage.v1.CreateQosVolumeRequest)
    CreateQosVolumeRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateQosVolumeRequest.newBuilder() to construct.
  private CreateQosVolumeRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateQosVolumeRequest() {
    qosVolumeId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateQosVolumeRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CreateQosVolumeRequest(
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
          case 10: {
            opi_api.storage.v1.QosVolume.Builder subBuilder = null;
            if (qosVolume_ != null) {
              subBuilder = qosVolume_.toBuilder();
            }
            qosVolume_ = input.readMessage(opi_api.storage.v1.QosVolume.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(qosVolume_);
              qosVolume_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            qosVolumeId_ = s;
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
    return opi_api.storage.v1.MiddleendQosVolumeProto.internal_static_opi_api_storage_v1_CreateQosVolumeRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return opi_api.storage.v1.MiddleendQosVolumeProto.internal_static_opi_api_storage_v1_CreateQosVolumeRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            opi_api.storage.v1.CreateQosVolumeRequest.class, opi_api.storage.v1.CreateQosVolumeRequest.Builder.class);
  }

  public static final int QOS_VOLUME_FIELD_NUMBER = 1;
  private opi_api.storage.v1.QosVolume qosVolume_;
  /**
   * <pre>
   * The QoS Volume to be created.
   * </pre>
   *
   * <code>.opi_api.storage.v1.QosVolume qos_volume = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the qosVolume field is set.
   */
  @java.lang.Override
  public boolean hasQosVolume() {
    return qosVolume_ != null;
  }
  /**
   * <pre>
   * The QoS Volume to be created.
   * </pre>
   *
   * <code>.opi_api.storage.v1.QosVolume qos_volume = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The qosVolume.
   */
  @java.lang.Override
  public opi_api.storage.v1.QosVolume getQosVolume() {
    return qosVolume_ == null ? opi_api.storage.v1.QosVolume.getDefaultInstance() : qosVolume_;
  }
  /**
   * <pre>
   * The QoS Volume to be created.
   * </pre>
   *
   * <code>.opi_api.storage.v1.QosVolume qos_volume = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public opi_api.storage.v1.QosVolumeOrBuilder getQosVolumeOrBuilder() {
    return getQosVolume();
  }

  public static final int QOS_VOLUME_ID_FIELD_NUMBER = 2;
  private volatile java.lang.Object qosVolumeId_;
  /**
   * <pre>
   * An optional ID to assign to the QoS Volume.
   * If this is not provided the system will auto-generate it.
   * </pre>
   *
   * <code>string qos_volume_id = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The qosVolumeId.
   */
  @java.lang.Override
  public java.lang.String getQosVolumeId() {
    java.lang.Object ref = qosVolumeId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      qosVolumeId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * An optional ID to assign to the QoS Volume.
   * If this is not provided the system will auto-generate it.
   * </pre>
   *
   * <code>string qos_volume_id = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for qosVolumeId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getQosVolumeIdBytes() {
    java.lang.Object ref = qosVolumeId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      qosVolumeId_ = b;
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
    if (qosVolume_ != null) {
      output.writeMessage(1, getQosVolume());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(qosVolumeId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, qosVolumeId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (qosVolume_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getQosVolume());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(qosVolumeId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, qosVolumeId_);
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
    if (!(obj instanceof opi_api.storage.v1.CreateQosVolumeRequest)) {
      return super.equals(obj);
    }
    opi_api.storage.v1.CreateQosVolumeRequest other = (opi_api.storage.v1.CreateQosVolumeRequest) obj;

    if (hasQosVolume() != other.hasQosVolume()) return false;
    if (hasQosVolume()) {
      if (!getQosVolume()
          .equals(other.getQosVolume())) return false;
    }
    if (!getQosVolumeId()
        .equals(other.getQosVolumeId())) return false;
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
    if (hasQosVolume()) {
      hash = (37 * hash) + QOS_VOLUME_FIELD_NUMBER;
      hash = (53 * hash) + getQosVolume().hashCode();
    }
    hash = (37 * hash) + QOS_VOLUME_ID_FIELD_NUMBER;
    hash = (53 * hash) + getQosVolumeId().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static opi_api.storage.v1.CreateQosVolumeRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.CreateQosVolumeRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.CreateQosVolumeRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.CreateQosVolumeRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.CreateQosVolumeRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.CreateQosVolumeRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.CreateQosVolumeRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.CreateQosVolumeRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.storage.v1.CreateQosVolumeRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.CreateQosVolumeRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.storage.v1.CreateQosVolumeRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.CreateQosVolumeRequest parseFrom(
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
  public static Builder newBuilder(opi_api.storage.v1.CreateQosVolumeRequest prototype) {
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
   * Represents a request to create an QoS Volume.
   * </pre>
   *
   * Protobuf type {@code opi_api.storage.v1.CreateQosVolumeRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:opi_api.storage.v1.CreateQosVolumeRequest)
      opi_api.storage.v1.CreateQosVolumeRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return opi_api.storage.v1.MiddleendQosVolumeProto.internal_static_opi_api_storage_v1_CreateQosVolumeRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return opi_api.storage.v1.MiddleendQosVolumeProto.internal_static_opi_api_storage_v1_CreateQosVolumeRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              opi_api.storage.v1.CreateQosVolumeRequest.class, opi_api.storage.v1.CreateQosVolumeRequest.Builder.class);
    }

    // Construct using opi_api.storage.v1.CreateQosVolumeRequest.newBuilder()
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
      if (qosVolumeBuilder_ == null) {
        qosVolume_ = null;
      } else {
        qosVolume_ = null;
        qosVolumeBuilder_ = null;
      }
      qosVolumeId_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return opi_api.storage.v1.MiddleendQosVolumeProto.internal_static_opi_api_storage_v1_CreateQosVolumeRequest_descriptor;
    }

    @java.lang.Override
    public opi_api.storage.v1.CreateQosVolumeRequest getDefaultInstanceForType() {
      return opi_api.storage.v1.CreateQosVolumeRequest.getDefaultInstance();
    }

    @java.lang.Override
    public opi_api.storage.v1.CreateQosVolumeRequest build() {
      opi_api.storage.v1.CreateQosVolumeRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public opi_api.storage.v1.CreateQosVolumeRequest buildPartial() {
      opi_api.storage.v1.CreateQosVolumeRequest result = new opi_api.storage.v1.CreateQosVolumeRequest(this);
      if (qosVolumeBuilder_ == null) {
        result.qosVolume_ = qosVolume_;
      } else {
        result.qosVolume_ = qosVolumeBuilder_.build();
      }
      result.qosVolumeId_ = qosVolumeId_;
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
      if (other instanceof opi_api.storage.v1.CreateQosVolumeRequest) {
        return mergeFrom((opi_api.storage.v1.CreateQosVolumeRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(opi_api.storage.v1.CreateQosVolumeRequest other) {
      if (other == opi_api.storage.v1.CreateQosVolumeRequest.getDefaultInstance()) return this;
      if (other.hasQosVolume()) {
        mergeQosVolume(other.getQosVolume());
      }
      if (!other.getQosVolumeId().isEmpty()) {
        qosVolumeId_ = other.qosVolumeId_;
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
      opi_api.storage.v1.CreateQosVolumeRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (opi_api.storage.v1.CreateQosVolumeRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private opi_api.storage.v1.QosVolume qosVolume_;
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.storage.v1.QosVolume, opi_api.storage.v1.QosVolume.Builder, opi_api.storage.v1.QosVolumeOrBuilder> qosVolumeBuilder_;
    /**
     * <pre>
     * The QoS Volume to be created.
     * </pre>
     *
     * <code>.opi_api.storage.v1.QosVolume qos_volume = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the qosVolume field is set.
     */
    public boolean hasQosVolume() {
      return qosVolumeBuilder_ != null || qosVolume_ != null;
    }
    /**
     * <pre>
     * The QoS Volume to be created.
     * </pre>
     *
     * <code>.opi_api.storage.v1.QosVolume qos_volume = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The qosVolume.
     */
    public opi_api.storage.v1.QosVolume getQosVolume() {
      if (qosVolumeBuilder_ == null) {
        return qosVolume_ == null ? opi_api.storage.v1.QosVolume.getDefaultInstance() : qosVolume_;
      } else {
        return qosVolumeBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The QoS Volume to be created.
     * </pre>
     *
     * <code>.opi_api.storage.v1.QosVolume qos_volume = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setQosVolume(opi_api.storage.v1.QosVolume value) {
      if (qosVolumeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        qosVolume_ = value;
        onChanged();
      } else {
        qosVolumeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The QoS Volume to be created.
     * </pre>
     *
     * <code>.opi_api.storage.v1.QosVolume qos_volume = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setQosVolume(
        opi_api.storage.v1.QosVolume.Builder builderForValue) {
      if (qosVolumeBuilder_ == null) {
        qosVolume_ = builderForValue.build();
        onChanged();
      } else {
        qosVolumeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The QoS Volume to be created.
     * </pre>
     *
     * <code>.opi_api.storage.v1.QosVolume qos_volume = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeQosVolume(opi_api.storage.v1.QosVolume value) {
      if (qosVolumeBuilder_ == null) {
        if (qosVolume_ != null) {
          qosVolume_ =
            opi_api.storage.v1.QosVolume.newBuilder(qosVolume_).mergeFrom(value).buildPartial();
        } else {
          qosVolume_ = value;
        }
        onChanged();
      } else {
        qosVolumeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The QoS Volume to be created.
     * </pre>
     *
     * <code>.opi_api.storage.v1.QosVolume qos_volume = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearQosVolume() {
      if (qosVolumeBuilder_ == null) {
        qosVolume_ = null;
        onChanged();
      } else {
        qosVolume_ = null;
        qosVolumeBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The QoS Volume to be created.
     * </pre>
     *
     * <code>.opi_api.storage.v1.QosVolume qos_volume = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public opi_api.storage.v1.QosVolume.Builder getQosVolumeBuilder() {
      
      onChanged();
      return getQosVolumeFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The QoS Volume to be created.
     * </pre>
     *
     * <code>.opi_api.storage.v1.QosVolume qos_volume = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public opi_api.storage.v1.QosVolumeOrBuilder getQosVolumeOrBuilder() {
      if (qosVolumeBuilder_ != null) {
        return qosVolumeBuilder_.getMessageOrBuilder();
      } else {
        return qosVolume_ == null ?
            opi_api.storage.v1.QosVolume.getDefaultInstance() : qosVolume_;
      }
    }
    /**
     * <pre>
     * The QoS Volume to be created.
     * </pre>
     *
     * <code>.opi_api.storage.v1.QosVolume qos_volume = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.storage.v1.QosVolume, opi_api.storage.v1.QosVolume.Builder, opi_api.storage.v1.QosVolumeOrBuilder> 
        getQosVolumeFieldBuilder() {
      if (qosVolumeBuilder_ == null) {
        qosVolumeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            opi_api.storage.v1.QosVolume, opi_api.storage.v1.QosVolume.Builder, opi_api.storage.v1.QosVolumeOrBuilder>(
                getQosVolume(),
                getParentForChildren(),
                isClean());
        qosVolume_ = null;
      }
      return qosVolumeBuilder_;
    }

    private java.lang.Object qosVolumeId_ = "";
    /**
     * <pre>
     * An optional ID to assign to the QoS Volume.
     * If this is not provided the system will auto-generate it.
     * </pre>
     *
     * <code>string qos_volume_id = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return The qosVolumeId.
     */
    public java.lang.String getQosVolumeId() {
      java.lang.Object ref = qosVolumeId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        qosVolumeId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * An optional ID to assign to the QoS Volume.
     * If this is not provided the system will auto-generate it.
     * </pre>
     *
     * <code>string qos_volume_id = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return The bytes for qosVolumeId.
     */
    public com.google.protobuf.ByteString
        getQosVolumeIdBytes() {
      java.lang.Object ref = qosVolumeId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        qosVolumeId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * An optional ID to assign to the QoS Volume.
     * If this is not provided the system will auto-generate it.
     * </pre>
     *
     * <code>string qos_volume_id = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param value The qosVolumeId to set.
     * @return This builder for chaining.
     */
    public Builder setQosVolumeId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      qosVolumeId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * An optional ID to assign to the QoS Volume.
     * If this is not provided the system will auto-generate it.
     * </pre>
     *
     * <code>string qos_volume_id = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return This builder for chaining.
     */
    public Builder clearQosVolumeId() {
      
      qosVolumeId_ = getDefaultInstance().getQosVolumeId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * An optional ID to assign to the QoS Volume.
     * If this is not provided the system will auto-generate it.
     * </pre>
     *
     * <code>string qos_volume_id = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param value The bytes for qosVolumeId to set.
     * @return This builder for chaining.
     */
    public Builder setQosVolumeIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      qosVolumeId_ = value;
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


    // @@protoc_insertion_point(builder_scope:opi_api.storage.v1.CreateQosVolumeRequest)
  }

  // @@protoc_insertion_point(class_scope:opi_api.storage.v1.CreateQosVolumeRequest)
  private static final opi_api.storage.v1.CreateQosVolumeRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new opi_api.storage.v1.CreateQosVolumeRequest();
  }

  public static opi_api.storage.v1.CreateQosVolumeRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateQosVolumeRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateQosVolumeRequest>() {
    @java.lang.Override
    public CreateQosVolumeRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CreateQosVolumeRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CreateQosVolumeRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateQosVolumeRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public opi_api.storage.v1.CreateQosVolumeRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

