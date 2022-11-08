// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: backend_aio.proto

package opi_api.storage.v1;

/**
 * Protobuf type {@code opi_api.storage.v1.AioControllerStatsRequest}
 */
public final class AioControllerStatsRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:opi_api.storage.v1.AioControllerStatsRequest)
    AioControllerStatsRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AioControllerStatsRequest.newBuilder() to construct.
  private AioControllerStatsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AioControllerStatsRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AioControllerStatsRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AioControllerStatsRequest(
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
            opi_api.common.v1.ObjectKey.Builder subBuilder = null;
            if (handle_ != null) {
              subBuilder = handle_.toBuilder();
            }
            handle_ = input.readMessage(opi_api.common.v1.ObjectKey.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(handle_);
              handle_ = subBuilder.buildPartial();
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
    return opi_api.storage.v1.BackendAioProto.internal_static_opi_api_storage_v1_AioControllerStatsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return opi_api.storage.v1.BackendAioProto.internal_static_opi_api_storage_v1_AioControllerStatsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            opi_api.storage.v1.AioControllerStatsRequest.class, opi_api.storage.v1.AioControllerStatsRequest.Builder.class);
  }

  public static final int HANDLE_FIELD_NUMBER = 1;
  private opi_api.common.v1.ObjectKey handle_;
  /**
   * <code>.opi_api.common.v1.ObjectKey handle = 1;</code>
   * @return Whether the handle field is set.
   */
  @java.lang.Override
  public boolean hasHandle() {
    return handle_ != null;
  }
  /**
   * <code>.opi_api.common.v1.ObjectKey handle = 1;</code>
   * @return The handle.
   */
  @java.lang.Override
  public opi_api.common.v1.ObjectKey getHandle() {
    return handle_ == null ? opi_api.common.v1.ObjectKey.getDefaultInstance() : handle_;
  }
  /**
   * <code>.opi_api.common.v1.ObjectKey handle = 1;</code>
   */
  @java.lang.Override
  public opi_api.common.v1.ObjectKeyOrBuilder getHandleOrBuilder() {
    return getHandle();
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
    if (handle_ != null) {
      output.writeMessage(1, getHandle());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (handle_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getHandle());
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
    if (!(obj instanceof opi_api.storage.v1.AioControllerStatsRequest)) {
      return super.equals(obj);
    }
    opi_api.storage.v1.AioControllerStatsRequest other = (opi_api.storage.v1.AioControllerStatsRequest) obj;

    if (hasHandle() != other.hasHandle()) return false;
    if (hasHandle()) {
      if (!getHandle()
          .equals(other.getHandle())) return false;
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
    if (hasHandle()) {
      hash = (37 * hash) + HANDLE_FIELD_NUMBER;
      hash = (53 * hash) + getHandle().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static opi_api.storage.v1.AioControllerStatsRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.AioControllerStatsRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.AioControllerStatsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.AioControllerStatsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.AioControllerStatsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.AioControllerStatsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.AioControllerStatsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.AioControllerStatsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.storage.v1.AioControllerStatsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.AioControllerStatsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.storage.v1.AioControllerStatsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.AioControllerStatsRequest parseFrom(
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
  public static Builder newBuilder(opi_api.storage.v1.AioControllerStatsRequest prototype) {
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
   * Protobuf type {@code opi_api.storage.v1.AioControllerStatsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:opi_api.storage.v1.AioControllerStatsRequest)
      opi_api.storage.v1.AioControllerStatsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return opi_api.storage.v1.BackendAioProto.internal_static_opi_api_storage_v1_AioControllerStatsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return opi_api.storage.v1.BackendAioProto.internal_static_opi_api_storage_v1_AioControllerStatsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              opi_api.storage.v1.AioControllerStatsRequest.class, opi_api.storage.v1.AioControllerStatsRequest.Builder.class);
    }

    // Construct using opi_api.storage.v1.AioControllerStatsRequest.newBuilder()
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
      if (handleBuilder_ == null) {
        handle_ = null;
      } else {
        handle_ = null;
        handleBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return opi_api.storage.v1.BackendAioProto.internal_static_opi_api_storage_v1_AioControllerStatsRequest_descriptor;
    }

    @java.lang.Override
    public opi_api.storage.v1.AioControllerStatsRequest getDefaultInstanceForType() {
      return opi_api.storage.v1.AioControllerStatsRequest.getDefaultInstance();
    }

    @java.lang.Override
    public opi_api.storage.v1.AioControllerStatsRequest build() {
      opi_api.storage.v1.AioControllerStatsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public opi_api.storage.v1.AioControllerStatsRequest buildPartial() {
      opi_api.storage.v1.AioControllerStatsRequest result = new opi_api.storage.v1.AioControllerStatsRequest(this);
      if (handleBuilder_ == null) {
        result.handle_ = handle_;
      } else {
        result.handle_ = handleBuilder_.build();
      }
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
      if (other instanceof opi_api.storage.v1.AioControllerStatsRequest) {
        return mergeFrom((opi_api.storage.v1.AioControllerStatsRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(opi_api.storage.v1.AioControllerStatsRequest other) {
      if (other == opi_api.storage.v1.AioControllerStatsRequest.getDefaultInstance()) return this;
      if (other.hasHandle()) {
        mergeHandle(other.getHandle());
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
      opi_api.storage.v1.AioControllerStatsRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (opi_api.storage.v1.AioControllerStatsRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private opi_api.common.v1.ObjectKey handle_;
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.common.v1.ObjectKey, opi_api.common.v1.ObjectKey.Builder, opi_api.common.v1.ObjectKeyOrBuilder> handleBuilder_;
    /**
     * <code>.opi_api.common.v1.ObjectKey handle = 1;</code>
     * @return Whether the handle field is set.
     */
    public boolean hasHandle() {
      return handleBuilder_ != null || handle_ != null;
    }
    /**
     * <code>.opi_api.common.v1.ObjectKey handle = 1;</code>
     * @return The handle.
     */
    public opi_api.common.v1.ObjectKey getHandle() {
      if (handleBuilder_ == null) {
        return handle_ == null ? opi_api.common.v1.ObjectKey.getDefaultInstance() : handle_;
      } else {
        return handleBuilder_.getMessage();
      }
    }
    /**
     * <code>.opi_api.common.v1.ObjectKey handle = 1;</code>
     */
    public Builder setHandle(opi_api.common.v1.ObjectKey value) {
      if (handleBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        handle_ = value;
        onChanged();
      } else {
        handleBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.opi_api.common.v1.ObjectKey handle = 1;</code>
     */
    public Builder setHandle(
        opi_api.common.v1.ObjectKey.Builder builderForValue) {
      if (handleBuilder_ == null) {
        handle_ = builderForValue.build();
        onChanged();
      } else {
        handleBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.opi_api.common.v1.ObjectKey handle = 1;</code>
     */
    public Builder mergeHandle(opi_api.common.v1.ObjectKey value) {
      if (handleBuilder_ == null) {
        if (handle_ != null) {
          handle_ =
            opi_api.common.v1.ObjectKey.newBuilder(handle_).mergeFrom(value).buildPartial();
        } else {
          handle_ = value;
        }
        onChanged();
      } else {
        handleBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.opi_api.common.v1.ObjectKey handle = 1;</code>
     */
    public Builder clearHandle() {
      if (handleBuilder_ == null) {
        handle_ = null;
        onChanged();
      } else {
        handle_ = null;
        handleBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.opi_api.common.v1.ObjectKey handle = 1;</code>
     */
    public opi_api.common.v1.ObjectKey.Builder getHandleBuilder() {
      
      onChanged();
      return getHandleFieldBuilder().getBuilder();
    }
    /**
     * <code>.opi_api.common.v1.ObjectKey handle = 1;</code>
     */
    public opi_api.common.v1.ObjectKeyOrBuilder getHandleOrBuilder() {
      if (handleBuilder_ != null) {
        return handleBuilder_.getMessageOrBuilder();
      } else {
        return handle_ == null ?
            opi_api.common.v1.ObjectKey.getDefaultInstance() : handle_;
      }
    }
    /**
     * <code>.opi_api.common.v1.ObjectKey handle = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.common.v1.ObjectKey, opi_api.common.v1.ObjectKey.Builder, opi_api.common.v1.ObjectKeyOrBuilder> 
        getHandleFieldBuilder() {
      if (handleBuilder_ == null) {
        handleBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            opi_api.common.v1.ObjectKey, opi_api.common.v1.ObjectKey.Builder, opi_api.common.v1.ObjectKeyOrBuilder>(
                getHandle(),
                getParentForChildren(),
                isClean());
        handle_ = null;
      }
      return handleBuilder_;
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


    // @@protoc_insertion_point(builder_scope:opi_api.storage.v1.AioControllerStatsRequest)
  }

  // @@protoc_insertion_point(class_scope:opi_api.storage.v1.AioControllerStatsRequest)
  private static final opi_api.storage.v1.AioControllerStatsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new opi_api.storage.v1.AioControllerStatsRequest();
  }

  public static opi_api.storage.v1.AioControllerStatsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AioControllerStatsRequest>
      PARSER = new com.google.protobuf.AbstractParser<AioControllerStatsRequest>() {
    @java.lang.Override
    public AioControllerStatsRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AioControllerStatsRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AioControllerStatsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AioControllerStatsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public opi_api.storage.v1.AioControllerStatsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

