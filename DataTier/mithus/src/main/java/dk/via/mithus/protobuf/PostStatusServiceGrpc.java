package dk.via.mithus.protobuf;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: protobuf.proto")
public final class PostStatusServiceGrpc {

  private PostStatusServiceGrpc() {}

  public static final String SERVICE_NAME = "dk.via.mithus.protobuf.PostStatusService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<dk.via.mithus.protobuf.PostStatus,
      dk.via.mithus.protobuf.PostStatus> getCreatePostStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreatePostStatus",
      requestType = dk.via.mithus.protobuf.PostStatus.class,
      responseType = dk.via.mithus.protobuf.PostStatus.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dk.via.mithus.protobuf.PostStatus,
      dk.via.mithus.protobuf.PostStatus> getCreatePostStatusMethod() {
    io.grpc.MethodDescriptor<dk.via.mithus.protobuf.PostStatus, dk.via.mithus.protobuf.PostStatus> getCreatePostStatusMethod;
    if ((getCreatePostStatusMethod = PostStatusServiceGrpc.getCreatePostStatusMethod) == null) {
      synchronized (PostStatusServiceGrpc.class) {
        if ((getCreatePostStatusMethod = PostStatusServiceGrpc.getCreatePostStatusMethod) == null) {
          PostStatusServiceGrpc.getCreatePostStatusMethod = getCreatePostStatusMethod =
              io.grpc.MethodDescriptor.<dk.via.mithus.protobuf.PostStatus, dk.via.mithus.protobuf.PostStatus>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreatePostStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dk.via.mithus.protobuf.PostStatus.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dk.via.mithus.protobuf.PostStatus.getDefaultInstance()))
              .setSchemaDescriptor(new PostStatusServiceMethodDescriptorSupplier("CreatePostStatus"))
              .build();
        }
      }
    }
    return getCreatePostStatusMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PostStatusServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PostStatusServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PostStatusServiceStub>() {
        @java.lang.Override
        public PostStatusServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PostStatusServiceStub(channel, callOptions);
        }
      };
    return PostStatusServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PostStatusServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PostStatusServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PostStatusServiceBlockingStub>() {
        @java.lang.Override
        public PostStatusServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PostStatusServiceBlockingStub(channel, callOptions);
        }
      };
    return PostStatusServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PostStatusServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PostStatusServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PostStatusServiceFutureStub>() {
        @java.lang.Override
        public PostStatusServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PostStatusServiceFutureStub(channel, callOptions);
        }
      };
    return PostStatusServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class PostStatusServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createPostStatus(dk.via.mithus.protobuf.PostStatus request,
        io.grpc.stub.StreamObserver<dk.via.mithus.protobuf.PostStatus> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreatePostStatusMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreatePostStatusMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                dk.via.mithus.protobuf.PostStatus,
                dk.via.mithus.protobuf.PostStatus>(
                  this, METHODID_CREATE_POST_STATUS)))
          .build();
    }
  }

  /**
   */
  public static final class PostStatusServiceStub extends io.grpc.stub.AbstractAsyncStub<PostStatusServiceStub> {
    private PostStatusServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PostStatusServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PostStatusServiceStub(channel, callOptions);
    }

    /**
     */
    public void createPostStatus(dk.via.mithus.protobuf.PostStatus request,
        io.grpc.stub.StreamObserver<dk.via.mithus.protobuf.PostStatus> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreatePostStatusMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class PostStatusServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<PostStatusServiceBlockingStub> {
    private PostStatusServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PostStatusServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PostStatusServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public dk.via.mithus.protobuf.PostStatus createPostStatus(dk.via.mithus.protobuf.PostStatus request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreatePostStatusMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class PostStatusServiceFutureStub extends io.grpc.stub.AbstractFutureStub<PostStatusServiceFutureStub> {
    private PostStatusServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PostStatusServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PostStatusServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dk.via.mithus.protobuf.PostStatus> createPostStatus(
        dk.via.mithus.protobuf.PostStatus request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreatePostStatusMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_POST_STATUS = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PostStatusServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PostStatusServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_POST_STATUS:
          serviceImpl.createPostStatus((dk.via.mithus.protobuf.PostStatus) request,
              (io.grpc.stub.StreamObserver<dk.via.mithus.protobuf.PostStatus>) responseObserver);
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

  private static abstract class PostStatusServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PostStatusServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return dk.via.mithus.protobuf.Protobuf.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PostStatusService");
    }
  }

  private static final class PostStatusServiceFileDescriptorSupplier
      extends PostStatusServiceBaseDescriptorSupplier {
    PostStatusServiceFileDescriptorSupplier() {}
  }

  private static final class PostStatusServiceMethodDescriptorSupplier
      extends PostStatusServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PostStatusServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (PostStatusServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PostStatusServiceFileDescriptorSupplier())
              .addMethod(getCreatePostStatusMethod())
              .build();
        }
      }
    }
    return result;
  }
}
