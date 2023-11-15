package dk.via.mithus.protobuf;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: protobuf.proto")
public final class ChatServiceGrpc {

  private ChatServiceGrpc() {}

  public static final String SERVICE_NAME = "dk.via.mithus.protobuf.ChatService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<dk.via.mithus.protobuf.ChatCreation,
      dk.via.mithus.protobuf.Chat> getCreateChatMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateChat",
      requestType = dk.via.mithus.protobuf.ChatCreation.class,
      responseType = dk.via.mithus.protobuf.Chat.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dk.via.mithus.protobuf.ChatCreation,
      dk.via.mithus.protobuf.Chat> getCreateChatMethod() {
    io.grpc.MethodDescriptor<dk.via.mithus.protobuf.ChatCreation, dk.via.mithus.protobuf.Chat> getCreateChatMethod;
    if ((getCreateChatMethod = ChatServiceGrpc.getCreateChatMethod) == null) {
      synchronized (ChatServiceGrpc.class) {
        if ((getCreateChatMethod = ChatServiceGrpc.getCreateChatMethod) == null) {
          ChatServiceGrpc.getCreateChatMethod = getCreateChatMethod =
              io.grpc.MethodDescriptor.<dk.via.mithus.protobuf.ChatCreation, dk.via.mithus.protobuf.Chat>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateChat"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dk.via.mithus.protobuf.ChatCreation.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dk.via.mithus.protobuf.Chat.getDefaultInstance()))
              .setSchemaDescriptor(new ChatServiceMethodDescriptorSupplier("CreateChat"))
              .build();
        }
      }
    }
    return getCreateChatMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dk.via.mithus.protobuf.ChatId,
      dk.via.mithus.protobuf.Chat> getGetChatMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetChat",
      requestType = dk.via.mithus.protobuf.ChatId.class,
      responseType = dk.via.mithus.protobuf.Chat.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dk.via.mithus.protobuf.ChatId,
      dk.via.mithus.protobuf.Chat> getGetChatMethod() {
    io.grpc.MethodDescriptor<dk.via.mithus.protobuf.ChatId, dk.via.mithus.protobuf.Chat> getGetChatMethod;
    if ((getGetChatMethod = ChatServiceGrpc.getGetChatMethod) == null) {
      synchronized (ChatServiceGrpc.class) {
        if ((getGetChatMethod = ChatServiceGrpc.getGetChatMethod) == null) {
          ChatServiceGrpc.getGetChatMethod = getGetChatMethod =
              io.grpc.MethodDescriptor.<dk.via.mithus.protobuf.ChatId, dk.via.mithus.protobuf.Chat>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetChat"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dk.via.mithus.protobuf.ChatId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dk.via.mithus.protobuf.Chat.getDefaultInstance()))
              .setSchemaDescriptor(new ChatServiceMethodDescriptorSupplier("GetChat"))
              .build();
        }
      }
    }
    return getGetChatMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dk.via.mithus.protobuf.UserId,
      dk.via.mithus.protobuf.Chats> getGetChatsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetChats",
      requestType = dk.via.mithus.protobuf.UserId.class,
      responseType = dk.via.mithus.protobuf.Chats.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dk.via.mithus.protobuf.UserId,
      dk.via.mithus.protobuf.Chats> getGetChatsMethod() {
    io.grpc.MethodDescriptor<dk.via.mithus.protobuf.UserId, dk.via.mithus.protobuf.Chats> getGetChatsMethod;
    if ((getGetChatsMethod = ChatServiceGrpc.getGetChatsMethod) == null) {
      synchronized (ChatServiceGrpc.class) {
        if ((getGetChatsMethod = ChatServiceGrpc.getGetChatsMethod) == null) {
          ChatServiceGrpc.getGetChatsMethod = getGetChatsMethod =
              io.grpc.MethodDescriptor.<dk.via.mithus.protobuf.UserId, dk.via.mithus.protobuf.Chats>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetChats"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dk.via.mithus.protobuf.UserId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dk.via.mithus.protobuf.Chats.getDefaultInstance()))
              .setSchemaDescriptor(new ChatServiceMethodDescriptorSupplier("GetChats"))
              .build();
        }
      }
    }
    return getGetChatsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dk.via.mithus.protobuf.MessageCreation,
      dk.via.mithus.protobuf.Void> getSendMessageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendMessage",
      requestType = dk.via.mithus.protobuf.MessageCreation.class,
      responseType = dk.via.mithus.protobuf.Void.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dk.via.mithus.protobuf.MessageCreation,
      dk.via.mithus.protobuf.Void> getSendMessageMethod() {
    io.grpc.MethodDescriptor<dk.via.mithus.protobuf.MessageCreation, dk.via.mithus.protobuf.Void> getSendMessageMethod;
    if ((getSendMessageMethod = ChatServiceGrpc.getSendMessageMethod) == null) {
      synchronized (ChatServiceGrpc.class) {
        if ((getSendMessageMethod = ChatServiceGrpc.getSendMessageMethod) == null) {
          ChatServiceGrpc.getSendMessageMethod = getSendMessageMethod =
              io.grpc.MethodDescriptor.<dk.via.mithus.protobuf.MessageCreation, dk.via.mithus.protobuf.Void>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendMessage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dk.via.mithus.protobuf.MessageCreation.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dk.via.mithus.protobuf.Void.getDefaultInstance()))
              .setSchemaDescriptor(new ChatServiceMethodDescriptorSupplier("SendMessage"))
              .build();
        }
      }
    }
    return getSendMessageMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ChatServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ChatServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ChatServiceStub>() {
        @java.lang.Override
        public ChatServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ChatServiceStub(channel, callOptions);
        }
      };
    return ChatServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ChatServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ChatServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ChatServiceBlockingStub>() {
        @java.lang.Override
        public ChatServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ChatServiceBlockingStub(channel, callOptions);
        }
      };
    return ChatServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ChatServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ChatServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ChatServiceFutureStub>() {
        @java.lang.Override
        public ChatServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ChatServiceFutureStub(channel, callOptions);
        }
      };
    return ChatServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class ChatServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createChat(dk.via.mithus.protobuf.ChatCreation request,
        io.grpc.stub.StreamObserver<dk.via.mithus.protobuf.Chat> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateChatMethod(), responseObserver);
    }

    /**
     */
    public void getChat(dk.via.mithus.protobuf.ChatId request,
        io.grpc.stub.StreamObserver<dk.via.mithus.protobuf.Chat> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetChatMethod(), responseObserver);
    }

    /**
     */
    public void getChats(dk.via.mithus.protobuf.UserId request,
        io.grpc.stub.StreamObserver<dk.via.mithus.protobuf.Chats> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetChatsMethod(), responseObserver);
    }

    /**
     */
    public void sendMessage(dk.via.mithus.protobuf.MessageCreation request,
        io.grpc.stub.StreamObserver<dk.via.mithus.protobuf.Void> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSendMessageMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateChatMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                dk.via.mithus.protobuf.ChatCreation,
                dk.via.mithus.protobuf.Chat>(
                  this, METHODID_CREATE_CHAT)))
          .addMethod(
            getGetChatMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                dk.via.mithus.protobuf.ChatId,
                dk.via.mithus.protobuf.Chat>(
                  this, METHODID_GET_CHAT)))
          .addMethod(
            getGetChatsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                dk.via.mithus.protobuf.UserId,
                dk.via.mithus.protobuf.Chats>(
                  this, METHODID_GET_CHATS)))
          .addMethod(
            getSendMessageMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                dk.via.mithus.protobuf.MessageCreation,
                dk.via.mithus.protobuf.Void>(
                  this, METHODID_SEND_MESSAGE)))
          .build();
    }
  }

  /**
   */
  public static final class ChatServiceStub extends io.grpc.stub.AbstractAsyncStub<ChatServiceStub> {
    private ChatServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ChatServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ChatServiceStub(channel, callOptions);
    }

    /**
     */
    public void createChat(dk.via.mithus.protobuf.ChatCreation request,
        io.grpc.stub.StreamObserver<dk.via.mithus.protobuf.Chat> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateChatMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getChat(dk.via.mithus.protobuf.ChatId request,
        io.grpc.stub.StreamObserver<dk.via.mithus.protobuf.Chat> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetChatMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getChats(dk.via.mithus.protobuf.UserId request,
        io.grpc.stub.StreamObserver<dk.via.mithus.protobuf.Chats> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetChatsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void sendMessage(dk.via.mithus.protobuf.MessageCreation request,
        io.grpc.stub.StreamObserver<dk.via.mithus.protobuf.Void> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSendMessageMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ChatServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ChatServiceBlockingStub> {
    private ChatServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ChatServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ChatServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public dk.via.mithus.protobuf.Chat createChat(dk.via.mithus.protobuf.ChatCreation request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateChatMethod(), getCallOptions(), request);
    }

    /**
     */
    public dk.via.mithus.protobuf.Chat getChat(dk.via.mithus.protobuf.ChatId request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetChatMethod(), getCallOptions(), request);
    }

    /**
     */
    public dk.via.mithus.protobuf.Chats getChats(dk.via.mithus.protobuf.UserId request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetChatsMethod(), getCallOptions(), request);
    }

    /**
     */
    public dk.via.mithus.protobuf.Void sendMessage(dk.via.mithus.protobuf.MessageCreation request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSendMessageMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ChatServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ChatServiceFutureStub> {
    private ChatServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ChatServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ChatServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dk.via.mithus.protobuf.Chat> createChat(
        dk.via.mithus.protobuf.ChatCreation request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateChatMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dk.via.mithus.protobuf.Chat> getChat(
        dk.via.mithus.protobuf.ChatId request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetChatMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dk.via.mithus.protobuf.Chats> getChats(
        dk.via.mithus.protobuf.UserId request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetChatsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dk.via.mithus.protobuf.Void> sendMessage(
        dk.via.mithus.protobuf.MessageCreation request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSendMessageMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_CHAT = 0;
  private static final int METHODID_GET_CHAT = 1;
  private static final int METHODID_GET_CHATS = 2;
  private static final int METHODID_SEND_MESSAGE = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ChatServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ChatServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_CHAT:
          serviceImpl.createChat((dk.via.mithus.protobuf.ChatCreation) request,
              (io.grpc.stub.StreamObserver<dk.via.mithus.protobuf.Chat>) responseObserver);
          break;
        case METHODID_GET_CHAT:
          serviceImpl.getChat((dk.via.mithus.protobuf.ChatId) request,
              (io.grpc.stub.StreamObserver<dk.via.mithus.protobuf.Chat>) responseObserver);
          break;
        case METHODID_GET_CHATS:
          serviceImpl.getChats((dk.via.mithus.protobuf.UserId) request,
              (io.grpc.stub.StreamObserver<dk.via.mithus.protobuf.Chats>) responseObserver);
          break;
        case METHODID_SEND_MESSAGE:
          serviceImpl.sendMessage((dk.via.mithus.protobuf.MessageCreation) request,
              (io.grpc.stub.StreamObserver<dk.via.mithus.protobuf.Void>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ChatServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ChatServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return dk.via.mithus.protobuf.Protobuf.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ChatService");
    }
  }

  private static final class ChatServiceFileDescriptorSupplier
      extends ChatServiceBaseDescriptorSupplier {
    ChatServiceFileDescriptorSupplier() {}
  }

  private static final class ChatServiceMethodDescriptorSupplier
      extends ChatServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ChatServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ChatServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ChatServiceFileDescriptorSupplier())
              .addMethod(getCreateChatMethod())
              .addMethod(getGetChatMethod())
              .addMethod(getGetChatsMethod())
              .addMethod(getSendMessageMethod())
              .build();
        }
      }
    }
    return result;
  }
}
