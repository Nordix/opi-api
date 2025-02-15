// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cloudrpc.proto

package opi_api.network.cloud.v1alpha1;

/**
 * <pre>
 * Create NextHop Request
 * </pre>
 *
 * Protobuf type {@code opi_api.network.cloud.v1alpha1.CreateNextHopRequest}
 */
public final class CreateNextHopRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:opi_api.network.cloud.v1alpha1.CreateNextHopRequest)
    CreateNextHopRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateNextHopRequest.newBuilder() to construct.
  private CreateNextHopRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateNextHopRequest() {
    parent_ = "";
    nexthopId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateNextHopRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CreateNextHopRequest(
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
            java.lang.String s = input.readStringRequireUtf8();

            parent_ = s;
            break;
          }
          case 18: {
            opi_api.network.cloud.v1alpha1.NextHop.Builder subBuilder = null;
            if (nexthop_ != null) {
              subBuilder = nexthop_.toBuilder();
            }
            nexthop_ = input.readMessage(opi_api.network.cloud.v1alpha1.NextHop.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(nexthop_);
              nexthop_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            nexthopId_ = s;
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
    return opi_api.network.cloud.v1alpha1.CloudRPC.internal_static_opi_api_network_cloud_v1alpha1_CreateNextHopRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return opi_api.network.cloud.v1alpha1.CloudRPC.internal_static_opi_api_network_cloud_v1alpha1_CreateNextHopRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            opi_api.network.cloud.v1alpha1.CreateNextHopRequest.class, opi_api.network.cloud.v1alpha1.CreateNextHopRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  private volatile java.lang.Object parent_;
  /**
   * <pre>
   * parent
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  @java.lang.Override
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * parent
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NEXTHOP_FIELD_NUMBER = 2;
  private opi_api.network.cloud.v1alpha1.NextHop nexthop_;
  /**
   * <pre>
   * nexthop
   * </pre>
   *
   * <code>.opi_api.network.cloud.v1alpha1.NextHop nexthop = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the nexthop field is set.
   */
  @java.lang.Override
  public boolean hasNexthop() {
    return nexthop_ != null;
  }
  /**
   * <pre>
   * nexthop
   * </pre>
   *
   * <code>.opi_api.network.cloud.v1alpha1.NextHop nexthop = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The nexthop.
   */
  @java.lang.Override
  public opi_api.network.cloud.v1alpha1.NextHop getNexthop() {
    return nexthop_ == null ? opi_api.network.cloud.v1alpha1.NextHop.getDefaultInstance() : nexthop_;
  }
  /**
   * <pre>
   * nexthop
   * </pre>
   *
   * <code>.opi_api.network.cloud.v1alpha1.NextHop nexthop = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public opi_api.network.cloud.v1alpha1.NextHopOrBuilder getNexthopOrBuilder() {
    return getNexthop();
  }

  public static final int NEXTHOP_ID_FIELD_NUMBER = 3;
  private volatile java.lang.Object nexthopId_;
  /**
   * <pre>
   * nexthop_id
   * </pre>
   *
   * <code>string nexthop_id = 3;</code>
   * @return The nexthopId.
   */
  @java.lang.Override
  public java.lang.String getNexthopId() {
    java.lang.Object ref = nexthopId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nexthopId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * nexthop_id
   * </pre>
   *
   * <code>string nexthop_id = 3;</code>
   * @return The bytes for nexthopId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNexthopIdBytes() {
    java.lang.Object ref = nexthopId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      nexthopId_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (nexthop_ != null) {
      output.writeMessage(2, getNexthop());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nexthopId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, nexthopId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (nexthop_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getNexthop());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nexthopId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, nexthopId_);
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
    if (!(obj instanceof opi_api.network.cloud.v1alpha1.CreateNextHopRequest)) {
      return super.equals(obj);
    }
    opi_api.network.cloud.v1alpha1.CreateNextHopRequest other = (opi_api.network.cloud.v1alpha1.CreateNextHopRequest) obj;

    if (!getParent()
        .equals(other.getParent())) return false;
    if (hasNexthop() != other.hasNexthop()) return false;
    if (hasNexthop()) {
      if (!getNexthop()
          .equals(other.getNexthop())) return false;
    }
    if (!getNexthopId()
        .equals(other.getNexthopId())) return false;
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
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    if (hasNexthop()) {
      hash = (37 * hash) + NEXTHOP_FIELD_NUMBER;
      hash = (53 * hash) + getNexthop().hashCode();
    }
    hash = (37 * hash) + NEXTHOP_ID_FIELD_NUMBER;
    hash = (53 * hash) + getNexthopId().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static opi_api.network.cloud.v1alpha1.CreateNextHopRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.network.cloud.v1alpha1.CreateNextHopRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.network.cloud.v1alpha1.CreateNextHopRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.network.cloud.v1alpha1.CreateNextHopRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.network.cloud.v1alpha1.CreateNextHopRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.network.cloud.v1alpha1.CreateNextHopRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.network.cloud.v1alpha1.CreateNextHopRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.network.cloud.v1alpha1.CreateNextHopRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.network.cloud.v1alpha1.CreateNextHopRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static opi_api.network.cloud.v1alpha1.CreateNextHopRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.network.cloud.v1alpha1.CreateNextHopRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.network.cloud.v1alpha1.CreateNextHopRequest parseFrom(
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
  public static Builder newBuilder(opi_api.network.cloud.v1alpha1.CreateNextHopRequest prototype) {
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
   * Create NextHop Request
   * </pre>
   *
   * Protobuf type {@code opi_api.network.cloud.v1alpha1.CreateNextHopRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:opi_api.network.cloud.v1alpha1.CreateNextHopRequest)
      opi_api.network.cloud.v1alpha1.CreateNextHopRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return opi_api.network.cloud.v1alpha1.CloudRPC.internal_static_opi_api_network_cloud_v1alpha1_CreateNextHopRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return opi_api.network.cloud.v1alpha1.CloudRPC.internal_static_opi_api_network_cloud_v1alpha1_CreateNextHopRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              opi_api.network.cloud.v1alpha1.CreateNextHopRequest.class, opi_api.network.cloud.v1alpha1.CreateNextHopRequest.Builder.class);
    }

    // Construct using opi_api.network.cloud.v1alpha1.CreateNextHopRequest.newBuilder()
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
      parent_ = "";

      if (nexthopBuilder_ == null) {
        nexthop_ = null;
      } else {
        nexthop_ = null;
        nexthopBuilder_ = null;
      }
      nexthopId_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return opi_api.network.cloud.v1alpha1.CloudRPC.internal_static_opi_api_network_cloud_v1alpha1_CreateNextHopRequest_descriptor;
    }

    @java.lang.Override
    public opi_api.network.cloud.v1alpha1.CreateNextHopRequest getDefaultInstanceForType() {
      return opi_api.network.cloud.v1alpha1.CreateNextHopRequest.getDefaultInstance();
    }

    @java.lang.Override
    public opi_api.network.cloud.v1alpha1.CreateNextHopRequest build() {
      opi_api.network.cloud.v1alpha1.CreateNextHopRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public opi_api.network.cloud.v1alpha1.CreateNextHopRequest buildPartial() {
      opi_api.network.cloud.v1alpha1.CreateNextHopRequest result = new opi_api.network.cloud.v1alpha1.CreateNextHopRequest(this);
      result.parent_ = parent_;
      if (nexthopBuilder_ == null) {
        result.nexthop_ = nexthop_;
      } else {
        result.nexthop_ = nexthopBuilder_.build();
      }
      result.nexthopId_ = nexthopId_;
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
      if (other instanceof opi_api.network.cloud.v1alpha1.CreateNextHopRequest) {
        return mergeFrom((opi_api.network.cloud.v1alpha1.CreateNextHopRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(opi_api.network.cloud.v1alpha1.CreateNextHopRequest other) {
      if (other == opi_api.network.cloud.v1alpha1.CreateNextHopRequest.getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        onChanged();
      }
      if (other.hasNexthop()) {
        mergeNexthop(other.getNexthop());
      }
      if (!other.getNexthopId().isEmpty()) {
        nexthopId_ = other.nexthopId_;
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
      opi_api.network.cloud.v1alpha1.CreateNextHopRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (opi_api.network.cloud.v1alpha1.CreateNextHopRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object parent_ = "";
    /**
     * <pre>
     * parent
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The parent.
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * parent
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The bytes for parent.
     */
    public com.google.protobuf.ByteString
        getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * parent
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      parent_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * parent
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearParent() {
      
      parent_ = getDefaultInstance().getParent();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * parent
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
     */
    public Builder setParentBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      parent_ = value;
      onChanged();
      return this;
    }

    private opi_api.network.cloud.v1alpha1.NextHop nexthop_;
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.network.cloud.v1alpha1.NextHop, opi_api.network.cloud.v1alpha1.NextHop.Builder, opi_api.network.cloud.v1alpha1.NextHopOrBuilder> nexthopBuilder_;
    /**
     * <pre>
     * nexthop
     * </pre>
     *
     * <code>.opi_api.network.cloud.v1alpha1.NextHop nexthop = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the nexthop field is set.
     */
    public boolean hasNexthop() {
      return nexthopBuilder_ != null || nexthop_ != null;
    }
    /**
     * <pre>
     * nexthop
     * </pre>
     *
     * <code>.opi_api.network.cloud.v1alpha1.NextHop nexthop = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The nexthop.
     */
    public opi_api.network.cloud.v1alpha1.NextHop getNexthop() {
      if (nexthopBuilder_ == null) {
        return nexthop_ == null ? opi_api.network.cloud.v1alpha1.NextHop.getDefaultInstance() : nexthop_;
      } else {
        return nexthopBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * nexthop
     * </pre>
     *
     * <code>.opi_api.network.cloud.v1alpha1.NextHop nexthop = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setNexthop(opi_api.network.cloud.v1alpha1.NextHop value) {
      if (nexthopBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        nexthop_ = value;
        onChanged();
      } else {
        nexthopBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * nexthop
     * </pre>
     *
     * <code>.opi_api.network.cloud.v1alpha1.NextHop nexthop = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setNexthop(
        opi_api.network.cloud.v1alpha1.NextHop.Builder builderForValue) {
      if (nexthopBuilder_ == null) {
        nexthop_ = builderForValue.build();
        onChanged();
      } else {
        nexthopBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * nexthop
     * </pre>
     *
     * <code>.opi_api.network.cloud.v1alpha1.NextHop nexthop = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeNexthop(opi_api.network.cloud.v1alpha1.NextHop value) {
      if (nexthopBuilder_ == null) {
        if (nexthop_ != null) {
          nexthop_ =
            opi_api.network.cloud.v1alpha1.NextHop.newBuilder(nexthop_).mergeFrom(value).buildPartial();
        } else {
          nexthop_ = value;
        }
        onChanged();
      } else {
        nexthopBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * nexthop
     * </pre>
     *
     * <code>.opi_api.network.cloud.v1alpha1.NextHop nexthop = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearNexthop() {
      if (nexthopBuilder_ == null) {
        nexthop_ = null;
        onChanged();
      } else {
        nexthop_ = null;
        nexthopBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * nexthop
     * </pre>
     *
     * <code>.opi_api.network.cloud.v1alpha1.NextHop nexthop = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public opi_api.network.cloud.v1alpha1.NextHop.Builder getNexthopBuilder() {
      
      onChanged();
      return getNexthopFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * nexthop
     * </pre>
     *
     * <code>.opi_api.network.cloud.v1alpha1.NextHop nexthop = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public opi_api.network.cloud.v1alpha1.NextHopOrBuilder getNexthopOrBuilder() {
      if (nexthopBuilder_ != null) {
        return nexthopBuilder_.getMessageOrBuilder();
      } else {
        return nexthop_ == null ?
            opi_api.network.cloud.v1alpha1.NextHop.getDefaultInstance() : nexthop_;
      }
    }
    /**
     * <pre>
     * nexthop
     * </pre>
     *
     * <code>.opi_api.network.cloud.v1alpha1.NextHop nexthop = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.network.cloud.v1alpha1.NextHop, opi_api.network.cloud.v1alpha1.NextHop.Builder, opi_api.network.cloud.v1alpha1.NextHopOrBuilder> 
        getNexthopFieldBuilder() {
      if (nexthopBuilder_ == null) {
        nexthopBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            opi_api.network.cloud.v1alpha1.NextHop, opi_api.network.cloud.v1alpha1.NextHop.Builder, opi_api.network.cloud.v1alpha1.NextHopOrBuilder>(
                getNexthop(),
                getParentForChildren(),
                isClean());
        nexthop_ = null;
      }
      return nexthopBuilder_;
    }

    private java.lang.Object nexthopId_ = "";
    /**
     * <pre>
     * nexthop_id
     * </pre>
     *
     * <code>string nexthop_id = 3;</code>
     * @return The nexthopId.
     */
    public java.lang.String getNexthopId() {
      java.lang.Object ref = nexthopId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nexthopId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * nexthop_id
     * </pre>
     *
     * <code>string nexthop_id = 3;</code>
     * @return The bytes for nexthopId.
     */
    public com.google.protobuf.ByteString
        getNexthopIdBytes() {
      java.lang.Object ref = nexthopId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nexthopId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * nexthop_id
     * </pre>
     *
     * <code>string nexthop_id = 3;</code>
     * @param value The nexthopId to set.
     * @return This builder for chaining.
     */
    public Builder setNexthopId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      nexthopId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * nexthop_id
     * </pre>
     *
     * <code>string nexthop_id = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearNexthopId() {
      
      nexthopId_ = getDefaultInstance().getNexthopId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * nexthop_id
     * </pre>
     *
     * <code>string nexthop_id = 3;</code>
     * @param value The bytes for nexthopId to set.
     * @return This builder for chaining.
     */
    public Builder setNexthopIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      nexthopId_ = value;
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


    // @@protoc_insertion_point(builder_scope:opi_api.network.cloud.v1alpha1.CreateNextHopRequest)
  }

  // @@protoc_insertion_point(class_scope:opi_api.network.cloud.v1alpha1.CreateNextHopRequest)
  private static final opi_api.network.cloud.v1alpha1.CreateNextHopRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new opi_api.network.cloud.v1alpha1.CreateNextHopRequest();
  }

  public static opi_api.network.cloud.v1alpha1.CreateNextHopRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateNextHopRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateNextHopRequest>() {
    @java.lang.Override
    public CreateNextHopRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CreateNextHopRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CreateNextHopRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateNextHopRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public opi_api.network.cloud.v1alpha1.CreateNextHopRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

