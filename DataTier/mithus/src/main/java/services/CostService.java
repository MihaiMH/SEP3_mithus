package services;

import dk.via.mithus.DAOInterfaces.CostDAO;
import dk.via.mithus.mappers.PostMapper;
import dk.via.mithus.protobuf.Cost;
import dk.via.mithus.protobuf.CostServiceGrpc;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;

@GRpcService
public class CostService extends CostServiceGrpc.CostServiceImplBase {
    @Autowired
    private CostDAO costDAO;

    public CostService() {}

    @Override
    public void createCost(Cost request, StreamObserver<Cost> responseObserver) {
        dk.via.mithus.Shared.Cost cost = new dk.via.mithus.Shared.Cost(
                request.getDeposit(),
                request.getMoveInPrice(),
                request.getUtilities(),
                request.getMonthlyRent());

        dk.via.mithus.Shared.Cost createdCost = costDAO.createCost(cost);
        responseObserver.onNext(PostMapper.mapCostProto(createdCost));
        responseObserver.onCompleted();
    }
}
