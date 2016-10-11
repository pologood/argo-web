// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PAppResponse.proto

package com.argo.web.protobuf;

/**
 * Protobuf type {@code PAppResponse}
 */
public  final class PAppResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:PAppResponse)
    PAppResponseOrBuilder {
  // Use PAppResponse.newBuilder() to construct.
  private PAppResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PAppResponse() {
    msg_ = "";
    sessionId_ = "";
    version_ = 0;
    code_ = 0;
    total_ = 0;
    data_ = java.util.Collections.emptyList();
    errors_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private PAppResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            msg_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            sessionId_ = s;
            break;
          }
          case 24: {

            version_ = input.readInt32();
            break;
          }
          case 32: {

            code_ = input.readInt32();
            break;
          }
          case 40: {

            total_ = input.readInt32();
            break;
          }
          case 50: {
            if (!((mutable_bitField0_ & 0x00000020) == 0x00000020)) {
              data_ = new java.util.ArrayList<com.google.protobuf.ByteString>();
              mutable_bitField0_ |= 0x00000020;
            }
            data_.add(input.readBytes());
            break;
          }
          case 58: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000040) == 0x00000040)) {
              errors_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000040;
            }
            errors_.add(s);
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
      if (((mutable_bitField0_ & 0x00000020) == 0x00000020)) {
        data_ = java.util.Collections.unmodifiableList(data_);
      }
      if (((mutable_bitField0_ & 0x00000040) == 0x00000040)) {
        errors_ = errors_.getUnmodifiableView();
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.argo.web.protobuf.PAppResponseProto.internal_static_PAppResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.argo.web.protobuf.PAppResponseProto.internal_static_PAppResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.argo.web.protobuf.PAppResponse.class, com.argo.web.protobuf.PAppResponse.Builder.class);
  }

  private int bitField0_;
  public static final int MSG_FIELD_NUMBER = 1;
  private volatile java.lang.Object msg_;
  /**
   * <code>optional string msg = 1;</code>
   */
  public java.lang.String getMsg() {
    java.lang.Object ref = msg_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      msg_ = s;
      return s;
    }
  }
  /**
   * <code>optional string msg = 1;</code>
   */
  public com.google.protobuf.ByteString
      getMsgBytes() {
    java.lang.Object ref = msg_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      msg_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SESSIONID_FIELD_NUMBER = 2;
  private volatile java.lang.Object sessionId_;
  /**
   * <code>optional string sessionId = 2;</code>
   */
  public java.lang.String getSessionId() {
    java.lang.Object ref = sessionId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      sessionId_ = s;
      return s;
    }
  }
  /**
   * <code>optional string sessionId = 2;</code>
   */
  public com.google.protobuf.ByteString
      getSessionIdBytes() {
    java.lang.Object ref = sessionId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      sessionId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VERSION_FIELD_NUMBER = 3;
  private int version_;
  /**
   * <code>optional int32 version = 3;</code>
   */
  public int getVersion() {
    return version_;
  }

  public static final int CODE_FIELD_NUMBER = 4;
  private int code_;
  /**
   * <code>optional int32 code = 4;</code>
   */
  public int getCode() {
    return code_;
  }

  public static final int TOTAL_FIELD_NUMBER = 5;
  private int total_;
  /**
   * <code>optional int32 total = 5;</code>
   */
  public int getTotal() {
    return total_;
  }

  public static final int DATA_FIELD_NUMBER = 6;
  private java.util.List<com.google.protobuf.ByteString> data_;
  /**
   * <code>repeated bytes data = 6;</code>
   */
  public java.util.List<com.google.protobuf.ByteString>
      getDataList() {
    return data_;
  }
  /**
   * <code>repeated bytes data = 6;</code>
   */
  public int getDataCount() {
    return data_.size();
  }
  /**
   * <code>repeated bytes data = 6;</code>
   */
  public com.google.protobuf.ByteString getData(int index) {
    return data_.get(index);
  }

  public static final int ERRORS_FIELD_NUMBER = 7;
  private com.google.protobuf.LazyStringList errors_;
  /**
   * <code>repeated string errors = 7;</code>
   */
  public com.google.protobuf.ProtocolStringList
      getErrorsList() {
    return errors_;
  }
  /**
   * <code>repeated string errors = 7;</code>
   */
  public int getErrorsCount() {
    return errors_.size();
  }
  /**
   * <code>repeated string errors = 7;</code>
   */
  public java.lang.String getErrors(int index) {
    return errors_.get(index);
  }
  /**
   * <code>repeated string errors = 7;</code>
   */
  public com.google.protobuf.ByteString
      getErrorsBytes(int index) {
    return errors_.getByteString(index);
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getMsgBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, msg_);
    }
    if (!getSessionIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, sessionId_);
    }
    if (version_ != 0) {
      output.writeInt32(3, version_);
    }
    if (code_ != 0) {
      output.writeInt32(4, code_);
    }
    if (total_ != 0) {
      output.writeInt32(5, total_);
    }
    for (int i = 0; i < data_.size(); i++) {
      output.writeBytes(6, data_.get(i));
    }
    for (int i = 0; i < errors_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 7, errors_.getRaw(i));
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getMsgBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, msg_);
    }
    if (!getSessionIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, sessionId_);
    }
    if (version_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, version_);
    }
    if (code_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, code_);
    }
    if (total_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(5, total_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < data_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeBytesSizeNoTag(data_.get(i));
      }
      size += dataSize;
      size += 1 * getDataList().size();
    }
    {
      int dataSize = 0;
      for (int i = 0; i < errors_.size(); i++) {
        dataSize += computeStringSizeNoTag(errors_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getErrorsList().size();
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.argo.web.protobuf.PAppResponse)) {
      return super.equals(obj);
    }
    com.argo.web.protobuf.PAppResponse other = (com.argo.web.protobuf.PAppResponse) obj;

    boolean result = true;
    result = result && getMsg()
        .equals(other.getMsg());
    result = result && getSessionId()
        .equals(other.getSessionId());
    result = result && (getVersion()
        == other.getVersion());
    result = result && (getCode()
        == other.getCode());
    result = result && (getTotal()
        == other.getTotal());
    result = result && getDataList()
        .equals(other.getDataList());
    result = result && getErrorsList()
        .equals(other.getErrorsList());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    hash = (37 * hash) + MSG_FIELD_NUMBER;
    hash = (53 * hash) + getMsg().hashCode();
    hash = (37 * hash) + SESSIONID_FIELD_NUMBER;
    hash = (53 * hash) + getSessionId().hashCode();
    hash = (37 * hash) + VERSION_FIELD_NUMBER;
    hash = (53 * hash) + getVersion();
    hash = (37 * hash) + CODE_FIELD_NUMBER;
    hash = (53 * hash) + getCode();
    hash = (37 * hash) + TOTAL_FIELD_NUMBER;
    hash = (53 * hash) + getTotal();
    if (getDataCount() > 0) {
      hash = (37 * hash) + DATA_FIELD_NUMBER;
      hash = (53 * hash) + getDataList().hashCode();
    }
    if (getErrorsCount() > 0) {
      hash = (37 * hash) + ERRORS_FIELD_NUMBER;
      hash = (53 * hash) + getErrorsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.argo.web.protobuf.PAppResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.argo.web.protobuf.PAppResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.argo.web.protobuf.PAppResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.argo.web.protobuf.PAppResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.argo.web.protobuf.PAppResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.argo.web.protobuf.PAppResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.argo.web.protobuf.PAppResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.argo.web.protobuf.PAppResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.argo.web.protobuf.PAppResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.argo.web.protobuf.PAppResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.argo.web.protobuf.PAppResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
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
   * Protobuf type {@code PAppResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:PAppResponse)
      com.argo.web.protobuf.PAppResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.argo.web.protobuf.PAppResponseProto.internal_static_PAppResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.argo.web.protobuf.PAppResponseProto.internal_static_PAppResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.argo.web.protobuf.PAppResponse.class, com.argo.web.protobuf.PAppResponse.Builder.class);
    }

    // Construct using com.argo.web.protobuf.PAppResponse.newBuilder()
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
    public Builder clear() {
      super.clear();
      msg_ = "";

      sessionId_ = "";

      version_ = 0;

      code_ = 0;

      total_ = 0;

      data_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000020);
      errors_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000040);
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.argo.web.protobuf.PAppResponseProto.internal_static_PAppResponse_descriptor;
    }

    public com.argo.web.protobuf.PAppResponse getDefaultInstanceForType() {
      return com.argo.web.protobuf.PAppResponse.getDefaultInstance();
    }

    public com.argo.web.protobuf.PAppResponse build() {
      com.argo.web.protobuf.PAppResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.argo.web.protobuf.PAppResponse buildPartial() {
      com.argo.web.protobuf.PAppResponse result = new com.argo.web.protobuf.PAppResponse(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.msg_ = msg_;
      result.sessionId_ = sessionId_;
      result.version_ = version_;
      result.code_ = code_;
      result.total_ = total_;
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        data_ = java.util.Collections.unmodifiableList(data_);
        bitField0_ = (bitField0_ & ~0x00000020);
      }
      result.data_ = data_;
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        errors_ = errors_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000040);
      }
      result.errors_ = errors_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.argo.web.protobuf.PAppResponse) {
        return mergeFrom((com.argo.web.protobuf.PAppResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.argo.web.protobuf.PAppResponse other) {
      if (other == com.argo.web.protobuf.PAppResponse.getDefaultInstance()) return this;
      if (!other.getMsg().isEmpty()) {
        msg_ = other.msg_;
        onChanged();
      }
      if (!other.getSessionId().isEmpty()) {
        sessionId_ = other.sessionId_;
        onChanged();
      }
      if (other.getVersion() != 0) {
        setVersion(other.getVersion());
      }
      if (other.getCode() != 0) {
        setCode(other.getCode());
      }
      if (other.getTotal() != 0) {
        setTotal(other.getTotal());
      }
      if (!other.data_.isEmpty()) {
        if (data_.isEmpty()) {
          data_ = other.data_;
          bitField0_ = (bitField0_ & ~0x00000020);
        } else {
          ensureDataIsMutable();
          data_.addAll(other.data_);
        }
        onChanged();
      }
      if (!other.errors_.isEmpty()) {
        if (errors_.isEmpty()) {
          errors_ = other.errors_;
          bitField0_ = (bitField0_ & ~0x00000040);
        } else {
          ensureErrorsIsMutable();
          errors_.addAll(other.errors_);
        }
        onChanged();
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.argo.web.protobuf.PAppResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.argo.web.protobuf.PAppResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object msg_ = "";
    /**
     * <code>optional string msg = 1;</code>
     */
    public java.lang.String getMsg() {
      java.lang.Object ref = msg_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        msg_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string msg = 1;</code>
     */
    public com.google.protobuf.ByteString
        getMsgBytes() {
      java.lang.Object ref = msg_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        msg_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string msg = 1;</code>
     */
    public Builder setMsg(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      msg_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string msg = 1;</code>
     */
    public Builder clearMsg() {
      
      msg_ = getDefaultInstance().getMsg();
      onChanged();
      return this;
    }
    /**
     * <code>optional string msg = 1;</code>
     */
    public Builder setMsgBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      msg_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object sessionId_ = "";
    /**
     * <code>optional string sessionId = 2;</code>
     */
    public java.lang.String getSessionId() {
      java.lang.Object ref = sessionId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        sessionId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string sessionId = 2;</code>
     */
    public com.google.protobuf.ByteString
        getSessionIdBytes() {
      java.lang.Object ref = sessionId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        sessionId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string sessionId = 2;</code>
     */
    public Builder setSessionId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      sessionId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string sessionId = 2;</code>
     */
    public Builder clearSessionId() {
      
      sessionId_ = getDefaultInstance().getSessionId();
      onChanged();
      return this;
    }
    /**
     * <code>optional string sessionId = 2;</code>
     */
    public Builder setSessionIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      sessionId_ = value;
      onChanged();
      return this;
    }

    private int version_ ;
    /**
     * <code>optional int32 version = 3;</code>
     */
    public int getVersion() {
      return version_;
    }
    /**
     * <code>optional int32 version = 3;</code>
     */
    public Builder setVersion(int value) {
      
      version_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 version = 3;</code>
     */
    public Builder clearVersion() {
      
      version_ = 0;
      onChanged();
      return this;
    }

    private int code_ ;
    /**
     * <code>optional int32 code = 4;</code>
     */
    public int getCode() {
      return code_;
    }
    /**
     * <code>optional int32 code = 4;</code>
     */
    public Builder setCode(int value) {
      
      code_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 code = 4;</code>
     */
    public Builder clearCode() {
      
      code_ = 0;
      onChanged();
      return this;
    }

    private int total_ ;
    /**
     * <code>optional int32 total = 5;</code>
     */
    public int getTotal() {
      return total_;
    }
    /**
     * <code>optional int32 total = 5;</code>
     */
    public Builder setTotal(int value) {
      
      total_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 total = 5;</code>
     */
    public Builder clearTotal() {
      
      total_ = 0;
      onChanged();
      return this;
    }

    private java.util.List<com.google.protobuf.ByteString> data_ = java.util.Collections.emptyList();
    private void ensureDataIsMutable() {
      if (!((bitField0_ & 0x00000020) == 0x00000020)) {
        data_ = new java.util.ArrayList<com.google.protobuf.ByteString>(data_);
        bitField0_ |= 0x00000020;
       }
    }
    /**
     * <code>repeated bytes data = 6;</code>
     */
    public java.util.List<com.google.protobuf.ByteString>
        getDataList() {
      return java.util.Collections.unmodifiableList(data_);
    }
    /**
     * <code>repeated bytes data = 6;</code>
     */
    public int getDataCount() {
      return data_.size();
    }
    /**
     * <code>repeated bytes data = 6;</code>
     */
    public com.google.protobuf.ByteString getData(int index) {
      return data_.get(index);
    }
    /**
     * <code>repeated bytes data = 6;</code>
     */
    public Builder setData(
        int index, com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureDataIsMutable();
      data_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated bytes data = 6;</code>
     */
    public Builder addData(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureDataIsMutable();
      data_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated bytes data = 6;</code>
     */
    public Builder addAllData(
        java.lang.Iterable<? extends com.google.protobuf.ByteString> values) {
      ensureDataIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, data_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated bytes data = 6;</code>
     */
    public Builder clearData() {
      data_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000020);
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList errors_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureErrorsIsMutable() {
      if (!((bitField0_ & 0x00000040) == 0x00000040)) {
        errors_ = new com.google.protobuf.LazyStringArrayList(errors_);
        bitField0_ |= 0x00000040;
       }
    }
    /**
     * <code>repeated string errors = 7;</code>
     */
    public com.google.protobuf.ProtocolStringList
        getErrorsList() {
      return errors_.getUnmodifiableView();
    }
    /**
     * <code>repeated string errors = 7;</code>
     */
    public int getErrorsCount() {
      return errors_.size();
    }
    /**
     * <code>repeated string errors = 7;</code>
     */
    public java.lang.String getErrors(int index) {
      return errors_.get(index);
    }
    /**
     * <code>repeated string errors = 7;</code>
     */
    public com.google.protobuf.ByteString
        getErrorsBytes(int index) {
      return errors_.getByteString(index);
    }
    /**
     * <code>repeated string errors = 7;</code>
     */
    public Builder setErrors(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureErrorsIsMutable();
      errors_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string errors = 7;</code>
     */
    public Builder addErrors(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureErrorsIsMutable();
      errors_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string errors = 7;</code>
     */
    public Builder addAllErrors(
        java.lang.Iterable<java.lang.String> values) {
      ensureErrorsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, errors_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string errors = 7;</code>
     */
    public Builder clearErrors() {
      errors_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000040);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string errors = 7;</code>
     */
    public Builder addErrorsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureErrorsIsMutable();
      errors_.add(value);
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:PAppResponse)
  }

  // @@protoc_insertion_point(class_scope:PAppResponse)
  private static final com.argo.web.protobuf.PAppResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.argo.web.protobuf.PAppResponse();
  }

  public static com.argo.web.protobuf.PAppResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PAppResponse>
      PARSER = new com.google.protobuf.AbstractParser<PAppResponse>() {
    public PAppResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new PAppResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PAppResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PAppResponse> getParserForType() {
    return PARSER;
  }

  public com.argo.web.protobuf.PAppResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

