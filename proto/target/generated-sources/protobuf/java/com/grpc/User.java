// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: schema.proto

package com.grpc;

/**
 * Protobuf type {@code com.grpc.User}
 */
public  final class User extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.grpc.User)
    UserOrBuilder {
  // Use User.newBuilder() to construct.
  private User(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private User() {
    id_ = "";
    dices_ = java.util.Collections.emptyList();
    queue_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private User(
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

            id_ = s;
            break;
          }
          case 18: {
            com.grpc.Room.Builder subBuilder = null;
            if (room_ != null) {
              subBuilder = room_.toBuilder();
            }
            room_ = input.readMessage(com.grpc.Room.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(room_);
              room_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            if (!((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
              dices_ = new java.util.ArrayList<com.grpc.Dice>();
              mutable_bitField0_ |= 0x00000004;
            }
            dices_.add(
                input.readMessage(com.grpc.Dice.parser(), extensionRegistry));
            break;
          }
          case 32: {

            queue_ = input.readInt32();
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
      if (((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
        dices_ = java.util.Collections.unmodifiableList(dices_);
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.grpc.Schema.internal_static_com_grpc_User_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.grpc.Schema.internal_static_com_grpc_User_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.grpc.User.class, com.grpc.User.Builder.class);
  }

  private int bitField0_;
  public static final int ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object id_;
  /**
   * <code>string id = 1;</code>
   */
  public java.lang.String getId() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      id_ = s;
      return s;
    }
  }
  /**
   * <code>string id = 1;</code>
   */
  public com.google.protobuf.ByteString
      getIdBytes() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      id_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ROOM_FIELD_NUMBER = 2;
  private com.grpc.Room room_;
  /**
   * <code>.com.grpc.Room room = 2;</code>
   */
  public boolean hasRoom() {
    return room_ != null;
  }
  /**
   * <code>.com.grpc.Room room = 2;</code>
   */
  public com.grpc.Room getRoom() {
    return room_ == null ? com.grpc.Room.getDefaultInstance() : room_;
  }
  /**
   * <code>.com.grpc.Room room = 2;</code>
   */
  public com.grpc.RoomOrBuilder getRoomOrBuilder() {
    return getRoom();
  }

  public static final int DICES_FIELD_NUMBER = 3;
  private java.util.List<com.grpc.Dice> dices_;
  /**
   * <code>repeated .com.grpc.Dice dices = 3;</code>
   */
  public java.util.List<com.grpc.Dice> getDicesList() {
    return dices_;
  }
  /**
   * <code>repeated .com.grpc.Dice dices = 3;</code>
   */
  public java.util.List<? extends com.grpc.DiceOrBuilder> 
      getDicesOrBuilderList() {
    return dices_;
  }
  /**
   * <code>repeated .com.grpc.Dice dices = 3;</code>
   */
  public int getDicesCount() {
    return dices_.size();
  }
  /**
   * <code>repeated .com.grpc.Dice dices = 3;</code>
   */
  public com.grpc.Dice getDices(int index) {
    return dices_.get(index);
  }
  /**
   * <code>repeated .com.grpc.Dice dices = 3;</code>
   */
  public com.grpc.DiceOrBuilder getDicesOrBuilder(
      int index) {
    return dices_.get(index);
  }

  public static final int QUEUE_FIELD_NUMBER = 4;
  private int queue_;
  /**
   * <code>int32 queue = 4;</code>
   */
  public int getQueue() {
    return queue_;
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
    if (!getIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, id_);
    }
    if (room_ != null) {
      output.writeMessage(2, getRoom());
    }
    for (int i = 0; i < dices_.size(); i++) {
      output.writeMessage(3, dices_.get(i));
    }
    if (queue_ != 0) {
      output.writeInt32(4, queue_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, id_);
    }
    if (room_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getRoom());
    }
    for (int i = 0; i < dices_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, dices_.get(i));
    }
    if (queue_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, queue_);
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
    if (!(obj instanceof com.grpc.User)) {
      return super.equals(obj);
    }
    com.grpc.User other = (com.grpc.User) obj;

    boolean result = true;
    result = result && getId()
        .equals(other.getId());
    result = result && (hasRoom() == other.hasRoom());
    if (hasRoom()) {
      result = result && getRoom()
          .equals(other.getRoom());
    }
    result = result && getDicesList()
        .equals(other.getDicesList());
    result = result && (getQueue()
        == other.getQueue());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + getId().hashCode();
    if (hasRoom()) {
      hash = (37 * hash) + ROOM_FIELD_NUMBER;
      hash = (53 * hash) + getRoom().hashCode();
    }
    if (getDicesCount() > 0) {
      hash = (37 * hash) + DICES_FIELD_NUMBER;
      hash = (53 * hash) + getDicesList().hashCode();
    }
    hash = (37 * hash) + QUEUE_FIELD_NUMBER;
    hash = (53 * hash) + getQueue();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.grpc.User parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.grpc.User parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.grpc.User parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.grpc.User parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.grpc.User parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.grpc.User parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.grpc.User parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.grpc.User parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.grpc.User parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.grpc.User parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.grpc.User parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.grpc.User parseFrom(
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
  public static Builder newBuilder(com.grpc.User prototype) {
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
   * Protobuf type {@code com.grpc.User}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.grpc.User)
      com.grpc.UserOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.grpc.Schema.internal_static_com_grpc_User_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.grpc.Schema.internal_static_com_grpc_User_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.grpc.User.class, com.grpc.User.Builder.class);
    }

    // Construct using com.grpc.User.newBuilder()
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
        getDicesFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      id_ = "";

      if (roomBuilder_ == null) {
        room_ = null;
      } else {
        room_ = null;
        roomBuilder_ = null;
      }
      if (dicesBuilder_ == null) {
        dices_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
      } else {
        dicesBuilder_.clear();
      }
      queue_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.grpc.Schema.internal_static_com_grpc_User_descriptor;
    }

    public com.grpc.User getDefaultInstanceForType() {
      return com.grpc.User.getDefaultInstance();
    }

    public com.grpc.User build() {
      com.grpc.User result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.grpc.User buildPartial() {
      com.grpc.User result = new com.grpc.User(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.id_ = id_;
      if (roomBuilder_ == null) {
        result.room_ = room_;
      } else {
        result.room_ = roomBuilder_.build();
      }
      if (dicesBuilder_ == null) {
        if (((bitField0_ & 0x00000004) == 0x00000004)) {
          dices_ = java.util.Collections.unmodifiableList(dices_);
          bitField0_ = (bitField0_ & ~0x00000004);
        }
        result.dices_ = dices_;
      } else {
        result.dices_ = dicesBuilder_.build();
      }
      result.queue_ = queue_;
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
      if (other instanceof com.grpc.User) {
        return mergeFrom((com.grpc.User)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.grpc.User other) {
      if (other == com.grpc.User.getDefaultInstance()) return this;
      if (!other.getId().isEmpty()) {
        id_ = other.id_;
        onChanged();
      }
      if (other.hasRoom()) {
        mergeRoom(other.getRoom());
      }
      if (dicesBuilder_ == null) {
        if (!other.dices_.isEmpty()) {
          if (dices_.isEmpty()) {
            dices_ = other.dices_;
            bitField0_ = (bitField0_ & ~0x00000004);
          } else {
            ensureDicesIsMutable();
            dices_.addAll(other.dices_);
          }
          onChanged();
        }
      } else {
        if (!other.dices_.isEmpty()) {
          if (dicesBuilder_.isEmpty()) {
            dicesBuilder_.dispose();
            dicesBuilder_ = null;
            dices_ = other.dices_;
            bitField0_ = (bitField0_ & ~0x00000004);
            dicesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getDicesFieldBuilder() : null;
          } else {
            dicesBuilder_.addAllMessages(other.dices_);
          }
        }
      }
      if (other.getQueue() != 0) {
        setQueue(other.getQueue());
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
      com.grpc.User parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.grpc.User) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object id_ = "";
    /**
     * <code>string id = 1;</code>
     */
    public java.lang.String getId() {
      java.lang.Object ref = id_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        id_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string id = 1;</code>
     */
    public com.google.protobuf.ByteString
        getIdBytes() {
      java.lang.Object ref = id_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        id_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string id = 1;</code>
     */
    public Builder setId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string id = 1;</code>
     */
    public Builder clearId() {
      
      id_ = getDefaultInstance().getId();
      onChanged();
      return this;
    }
    /**
     * <code>string id = 1;</code>
     */
    public Builder setIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      id_ = value;
      onChanged();
      return this;
    }

    private com.grpc.Room room_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.grpc.Room, com.grpc.Room.Builder, com.grpc.RoomOrBuilder> roomBuilder_;
    /**
     * <code>.com.grpc.Room room = 2;</code>
     */
    public boolean hasRoom() {
      return roomBuilder_ != null || room_ != null;
    }
    /**
     * <code>.com.grpc.Room room = 2;</code>
     */
    public com.grpc.Room getRoom() {
      if (roomBuilder_ == null) {
        return room_ == null ? com.grpc.Room.getDefaultInstance() : room_;
      } else {
        return roomBuilder_.getMessage();
      }
    }
    /**
     * <code>.com.grpc.Room room = 2;</code>
     */
    public Builder setRoom(com.grpc.Room value) {
      if (roomBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        room_ = value;
        onChanged();
      } else {
        roomBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.com.grpc.Room room = 2;</code>
     */
    public Builder setRoom(
        com.grpc.Room.Builder builderForValue) {
      if (roomBuilder_ == null) {
        room_ = builderForValue.build();
        onChanged();
      } else {
        roomBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.com.grpc.Room room = 2;</code>
     */
    public Builder mergeRoom(com.grpc.Room value) {
      if (roomBuilder_ == null) {
        if (room_ != null) {
          room_ =
            com.grpc.Room.newBuilder(room_).mergeFrom(value).buildPartial();
        } else {
          room_ = value;
        }
        onChanged();
      } else {
        roomBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.com.grpc.Room room = 2;</code>
     */
    public Builder clearRoom() {
      if (roomBuilder_ == null) {
        room_ = null;
        onChanged();
      } else {
        room_ = null;
        roomBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.com.grpc.Room room = 2;</code>
     */
    public com.grpc.Room.Builder getRoomBuilder() {
      
      onChanged();
      return getRoomFieldBuilder().getBuilder();
    }
    /**
     * <code>.com.grpc.Room room = 2;</code>
     */
    public com.grpc.RoomOrBuilder getRoomOrBuilder() {
      if (roomBuilder_ != null) {
        return roomBuilder_.getMessageOrBuilder();
      } else {
        return room_ == null ?
            com.grpc.Room.getDefaultInstance() : room_;
      }
    }
    /**
     * <code>.com.grpc.Room room = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.grpc.Room, com.grpc.Room.Builder, com.grpc.RoomOrBuilder> 
        getRoomFieldBuilder() {
      if (roomBuilder_ == null) {
        roomBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.grpc.Room, com.grpc.Room.Builder, com.grpc.RoomOrBuilder>(
                getRoom(),
                getParentForChildren(),
                isClean());
        room_ = null;
      }
      return roomBuilder_;
    }

    private java.util.List<com.grpc.Dice> dices_ =
      java.util.Collections.emptyList();
    private void ensureDicesIsMutable() {
      if (!((bitField0_ & 0x00000004) == 0x00000004)) {
        dices_ = new java.util.ArrayList<com.grpc.Dice>(dices_);
        bitField0_ |= 0x00000004;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.grpc.Dice, com.grpc.Dice.Builder, com.grpc.DiceOrBuilder> dicesBuilder_;

    /**
     * <code>repeated .com.grpc.Dice dices = 3;</code>
     */
    public java.util.List<com.grpc.Dice> getDicesList() {
      if (dicesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(dices_);
      } else {
        return dicesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .com.grpc.Dice dices = 3;</code>
     */
    public int getDicesCount() {
      if (dicesBuilder_ == null) {
        return dices_.size();
      } else {
        return dicesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .com.grpc.Dice dices = 3;</code>
     */
    public com.grpc.Dice getDices(int index) {
      if (dicesBuilder_ == null) {
        return dices_.get(index);
      } else {
        return dicesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .com.grpc.Dice dices = 3;</code>
     */
    public Builder setDices(
        int index, com.grpc.Dice value) {
      if (dicesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDicesIsMutable();
        dices_.set(index, value);
        onChanged();
      } else {
        dicesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .com.grpc.Dice dices = 3;</code>
     */
    public Builder setDices(
        int index, com.grpc.Dice.Builder builderForValue) {
      if (dicesBuilder_ == null) {
        ensureDicesIsMutable();
        dices_.set(index, builderForValue.build());
        onChanged();
      } else {
        dicesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.grpc.Dice dices = 3;</code>
     */
    public Builder addDices(com.grpc.Dice value) {
      if (dicesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDicesIsMutable();
        dices_.add(value);
        onChanged();
      } else {
        dicesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .com.grpc.Dice dices = 3;</code>
     */
    public Builder addDices(
        int index, com.grpc.Dice value) {
      if (dicesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDicesIsMutable();
        dices_.add(index, value);
        onChanged();
      } else {
        dicesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .com.grpc.Dice dices = 3;</code>
     */
    public Builder addDices(
        com.grpc.Dice.Builder builderForValue) {
      if (dicesBuilder_ == null) {
        ensureDicesIsMutable();
        dices_.add(builderForValue.build());
        onChanged();
      } else {
        dicesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.grpc.Dice dices = 3;</code>
     */
    public Builder addDices(
        int index, com.grpc.Dice.Builder builderForValue) {
      if (dicesBuilder_ == null) {
        ensureDicesIsMutable();
        dices_.add(index, builderForValue.build());
        onChanged();
      } else {
        dicesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.grpc.Dice dices = 3;</code>
     */
    public Builder addAllDices(
        java.lang.Iterable<? extends com.grpc.Dice> values) {
      if (dicesBuilder_ == null) {
        ensureDicesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, dices_);
        onChanged();
      } else {
        dicesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .com.grpc.Dice dices = 3;</code>
     */
    public Builder clearDices() {
      if (dicesBuilder_ == null) {
        dices_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
      } else {
        dicesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .com.grpc.Dice dices = 3;</code>
     */
    public Builder removeDices(int index) {
      if (dicesBuilder_ == null) {
        ensureDicesIsMutable();
        dices_.remove(index);
        onChanged();
      } else {
        dicesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .com.grpc.Dice dices = 3;</code>
     */
    public com.grpc.Dice.Builder getDicesBuilder(
        int index) {
      return getDicesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .com.grpc.Dice dices = 3;</code>
     */
    public com.grpc.DiceOrBuilder getDicesOrBuilder(
        int index) {
      if (dicesBuilder_ == null) {
        return dices_.get(index);  } else {
        return dicesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .com.grpc.Dice dices = 3;</code>
     */
    public java.util.List<? extends com.grpc.DiceOrBuilder> 
         getDicesOrBuilderList() {
      if (dicesBuilder_ != null) {
        return dicesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(dices_);
      }
    }
    /**
     * <code>repeated .com.grpc.Dice dices = 3;</code>
     */
    public com.grpc.Dice.Builder addDicesBuilder() {
      return getDicesFieldBuilder().addBuilder(
          com.grpc.Dice.getDefaultInstance());
    }
    /**
     * <code>repeated .com.grpc.Dice dices = 3;</code>
     */
    public com.grpc.Dice.Builder addDicesBuilder(
        int index) {
      return getDicesFieldBuilder().addBuilder(
          index, com.grpc.Dice.getDefaultInstance());
    }
    /**
     * <code>repeated .com.grpc.Dice dices = 3;</code>
     */
    public java.util.List<com.grpc.Dice.Builder> 
         getDicesBuilderList() {
      return getDicesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.grpc.Dice, com.grpc.Dice.Builder, com.grpc.DiceOrBuilder> 
        getDicesFieldBuilder() {
      if (dicesBuilder_ == null) {
        dicesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.grpc.Dice, com.grpc.Dice.Builder, com.grpc.DiceOrBuilder>(
                dices_,
                ((bitField0_ & 0x00000004) == 0x00000004),
                getParentForChildren(),
                isClean());
        dices_ = null;
      }
      return dicesBuilder_;
    }

    private int queue_ ;
    /**
     * <code>int32 queue = 4;</code>
     */
    public int getQueue() {
      return queue_;
    }
    /**
     * <code>int32 queue = 4;</code>
     */
    public Builder setQueue(int value) {
      
      queue_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 queue = 4;</code>
     */
    public Builder clearQueue() {
      
      queue_ = 0;
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


    // @@protoc_insertion_point(builder_scope:com.grpc.User)
  }

  // @@protoc_insertion_point(class_scope:com.grpc.User)
  private static final com.grpc.User DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.grpc.User();
  }

  public static com.grpc.User getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<User>
      PARSER = new com.google.protobuf.AbstractParser<User>() {
    public User parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new User(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<User> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<User> getParserForType() {
    return PARSER;
  }

  public com.grpc.User getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

