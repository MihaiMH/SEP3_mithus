package dk.via.mithus.protobuf;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: protobuf.proto")
public final class HousingTypeServiceGrpc {

  private HousingTypeServiceGrpc() {}

  public static final String SERVICE_NAME = "dk.via.mithus.protobuf.HousingTypeService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<dk.via.mithus.protobuf.HousingType,
      dk.via.mithus.protobuf.HousingType> getCreateHousingTypeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateHousingType",
      requestType = dk.via.mithus.protobuf.HousingType.class,
      responseType = dk.via.mithus.protobuf.HousingType.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dk.via.mithus.protobuf.HousingType,
      dk.via.mithus.protobuf.HousingType> getCreateHousingTypeMethod() {
    io.grpc.MethodDescriptor<dk.via.mithus.protobuf.HousingType, dk.via.mithus.protobuf.HousingType> getCreateHousingTypeMethod;
    if ((getCreateHousingTypeMethod = HousingTypeServiceGrpc.getCreateHousingTypeMethod) == null) {
      synchronized (HousingTypeServiceGrpc.class) {
        if ((getCreateHousingTypeMethod = HousingTypeServiceGrpc.getCreateHousingTypeMethod) == null) {
          HousingTypeServiceGrpc.getCreateHousingTypeMethod = getCreateHousingTypeMethod =
              io.grpc.MethodDescriptor.<dk.via.mithus.protobuf.HousingType, dk.via.mithus.protobuf.HousingType>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateHousingType"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dk.via.mithus.protobuf.HousingType.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dk.via.mithus.protobuf.HousingType.getDefaultInstance()))
              .setSchemaDescriptor(new HousingTypeServiceMethodDescriptorSupplier("CreateHousingType"))
              .build();
        }
      }
    }
    return getCreateHousingTypeMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HousingTypeServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HousingTypeServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HousingTypeServiceStub>() {
        @java.lang.Override
        public HousingTypeServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HousingTypeServiceStub(channel, callOptions);
        }
      };
    return HousingTypeServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HousingTypeServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HousingTypeServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HousingTypeServiceBlockingStub>() {
        @java.lang.Override
        public HousingTypeServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HousingTypeServiceBlockingStub(channel, callOptions);
        }
      };
    return HousingTypeServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static HousingTypeServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HousingTypeServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HousingTypeServiceFutureStub>() {
        @java.lang.Override
        public HousingTypeServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HousingTypeServiceFutureStub(channel, callOptions);
        }
      };
    return HousingTypeServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class HousingTypeServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createHousingType(dk.via.mithus.protobuf.HousingType request,
        io.grpc.stub.StreamObserver<dk.via.mithus.protobuf.HousingType> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateHousingTypeMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateHousingTypeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                dk.via.mithus.protobuf.HousingType,
                dk.via.mithus.protobuf.HousingType>(
                  this, METHODID_CREATE_HOUSING_TYPE)))
          .build();
    }
  }

  /**
   */
  public static final class HousingTypeServiceStub extends io.grpc.stub.AbstractAsyncStub<HousingTypeServiceStub> {
    private HousingTypeServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HousingTypeServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HousingTypeServiceStub(channel, callOptions);
    }

    /**
     */
    public void createHousingType(dk.via.mithus.protobuf.HousingType request,
        io.grpc.stub.StreamObserver<dk.via.mithus.protobuf.HousingType> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateHousingTypeMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class HousingTypeServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<HousingTypeServiceBlockingStub> {
    private HousingTypeServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HousingTypeServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HousingTypeServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public dk.via.mithus.protobuf.HousingType createHousingType(dk.via.mithus.protobuf.HousingType request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateHousingTypeMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class HousingTypeServiceFutureStub extends io.grpc.stub.AbstractFutureStub<HousingTypeServiceFutureStub> {
    private HousingTypeServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HousingTypeServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HousingTypeServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dk.via.mithus.protobuf.HousingType> createHousingType(
        dk.via.mithus.protobuf.HousingType request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateHousingTypeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_HOUSING_TYPE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final HousingTypeServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(HousingTypeServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_HOUSING_TYPE:
          serviceImpl.createHousingType((dk.via.mithus.protobuf.HousingType) request,
              (io.grpc.stub.StreamObserver<dk.via.mithus.protobuf.HousingType>) responseObserver);
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

  private static abstract class HousingTypeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    HousingTypeServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return dk.via.mithus.protobuf.Protobuf.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("HousingTypeService");
    }
  }

  private static final class HousingTypeServiceFileDescriptorSupplier
      extends HousingTypeServiceBaseDescriptorSupplier {
    HousingTypeServiceFileDescriptorSupplier() {}
  }

  private static final class HousingTypeServiceMethodDescriptorSupplier
      extends HousingTypeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    HousingTypeServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (HousingTypeServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new HousingTypeServiceFileDescriptorSupplier())
              .addMethod(getCreateHousingTypeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
