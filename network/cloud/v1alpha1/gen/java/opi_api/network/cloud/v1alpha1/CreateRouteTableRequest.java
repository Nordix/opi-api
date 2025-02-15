// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cloudrpc.proto

package opi_api.network.cloud.v1alpha1;

/**
 * <pre>
 * Create RouteTable Request
 * </pre>
 *
 * Protobuf type {@code opi_api.network.cloud.v1alpha1.CreateRouteTableRequest}
 */
public final class CreateRouteTableRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:opi_api.network.cloud.v1alpha1.CreateRouteTableRequest)
    CreateRouteTableRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateRouteTableRequest.newBuilder() to construct.
  private CreateRouteTableRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateRouteTableRequest() {
    parent_ = "";
    routetableId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateRouteTableRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CreateRouteTableRequest(
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
            opi_api.network.cloud.v1alpha1.RouteTable.Builder subBuilder = null;
            if (routetable_ != null) {
              subBuilder = routetable_.toBuilder();
            }
            routetable_ = input.readMessage(opi_api.network.cloud.v1alpha1.RouteTable.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(routetable_);
              routetable_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            routetableId_ = s;
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
    return opi_api.network.cloud.v1alpha1.CloudRPC.internal_static_opi_api_network_cloud_v1alpha1_CreateRouteTableRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return opi_api.network.cloud.v1alpha1.CloudRPC.internal_static_opi_api_network_cloud_v1alpha1_CreateRouteTableRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            opi_api.network.cloud.v1alpha1.CreateRouteTableRequest.class, opi_api.network.cloud.v1alpha1.CreateRouteTableRequest.Builder.class);
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

  public static final int ROUTETABLE_FIELD_NUMBER = 2;
  private opi_api.network.cloud.v1alpha1.RouteTable routetable_;
  /**
   * <pre>
   * routetable
   * </pre>
   *
   * <code>.opi_api.network.cloud.v1alpha1.RouteTable routetable = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the routetable field is set.
   */
  @java.lang.Override
  public boolean hasRoutetable() {
    return routetable_ != null;
  }
  /**
   * <pre>
   * routetable
   * </pre>
   *
   * <code>.opi_api.network.cloud.v1alpha1.RouteTable routetable = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The routetable.
   */
  @java.lang.Override
  public opi_api.network.cloud.v1alpha1.RouteTable getRoutetable() {
    return routetable_ == null ? opi_api.network.cloud.v1alpha1.RouteTable.getDefaultInstance() : routetable_;
  }
  /**
   * <pre>
   * routetable
   * </pre>
   *
   * <code>.opi_api.network.cloud.v1alpha1.RouteTable routetable = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public opi_api.network.cloud.v1alpha1.RouteTableOrBuilder getRoutetableOrBuilder() {
    return getRoutetable();
  }

  public static final int ROUTETABLE_ID_FIELD_NUMBER = 3;
  private volatile java.lang.Object routetableId_;
  /**
   * <pre>
   * routetable_id
   * </pre>
   *
   * <code>string routetable_id = 3;</code>
   * @return The routetableId.
   */
  @java.lang.Override
  public java.lang.String getRoutetableId() {
    java.lang.Object ref = routetableId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      routetableId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * routetable_id
   * </pre>
   *
   * <code>string routetable_id = 3;</code>
   * @return The bytes for routetableId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getRoutetableIdBytes() {
    java.lang.Object ref = routetableId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      routetableId_ = b;
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
    if (routetable_ != null) {
      output.writeMessage(2, getRoutetable());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(routetableId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, routetableId_);
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
    if (routetable_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getRoutetable());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(routetableId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, routetableId_);
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
    if (!(obj instanceof opi_api.network.cloud.v1alpha1.CreateRouteTableRequest)) {
      return super.equals(obj);
    }
    opi_api.network.cloud.v1alpha1.CreateRouteTableRequest other = (opi_api.network.cloud.v1alpha1.CreateRouteTableRequest) obj;

    if (!getParent()
        .equals(other.getParent())) return false;
    if (hasRoutetable() != other.hasRoutetable()) return false;
    if (hasRoutetable()) {
      if (!getRoutetable()
          .equals(other.getRoutetable())) return false;
    }
    if (!getRoutetableId()
        .equals(other.getRoutetableId())) return false;
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
    if (hasRoutetable()) {
      hash = (37 * hash) + ROUTETABLE_FIELD_NUMBER;
      hash = (53 * hash) + getRoutetable().hashCode();
    }
    hash = (37 * hash) + ROUTETABLE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getRoutetableId().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static opi_api.network.cloud.v1alpha1.CreateRouteTableRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.network.cloud.v1alpha1.CreateRouteTableRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.network.cloud.v1alpha1.CreateRouteTableRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.network.cloud.v1alpha1.CreateRouteTableRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.network.cloud.v1alpha1.CreateRouteTableRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.network.cloud.v1alpha1.CreateRouteTableRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.network.cloud.v1alpha1.CreateRouteTableRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.network.cloud.v1alpha1.CreateRouteTableRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.network.cloud.v1alpha1.CreateRouteTableRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static opi_api.network.cloud.v1alpha1.CreateRouteTableRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.network.cloud.v1alpha1.CreateRouteTableRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.network.cloud.v1alpha1.CreateRouteTableRequest parseFrom(
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
  public static Builder newBuilder(opi_api.network.cloud.v1alpha1.CreateRouteTableRequest prototype) {
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
   * Create RouteTable Request
   * </pre>
   *
   * Protobuf type {@code opi_api.network.cloud.v1alpha1.CreateRouteTableRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:opi_api.network.cloud.v1alpha1.CreateRouteTableRequest)
      opi_api.network.cloud.v1alpha1.CreateRouteTableRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return opi_api.network.cloud.v1alpha1.CloudRPC.internal_static_opi_api_network_cloud_v1alpha1_CreateRouteTableRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return opi_api.network.cloud.v1alpha1.CloudRPC.internal_static_opi_api_network_cloud_v1alpha1_CreateRouteTableRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              opi_api.network.cloud.v1alpha1.CreateRouteTableRequest.class, opi_api.network.cloud.v1alpha1.CreateRouteTableRequest.Builder.class);
    }

    // Construct using opi_api.network.cloud.v1alpha1.CreateRouteTableRequest.newBuilder()
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

      if (routetableBuilder_ == null) {
        routetable_ = null;
      } else {
        routetable_ = null;
        routetableBuilder_ = null;
      }
      routetableId_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return opi_api.network.cloud.v1alpha1.CloudRPC.internal_static_opi_api_network_cloud_v1alpha1_CreateRouteTableRequest_descriptor;
    }

    @java.lang.Override
    public opi_api.network.cloud.v1alpha1.CreateRouteTableRequest getDefaultInstanceForType() {
      return opi_api.network.cloud.v1alpha1.CreateRouteTableRequest.getDefaultInstance();
    }

    @java.lang.Override
    public opi_api.network.cloud.v1alpha1.CreateRouteTableRequest build() {
      opi_api.network.cloud.v1alpha1.CreateRouteTableRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public opi_api.network.cloud.v1alpha1.CreateRouteTableRequest buildPartial() {
      opi_api.network.cloud.v1alpha1.CreateRouteTableRequest result = new opi_api.network.cloud.v1alpha1.CreateRouteTableRequest(this);
      result.parent_ = parent_;
      if (routetableBuilder_ == null) {
        result.routetable_ = routetable_;
      } else {
        result.routetable_ = routetableBuilder_.build();
      }
      result.routetableId_ = routetableId_;
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
      if (other instanceof opi_api.network.cloud.v1alpha1.CreateRouteTableRequest) {
        return mergeFrom((opi_api.network.cloud.v1alpha1.CreateRouteTableRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(opi_api.network.cloud.v1alpha1.CreateRouteTableRequest other) {
      if (other == opi_api.network.cloud.v1alpha1.CreateRouteTableRequest.getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        onChanged();
      }
      if (other.hasRoutetable()) {
        mergeRoutetable(other.getRoutetable());
      }
      if (!other.getRoutetableId().isEmpty()) {
        routetableId_ = other.routetableId_;
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
      opi_api.network.cloud.v1alpha1.CreateRouteTableRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (opi_api.network.cloud.v1alpha1.CreateRouteTableRequest) e.getUnfinishedMessage();
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

    private opi_api.network.cloud.v1alpha1.RouteTable routetable_;
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.network.cloud.v1alpha1.RouteTable, opi_api.network.cloud.v1alpha1.RouteTable.Builder, opi_api.network.cloud.v1alpha1.RouteTableOrBuilder> routetableBuilder_;
    /**
     * <pre>
     * routetable
     * </pre>
     *
     * <code>.opi_api.network.cloud.v1alpha1.RouteTable routetable = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the routetable field is set.
     */
    public boolean hasRoutetable() {
      return routetableBuilder_ != null || routetable_ != null;
    }
    /**
     * <pre>
     * routetable
     * </pre>
     *
     * <code>.opi_api.network.cloud.v1alpha1.RouteTable routetable = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The routetable.
     */
    public opi_api.network.cloud.v1alpha1.RouteTable getRoutetable() {
      if (routetableBuilder_ == null) {
        return routetable_ == null ? opi_api.network.cloud.v1alpha1.RouteTable.getDefaultInstance() : routetable_;
      } else {
        return routetableBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * routetable
     * </pre>
     *
     * <code>.opi_api.network.cloud.v1alpha1.RouteTable routetable = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setRoutetable(opi_api.network.cloud.v1alpha1.RouteTable value) {
      if (routetableBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        routetable_ = value;
        onChanged();
      } else {
        routetableBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * routetable
     * </pre>
     *
     * <code>.opi_api.network.cloud.v1alpha1.RouteTable routetable = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setRoutetable(
        opi_api.network.cloud.v1alpha1.RouteTable.Builder builderForValue) {
      if (routetableBuilder_ == null) {
        routetable_ = builderForValue.build();
        onChanged();
      } else {
        routetableBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * routetable
     * </pre>
     *
     * <code>.opi_api.network.cloud.v1alpha1.RouteTable routetable = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeRoutetable(opi_api.network.cloud.v1alpha1.RouteTable value) {
      if (routetableBuilder_ == null) {
        if (routetable_ != null) {
          routetable_ =
            opi_api.network.cloud.v1alpha1.RouteTable.newBuilder(routetable_).mergeFrom(value).buildPartial();
        } else {
          routetable_ = value;
        }
        onChanged();
      } else {
        routetableBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * routetable
     * </pre>
     *
     * <code>.opi_api.network.cloud.v1alpha1.RouteTable routetable = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearRoutetable() {
      if (routetableBuilder_ == null) {
        routetable_ = null;
        onChanged();
      } else {
        routetable_ = null;
        routetableBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * routetable
     * </pre>
     *
     * <code>.opi_api.network.cloud.v1alpha1.RouteTable routetable = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public opi_api.network.cloud.v1alpha1.RouteTable.Builder getRoutetableBuilder() {
      
      onChanged();
      return getRoutetableFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * routetable
     * </pre>
     *
     * <code>.opi_api.network.cloud.v1alpha1.RouteTable routetable = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public opi_api.network.cloud.v1alpha1.RouteTableOrBuilder getRoutetableOrBuilder() {
      if (routetableBuilder_ != null) {
        return routetableBuilder_.getMessageOrBuilder();
      } else {
        return routetable_ == null ?
            opi_api.network.cloud.v1alpha1.RouteTable.getDefaultInstance() : routetable_;
      }
    }
    /**
     * <pre>
     * routetable
     * </pre>
     *
     * <code>.opi_api.network.cloud.v1alpha1.RouteTable routetable = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.network.cloud.v1alpha1.RouteTable, opi_api.network.cloud.v1alpha1.RouteTable.Builder, opi_api.network.cloud.v1alpha1.RouteTableOrBuilder> 
        getRoutetableFieldBuilder() {
      if (routetableBuilder_ == null) {
        routetableBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            opi_api.network.cloud.v1alpha1.RouteTable, opi_api.network.cloud.v1alpha1.RouteTable.Builder, opi_api.network.cloud.v1alpha1.RouteTableOrBuilder>(
                getRoutetable(),
                getParentForChildren(),
                isClean());
        routetable_ = null;
      }
      return routetableBuilder_;
    }

    private java.lang.Object routetableId_ = "";
    /**
     * <pre>
     * routetable_id
     * </pre>
     *
     * <code>string routetable_id = 3;</code>
     * @return The routetableId.
     */
    public java.lang.String getRoutetableId() {
      java.lang.Object ref = routetableId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        routetableId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * routetable_id
     * </pre>
     *
     * <code>string routetable_id = 3;</code>
     * @return The bytes for routetableId.
     */
    public com.google.protobuf.ByteString
        getRoutetableIdBytes() {
      java.lang.Object ref = routetableId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        routetableId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * routetable_id
     * </pre>
     *
     * <code>string routetable_id = 3;</code>
     * @param value The routetableId to set.
     * @return This builder for chaining.
     */
    public Builder setRoutetableId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      routetableId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * routetable_id
     * </pre>
     *
     * <code>string routetable_id = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearRoutetableId() {
      
      routetableId_ = getDefaultInstance().getRoutetableId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * routetable_id
     * </pre>
     *
     * <code>string routetable_id = 3;</code>
     * @param value The bytes for routetableId to set.
     * @return This builder for chaining.
     */
    public Builder setRoutetableIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      routetableId_ = value;
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


    // @@protoc_insertion_point(builder_scope:opi_api.network.cloud.v1alpha1.CreateRouteTableRequest)
  }

  // @@protoc_insertion_point(class_scope:opi_api.network.cloud.v1alpha1.CreateRouteTableRequest)
  private static final opi_api.network.cloud.v1alpha1.CreateRouteTableRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new opi_api.network.cloud.v1alpha1.CreateRouteTableRequest();
  }

  public static opi_api.network.cloud.v1alpha1.CreateRouteTableRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateRouteTableRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateRouteTableRequest>() {
    @java.lang.Override
    public CreateRouteTableRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CreateRouteTableRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CreateRouteTableRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateRouteTableRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public opi_api.network.cloud.v1alpha1.CreateRouteTableRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

