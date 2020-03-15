// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common.proto

package edu.usfca.protobuf;

public final class Common {
  private Common() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * <pre>
   * Each mobile device uses either Android or iOS.
   * </pre>
   *
   * Protobuf enum {@code edu.usfca.protobuf.OsType}
   */
  public enum OsType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>UNKNOWN_OS_TYPE = 0;</code>
     */
    UNKNOWN_OS_TYPE(0),
    /**
     * <code>ANDROID = 1;</code>
     */
    ANDROID(1),
    /**
     * <code>IOS = 2;</code>
     */
    IOS(2),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>UNKNOWN_OS_TYPE = 0;</code>
     */
    public static final int UNKNOWN_OS_TYPE_VALUE = 0;
    /**
     * <code>ANDROID = 1;</code>
     */
    public static final int ANDROID_VALUE = 1;
    /**
     * <code>IOS = 2;</code>
     */
    public static final int IOS_VALUE = 2;


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
    public static OsType valueOf(int value) {
      return forNumber(value);
    }

    public static OsType forNumber(int value) {
      switch (value) {
        case 0: return UNKNOWN_OS_TYPE;
        case 1: return ANDROID;
        case 2: return IOS;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<OsType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        OsType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<OsType>() {
            public OsType findValueByNumber(int number) {
              return OsType.forNumber(number);
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
      return edu.usfca.protobuf.Common.getDescriptor().getEnumTypes().get(0);
    }

    private static final OsType[] VALUES = values();

    public static OsType valueOf(
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

    private OsType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:edu.usfca.protobuf.OsType)
  }

  public interface DeviceIdOrBuilder extends
      // @@protoc_insertion_point(interface_extends:edu.usfca.protobuf.DeviceId)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional .edu.usfca.protobuf.OsType os = 1;</code>
     */
    int getOsValue();
    /**
     * <code>optional .edu.usfca.protobuf.OsType os = 1;</code>
     */
    edu.usfca.protobuf.Common.OsType getOs();

    /**
     * <code>optional string uuid = 2;</code>
     */
    java.lang.String getUuid();
    /**
     * <code>optional string uuid = 2;</code>
     */
    com.google.protobuf.ByteString
        getUuidBytes();

    /**
     * <code>optional string webid = 3;</code>
     */
    java.lang.String getWebid();
    /**
     * <code>optional string webid = 3;</code>
     */
    com.google.protobuf.ByteString
        getWebidBytes();

    public edu.usfca.protobuf.Common.DeviceId.IdCase getIdCase();
  }
  /**
   * <pre>
   * Device Id uniquely identifies a mobile device.
   * It has $os (Ostype) and either uuid or webid (string), but not both.
   * </pre>
   *
   * Protobuf type {@code edu.usfca.protobuf.DeviceId}
   */
  public  static final class DeviceId extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:edu.usfca.protobuf.DeviceId)
      DeviceIdOrBuilder {
    // Use DeviceId.newBuilder() to construct.
    private DeviceId(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private DeviceId() {
      os_ = 0;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private DeviceId(
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
              int rawValue = input.readEnum();

              os_ = rawValue;
              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();
              idCase_ = 2;
              id_ = s;
              break;
            }
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();
              idCase_ = 3;
              id_ = s;
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
      return edu.usfca.protobuf.Common.internal_static_edu_usfca_protobuf_DeviceId_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return edu.usfca.protobuf.Common.internal_static_edu_usfca_protobuf_DeviceId_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              edu.usfca.protobuf.Common.DeviceId.class, edu.usfca.protobuf.Common.DeviceId.Builder.class);
    }

    private int idCase_ = 0;
    private java.lang.Object id_;
    public enum IdCase
        implements com.google.protobuf.Internal.EnumLite {
      UUID(2),
      WEBID(3),
      ID_NOT_SET(0);
      private final int value;
      private IdCase(int value) {
        this.value = value;
      }
      /**
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static IdCase valueOf(int value) {
        return forNumber(value);
      }

      public static IdCase forNumber(int value) {
        switch (value) {
          case 2: return UUID;
          case 3: return WEBID;
          case 0: return ID_NOT_SET;
          default: return null;
        }
      }
      public int getNumber() {
        return this.value;
      }
    };

    public IdCase
    getIdCase() {
      return IdCase.forNumber(
          idCase_);
    }

    public static final int OS_FIELD_NUMBER = 1;
    private int os_;
    /**
     * <code>optional .edu.usfca.protobuf.OsType os = 1;</code>
     */
    public int getOsValue() {
      return os_;
    }
    /**
     * <code>optional .edu.usfca.protobuf.OsType os = 1;</code>
     */
    public edu.usfca.protobuf.Common.OsType getOs() {
      edu.usfca.protobuf.Common.OsType result = edu.usfca.protobuf.Common.OsType.valueOf(os_);
      return result == null ? edu.usfca.protobuf.Common.OsType.UNRECOGNIZED : result;
    }

    public static final int UUID_FIELD_NUMBER = 2;
    /**
     * <code>optional string uuid = 2;</code>
     */
    public java.lang.String getUuid() {
      java.lang.Object ref = "";
      if (idCase_ == 2) {
        ref = id_;
      }
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (idCase_ == 2) {
          id_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string uuid = 2;</code>
     */
    public com.google.protobuf.ByteString
        getUuidBytes() {
      java.lang.Object ref = "";
      if (idCase_ == 2) {
        ref = id_;
      }
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        if (idCase_ == 2) {
          id_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int WEBID_FIELD_NUMBER = 3;
    /**
     * <code>optional string webid = 3;</code>
     */
    public java.lang.String getWebid() {
      java.lang.Object ref = "";
      if (idCase_ == 3) {
        ref = id_;
      }
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (idCase_ == 3) {
          id_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string webid = 3;</code>
     */
    public com.google.protobuf.ByteString
        getWebidBytes() {
      java.lang.Object ref = "";
      if (idCase_ == 3) {
        ref = id_;
      }
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        if (idCase_ == 3) {
          id_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
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
      if (os_ != edu.usfca.protobuf.Common.OsType.UNKNOWN_OS_TYPE.getNumber()) {
        output.writeEnum(1, os_);
      }
      if (idCase_ == 2) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, id_);
      }
      if (idCase_ == 3) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, id_);
      }
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (os_ != edu.usfca.protobuf.Common.OsType.UNKNOWN_OS_TYPE.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(1, os_);
      }
      if (idCase_ == 2) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, id_);
      }
      if (idCase_ == 3) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, id_);
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
      if (!(obj instanceof edu.usfca.protobuf.Common.DeviceId)) {
        return super.equals(obj);
      }
      edu.usfca.protobuf.Common.DeviceId other = (edu.usfca.protobuf.Common.DeviceId) obj;

      boolean result = true;
      result = result && os_ == other.os_;
      result = result && getIdCase().equals(
          other.getIdCase());
      if (!result) return false;
      switch (idCase_) {
        case 2:
          result = result && getUuid()
              .equals(other.getUuid());
          break;
        case 3:
          result = result && getWebid()
              .equals(other.getWebid());
          break;
        case 0:
        default:
      }
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptorForType().hashCode();
      hash = (37 * hash) + OS_FIELD_NUMBER;
      hash = (53 * hash) + os_;
      switch (idCase_) {
        case 2:
          hash = (37 * hash) + UUID_FIELD_NUMBER;
          hash = (53 * hash) + getUuid().hashCode();
          break;
        case 3:
          hash = (37 * hash) + WEBID_FIELD_NUMBER;
          hash = (53 * hash) + getWebid().hashCode();
          break;
        case 0:
        default:
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static edu.usfca.protobuf.Common.DeviceId parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static edu.usfca.protobuf.Common.DeviceId parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static edu.usfca.protobuf.Common.DeviceId parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static edu.usfca.protobuf.Common.DeviceId parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static edu.usfca.protobuf.Common.DeviceId parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static edu.usfca.protobuf.Common.DeviceId parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static edu.usfca.protobuf.Common.DeviceId parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static edu.usfca.protobuf.Common.DeviceId parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static edu.usfca.protobuf.Common.DeviceId parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static edu.usfca.protobuf.Common.DeviceId parseFrom(
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
    public static Builder newBuilder(edu.usfca.protobuf.Common.DeviceId prototype) {
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
     * <pre>
     * Device Id uniquely identifies a mobile device.
     * It has $os (Ostype) and either uuid or webid (string), but not both.
     * </pre>
     *
     * Protobuf type {@code edu.usfca.protobuf.DeviceId}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:edu.usfca.protobuf.DeviceId)
        edu.usfca.protobuf.Common.DeviceIdOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return edu.usfca.protobuf.Common.internal_static_edu_usfca_protobuf_DeviceId_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return edu.usfca.protobuf.Common.internal_static_edu_usfca_protobuf_DeviceId_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                edu.usfca.protobuf.Common.DeviceId.class, edu.usfca.protobuf.Common.DeviceId.Builder.class);
      }

      // Construct using edu.usfca.protobuf.Common.DeviceId.newBuilder()
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
        os_ = 0;

        idCase_ = 0;
        id_ = null;
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return edu.usfca.protobuf.Common.internal_static_edu_usfca_protobuf_DeviceId_descriptor;
      }

      public edu.usfca.protobuf.Common.DeviceId getDefaultInstanceForType() {
        return edu.usfca.protobuf.Common.DeviceId.getDefaultInstance();
      }

      public edu.usfca.protobuf.Common.DeviceId build() {
        edu.usfca.protobuf.Common.DeviceId result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public edu.usfca.protobuf.Common.DeviceId buildPartial() {
        edu.usfca.protobuf.Common.DeviceId result = new edu.usfca.protobuf.Common.DeviceId(this);
        result.os_ = os_;
        if (idCase_ == 2) {
          result.id_ = id_;
        }
        if (idCase_ == 3) {
          result.id_ = id_;
        }
        result.idCase_ = idCase_;
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
        if (other instanceof edu.usfca.protobuf.Common.DeviceId) {
          return mergeFrom((edu.usfca.protobuf.Common.DeviceId)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(edu.usfca.protobuf.Common.DeviceId other) {
        if (other == edu.usfca.protobuf.Common.DeviceId.getDefaultInstance()) return this;
        if (other.os_ != 0) {
          setOsValue(other.getOsValue());
        }
        switch (other.getIdCase()) {
          case UUID: {
            idCase_ = 2;
            id_ = other.id_;
            onChanged();
            break;
          }
          case WEBID: {
            idCase_ = 3;
            id_ = other.id_;
            onChanged();
            break;
          }
          case ID_NOT_SET: {
            break;
          }
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
        edu.usfca.protobuf.Common.DeviceId parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (edu.usfca.protobuf.Common.DeviceId) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int idCase_ = 0;
      private java.lang.Object id_;
      public IdCase
          getIdCase() {
        return IdCase.forNumber(
            idCase_);
      }

      public Builder clearId() {
        idCase_ = 0;
        id_ = null;
        onChanged();
        return this;
      }


      private int os_ = 0;
      /**
       * <code>optional .edu.usfca.protobuf.OsType os = 1;</code>
       */
      public int getOsValue() {
        return os_;
      }
      /**
       * <code>optional .edu.usfca.protobuf.OsType os = 1;</code>
       */
      public Builder setOsValue(int value) {
        os_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional .edu.usfca.protobuf.OsType os = 1;</code>
       */
      public edu.usfca.protobuf.Common.OsType getOs() {
        edu.usfca.protobuf.Common.OsType result = edu.usfca.protobuf.Common.OsType.valueOf(os_);
        return result == null ? edu.usfca.protobuf.Common.OsType.UNRECOGNIZED : result;
      }
      /**
       * <code>optional .edu.usfca.protobuf.OsType os = 1;</code>
       */
      public Builder setOs(edu.usfca.protobuf.Common.OsType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        os_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>optional .edu.usfca.protobuf.OsType os = 1;</code>
       */
      public Builder clearOs() {
        
        os_ = 0;
        onChanged();
        return this;
      }

      /**
       * <code>optional string uuid = 2;</code>
       */
      public java.lang.String getUuid() {
        java.lang.Object ref = "";
        if (idCase_ == 2) {
          ref = id_;
        }
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (idCase_ == 2) {
            id_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string uuid = 2;</code>
       */
      public com.google.protobuf.ByteString
          getUuidBytes() {
        java.lang.Object ref = "";
        if (idCase_ == 2) {
          ref = id_;
        }
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          if (idCase_ == 2) {
            id_ = b;
          }
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string uuid = 2;</code>
       */
      public Builder setUuid(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  idCase_ = 2;
        id_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string uuid = 2;</code>
       */
      public Builder clearUuid() {
        if (idCase_ == 2) {
          idCase_ = 0;
          id_ = null;
          onChanged();
        }
        return this;
      }
      /**
       * <code>optional string uuid = 2;</code>
       */
      public Builder setUuidBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        idCase_ = 2;
        id_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>optional string webid = 3;</code>
       */
      public java.lang.String getWebid() {
        java.lang.Object ref = "";
        if (idCase_ == 3) {
          ref = id_;
        }
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (idCase_ == 3) {
            id_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string webid = 3;</code>
       */
      public com.google.protobuf.ByteString
          getWebidBytes() {
        java.lang.Object ref = "";
        if (idCase_ == 3) {
          ref = id_;
        }
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          if (idCase_ == 3) {
            id_ = b;
          }
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string webid = 3;</code>
       */
      public Builder setWebid(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  idCase_ = 3;
        id_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string webid = 3;</code>
       */
      public Builder clearWebid() {
        if (idCase_ == 3) {
          idCase_ = 0;
          id_ = null;
          onChanged();
        }
        return this;
      }
      /**
       * <code>optional string webid = 3;</code>
       */
      public Builder setWebidBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        idCase_ = 3;
        id_ = value;
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


      // @@protoc_insertion_point(builder_scope:edu.usfca.protobuf.DeviceId)
    }

    // @@protoc_insertion_point(class_scope:edu.usfca.protobuf.DeviceId)
    private static final edu.usfca.protobuf.Common.DeviceId DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new edu.usfca.protobuf.Common.DeviceId();
    }

    public static edu.usfca.protobuf.Common.DeviceId getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<DeviceId>
        PARSER = new com.google.protobuf.AbstractParser<DeviceId>() {
      public DeviceId parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new DeviceId(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<DeviceId> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<DeviceId> getParserForType() {
      return PARSER;
    }

    public edu.usfca.protobuf.Common.DeviceId getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_edu_usfca_protobuf_DeviceId_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_edu_usfca_protobuf_DeviceId_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014common.proto\022\022edu.usfca.protobuf\"Y\n\010De" +
      "viceId\022&\n\002os\030\001 \001(\0162\032.edu.usfca.protobuf." +
      "OsType\022\016\n\004uuid\030\002 \001(\tH\000\022\017\n\005webid\030\003 \001(\tH\000B" +
      "\004\n\002id*3\n\006OsType\022\023\n\017UNKNOWN_OS_TYPE\020\000\022\013\n\007" +
      "ANDROID\020\001\022\007\n\003IOS\020\002b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_edu_usfca_protobuf_DeviceId_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_edu_usfca_protobuf_DeviceId_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_edu_usfca_protobuf_DeviceId_descriptor,
        new java.lang.String[] { "Os", "Uuid", "Webid", "Id", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}