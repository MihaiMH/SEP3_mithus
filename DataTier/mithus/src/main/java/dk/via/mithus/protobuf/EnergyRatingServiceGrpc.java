package dk.via.mithus.protobuf;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: protobuf.proto")
public final class EnergyRatingServiceGrpc {

  private EnergyRatingServiceGrpc() {}

  public static final String SERVICE_NAME = "dk.via.mithus.protobuf.EnergyRatingService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<dk.via.mithus.protobuf.EnergyRating,
      dk.via.mithus.protobuf.EnergyRating> getCreateEnergyRatingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateEnergyRating",
      requestType = dk.via.mithus.protobuf.EnergyRating.class,
      responseType = dk.via.mithus.protobuf.EnergyRating.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dk.via.mithus.protobuf.EnergyRating,
      dk.via.mithus.protobuf.EnergyRating> getCreateEnergyRatingMethod() {
    io.grpc.MethodDescriptor<dk.via.mithus.protobuf.EnergyRating, dk.via.mithus.protobuf.EnergyRating> getCreateEnergyRatingMethod;
    if ((getCreateEnergyRatingMethod = EnergyRatingServiceGrpc.getCreateEnergyRatingMethod) == null) {
      synchronized (EnergyRatingServiceGrpc.class) {
        if ((getCreateEnergyRatingMethod = EnergyRatingServiceGrpc.getCreateEnergyRatingMethod) == null) {
          EnergyRatingServiceGrpc.getCreateEnergyRatingMethod = getCreateEnergyRatingMethod =
              io.grpc.MethodDescriptor.<dk.via.mithus.protobuf.EnergyRating, dk.via.mithus.protobuf.EnergyRating>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateEnergyRating"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dk.via.mithus.protobuf.EnergyRating.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dk.via.mithus.protobuf.EnergyRating.getDefaultInstance()))
              .setSchemaDescriptor(new EnergyRatingServiceMethodDescriptorSupplier("CreateEnergyRating"))
              .build();
        }
      }
    }
    return getCreateEnergyRatingMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EnergyRatingServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EnergyRatingServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EnergyRatingServiceStub>() {
        @java.lang.Override
        public EnergyRatingServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EnergyRatingServiceStub(channel, callOptions);
        }
      };
    return EnergyRatingServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EnergyRatingServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EnergyRatingServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EnergyRatingServiceBlockingStub>() {
        @java.lang.Override
        public EnergyRatingServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EnergyRatingServiceBlockingStub(channel, callOptions);
        }
      };
    return EnergyRatingServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static EnergyRatingServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EnergyRatingServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EnergyRatingServiceFutureStub>() {
        @java.lang.Override
        public EnergyRatingServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EnergyRatingServiceFutureStub(channel, callOptions);
        }
      };
    return EnergyRatingServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class EnergyRatingServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createEnergyRating(dk.via.mithus.protobuf.EnergyRating request,
        io.grpc.stub.StreamObserver<dk.via.mithus.protobuf.EnergyRating> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateEnergyRatingMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateEnergyRatingMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                dk.via.mithus.protobuf.EnergyRating,
                dk.via.mithus.protobuf.EnergyRating>(
                  this, METHODID_CREATE_ENERGY_RATING)))
          .build();
    }
  }

  /**
   */
  public static final class EnergyRatingServiceStub extends io.grpc.stub.AbstractAsyncStub<EnergyRatingServiceStub> {
    private EnergyRatingServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EnergyRatingServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EnergyRatingServiceStub(channel, callOptions);
    }

    /**
     */
    public void createEnergyRating(dk.via.mithus.protobuf.EnergyRating request,
        io.grpc.stub.StreamObserver<dk.via.mithus.protobuf.EnergyRating> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateEnergyRatingMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class EnergyRatingServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<EnergyRatingServiceBlockingStub> {
    private EnergyRatingServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EnergyRatingServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EnergyRatingServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public dk.via.mithus.protobuf.EnergyRating createEnergyRating(dk.via.mithus.protobuf.EnergyRating request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateEnergyRatingMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class EnergyRatingServiceFutureStub extends io.grpc.stub.AbstractFutureStub<EnergyRatingServiceFutureStub> {
    private EnergyRatingServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EnergyRatingServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EnergyRatingServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dk.via.mithus.protobuf.EnergyRating> createEnergyRating(
        dk.via.mithus.protobuf.EnergyRating request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateEnergyRatingMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_ENERGY_RATING = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final EnergyRatingServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(EnergyRatingServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_ENERGY_RATING:
          serviceImpl.createEnergyRating((dk.via.mithus.protobuf.EnergyRating) request,
              (io.grpc.stub.StreamObserver<dk.via.mithus.protobuf.EnergyRating>) responseObserver);
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

  private static abstract class EnergyRatingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    EnergyRatingServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return dk.via.mithus.protobuf.Protobuf.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("EnergyRatingService");
    }
  }

  private static final class EnergyRatingServiceFileDescriptorSupplier
      extends EnergyRatingServiceBaseDescriptorSupplier {
    EnergyRatingServiceFileDescriptorSupplier() {}
  }

  private static final class EnergyRatingServiceMethodDescriptorSupplier
      extends EnergyRatingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    EnergyRatingServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (EnergyRatingServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new EnergyRatingServiceFileDescriptorSupplier())
              .addMethod(getCreateEnergyRatingMethod())
              .build();
        }
      }
    }
    return result;
  }
}
