package dk.via.mithus.protobuf;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: protobuf.proto")
public final class AmenityServiceGrpc {

  private AmenityServiceGrpc() {}

  public static final String SERVICE_NAME = "dk.via.mithus.protobuf.AmenityService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<dk.via.mithus.protobuf.Amenity,
      dk.via.mithus.protobuf.Amenity> getCreateAmenityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateAmenity",
      requestType = dk.via.mithus.protobuf.Amenity.class,
      responseType = dk.via.mithus.protobuf.Amenity.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dk.via.mithus.protobuf.Amenity,
      dk.via.mithus.protobuf.Amenity> getCreateAmenityMethod() {
    io.grpc.MethodDescriptor<dk.via.mithus.protobuf.Amenity, dk.via.mithus.protobuf.Amenity> getCreateAmenityMethod;
    if ((getCreateAmenityMethod = AmenityServiceGrpc.getCreateAmenityMethod) == null) {
      synchronized (AmenityServiceGrpc.class) {
        if ((getCreateAmenityMethod = AmenityServiceGrpc.getCreateAmenityMethod) == null) {
          AmenityServiceGrpc.getCreateAmenityMethod = getCreateAmenityMethod =
              io.grpc.MethodDescriptor.<dk.via.mithus.protobuf.Amenity, dk.via.mithus.protobuf.Amenity>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateAmenity"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dk.via.mithus.protobuf.Amenity.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dk.via.mithus.protobuf.Amenity.getDefaultInstance()))
              .setSchemaDescriptor(new AmenityServiceMethodDescriptorSupplier("CreateAmenity"))
              .build();
        }
      }
    }
    return getCreateAmenityMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AmenityServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AmenityServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AmenityServiceStub>() {
        @java.lang.Override
        public AmenityServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AmenityServiceStub(channel, callOptions);
        }
      };
    return AmenityServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AmenityServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AmenityServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AmenityServiceBlockingStub>() {
        @java.lang.Override
        public AmenityServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AmenityServiceBlockingStub(channel, callOptions);
        }
      };
    return AmenityServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AmenityServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AmenityServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AmenityServiceFutureStub>() {
        @java.lang.Override
        public AmenityServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AmenityServiceFutureStub(channel, callOptions);
        }
      };
    return AmenityServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class AmenityServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createAmenity(dk.via.mithus.protobuf.Amenity request,
        io.grpc.stub.StreamObserver<dk.via.mithus.protobuf.Amenity> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateAmenityMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateAmenityMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                dk.via.mithus.protobuf.Amenity,
                dk.via.mithus.protobuf.Amenity>(
                  this, METHODID_CREATE_AMENITY)))
          .build();
    }
  }

  /**
   */
  public static final class AmenityServiceStub extends io.grpc.stub.AbstractAsyncStub<AmenityServiceStub> {
    private AmenityServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AmenityServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AmenityServiceStub(channel, callOptions);
    }

    /**
     */
    public void createAmenity(dk.via.mithus.protobuf.Amenity request,
        io.grpc.stub.StreamObserver<dk.via.mithus.protobuf.Amenity> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateAmenityMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class AmenityServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<AmenityServiceBlockingStub> {
    private AmenityServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AmenityServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AmenityServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public dk.via.mithus.protobuf.Amenity createAmenity(dk.via.mithus.protobuf.Amenity request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateAmenityMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AmenityServiceFutureStub extends io.grpc.stub.AbstractFutureStub<AmenityServiceFutureStub> {
    private AmenityServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AmenityServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AmenityServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dk.via.mithus.protobuf.Amenity> createAmenity(
        dk.via.mithus.protobuf.Amenity request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateAmenityMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_AMENITY = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AmenityServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AmenityServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_AMENITY:
          serviceImpl.createAmenity((dk.via.mithus.protobuf.Amenity) request,
              (io.grpc.stub.StreamObserver<dk.via.mithus.protobuf.Amenity>) responseObserver);
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

  private static abstract class AmenityServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AmenityServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return dk.via.mithus.protobuf.Protobuf.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AmenityService");
    }
  }

  private static final class AmenityServiceFileDescriptorSupplier
      extends AmenityServiceBaseDescriptorSupplier {
    AmenityServiceFileDescriptorSupplier() {}
  }

  private static final class AmenityServiceMethodDescriptorSupplier
      extends AmenityServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AmenityServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (AmenityServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AmenityServiceFileDescriptorSupplier())
              .addMethod(getCreateAmenityMethod())
              .build();
        }
      }
    }
    return result;
  }
}
