package dk.via.mithus.protobuf;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: protobuf.proto")
public final class PostServiceGrpc {

  private PostServiceGrpc() {}

  public static final String SERVICE_NAME = "dk.via.mithus.protobuf.PostService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<dk.via.mithus.protobuf.Post,
      dk.via.mithus.protobuf.Post> getCreatePostMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreatePost",
      requestType = dk.via.mithus.protobuf.Post.class,
      responseType = dk.via.mithus.protobuf.Post.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dk.via.mithus.protobuf.Post,
      dk.via.mithus.protobuf.Post> getCreatePostMethod() {
    io.grpc.MethodDescriptor<dk.via.mithus.protobuf.Post, dk.via.mithus.protobuf.Post> getCreatePostMethod;
    if ((getCreatePostMethod = PostServiceGrpc.getCreatePostMethod) == null) {
      synchronized (PostServiceGrpc.class) {
        if ((getCreatePostMethod = PostServiceGrpc.getCreatePostMethod) == null) {
          PostServiceGrpc.getCreatePostMethod = getCreatePostMethod =
              io.grpc.MethodDescriptor.<dk.via.mithus.protobuf.Post, dk.via.mithus.protobuf.Post>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreatePost"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dk.via.mithus.protobuf.Post.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dk.via.mithus.protobuf.Post.getDefaultInstance()))
              .setSchemaDescriptor(new PostServiceMethodDescriptorSupplier("CreatePost"))
              .build();
        }
      }
    }
    return getCreatePostMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dk.via.mithus.protobuf.SearchField,
      dk.via.mithus.protobuf.Post> getFindPostMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FindPost",
      requestType = dk.via.mithus.protobuf.SearchField.class,
      responseType = dk.via.mithus.protobuf.Post.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dk.via.mithus.protobuf.SearchField,
      dk.via.mithus.protobuf.Post> getFindPostMethod() {
    io.grpc.MethodDescriptor<dk.via.mithus.protobuf.SearchField, dk.via.mithus.protobuf.Post> getFindPostMethod;
    if ((getFindPostMethod = PostServiceGrpc.getFindPostMethod) == null) {
      synchronized (PostServiceGrpc.class) {
        if ((getFindPostMethod = PostServiceGrpc.getFindPostMethod) == null) {
          PostServiceGrpc.getFindPostMethod = getFindPostMethod =
              io.grpc.MethodDescriptor.<dk.via.mithus.protobuf.SearchField, dk.via.mithus.protobuf.Post>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FindPost"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dk.via.mithus.protobuf.SearchField.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dk.via.mithus.protobuf.Post.getDefaultInstance()))
              .setSchemaDescriptor(new PostServiceMethodDescriptorSupplier("FindPost"))
              .build();
        }
      }
    }
    return getFindPostMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dk.via.mithus.protobuf.Void,
      dk.via.mithus.protobuf.Posts> getGetPostsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPosts",
      requestType = dk.via.mithus.protobuf.Void.class,
      responseType = dk.via.mithus.protobuf.Posts.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dk.via.mithus.protobuf.Void,
      dk.via.mithus.protobuf.Posts> getGetPostsMethod() {
    io.grpc.MethodDescriptor<dk.via.mithus.protobuf.Void, dk.via.mithus.protobuf.Posts> getGetPostsMethod;
    if ((getGetPostsMethod = PostServiceGrpc.getGetPostsMethod) == null) {
      synchronized (PostServiceGrpc.class) {
        if ((getGetPostsMethod = PostServiceGrpc.getGetPostsMethod) == null) {
          PostServiceGrpc.getGetPostsMethod = getGetPostsMethod =
              io.grpc.MethodDescriptor.<dk.via.mithus.protobuf.Void, dk.via.mithus.protobuf.Posts>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPosts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dk.via.mithus.protobuf.Void.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dk.via.mithus.protobuf.Posts.getDefaultInstance()))
              .setSchemaDescriptor(new PostServiceMethodDescriptorSupplier("GetPosts"))
              .build();
        }
      }
    }
    return getGetPostsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dk.via.mithus.protobuf.SearchField,
      dk.via.mithus.protobuf.Posts> getGetPostsByLandlordMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPostsByLandlord",
      requestType = dk.via.mithus.protobuf.SearchField.class,
      responseType = dk.via.mithus.protobuf.Posts.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dk.via.mithus.protobuf.SearchField,
      dk.via.mithus.protobuf.Posts> getGetPostsByLandlordMethod() {
    io.grpc.MethodDescriptor<dk.via.mithus.protobuf.SearchField, dk.via.mithus.protobuf.Posts> getGetPostsByLandlordMethod;
    if ((getGetPostsByLandlordMethod = PostServiceGrpc.getGetPostsByLandlordMethod) == null) {
      synchronized (PostServiceGrpc.class) {
        if ((getGetPostsByLandlordMethod = PostServiceGrpc.getGetPostsByLandlordMethod) == null) {
          PostServiceGrpc.getGetPostsByLandlordMethod = getGetPostsByLandlordMethod =
              io.grpc.MethodDescriptor.<dk.via.mithus.protobuf.SearchField, dk.via.mithus.protobuf.Posts>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPostsByLandlord"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dk.via.mithus.protobuf.SearchField.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dk.via.mithus.protobuf.Posts.getDefaultInstance()))
              .setSchemaDescriptor(new PostServiceMethodDescriptorSupplier("GetPostsByLandlord"))
              .build();
        }
      }
    }
    return getGetPostsByLandlordMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dk.via.mithus.protobuf.Post,
      dk.via.mithus.protobuf.Void> getUpdatePostMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdatePost",
      requestType = dk.via.mithus.protobuf.Post.class,
      responseType = dk.via.mithus.protobuf.Void.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dk.via.mithus.protobuf.Post,
      dk.via.mithus.protobuf.Void> getUpdatePostMethod() {
    io.grpc.MethodDescriptor<dk.via.mithus.protobuf.Post, dk.via.mithus.protobuf.Void> getUpdatePostMethod;
    if ((getUpdatePostMethod = PostServiceGrpc.getUpdatePostMethod) == null) {
      synchronized (PostServiceGrpc.class) {
        if ((getUpdatePostMethod = PostServiceGrpc.getUpdatePostMethod) == null) {
          PostServiceGrpc.getUpdatePostMethod = getUpdatePostMethod =
              io.grpc.MethodDescriptor.<dk.via.mithus.protobuf.Post, dk.via.mithus.protobuf.Void>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdatePost"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dk.via.mithus.protobuf.Post.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dk.via.mithus.protobuf.Void.getDefaultInstance()))
              .setSchemaDescriptor(new PostServiceMethodDescriptorSupplier("UpdatePost"))
              .build();
        }
      }
    }
    return getUpdatePostMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dk.via.mithus.protobuf.Post,
      dk.via.mithus.protobuf.Void> getDeletePostMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeletePost",
      requestType = dk.via.mithus.protobuf.Post.class,
      responseType = dk.via.mithus.protobuf.Void.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dk.via.mithus.protobuf.Post,
      dk.via.mithus.protobuf.Void> getDeletePostMethod() {
    io.grpc.MethodDescriptor<dk.via.mithus.protobuf.Post, dk.via.mithus.protobuf.Void> getDeletePostMethod;
    if ((getDeletePostMethod = PostServiceGrpc.getDeletePostMethod) == null) {
      synchronized (PostServiceGrpc.class) {
        if ((getDeletePostMethod = PostServiceGrpc.getDeletePostMethod) == null) {
          PostServiceGrpc.getDeletePostMethod = getDeletePostMethod =
              io.grpc.MethodDescriptor.<dk.via.mithus.protobuf.Post, dk.via.mithus.protobuf.Void>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeletePost"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dk.via.mithus.protobuf.Post.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dk.via.mithus.protobuf.Void.getDefaultInstance()))
              .setSchemaDescriptor(new PostServiceMethodDescriptorSupplier("DeletePost"))
              .build();
        }
      }
    }
    return getDeletePostMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PostServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PostServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PostServiceStub>() {
        @java.lang.Override
        public PostServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PostServiceStub(channel, callOptions);
        }
      };
    return PostServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PostServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PostServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PostServiceBlockingStub>() {
        @java.lang.Override
        public PostServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PostServiceBlockingStub(channel, callOptions);
        }
      };
    return PostServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PostServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PostServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PostServiceFutureStub>() {
        @java.lang.Override
        public PostServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PostServiceFutureStub(channel, callOptions);
        }
      };
    return PostServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class PostServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createPost(dk.via.mithus.protobuf.Post request,
        io.grpc.stub.StreamObserver<dk.via.mithus.protobuf.Post> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreatePostMethod(), responseObserver);
    }

    /**
     */
    public void findPost(dk.via.mithus.protobuf.SearchField request,
        io.grpc.stub.StreamObserver<dk.via.mithus.protobuf.Post> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindPostMethod(), responseObserver);
    }

    /**
     */
    public void getPosts(dk.via.mithus.protobuf.Void request,
        io.grpc.stub.StreamObserver<dk.via.mithus.protobuf.Posts> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPostsMethod(), responseObserver);
    }

    /**
     */
    public void getPostsByLandlord(dk.via.mithus.protobuf.SearchField request,
        io.grpc.stub.StreamObserver<dk.via.mithus.protobuf.Posts> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPostsByLandlordMethod(), responseObserver);
    }

    /**
     */
    public void updatePost(dk.via.mithus.protobuf.Post request,
        io.grpc.stub.StreamObserver<dk.via.mithus.protobuf.Void> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdatePostMethod(), responseObserver);
    }

    /**
     */
    public void deletePost(dk.via.mithus.protobuf.Post request,
        io.grpc.stub.StreamObserver<dk.via.mithus.protobuf.Void> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeletePostMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreatePostMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                dk.via.mithus.protobuf.Post,
                dk.via.mithus.protobuf.Post>(
                  this, METHODID_CREATE_POST)))
          .addMethod(
            getFindPostMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                dk.via.mithus.protobuf.SearchField,
                dk.via.mithus.protobuf.Post>(
                  this, METHODID_FIND_POST)))
          .addMethod(
            getGetPostsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                dk.via.mithus.protobuf.Void,
                dk.via.mithus.protobuf.Posts>(
                  this, METHODID_GET_POSTS)))
          .addMethod(
            getGetPostsByLandlordMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                dk.via.mithus.protobuf.SearchField,
                dk.via.mithus.protobuf.Posts>(
                  this, METHODID_GET_POSTS_BY_LANDLORD)))
          .addMethod(
            getUpdatePostMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                dk.via.mithus.protobuf.Post,
                dk.via.mithus.protobuf.Void>(
                  this, METHODID_UPDATE_POST)))
          .addMethod(
            getDeletePostMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                dk.via.mithus.protobuf.Post,
                dk.via.mithus.protobuf.Void>(
                  this, METHODID_DELETE_POST)))
          .build();
    }
  }

  /**
   */
  public static final class PostServiceStub extends io.grpc.stub.AbstractAsyncStub<PostServiceStub> {
    private PostServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PostServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PostServiceStub(channel, callOptions);
    }

    /**
     */
    public void createPost(dk.via.mithus.protobuf.Post request,
        io.grpc.stub.StreamObserver<dk.via.mithus.protobuf.Post> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreatePostMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findPost(dk.via.mithus.protobuf.SearchField request,
        io.grpc.stub.StreamObserver<dk.via.mithus.protobuf.Post> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFindPostMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPosts(dk.via.mithus.protobuf.Void request,
        io.grpc.stub.StreamObserver<dk.via.mithus.protobuf.Posts> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPostsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPostsByLandlord(dk.via.mithus.protobuf.SearchField request,
        io.grpc.stub.StreamObserver<dk.via.mithus.protobuf.Posts> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPostsByLandlordMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updatePost(dk.via.mithus.protobuf.Post request,
        io.grpc.stub.StreamObserver<dk.via.mithus.protobuf.Void> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdatePostMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deletePost(dk.via.mithus.protobuf.Post request,
        io.grpc.stub.StreamObserver<dk.via.mithus.protobuf.Void> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeletePostMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class PostServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<PostServiceBlockingStub> {
    private PostServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PostServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PostServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public dk.via.mithus.protobuf.Post createPost(dk.via.mithus.protobuf.Post request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreatePostMethod(), getCallOptions(), request);
    }

    /**
     */
    public dk.via.mithus.protobuf.Post findPost(dk.via.mithus.protobuf.SearchField request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindPostMethod(), getCallOptions(), request);
    }

    /**
     */
    public dk.via.mithus.protobuf.Posts getPosts(dk.via.mithus.protobuf.Void request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPostsMethod(), getCallOptions(), request);
    }

    /**
     */
    public dk.via.mithus.protobuf.Posts getPostsByLandlord(dk.via.mithus.protobuf.SearchField request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPostsByLandlordMethod(), getCallOptions(), request);
    }

    /**
     */
    public dk.via.mithus.protobuf.Void updatePost(dk.via.mithus.protobuf.Post request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdatePostMethod(), getCallOptions(), request);
    }

    /**
     */
    public dk.via.mithus.protobuf.Void deletePost(dk.via.mithus.protobuf.Post request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeletePostMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class PostServiceFutureStub extends io.grpc.stub.AbstractFutureStub<PostServiceFutureStub> {
    private PostServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PostServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PostServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dk.via.mithus.protobuf.Post> createPost(
        dk.via.mithus.protobuf.Post request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreatePostMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dk.via.mithus.protobuf.Post> findPost(
        dk.via.mithus.protobuf.SearchField request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFindPostMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dk.via.mithus.protobuf.Posts> getPosts(
        dk.via.mithus.protobuf.Void request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPostsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dk.via.mithus.protobuf.Posts> getPostsByLandlord(
        dk.via.mithus.protobuf.SearchField request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPostsByLandlordMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dk.via.mithus.protobuf.Void> updatePost(
        dk.via.mithus.protobuf.Post request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdatePostMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dk.via.mithus.protobuf.Void> deletePost(
        dk.via.mithus.protobuf.Post request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeletePostMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_POST = 0;
  private static final int METHODID_FIND_POST = 1;
  private static final int METHODID_GET_POSTS = 2;
  private static final int METHODID_GET_POSTS_BY_LANDLORD = 3;
  private static final int METHODID_UPDATE_POST = 4;
  private static final int METHODID_DELETE_POST = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PostServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PostServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_POST:
          serviceImpl.createPost((dk.via.mithus.protobuf.Post) request,
              (io.grpc.stub.StreamObserver<dk.via.mithus.protobuf.Post>) responseObserver);
          break;
        case METHODID_FIND_POST:
          serviceImpl.findPost((dk.via.mithus.protobuf.SearchField) request,
              (io.grpc.stub.StreamObserver<dk.via.mithus.protobuf.Post>) responseObserver);
          break;
        case METHODID_GET_POSTS:
          serviceImpl.getPosts((dk.via.mithus.protobuf.Void) request,
              (io.grpc.stub.StreamObserver<dk.via.mithus.protobuf.Posts>) responseObserver);
          break;
        case METHODID_GET_POSTS_BY_LANDLORD:
          serviceImpl.getPostsByLandlord((dk.via.mithus.protobuf.SearchField) request,
              (io.grpc.stub.StreamObserver<dk.via.mithus.protobuf.Posts>) responseObserver);
          break;
        case METHODID_UPDATE_POST:
          serviceImpl.updatePost((dk.via.mithus.protobuf.Post) request,
              (io.grpc.stub.StreamObserver<dk.via.mithus.protobuf.Void>) responseObserver);
          break;
        case METHODID_DELETE_POST:
          serviceImpl.deletePost((dk.via.mithus.protobuf.Post) request,
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

  private static abstract class PostServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PostServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return dk.via.mithus.protobuf.Protobuf.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PostService");
    }
  }

  private static final class PostServiceFileDescriptorSupplier
      extends PostServiceBaseDescriptorSupplier {
    PostServiceFileDescriptorSupplier() {}
  }

  private static final class PostServiceMethodDescriptorSupplier
      extends PostServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PostServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (PostServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PostServiceFileDescriptorSupplier())
              .addMethod(getCreatePostMethod())
              .addMethod(getFindPostMethod())
              .addMethod(getGetPostsMethod())
              .addMethod(getGetPostsByLandlordMethod())
              .addMethod(getUpdatePostMethod())
              .addMethod(getDeletePostMethod())
              .build();
        }
      }
    }
    return result;
  }
}
