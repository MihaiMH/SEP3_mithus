package dk.via.mithus.protobuf;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: protobuf.proto")
public final class UserServiceGrpc {

  private UserServiceGrpc() {}

  public static final String SERVICE_NAME = "dk.via.mithus.protobuf.UserService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<dk.via.mithus.protobuf.UserCreation,
      dk.via.mithus.protobuf.User> getRegisterUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RegisterUser",
      requestType = dk.via.mithus.protobuf.UserCreation.class,
      responseType = dk.via.mithus.protobuf.User.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dk.via.mithus.protobuf.UserCreation,
      dk.via.mithus.protobuf.User> getRegisterUserMethod() {
    io.grpc.MethodDescriptor<dk.via.mithus.protobuf.UserCreation, dk.via.mithus.protobuf.User> getRegisterUserMethod;
    if ((getRegisterUserMethod = UserServiceGrpc.getRegisterUserMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getRegisterUserMethod = UserServiceGrpc.getRegisterUserMethod) == null) {
          UserServiceGrpc.getRegisterUserMethod = getRegisterUserMethod =
              io.grpc.MethodDescriptor.<dk.via.mithus.protobuf.UserCreation, dk.via.mithus.protobuf.User>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RegisterUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dk.via.mithus.protobuf.UserCreation.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dk.via.mithus.protobuf.User.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("RegisterUser"))
              .build();
        }
      }
    }
    return getRegisterUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dk.via.mithus.protobuf.UserLogin,
      dk.via.mithus.protobuf.User> getLoginUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LoginUser",
      requestType = dk.via.mithus.protobuf.UserLogin.class,
      responseType = dk.via.mithus.protobuf.User.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dk.via.mithus.protobuf.UserLogin,
      dk.via.mithus.protobuf.User> getLoginUserMethod() {
    io.grpc.MethodDescriptor<dk.via.mithus.protobuf.UserLogin, dk.via.mithus.protobuf.User> getLoginUserMethod;
    if ((getLoginUserMethod = UserServiceGrpc.getLoginUserMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getLoginUserMethod = UserServiceGrpc.getLoginUserMethod) == null) {
          UserServiceGrpc.getLoginUserMethod = getLoginUserMethod =
              io.grpc.MethodDescriptor.<dk.via.mithus.protobuf.UserLogin, dk.via.mithus.protobuf.User>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LoginUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dk.via.mithus.protobuf.UserLogin.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dk.via.mithus.protobuf.User.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("LoginUser"))
              .build();
        }
      }
    }
    return getLoginUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dk.via.mithus.protobuf.Void,
      dk.via.mithus.protobuf.Roles> getGetRolesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRoles",
      requestType = dk.via.mithus.protobuf.Void.class,
      responseType = dk.via.mithus.protobuf.Roles.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dk.via.mithus.protobuf.Void,
      dk.via.mithus.protobuf.Roles> getGetRolesMethod() {
    io.grpc.MethodDescriptor<dk.via.mithus.protobuf.Void, dk.via.mithus.protobuf.Roles> getGetRolesMethod;
    if ((getGetRolesMethod = UserServiceGrpc.getGetRolesMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getGetRolesMethod = UserServiceGrpc.getGetRolesMethod) == null) {
          UserServiceGrpc.getGetRolesMethod = getGetRolesMethod =
              io.grpc.MethodDescriptor.<dk.via.mithus.protobuf.Void, dk.via.mithus.protobuf.Roles>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetRoles"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dk.via.mithus.protobuf.Void.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dk.via.mithus.protobuf.Roles.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("GetRoles"))
              .build();
        }
      }
    }
    return getGetRolesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UserServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserServiceStub>() {
        @java.lang.Override
        public UserServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserServiceStub(channel, callOptions);
        }
      };
    return UserServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserServiceBlockingStub>() {
        @java.lang.Override
        public UserServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserServiceBlockingStub(channel, callOptions);
        }
      };
    return UserServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UserServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserServiceFutureStub>() {
        @java.lang.Override
        public UserServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserServiceFutureStub(channel, callOptions);
        }
      };
    return UserServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class UserServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void registerUser(dk.via.mithus.protobuf.UserCreation request,
        io.grpc.stub.StreamObserver<dk.via.mithus.protobuf.User> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRegisterUserMethod(), responseObserver);
    }

    /**
     */
    public void loginUser(dk.via.mithus.protobuf.UserLogin request,
        io.grpc.stub.StreamObserver<dk.via.mithus.protobuf.User> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLoginUserMethod(), responseObserver);
    }

    /**
     */
    public void getRoles(dk.via.mithus.protobuf.Void request,
        io.grpc.stub.StreamObserver<dk.via.mithus.protobuf.Roles> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetRolesMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRegisterUserMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                dk.via.mithus.protobuf.UserCreation,
                dk.via.mithus.protobuf.User>(
                  this, METHODID_REGISTER_USER)))
          .addMethod(
            getLoginUserMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                dk.via.mithus.protobuf.UserLogin,
                dk.via.mithus.protobuf.User>(
                  this, METHODID_LOGIN_USER)))
          .addMethod(
            getGetRolesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                dk.via.mithus.protobuf.Void,
                dk.via.mithus.protobuf.Roles>(
                  this, METHODID_GET_ROLES)))
          .build();
    }
  }

  /**
   */
  public static final class UserServiceStub extends io.grpc.stub.AbstractAsyncStub<UserServiceStub> {
    private UserServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserServiceStub(channel, callOptions);
    }

    /**
     */
    public void registerUser(dk.via.mithus.protobuf.UserCreation request,
        io.grpc.stub.StreamObserver<dk.via.mithus.protobuf.User> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRegisterUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void loginUser(dk.via.mithus.protobuf.UserLogin request,
        io.grpc.stub.StreamObserver<dk.via.mithus.protobuf.User> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLoginUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getRoles(dk.via.mithus.protobuf.Void request,
        io.grpc.stub.StreamObserver<dk.via.mithus.protobuf.Roles> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetRolesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class UserServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<UserServiceBlockingStub> {
    private UserServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public dk.via.mithus.protobuf.User registerUser(dk.via.mithus.protobuf.UserCreation request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRegisterUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public dk.via.mithus.protobuf.User loginUser(dk.via.mithus.protobuf.UserLogin request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLoginUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public dk.via.mithus.protobuf.Roles getRoles(dk.via.mithus.protobuf.Void request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetRolesMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class UserServiceFutureStub extends io.grpc.stub.AbstractFutureStub<UserServiceFutureStub> {
    private UserServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dk.via.mithus.protobuf.User> registerUser(
        dk.via.mithus.protobuf.UserCreation request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRegisterUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dk.via.mithus.protobuf.User> loginUser(
        dk.via.mithus.protobuf.UserLogin request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLoginUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dk.via.mithus.protobuf.Roles> getRoles(
        dk.via.mithus.protobuf.Void request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetRolesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REGISTER_USER = 0;
  private static final int METHODID_LOGIN_USER = 1;
  private static final int METHODID_GET_ROLES = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UserServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UserServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_REGISTER_USER:
          serviceImpl.registerUser((dk.via.mithus.protobuf.UserCreation) request,
              (io.grpc.stub.StreamObserver<dk.via.mithus.protobuf.User>) responseObserver);
          break;
        case METHODID_LOGIN_USER:
          serviceImpl.loginUser((dk.via.mithus.protobuf.UserLogin) request,
              (io.grpc.stub.StreamObserver<dk.via.mithus.protobuf.User>) responseObserver);
          break;
        case METHODID_GET_ROLES:
          serviceImpl.getRoles((dk.via.mithus.protobuf.Void) request,
              (io.grpc.stub.StreamObserver<dk.via.mithus.protobuf.Roles>) responseObserver);
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

  private static abstract class UserServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UserServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return dk.via.mithus.protobuf.Protobuf.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UserService");
    }
  }

  private static final class UserServiceFileDescriptorSupplier
      extends UserServiceBaseDescriptorSupplier {
    UserServiceFileDescriptorSupplier() {}
  }

  private static final class UserServiceMethodDescriptorSupplier
      extends UserServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    UserServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (UserServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UserServiceFileDescriptorSupplier())
              .addMethod(getRegisterUserMethod())
              .addMethod(getLoginUserMethod())
              .addMethod(getGetRolesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
