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
  private static volatile io.grpc.MethodDescriptor<dk.via.mithus.protobuf.PostCreation,
      dk.via.mithus.protobuf.PostResponse> getCreatePostMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreatePost",
      requestType = dk.via.mithus.protobuf.PostCreation.class,
      responseType = dk.via.mithus.protobuf.PostResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dk.via.mithus.protobuf.PostCreation,
      dk.via.mithus.protobuf.PostResponse> getCreatePostMethod() {
    io.grpc.MethodDescriptor<dk.via.mithus.protobuf.PostCreation, dk.via.mithus.protobuf.PostResponse> getCreatePostMethod;
    if ((getCreatePostMethod = PostServiceGrpc.getCreatePostMethod) == null) {
      synchronized (PostServiceGrpc.class) {
        if ((getCreatePostMethod = PostServiceGrpc.getCreatePostMethod) == null) {
          PostServiceGrpc.getCreatePostMethod = getCreatePostMethod =
              io.grpc.MethodDescriptor.<dk.via.mithus.protobuf.PostCreation, dk.via.mithus.protobuf.PostResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreatePost"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dk.via.mithus.protobuf.PostCreation.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dk.via.mithus.protobuf.PostResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PostServiceMethodDescriptorSupplier("CreatePost"))
              .build();
        }
      }
    }
    return getCreatePostMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dk.via.mithus.protobuf.PostId,
      dk.via.mithus.protobuf.PostResponse> getGetPostMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPost",
      requestType = dk.via.mithus.protobuf.PostId.class,
      responseType = dk.via.mithus.protobuf.PostResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dk.via.mithus.protobuf.PostId,
      dk.via.mithus.protobuf.PostResponse> getGetPostMethod() {
    io.grpc.MethodDescriptor<dk.via.mithus.protobuf.PostId, dk.via.mithus.protobuf.PostResponse> getGetPostMethod;
    if ((getGetPostMethod = PostServiceGrpc.getGetPostMethod) == null) {
      synchronized (PostServiceGrpc.class) {
        if ((getGetPostMethod = PostServiceGrpc.getGetPostMethod) == null) {
          PostServiceGrpc.getGetPostMethod = getGetPostMethod =
              io.grpc.MethodDescriptor.<dk.via.mithus.protobuf.PostId, dk.via.mithus.protobuf.PostResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPost"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dk.via.mithus.protobuf.PostId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dk.via.mithus.protobuf.PostResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PostServiceMethodDescriptorSupplier("GetPost"))
              .build();
        }
      }
    }
    return getGetPostMethod;
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

  private static volatile io.grpc.MethodDescriptor<dk.via.mithus.protobuf.PostCreation,
      dk.via.mithus.protobuf.PostResponse> getUpdatePostMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdatePost",
      requestType = dk.via.mithus.protobuf.PostCreation.class,
      responseType = dk.via.mithus.protobuf.PostResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dk.via.mithus.protobuf.PostCreation,
      dk.via.mithus.protobuf.PostResponse> getUpdatePostMethod() {
    io.grpc.MethodDescriptor<dk.via.mithus.protobuf.PostCreation, dk.via.mithus.protobuf.PostResponse> getUpdatePostMethod;
    if ((getUpdatePostMethod = PostServiceGrpc.getUpdatePostMethod) == null) {
      synchronized (PostServiceGrpc.class) {
        if ((getUpdatePostMethod = PostServiceGrpc.getUpdatePostMethod) == null) {
          PostServiceGrpc.getUpdatePostMethod = getUpdatePostMethod =
              io.grpc.MethodDescriptor.<dk.via.mithus.protobuf.PostCreation, dk.via.mithus.protobuf.PostResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdatePost"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dk.via.mithus.protobuf.PostCreation.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dk.via.mithus.protobuf.PostResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PostServiceMethodDescriptorSupplier("UpdatePost"))
              .build();
        }
      }
    }
    return getUpdatePostMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dk.via.mithus.protobuf.PostStatusUpdate,
      dk.via.mithus.protobuf.PostResponse> getSetPostStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetPostStatus",
      requestType = dk.via.mithus.protobuf.PostStatusUpdate.class,
      responseType = dk.via.mithus.protobuf.PostResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dk.via.mithus.protobuf.PostStatusUpdate,
      dk.via.mithus.protobuf.PostResponse> getSetPostStatusMethod() {
    io.grpc.MethodDescriptor<dk.via.mithus.protobuf.PostStatusUpdate, dk.via.mithus.protobuf.PostResponse> getSetPostStatusMethod;
    if ((getSetPostStatusMethod = PostServiceGrpc.getSetPostStatusMethod) == null) {
      synchronized (PostServiceGrpc.class) {
        if ((getSetPostStatusMethod = PostServiceGrpc.getSetPostStatusMethod) == null) {
          PostServiceGrpc.getSetPostStatusMethod = getSetPostStatusMethod =
              io.grpc.MethodDescriptor.<dk.via.mithus.protobuf.PostStatusUpdate, dk.via.mithus.protobuf.PostResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetPostStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dk.via.mithus.protobuf.PostStatusUpdate.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dk.via.mithus.protobuf.PostResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PostServiceMethodDescriptorSupplier("SetPostStatus"))
              .build();
        }
      }
    }
    return getSetPostStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dk.via.mithus.protobuf.PostId,
      dk.via.mithus.protobuf.Void> getDeletePostMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeletePost",
      requestType = dk.via.mithus.protobuf.PostId.class,
      responseType = dk.via.mithus.protobuf.Void.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dk.via.mithus.protobuf.PostId,
      dk.via.mithus.protobuf.Void> getDeletePostMethod() {
    io.grpc.MethodDescriptor<dk.via.mithus.protobuf.PostId, dk.via.mithus.protobuf.Void> getDeletePostMethod;
    if ((getDeletePostMethod = PostServiceGrpc.getDeletePostMethod) == null) {
      synchronized (PostServiceGrpc.class) {
        if ((getDeletePostMethod = PostServiceGrpc.getDeletePostMethod) == null) {
          PostServiceGrpc.getDeletePostMethod = getDeletePostMethod =
              io.grpc.MethodDescriptor.<dk.via.mithus.protobuf.PostId, dk.via.mithus.protobuf.Void>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeletePost"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dk.via.mithus.protobuf.PostId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dk.via.mithus.protobuf.Void.getDefaultInstance()))
              .setSchemaDescriptor(new PostServiceMethodDescriptorSupplier("DeletePost"))
              .build();
        }
      }
    }
    return getDeletePostMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dk.via.mithus.protobuf.Void,
      dk.via.mithus.protobuf.PostStatuses> getGetPostStatusesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPostStatuses",
      requestType = dk.via.mithus.protobuf.Void.class,
      responseType = dk.via.mithus.protobuf.PostStatuses.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dk.via.mithus.protobuf.Void,
      dk.via.mithus.protobuf.PostStatuses> getGetPostStatusesMethod() {
    io.grpc.MethodDescriptor<dk.via.mithus.protobuf.Void, dk.via.mithus.protobuf.PostStatuses> getGetPostStatusesMethod;
    if ((getGetPostStatusesMethod = PostServiceGrpc.getGetPostStatusesMethod) == null) {
      synchronized (PostServiceGrpc.class) {
        if ((getGetPostStatusesMethod = PostServiceGrpc.getGetPostStatusesMethod) == null) {
          PostServiceGrpc.getGetPostStatusesMethod = getGetPostStatusesMethod =
              io.grpc.MethodDescriptor.<dk.via.mithus.protobuf.Void, dk.via.mithus.protobuf.PostStatuses>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPostStatuses"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dk.via.mithus.protobuf.Void.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dk.via.mithus.protobuf.PostStatuses.getDefaultInstance()))
              .setSchemaDescriptor(new PostServiceMethodDescriptorSupplier("GetPostStatuses"))
              .build();
        }
      }
    }
    return getGetPostStatusesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dk.via.mithus.protobuf.Void,
      dk.via.mithus.protobuf.HousingTypes> getGetHousingTypesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetHousingTypes",
      requestType = dk.via.mithus.protobuf.Void.class,
      responseType = dk.via.mithus.protobuf.HousingTypes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dk.via.mithus.protobuf.Void,
      dk.via.mithus.protobuf.HousingTypes> getGetHousingTypesMethod() {
    io.grpc.MethodDescriptor<dk.via.mithus.protobuf.Void, dk.via.mithus.protobuf.HousingTypes> getGetHousingTypesMethod;
    if ((getGetHousingTypesMethod = PostServiceGrpc.getGetHousingTypesMethod) == null) {
      synchronized (PostServiceGrpc.class) {
        if ((getGetHousingTypesMethod = PostServiceGrpc.getGetHousingTypesMethod) == null) {
          PostServiceGrpc.getGetHousingTypesMethod = getGetHousingTypesMethod =
              io.grpc.MethodDescriptor.<dk.via.mithus.protobuf.Void, dk.via.mithus.protobuf.HousingTypes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetHousingTypes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dk.via.mithus.protobuf.Void.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dk.via.mithus.protobuf.HousingTypes.getDefaultInstance()))
              .setSchemaDescriptor(new PostServiceMethodDescriptorSupplier("GetHousingTypes"))
              .build();
        }
      }
    }
    return getGetHousingTypesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dk.via.mithus.protobuf.Void,
      dk.via.mithus.protobuf.EnergyRatings> getGetEnergyRatingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetEnergyRatings",
      requestType = dk.via.mithus.protobuf.Void.class,
      responseType = dk.via.mithus.protobuf.EnergyRatings.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dk.via.mithus.protobuf.Void,
      dk.via.mithus.protobuf.EnergyRatings> getGetEnergyRatingsMethod() {
    io.grpc.MethodDescriptor<dk.via.mithus.protobuf.Void, dk.via.mithus.protobuf.EnergyRatings> getGetEnergyRatingsMethod;
    if ((getGetEnergyRatingsMethod = PostServiceGrpc.getGetEnergyRatingsMethod) == null) {
      synchronized (PostServiceGrpc.class) {
        if ((getGetEnergyRatingsMethod = PostServiceGrpc.getGetEnergyRatingsMethod) == null) {
          PostServiceGrpc.getGetEnergyRatingsMethod = getGetEnergyRatingsMethod =
              io.grpc.MethodDescriptor.<dk.via.mithus.protobuf.Void, dk.via.mithus.protobuf.EnergyRatings>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetEnergyRatings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dk.via.mithus.protobuf.Void.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dk.via.mithus.protobuf.EnergyRatings.getDefaultInstance()))
              .setSchemaDescriptor(new PostServiceMethodDescriptorSupplier("GetEnergyRatings"))
              .build();
        }
      }
    }
    return getGetEnergyRatingsMethod;
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
    public void createPost(dk.via.mithus.protobuf.PostCreation request,
        io.grpc.stub.StreamObserver<dk.via.mithus.protobuf.PostResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreatePostMethod(), responseObserver);
    }

    /**
     */
    public void getPost(dk.via.mithus.protobuf.PostId request,
        io.grpc.stub.StreamObserver<dk.via.mithus.protobuf.PostResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPostMethod(), responseObserver);
    }

    /**
     */
    public void getPosts(dk.via.mithus.protobuf.Void request,
        io.grpc.stub.StreamObserver<dk.via.mithus.protobuf.Posts> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPostsMethod(), responseObserver);
    }

    /**
     */
    public void updatePost(dk.via.mithus.protobuf.PostCreation request,
        io.grpc.stub.StreamObserver<dk.via.mithus.protobuf.PostResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdatePostMethod(), responseObserver);
    }

    /**
     */
    public void setPostStatus(dk.via.mithus.protobuf.PostStatusUpdate request,
        io.grpc.stub.StreamObserver<dk.via.mithus.protobuf.PostResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetPostStatusMethod(), responseObserver);
    }

    /**
     */
    public void deletePost(dk.via.mithus.protobuf.PostId request,
        io.grpc.stub.StreamObserver<dk.via.mithus.protobuf.Void> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeletePostMethod(), responseObserver);
    }

    /**
     */
    public void getPostStatuses(dk.via.mithus.protobuf.Void request,
        io.grpc.stub.StreamObserver<dk.via.mithus.protobuf.PostStatuses> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPostStatusesMethod(), responseObserver);
    }

    /**
     */
    public void getHousingTypes(dk.via.mithus.protobuf.Void request,
        io.grpc.stub.StreamObserver<dk.via.mithus.protobuf.HousingTypes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetHousingTypesMethod(), responseObserver);
    }

    /**
     */
    public void getEnergyRatings(dk.via.mithus.protobuf.Void request,
        io.grpc.stub.StreamObserver<dk.via.mithus.protobuf.EnergyRatings> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetEnergyRatingsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreatePostMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                dk.via.mithus.protobuf.PostCreation,
                dk.via.mithus.protobuf.PostResponse>(
                  this, METHODID_CREATE_POST)))
          .addMethod(
            getGetPostMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                dk.via.mithus.protobuf.PostId,
                dk.via.mithus.protobuf.PostResponse>(
                  this, METHODID_GET_POST)))
          .addMethod(
            getGetPostsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                dk.via.mithus.protobuf.Void,
                dk.via.mithus.protobuf.Posts>(
                  this, METHODID_GET_POSTS)))
          .addMethod(
            getUpdatePostMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                dk.via.mithus.protobuf.PostCreation,
                dk.via.mithus.protobuf.PostResponse>(
                  this, METHODID_UPDATE_POST)))
          .addMethod(
            getSetPostStatusMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                dk.via.mithus.protobuf.PostStatusUpdate,
                dk.via.mithus.protobuf.PostResponse>(
                  this, METHODID_SET_POST_STATUS)))
          .addMethod(
            getDeletePostMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                dk.via.mithus.protobuf.PostId,
                dk.via.mithus.protobuf.Void>(
                  this, METHODID_DELETE_POST)))
          .addMethod(
            getGetPostStatusesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                dk.via.mithus.protobuf.Void,
                dk.via.mithus.protobuf.PostStatuses>(
                  this, METHODID_GET_POST_STATUSES)))
          .addMethod(
            getGetHousingTypesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                dk.via.mithus.protobuf.Void,
                dk.via.mithus.protobuf.HousingTypes>(
                  this, METHODID_GET_HOUSING_TYPES)))
          .addMethod(
            getGetEnergyRatingsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                dk.via.mithus.protobuf.Void,
                dk.via.mithus.protobuf.EnergyRatings>(
                  this, METHODID_GET_ENERGY_RATINGS)))
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
    public void createPost(dk.via.mithus.protobuf.PostCreation request,
        io.grpc.stub.StreamObserver<dk.via.mithus.protobuf.PostResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreatePostMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPost(dk.via.mithus.protobuf.PostId request,
        io.grpc.stub.StreamObserver<dk.via.mithus.protobuf.PostResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPostMethod(), getCallOptions()), request, responseObserver);
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
    public void updatePost(dk.via.mithus.protobuf.PostCreation request,
        io.grpc.stub.StreamObserver<dk.via.mithus.protobuf.PostResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdatePostMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setPostStatus(dk.via.mithus.protobuf.PostStatusUpdate request,
        io.grpc.stub.StreamObserver<dk.via.mithus.protobuf.PostResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetPostStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deletePost(dk.via.mithus.protobuf.PostId request,
        io.grpc.stub.StreamObserver<dk.via.mithus.protobuf.Void> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeletePostMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPostStatuses(dk.via.mithus.protobuf.Void request,
        io.grpc.stub.StreamObserver<dk.via.mithus.protobuf.PostStatuses> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPostStatusesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getHousingTypes(dk.via.mithus.protobuf.Void request,
        io.grpc.stub.StreamObserver<dk.via.mithus.protobuf.HousingTypes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetHousingTypesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getEnergyRatings(dk.via.mithus.protobuf.Void request,
        io.grpc.stub.StreamObserver<dk.via.mithus.protobuf.EnergyRatings> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetEnergyRatingsMethod(), getCallOptions()), request, responseObserver);
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
    public dk.via.mithus.protobuf.PostResponse createPost(dk.via.mithus.protobuf.PostCreation request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreatePostMethod(), getCallOptions(), request);
    }

    /**
     */
    public dk.via.mithus.protobuf.PostResponse getPost(dk.via.mithus.protobuf.PostId request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPostMethod(), getCallOptions(), request);
    }

    /**
     */
    public dk.via.mithus.protobuf.Posts getPosts(dk.via.mithus.protobuf.Void request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPostsMethod(), getCallOptions(), request);
    }

    /**
     */
    public dk.via.mithus.protobuf.PostResponse updatePost(dk.via.mithus.protobuf.PostCreation request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdatePostMethod(), getCallOptions(), request);
    }

    /**
     */
    public dk.via.mithus.protobuf.PostResponse setPostStatus(dk.via.mithus.protobuf.PostStatusUpdate request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetPostStatusMethod(), getCallOptions(), request);
    }

    /**
     */
    public dk.via.mithus.protobuf.Void deletePost(dk.via.mithus.protobuf.PostId request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeletePostMethod(), getCallOptions(), request);
    }

    /**
     */
    public dk.via.mithus.protobuf.PostStatuses getPostStatuses(dk.via.mithus.protobuf.Void request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPostStatusesMethod(), getCallOptions(), request);
    }

    /**
     */
    public dk.via.mithus.protobuf.HousingTypes getHousingTypes(dk.via.mithus.protobuf.Void request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetHousingTypesMethod(), getCallOptions(), request);
    }

    /**
     */
    public dk.via.mithus.protobuf.EnergyRatings getEnergyRatings(dk.via.mithus.protobuf.Void request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetEnergyRatingsMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<dk.via.mithus.protobuf.PostResponse> createPost(
        dk.via.mithus.protobuf.PostCreation request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreatePostMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dk.via.mithus.protobuf.PostResponse> getPost(
        dk.via.mithus.protobuf.PostId request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPostMethod(), getCallOptions()), request);
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
    public com.google.common.util.concurrent.ListenableFuture<dk.via.mithus.protobuf.PostResponse> updatePost(
        dk.via.mithus.protobuf.PostCreation request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdatePostMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dk.via.mithus.protobuf.PostResponse> setPostStatus(
        dk.via.mithus.protobuf.PostStatusUpdate request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetPostStatusMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dk.via.mithus.protobuf.Void> deletePost(
        dk.via.mithus.protobuf.PostId request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeletePostMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dk.via.mithus.protobuf.PostStatuses> getPostStatuses(
        dk.via.mithus.protobuf.Void request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPostStatusesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dk.via.mithus.protobuf.HousingTypes> getHousingTypes(
        dk.via.mithus.protobuf.Void request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetHousingTypesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dk.via.mithus.protobuf.EnergyRatings> getEnergyRatings(
        dk.via.mithus.protobuf.Void request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetEnergyRatingsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_POST = 0;
  private static final int METHODID_GET_POST = 1;
  private static final int METHODID_GET_POSTS = 2;
  private static final int METHODID_UPDATE_POST = 3;
  private static final int METHODID_SET_POST_STATUS = 4;
  private static final int METHODID_DELETE_POST = 5;
  private static final int METHODID_GET_POST_STATUSES = 6;
  private static final int METHODID_GET_HOUSING_TYPES = 7;
  private static final int METHODID_GET_ENERGY_RATINGS = 8;

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
          serviceImpl.createPost((dk.via.mithus.protobuf.PostCreation) request,
              (io.grpc.stub.StreamObserver<dk.via.mithus.protobuf.PostResponse>) responseObserver);
          break;
        case METHODID_GET_POST:
          serviceImpl.getPost((dk.via.mithus.protobuf.PostId) request,
              (io.grpc.stub.StreamObserver<dk.via.mithus.protobuf.PostResponse>) responseObserver);
          break;
        case METHODID_GET_POSTS:
          serviceImpl.getPosts((dk.via.mithus.protobuf.Void) request,
              (io.grpc.stub.StreamObserver<dk.via.mithus.protobuf.Posts>) responseObserver);
          break;
        case METHODID_UPDATE_POST:
          serviceImpl.updatePost((dk.via.mithus.protobuf.PostCreation) request,
              (io.grpc.stub.StreamObserver<dk.via.mithus.protobuf.PostResponse>) responseObserver);
          break;
        case METHODID_SET_POST_STATUS:
          serviceImpl.setPostStatus((dk.via.mithus.protobuf.PostStatusUpdate) request,
              (io.grpc.stub.StreamObserver<dk.via.mithus.protobuf.PostResponse>) responseObserver);
          break;
        case METHODID_DELETE_POST:
          serviceImpl.deletePost((dk.via.mithus.protobuf.PostId) request,
              (io.grpc.stub.StreamObserver<dk.via.mithus.protobuf.Void>) responseObserver);
          break;
        case METHODID_GET_POST_STATUSES:
          serviceImpl.getPostStatuses((dk.via.mithus.protobuf.Void) request,
              (io.grpc.stub.StreamObserver<dk.via.mithus.protobuf.PostStatuses>) responseObserver);
          break;
        case METHODID_GET_HOUSING_TYPES:
          serviceImpl.getHousingTypes((dk.via.mithus.protobuf.Void) request,
              (io.grpc.stub.StreamObserver<dk.via.mithus.protobuf.HousingTypes>) responseObserver);
          break;
        case METHODID_GET_ENERGY_RATINGS:
          serviceImpl.getEnergyRatings((dk.via.mithus.protobuf.Void) request,
              (io.grpc.stub.StreamObserver<dk.via.mithus.protobuf.EnergyRatings>) responseObserver);
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
              .addMethod(getGetPostMethod())
              .addMethod(getGetPostsMethod())
              .addMethod(getUpdatePostMethod())
              .addMethod(getSetPostStatusMethod())
              .addMethod(getDeletePostMethod())
              .addMethod(getGetPostStatusesMethod())
              .addMethod(getGetHousingTypesMethod())
              .addMethod(getGetEnergyRatingsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
