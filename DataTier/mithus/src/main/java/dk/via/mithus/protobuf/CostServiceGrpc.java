package dk.via.mithus.protobuf;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: protobuf.proto")
public final class CostServiceGrpc {

  private CostServiceGrpc() {}

  public static final String SERVICE_NAME = "dk.via.mithus.protobuf.CostService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<dk.via.mithus.protobuf.Cost,
      dk.via.mithus.protobuf.Cost> getCreateCostMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateCost",
      requestType = dk.via.mithus.protobuf.Cost.class,
      responseType = dk.via.mithus.protobuf.Cost.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dk.via.mithus.protobuf.Cost,
      dk.via.mithus.protobuf.Cost> getCreateCostMethod() {
    io.grpc.MethodDescriptor<dk.via.mithus.protobuf.Cost, dk.via.mithus.protobuf.Cost> getCreateCostMethod;
    if ((getCreateCostMethod = CostServiceGrpc.getCreateCostMethod) == null) {
      synchronized (CostServiceGrpc.class) {
        if ((getCreateCostMethod = CostServiceGrpc.getCreateCostMethod) == null) {
          CostServiceGrpc.getCreateCostMethod = getCreateCostMethod =
              io.grpc.MethodDescriptor.<dk.via.mithus.protobuf.Cost, dk.via.mithus.protobuf.Cost>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateCost"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dk.via.mithus.protobuf.Cost.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dk.via.mithus.protobuf.Cost.getDefaultInstance()))
              .setSchemaDescriptor(new CostServiceMethodDescriptorSupplier("CreateCost"))
              .build();
        }
      }
    }
    return getCreateCostMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CostServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CostServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CostServiceStub>() {
        @java.lang.Override
        public CostServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CostServiceStub(channel, callOptions);
        }
      };
    return CostServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CostServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CostServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CostServiceBlockingStub>() {
        @java.lang.Override
        public CostServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CostServiceBlockingStub(channel, callOptions);
        }
      };
    return CostServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CostServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CostServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CostServiceFutureStub>() {
        @java.lang.Override
        public CostServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CostServiceFutureStub(channel, callOptions);
        }
      };
    return CostServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class CostServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createCost(dk.via.mithus.protobuf.Cost request,
        io.grpc.stub.StreamObserver<dk.via.mithus.protobuf.Cost> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateCostMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateCostMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                dk.via.mithus.protobuf.Cost,
                dk.via.mithus.protobuf.Cost>(
                  this, METHODID_CREATE_COST)))
          .build();
    }
  }

  /**
   */
  public static final class CostServiceStub extends io.grpc.stub.AbstractAsyncStub<CostServiceStub> {
    private CostServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CostServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CostServiceStub(channel, callOptions);
    }

    /**
     */
    public void createCost(dk.via.mithus.protobuf.Cost request,
        io.grpc.stub.StreamObserver<dk.via.mithus.protobuf.Cost> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateCostMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CostServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<CostServiceBlockingStub> {
    private CostServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CostServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CostServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public dk.via.mithus.protobuf.Cost createCost(dk.via.mithus.protobuf.Cost request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateCostMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CostServiceFutureStub extends io.grpc.stub.AbstractFutureStub<CostServiceFutureStub> {
    private CostServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CostServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CostServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dk.via.mithus.protobuf.Cost> createCost(
        dk.via.mithus.protobuf.Cost request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateCostMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_COST = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CostServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CostServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_COST:
          serviceImpl.createCost((dk.via.mithus.protobuf.Cost) request,
              (io.grpc.stub.StreamObserver<dk.via.mithus.protobuf.Cost>) responseObserver);
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

  private static abstract class CostServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CostServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return dk.via.mithus.protobuf.Protobuf.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CostService");
    }
  }

  private static final class CostServiceFileDescriptorSupplier
      extends CostServiceBaseDescriptorSupplier {
    CostServiceFileDescriptorSupplier() {}
  }

  private static final class CostServiceMethodDescriptorSupplier
      extends CostServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CostServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (CostServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CostServiceFileDescriptorSupplier())
              .addMethod(getCreateCostMethod())
              .build();
        }
      }
    }
    return result;
  }
}
