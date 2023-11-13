package dk.via.mithus.mappers;

import dk.via.mithus.protobuf.Amenity;

public abstract class AmenityMapper {
    public static Amenity mapProto(dk.via.mithus.Shared.Amenity amenity) {
        return Amenity.newBuilder()
                .setId(String.valueOf(amenity.getId()))
                .setName(amenity.getName())
                .setDescription(amenity.getDescription())
                .build();
    }
}
