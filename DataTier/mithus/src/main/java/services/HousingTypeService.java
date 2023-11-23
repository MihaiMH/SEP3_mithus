//package services;
//
//import dk.via.mithus.DAOInterfaces.HousingTypeDAO;
//import dk.via.mithus.mappers.PostMapper;
//import dk.via.mithus.protobuf.HousingType;
//import dk.via.mithus.protobuf.HousingTypeServiceGrpc;
//import io.grpc.stub.StreamObserver;
//import org.lognet.springboot.grpc.GRpcService;
//import org.springframework.beans.factory.annotation.Autowired;
//
//@GRpcService
//public class HousingTypeService extends HousingTypeServiceGrpc.HousingTypeServiceImplBase {
//    @Autowired
//    private HousingTypeDAO housingTypeDAO;
//
//    public HousingTypeService() {}
//
//    @Override
//    public void createHousingType(HousingType request, StreamObserver<HousingType> responseObserver) {
//        dk.via.mithus.Shared.HousingType housingType = new dk.via.mithus.Shared.HousingType(request.getName());
//
//        dk.via.mithus.Shared.HousingType createdHousingType = housingTypeDAO.createHousingType(housingType);
//        responseObserver.onNext(PostMapper.mapHousingTypeProto(createdHousingType));
//        responseObserver.onCompleted();
//    }
//}
