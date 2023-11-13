package services;

import dk.via.mithus.DAOInterfaces.AddressDAO;
import dk.via.mithus.mappers.PostMapper;
import dk.via.mithus.protobuf.Address;
import dk.via.mithus.protobuf.AddressServiceGrpc;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;

@GRpcService
public class AddressService extends AddressServiceGrpc.AddressServiceImplBase {
    @Autowired
    private AddressDAO addressDAO;

    public AddressService() {}

    @Override
    public void createAddress(Address request, StreamObserver<Address> responseObserver) {
        dk.via.mithus.Shared.Address address = new dk.via.mithus.Shared.Address(
                request.getStreet(),
                request.getCity(),
                request.getCountry(),
                request.getZipCode());

        dk.via.mithus.Shared.Address createdAddress = addressDAO.createAddress(address);
        responseObserver.onNext(PostMapper.mapAddressProto(createdAddress));
        responseObserver.onCompleted();
    }
}
