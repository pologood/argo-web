// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PAppRequest.proto

package com.argo.sdk.protobuf;

/**
 * Protobuf type {@code PAppRequestParam}
 */
public  final class PAppRequestParam extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:PAppRequestParam)
    PAppRequestParamOrBuilder {
  // Use PAppRequestParam.newBuilder() to construct.
  private PAppRequestParam(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PAppRequestParam() {
    name_ = "";
    intValue_ = 0;
    strValue_ = "";
    longValue_ = 0L;
    floatValue_ = 0F;
    boolValue_ = false;
    bytesValue_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private PAppRequestParam(
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

            name_ = s;
            break;
          }
          case 16: {

            intValue_ = input.readInt32();
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            strValue_ = s;
            break;
          }
          case 32: {

            longValue_ = input.readInt64();
            break;
          }
          case 45: {

            floatValue_ = input.readFloat();
            break;
          }
          case 48: {

            boolValue_ = input.readBool();
            break;
          }
          case 58: {

            bytesValue_ = input.readBytes();
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
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.argo.sdk.protobuf.PAppRequestProto.internal_static_PAppRequestParam_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.argo.sdk.protobuf.PAppRequestProto.internal_static_PAppRequestParam_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.argo.sdk.protobuf.PAppRequestParam.class, com.argo.sdk.protobuf.PAppRequestParam.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   * <code>optional string name = 1;</code>
   */
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
   * <code>optional string name = 1;</code>
   */
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

  public static final int INTVALUE_FIELD_NUMBER = 2;
  private int intValue_;
  /**
   * <code>optional int32 intValue = 2;</code>
   */
  public int getIntValue() {
    return intValue_;
  }

  public static final int STRVALUE_FIELD_NUMBER = 3;
  private volatile java.lang.Object strValue_;
  /**
   * <code>optional string strValue = 3;</code>
   */
  public java.lang.String getStrValue() {
    java.lang.Object ref = strValue_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      strValue_ = s;
      return s;
    }
  }
  /**
   * <code>optional string strValue = 3;</code>
   */
  public com.google.protobuf.ByteString
      getStrValueBytes() {
    java.lang.Object ref = strValue_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      strValue_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LONGVALUE_FIELD_NUMBER = 4;
  private long longValue_;
  /**
   * <code>optional int64 longValue = 4;</code>
   */
  public long getLongValue() {
    return longValue_;
  }

  public static final int FLOATVALUE_FIELD_NUMBER = 5;
  private float floatValue_;
  /**
   * <code>optional float floatValue = 5;</code>
   */
  public float getFloatValue() {
    return floatValue_;
  }

  public static final int BOOLVALUE_FIELD_NUMBER = 6;
  private boolean boolValue_;
  /**
   * <code>optional bool boolValue = 6;</code>
   */
  public boolean getBoolValue() {
    return boolValue_;
  }

  public static final int BYTESVALUE_FIELD_NUMBER = 7;
  private com.google.protobuf.ByteString bytesValue_;
  /**
   * <code>optional bytes bytesValue = 7;</code>
   */
  public com.google.protobuf.ByteString getBytesValue() {
    return bytesValue_;
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
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (intValue_ != 0) {
      output.writeInt32(2, intValue_);
    }
    if (!getStrValueBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, strValue_);
    }
    if (longValue_ != 0L) {
      output.writeInt64(4, longValue_);
    }
    if (floatValue_ != 0F) {
      output.writeFloat(5, floatValue_);
    }
    if (boolValue_ != false) {
      output.writeBool(6, boolValue_);
    }
    if (!bytesValue_.isEmpty()) {
      output.writeBytes(7, bytesValue_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (intValue_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, intValue_);
    }
    if (!getStrValueBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, strValue_);
    }
    if (longValue_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, longValue_);
    }
    if (floatValue_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(5, floatValue_);
    }
    if (boolValue_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(6, boolValue_);
    }
    if (!bytesValue_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(7, bytesValue_);
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
    if (!(obj instanceof com.argo.sdk.protobuf.PAppRequestParam)) {
      return super.equals(obj);
    }
    com.argo.sdk.protobuf.PAppRequestParam other = (com.argo.sdk.protobuf.PAppRequestParam) obj;

    boolean result = true;
    result = result && getName()
        .equals(other.getName());
    result = result && (getIntValue()
        == other.getIntValue());
    result = result && getStrValue()
        .equals(other.getStrValue());
    result = result && (getLongValue()
        == other.getLongValue());
    result = result && (
        java.lang.Float.floatToIntBits(getFloatValue())
        == java.lang.Float.floatToIntBits(
            other.getFloatValue()));
    result = result && (getBoolValue()
        == other.getBoolValue());
    result = result && getBytesValue()
        .equals(other.getBytesValue());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + INTVALUE_FIELD_NUMBER;
    hash = (53 * hash) + getIntValue();
    hash = (37 * hash) + STRVALUE_FIELD_NUMBER;
    hash = (53 * hash) + getStrValue().hashCode();
    hash = (37 * hash) + LONGVALUE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getLongValue());
    hash = (37 * hash) + FLOATVALUE_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getFloatValue());
    hash = (37 * hash) + BOOLVALUE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getBoolValue());
    hash = (37 * hash) + BYTESVALUE_FIELD_NUMBER;
    hash = (53 * hash) + getBytesValue().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.argo.sdk.protobuf.PAppRequestParam parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.argo.sdk.protobuf.PAppRequestParam parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.argo.sdk.protobuf.PAppRequestParam parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.argo.sdk.protobuf.PAppRequestParam parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.argo.sdk.protobuf.PAppRequestParam parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.argo.sdk.protobuf.PAppRequestParam parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.argo.sdk.protobuf.PAppRequestParam parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.argo.sdk.protobuf.PAppRequestParam parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.argo.sdk.protobuf.PAppRequestParam parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.argo.sdk.protobuf.PAppRequestParam parseFrom(
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
  public static Builder newBuilder(com.argo.sdk.protobuf.PAppRequestParam prototype) {
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
   * Protobuf type {@code PAppRequestParam}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:PAppRequestParam)
      com.argo.sdk.protobuf.PAppRequestParamOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.argo.sdk.protobuf.PAppRequestProto.internal_static_PAppRequestParam_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.argo.sdk.protobuf.PAppRequestProto.internal_static_PAppRequestParam_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.argo.sdk.protobuf.PAppRequestParam.class, com.argo.sdk.protobuf.PAppRequestParam.Builder.class);
    }

    // Construct using com.argo.sdk.protobuf.PAppRequestParam.newBuilder()
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
      name_ = "";

      intValue_ = 0;

      strValue_ = "";

      longValue_ = 0L;

      floatValue_ = 0F;

      boolValue_ = false;

      bytesValue_ = com.google.protobuf.ByteString.EMPTY;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.argo.sdk.protobuf.PAppRequestProto.internal_static_PAppRequestParam_descriptor;
    }

    public com.argo.sdk.protobuf.PAppRequestParam getDefaultInstanceForType() {
      return com.argo.sdk.protobuf.PAppRequestParam.getDefaultInstance();
    }

    public com.argo.sdk.protobuf.PAppRequestParam build() {
      com.argo.sdk.protobuf.PAppRequestParam result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.argo.sdk.protobuf.PAppRequestParam buildPartial() {
      com.argo.sdk.protobuf.PAppRequestParam result = new com.argo.sdk.protobuf.PAppRequestParam(this);
      result.name_ = name_;
      result.intValue_ = intValue_;
      result.strValue_ = strValue_;
      result.longValue_ = longValue_;
      result.floatValue_ = floatValue_;
      result.boolValue_ = boolValue_;
      result.bytesValue_ = bytesValue_;
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
      if (other instanceof com.argo.sdk.protobuf.PAppRequestParam) {
        return mergeFrom((com.argo.sdk.protobuf.PAppRequestParam)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.argo.sdk.protobuf.PAppRequestParam other) {
      if (other == com.argo.sdk.protobuf.PAppRequestParam.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (other.getIntValue() != 0) {
        setIntValue(other.getIntValue());
      }
      if (!other.getStrValue().isEmpty()) {
        strValue_ = other.strValue_;
        onChanged();
      }
      if (other.getLongValue() != 0L) {
        setLongValue(other.getLongValue());
      }
      if (other.getFloatValue() != 0F) {
        setFloatValue(other.getFloatValue());
      }
      if (other.getBoolValue() != false) {
        setBoolValue(other.getBoolValue());
      }
      if (other.getBytesValue() != com.google.protobuf.ByteString.EMPTY) {
        setBytesValue(other.getBytesValue());
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
      com.argo.sdk.protobuf.PAppRequestParam parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.argo.sdk.protobuf.PAppRequestParam) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <code>optional string name = 1;</code>
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
     * <code>optional string name = 1;</code>
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
     * <code>optional string name = 1;</code>
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
     * <code>optional string name = 1;</code>
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <code>optional string name = 1;</code>
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

    private int intValue_ ;
    /**
     * <code>optional int32 intValue = 2;</code>
     */
    public int getIntValue() {
      return intValue_;
    }
    /**
     * <code>optional int32 intValue = 2;</code>
     */
    public Builder setIntValue(int value) {
      
      intValue_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 intValue = 2;</code>
     */
    public Builder clearIntValue() {
      
      intValue_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object strValue_ = "";
    /**
     * <code>optional string strValue = 3;</code>
     */
    public java.lang.String getStrValue() {
      java.lang.Object ref = strValue_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        strValue_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string strValue = 3;</code>
     */
    public com.google.protobuf.ByteString
        getStrValueBytes() {
      java.lang.Object ref = strValue_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        strValue_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string strValue = 3;</code>
     */
    public Builder setStrValue(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      strValue_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string strValue = 3;</code>
     */
    public Builder clearStrValue() {
      
      strValue_ = getDefaultInstance().getStrValue();
      onChanged();
      return this;
    }
    /**
     * <code>optional string strValue = 3;</code>
     */
    public Builder setStrValueBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      strValue_ = value;
      onChanged();
      return this;
    }

    private long longValue_ ;
    /**
     * <code>optional int64 longValue = 4;</code>
     */
    public long getLongValue() {
      return longValue_;
    }
    /**
     * <code>optional int64 longValue = 4;</code>
     */
    public Builder setLongValue(long value) {
      
      longValue_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 longValue = 4;</code>
     */
    public Builder clearLongValue() {
      
      longValue_ = 0L;
      onChanged();
      return this;
    }

    private float floatValue_ ;
    /**
     * <code>optional float floatValue = 5;</code>
     */
    public float getFloatValue() {
      return floatValue_;
    }
    /**
     * <code>optional float floatValue = 5;</code>
     */
    public Builder setFloatValue(float value) {
      
      floatValue_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional float floatValue = 5;</code>
     */
    public Builder clearFloatValue() {
      
      floatValue_ = 0F;
      onChanged();
      return this;
    }

    private boolean boolValue_ ;
    /**
     * <code>optional bool boolValue = 6;</code>
     */
    public boolean getBoolValue() {
      return boolValue_;
    }
    /**
     * <code>optional bool boolValue = 6;</code>
     */
    public Builder setBoolValue(boolean value) {
      
      boolValue_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional bool boolValue = 6;</code>
     */
    public Builder clearBoolValue() {
      
      boolValue_ = false;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString bytesValue_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>optional bytes bytesValue = 7;</code>
     */
    public com.google.protobuf.ByteString getBytesValue() {
      return bytesValue_;
    }
    /**
     * <code>optional bytes bytesValue = 7;</code>
     */
    public Builder setBytesValue(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      bytesValue_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional bytes bytesValue = 7;</code>
     */
    public Builder clearBytesValue() {
      
      bytesValue_ = getDefaultInstance().getBytesValue();
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


    // @@protoc_insertion_point(builder_scope:PAppRequestParam)
  }

  // @@protoc_insertion_point(class_scope:PAppRequestParam)
  private static final com.argo.sdk.protobuf.PAppRequestParam DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.argo.sdk.protobuf.PAppRequestParam();
  }

  public static com.argo.sdk.protobuf.PAppRequestParam getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PAppRequestParam>
      PARSER = new com.google.protobuf.AbstractParser<PAppRequestParam>() {
    public PAppRequestParam parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new PAppRequestParam(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PAppRequestParam> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PAppRequestParam> getParserForType() {
    return PARSER;
  }

  public com.argo.sdk.protobuf.PAppRequestParam getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

