// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protobuf.proto

package dk.via.mithus.protobuf;

/**
 * Protobuf type {@code dk.via.mithus.protobuf.Chats}
 */
public final class Chats extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:dk.via.mithus.protobuf.Chats)
    ChatsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Chats.newBuilder() to construct.
  private Chats(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Chats() {
    chats_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Chats();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Chats(
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
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              chats_ = new java.util.ArrayList<dk.via.mithus.protobuf.Chat>();
              mutable_bitField0_ |= 0x00000001;
            }
            chats_.add(
                input.readMessage(dk.via.mithus.protobuf.Chat.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        chats_ = java.util.Collections.unmodifiableList(chats_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return dk.via.mithus.protobuf.Protobuf.internal_static_dk_via_mithus_protobuf_Chats_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return dk.via.mithus.protobuf.Protobuf.internal_static_dk_via_mithus_protobuf_Chats_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            dk.via.mithus.protobuf.Chats.class, dk.via.mithus.protobuf.Chats.Builder.class);
  }

  public static final int CHATS_FIELD_NUMBER = 1;
  private java.util.List<dk.via.mithus.protobuf.Chat> chats_;
  /**
   * <code>repeated .dk.via.mithus.protobuf.Chat chats = 1;</code>
   */
  @java.lang.Override
  public java.util.List<dk.via.mithus.protobuf.Chat> getChatsList() {
    return chats_;
  }
  /**
   * <code>repeated .dk.via.mithus.protobuf.Chat chats = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends dk.via.mithus.protobuf.ChatOrBuilder> 
      getChatsOrBuilderList() {
    return chats_;
  }
  /**
   * <code>repeated .dk.via.mithus.protobuf.Chat chats = 1;</code>
   */
  @java.lang.Override
  public int getChatsCount() {
    return chats_.size();
  }
  /**
   * <code>repeated .dk.via.mithus.protobuf.Chat chats = 1;</code>
   */
  @java.lang.Override
  public dk.via.mithus.protobuf.Chat getChats(int index) {
    return chats_.get(index);
  }
  /**
   * <code>repeated .dk.via.mithus.protobuf.Chat chats = 1;</code>
   */
  @java.lang.Override
  public dk.via.mithus.protobuf.ChatOrBuilder getChatsOrBuilder(
      int index) {
    return chats_.get(index);
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
    for (int i = 0; i < chats_.size(); i++) {
      output.writeMessage(1, chats_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < chats_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, chats_.get(i));
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
    if (!(obj instanceof dk.via.mithus.protobuf.Chats)) {
      return super.equals(obj);
    }
    dk.via.mithus.protobuf.Chats other = (dk.via.mithus.protobuf.Chats) obj;

    if (!getChatsList()
        .equals(other.getChatsList())) return false;
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
    if (getChatsCount() > 0) {
      hash = (37 * hash) + CHATS_FIELD_NUMBER;
      hash = (53 * hash) + getChatsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static dk.via.mithus.protobuf.Chats parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static dk.via.mithus.protobuf.Chats parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static dk.via.mithus.protobuf.Chats parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static dk.via.mithus.protobuf.Chats parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static dk.via.mithus.protobuf.Chats parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static dk.via.mithus.protobuf.Chats parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static dk.via.mithus.protobuf.Chats parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static dk.via.mithus.protobuf.Chats parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static dk.via.mithus.protobuf.Chats parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static dk.via.mithus.protobuf.Chats parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static dk.via.mithus.protobuf.Chats parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static dk.via.mithus.protobuf.Chats parseFrom(
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
  public static Builder newBuilder(dk.via.mithus.protobuf.Chats prototype) {
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
   * Protobuf type {@code dk.via.mithus.protobuf.Chats}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:dk.via.mithus.protobuf.Chats)
      dk.via.mithus.protobuf.ChatsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return dk.via.mithus.protobuf.Protobuf.internal_static_dk_via_mithus_protobuf_Chats_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return dk.via.mithus.protobuf.Protobuf.internal_static_dk_via_mithus_protobuf_Chats_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              dk.via.mithus.protobuf.Chats.class, dk.via.mithus.protobuf.Chats.Builder.class);
    }

    // Construct using dk.via.mithus.protobuf.Chats.newBuilder()
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
        getChatsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (chatsBuilder_ == null) {
        chats_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        chatsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return dk.via.mithus.protobuf.Protobuf.internal_static_dk_via_mithus_protobuf_Chats_descriptor;
    }

    @java.lang.Override
    public dk.via.mithus.protobuf.Chats getDefaultInstanceForType() {
      return dk.via.mithus.protobuf.Chats.getDefaultInstance();
    }

    @java.lang.Override
    public dk.via.mithus.protobuf.Chats build() {
      dk.via.mithus.protobuf.Chats result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public dk.via.mithus.protobuf.Chats buildPartial() {
      dk.via.mithus.protobuf.Chats result = new dk.via.mithus.protobuf.Chats(this);
      int from_bitField0_ = bitField0_;
      if (chatsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          chats_ = java.util.Collections.unmodifiableList(chats_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.chats_ = chats_;
      } else {
        result.chats_ = chatsBuilder_.build();
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
      if (other instanceof dk.via.mithus.protobuf.Chats) {
        return mergeFrom((dk.via.mithus.protobuf.Chats)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(dk.via.mithus.protobuf.Chats other) {
      if (other == dk.via.mithus.protobuf.Chats.getDefaultInstance()) return this;
      if (chatsBuilder_ == null) {
        if (!other.chats_.isEmpty()) {
          if (chats_.isEmpty()) {
            chats_ = other.chats_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureChatsIsMutable();
            chats_.addAll(other.chats_);
          }
          onChanged();
        }
      } else {
        if (!other.chats_.isEmpty()) {
          if (chatsBuilder_.isEmpty()) {
            chatsBuilder_.dispose();
            chatsBuilder_ = null;
            chats_ = other.chats_;
            bitField0_ = (bitField0_ & ~0x00000001);
            chatsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getChatsFieldBuilder() : null;
          } else {
            chatsBuilder_.addAllMessages(other.chats_);
          }
        }
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
      dk.via.mithus.protobuf.Chats parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (dk.via.mithus.protobuf.Chats) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<dk.via.mithus.protobuf.Chat> chats_ =
      java.util.Collections.emptyList();
    private void ensureChatsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        chats_ = new java.util.ArrayList<dk.via.mithus.protobuf.Chat>(chats_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        dk.via.mithus.protobuf.Chat, dk.via.mithus.protobuf.Chat.Builder, dk.via.mithus.protobuf.ChatOrBuilder> chatsBuilder_;

    /**
     * <code>repeated .dk.via.mithus.protobuf.Chat chats = 1;</code>
     */
    public java.util.List<dk.via.mithus.protobuf.Chat> getChatsList() {
      if (chatsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(chats_);
      } else {
        return chatsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .dk.via.mithus.protobuf.Chat chats = 1;</code>
     */
    public int getChatsCount() {
      if (chatsBuilder_ == null) {
        return chats_.size();
      } else {
        return chatsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .dk.via.mithus.protobuf.Chat chats = 1;</code>
     */
    public dk.via.mithus.protobuf.Chat getChats(int index) {
      if (chatsBuilder_ == null) {
        return chats_.get(index);
      } else {
        return chatsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .dk.via.mithus.protobuf.Chat chats = 1;</code>
     */
    public Builder setChats(
        int index, dk.via.mithus.protobuf.Chat value) {
      if (chatsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureChatsIsMutable();
        chats_.set(index, value);
        onChanged();
      } else {
        chatsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .dk.via.mithus.protobuf.Chat chats = 1;</code>
     */
    public Builder setChats(
        int index, dk.via.mithus.protobuf.Chat.Builder builderForValue) {
      if (chatsBuilder_ == null) {
        ensureChatsIsMutable();
        chats_.set(index, builderForValue.build());
        onChanged();
      } else {
        chatsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .dk.via.mithus.protobuf.Chat chats = 1;</code>
     */
    public Builder addChats(dk.via.mithus.protobuf.Chat value) {
      if (chatsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureChatsIsMutable();
        chats_.add(value);
        onChanged();
      } else {
        chatsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .dk.via.mithus.protobuf.Chat chats = 1;</code>
     */
    public Builder addChats(
        int index, dk.via.mithus.protobuf.Chat value) {
      if (chatsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureChatsIsMutable();
        chats_.add(index, value);
        onChanged();
      } else {
        chatsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .dk.via.mithus.protobuf.Chat chats = 1;</code>
     */
    public Builder addChats(
        dk.via.mithus.protobuf.Chat.Builder builderForValue) {
      if (chatsBuilder_ == null) {
        ensureChatsIsMutable();
        chats_.add(builderForValue.build());
        onChanged();
      } else {
        chatsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .dk.via.mithus.protobuf.Chat chats = 1;</code>
     */
    public Builder addChats(
        int index, dk.via.mithus.protobuf.Chat.Builder builderForValue) {
      if (chatsBuilder_ == null) {
        ensureChatsIsMutable();
        chats_.add(index, builderForValue.build());
        onChanged();
      } else {
        chatsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .dk.via.mithus.protobuf.Chat chats = 1;</code>
     */
    public Builder addAllChats(
        java.lang.Iterable<? extends dk.via.mithus.protobuf.Chat> values) {
      if (chatsBuilder_ == null) {
        ensureChatsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, chats_);
        onChanged();
      } else {
        chatsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .dk.via.mithus.protobuf.Chat chats = 1;</code>
     */
    public Builder clearChats() {
      if (chatsBuilder_ == null) {
        chats_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        chatsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .dk.via.mithus.protobuf.Chat chats = 1;</code>
     */
    public Builder removeChats(int index) {
      if (chatsBuilder_ == null) {
        ensureChatsIsMutable();
        chats_.remove(index);
        onChanged();
      } else {
        chatsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .dk.via.mithus.protobuf.Chat chats = 1;</code>
     */
    public dk.via.mithus.protobuf.Chat.Builder getChatsBuilder(
        int index) {
      return getChatsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .dk.via.mithus.protobuf.Chat chats = 1;</code>
     */
    public dk.via.mithus.protobuf.ChatOrBuilder getChatsOrBuilder(
        int index) {
      if (chatsBuilder_ == null) {
        return chats_.get(index);  } else {
        return chatsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .dk.via.mithus.protobuf.Chat chats = 1;</code>
     */
    public java.util.List<? extends dk.via.mithus.protobuf.ChatOrBuilder> 
         getChatsOrBuilderList() {
      if (chatsBuilder_ != null) {
        return chatsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(chats_);
      }
    }
    /**
     * <code>repeated .dk.via.mithus.protobuf.Chat chats = 1;</code>
     */
    public dk.via.mithus.protobuf.Chat.Builder addChatsBuilder() {
      return getChatsFieldBuilder().addBuilder(
          dk.via.mithus.protobuf.Chat.getDefaultInstance());
    }
    /**
     * <code>repeated .dk.via.mithus.protobuf.Chat chats = 1;</code>
     */
    public dk.via.mithus.protobuf.Chat.Builder addChatsBuilder(
        int index) {
      return getChatsFieldBuilder().addBuilder(
          index, dk.via.mithus.protobuf.Chat.getDefaultInstance());
    }
    /**
     * <code>repeated .dk.via.mithus.protobuf.Chat chats = 1;</code>
     */
    public java.util.List<dk.via.mithus.protobuf.Chat.Builder> 
         getChatsBuilderList() {
      return getChatsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        dk.via.mithus.protobuf.Chat, dk.via.mithus.protobuf.Chat.Builder, dk.via.mithus.protobuf.ChatOrBuilder> 
        getChatsFieldBuilder() {
      if (chatsBuilder_ == null) {
        chatsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            dk.via.mithus.protobuf.Chat, dk.via.mithus.protobuf.Chat.Builder, dk.via.mithus.protobuf.ChatOrBuilder>(
                chats_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        chats_ = null;
      }
      return chatsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:dk.via.mithus.protobuf.Chats)
  }

  // @@protoc_insertion_point(class_scope:dk.via.mithus.protobuf.Chats)
  private static final dk.via.mithus.protobuf.Chats DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new dk.via.mithus.protobuf.Chats();
  }

  public static dk.via.mithus.protobuf.Chats getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Chats>
      PARSER = new com.google.protobuf.AbstractParser<Chats>() {
    @java.lang.Override
    public Chats parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Chats(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Chats> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Chats> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public dk.via.mithus.protobuf.Chats getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

