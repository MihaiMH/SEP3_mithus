//package services;
//
//import dk.via.mithus.DAOInterfaces.AmenityDAO;
//import dk.via.mithus.mappers.AmenityMapper;
//import dk.via.mithus.protobuf.Amenity;
//import dk.via.mithus.protobuf.AmenityServiceGrpc;
//import io.grpc.stub.StreamObserver;
//import org.lognet.springboot.grpc.GRpcService;
//import org.springframework.beans.factory.annotation.Autowired;
//
//@GRpcService
//public class AmenityService extends AmenityServiceGrpc.AmenityServiceImplBase {
//    @Autowired
//    private AmenityDAO amenityDAO;
//
//    public AmenityService() {}
//
//    @Override
//    public void createAmenity(Amenity request, StreamObserver<Amenity> responseObserver) {
//        dk.via.mithus.Shared.Amenity amenity = new dk.via.mithus.Shared.Amenity(
//                request.getName(),
//                request.getDescription());
//
//        dk.via.mithus.Shared.Amenity createdAmenity = amenityDAO.createAmenity(amenity);
//        responseObserver.onNext(AmenityMapper.mapProto(createdAmenity));
//        responseObserver.onCompleted();
//    }
//}
