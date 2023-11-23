//package services;
//
//import dk.via.mithus.DAOInterfaces.EnergyRatingDAO;
//import dk.via.mithus.mappers.PostMapper;
//import dk.via.mithus.protobuf.EnergyRating;
//import dk.via.mithus.protobuf.EnergyRatingServiceGrpc;
//import io.grpc.stub.StreamObserver;
//import org.lognet.springboot.grpc.GRpcService;
//import org.springframework.beans.factory.annotation.Autowired;
//
//@GRpcService
//public class EnergyRatingService extends EnergyRatingServiceGrpc.EnergyRatingServiceImplBase {
//    @Autowired
//    private EnergyRatingDAO energyRatingDAO;
//
//    public EnergyRatingService() {}
//
//    @Override
//    public void createEnergyRating(EnergyRating request, StreamObserver<EnergyRating> responseObserver) {
//        dk.via.mithus.Shared.EnergyRating energyRating = new dk.via.mithus.Shared.EnergyRating(request.getName());
//
//        dk.via.mithus.Shared.EnergyRating createdEnergyRating = energyRatingDAO.createEnergyRating(energyRating);
//        responseObserver.onNext(PostMapper.mapEnergyRatingProto(createdEnergyRating));
//        responseObserver.onCompleted();
//    }
//}
