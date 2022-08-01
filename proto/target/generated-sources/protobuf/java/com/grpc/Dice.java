// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: schema.proto

package com.grpc;

/**
 * Protobuf type {@code com.grpc.Dice}
 */
public  final class Dice extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.grpc.Dice)
    DiceOrBuilder {
  // Use Dice.newBuilder() to construct.
  private Dice(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Dice() {
    number_ = 0;
    diceColor_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private Dice(
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
          case 8: {

            number_ = input.readInt32();
            break;
          }
          case 16: {
            int rawValue = input.readEnum();

            diceColor_ = rawValue;
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
    return com.grpc.Schema.internal_static_com_grpc_Dice_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.grpc.Schema.internal_static_com_grpc_Dice_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.grpc.Dice.class, com.grpc.Dice.Builder.class);
  }

  /**
   * Protobuf enum {@code com.grpc.Dice.Type}
   */
  public enum Type
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>white = 0;</code>
     */
    white(0),
    /**
     * <code>secondWhite = 1;</code>
     */
    secondWhite(1),
    /**
     * <code>blue = 2;</code>
     */
    blue(2),
    /**
     * <code>green = 3;</code>
     */
    green(3),
    /**
     * <code>red = 4;</code>
     */
    red(4),
    /**
     * <code>yellow = 5;</code>
     */
    yellow(5),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>white = 0;</code>
     */
    public static final int white_VALUE = 0;
    /**
     * <code>secondWhite = 1;</code>
     */
    public static final int secondWhite_VALUE = 1;
    /**
     * <code>blue = 2;</code>
     */
    public static final int blue_VALUE = 2;
    /**
     * <code>green = 3;</code>
     */
    public static final int green_VALUE = 3;
    /**
     * <code>red = 4;</code>
     */
    public static final int red_VALUE = 4;
    /**
     * <code>yellow = 5;</code>
     */
    public static final int yellow_VALUE = 5;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static Type valueOf(int value) {
      return forNumber(value);
    }

    public static Type forNumber(int value) {
      switch (value) {
        case 0: return white;
        case 1: return secondWhite;
        case 2: return blue;
        case 3: return green;
        case 4: return red;
        case 5: return yellow;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Type>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Type> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Type>() {
            public Type findValueByNumber(int number) {
              return Type.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.grpc.Dice.getDescriptor().getEnumTypes().get(0);
    }

    private static final Type[] VALUES = values();

    public static Type valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Type(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:com.grpc.Dice.Type)
  }

  public static final int NUMBER_FIELD_NUMBER = 1;
  private int number_;
  /**
   * <code>int32 number = 1;</code>
   */
  public int getNumber() {
    return number_;
  }

  public static final int DICECOLOR_FIELD_NUMBER = 2;
  private int diceColor_;
  /**
   * <code>.com.grpc.Dice.Type diceColor = 2;</code>
   */
  public int getDiceColorValue() {
    return diceColor_;
  }
  /**
   * <code>.com.grpc.Dice.Type diceColor = 2;</code>
   */
  public com.grpc.Dice.Type getDiceColor() {
    com.grpc.Dice.Type result = com.grpc.Dice.Type.valueOf(diceColor_);
    return result == null ? com.grpc.Dice.Type.UNRECOGNIZED : result;
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
    if (number_ != 0) {
      output.writeInt32(1, number_);
    }
    if (diceColor_ != com.grpc.Dice.Type.white.getNumber()) {
      output.writeEnum(2, diceColor_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (number_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, number_);
    }
    if (diceColor_ != com.grpc.Dice.Type.white.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, diceColor_);
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
    if (!(obj instanceof com.grpc.Dice)) {
      return super.equals(obj);
    }
    com.grpc.Dice other = (com.grpc.Dice) obj;

    boolean result = true;
    result = result && (getNumber()
        == other.getNumber());
    result = result && diceColor_ == other.diceColor_;
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + NUMBER_FIELD_NUMBER;
    hash = (53 * hash) + getNumber();
    hash = (37 * hash) + DICECOLOR_FIELD_NUMBER;
    hash = (53 * hash) + diceColor_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.grpc.Dice parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.grpc.Dice parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.grpc.Dice parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.grpc.Dice parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.grpc.Dice parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.grpc.Dice parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.grpc.Dice parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.grpc.Dice parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.grpc.Dice parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.grpc.Dice parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.grpc.Dice parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.grpc.Dice parseFrom(
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
  public static Builder newBuilder(com.grpc.Dice prototype) {
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
   * Protobuf type {@code com.grpc.Dice}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.grpc.Dice)
      com.grpc.DiceOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.grpc.Schema.internal_static_com_grpc_Dice_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.grpc.Schema.internal_static_com_grpc_Dice_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.grpc.Dice.class, com.grpc.Dice.Builder.class);
    }

    // Construct using com.grpc.Dice.newBuilder()
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
      number_ = 0;

      diceColor_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.grpc.Schema.internal_static_com_grpc_Dice_descriptor;
    }

    public com.grpc.Dice getDefaultInstanceForType() {
      return com.grpc.Dice.getDefaultInstance();
    }

    public com.grpc.Dice build() {
      com.grpc.Dice result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.grpc.Dice buildPartial() {
      com.grpc.Dice result = new com.grpc.Dice(this);
      result.number_ = number_;
      result.diceColor_ = diceColor_;
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
      if (other instanceof com.grpc.Dice) {
        return mergeFrom((com.grpc.Dice)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.grpc.Dice other) {
      if (other == com.grpc.Dice.getDefaultInstance()) return this;
      if (other.getNumber() != 0) {
        setNumber(other.getNumber());
      }
      if (other.diceColor_ != 0) {
        setDiceColorValue(other.getDiceColorValue());
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
      com.grpc.Dice parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.grpc.Dice) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int number_ ;
    /**
     * <code>int32 number = 1;</code>
     */
    public int getNumber() {
      return number_;
    }
    /**
     * <code>int32 number = 1;</code>
     */
    public Builder setNumber(int value) {
      
      number_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 number = 1;</code>
     */
    public Builder clearNumber() {
      
      number_ = 0;
      onChanged();
      return this;
    }

    private int diceColor_ = 0;
    /**
     * <code>.com.grpc.Dice.Type diceColor = 2;</code>
     */
    public int getDiceColorValue() {
      return diceColor_;
    }
    /**
     * <code>.com.grpc.Dice.Type diceColor = 2;</code>
     */
    public Builder setDiceColorValue(int value) {
      diceColor_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.com.grpc.Dice.Type diceColor = 2;</code>
     */
    public com.grpc.Dice.Type getDiceColor() {
      com.grpc.Dice.Type result = com.grpc.Dice.Type.valueOf(diceColor_);
      return result == null ? com.grpc.Dice.Type.UNRECOGNIZED : result;
    }
    /**
     * <code>.com.grpc.Dice.Type diceColor = 2;</code>
     */
    public Builder setDiceColor(com.grpc.Dice.Type value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      diceColor_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.com.grpc.Dice.Type diceColor = 2;</code>
     */
    public Builder clearDiceColor() {
      
      diceColor_ = 0;
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


    // @@protoc_insertion_point(builder_scope:com.grpc.Dice)
  }

  // @@protoc_insertion_point(class_scope:com.grpc.Dice)
  private static final com.grpc.Dice DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.grpc.Dice();
  }

  public static com.grpc.Dice getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Dice>
      PARSER = new com.google.protobuf.AbstractParser<Dice>() {
    public Dice parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new Dice(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Dice> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Dice> getParserForType() {
    return PARSER;
  }

  public com.grpc.Dice getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

