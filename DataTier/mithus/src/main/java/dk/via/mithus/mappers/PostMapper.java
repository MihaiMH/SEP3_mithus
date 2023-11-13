package dk.via.mithus.mappers;

import dk.via.mithus.protobuf.*;

import java.util.ArrayList;
import java.util.Collection;

public abstract class PostMapper {
    public static Post mapProto(dk.via.mithus.Shared.Post post) {
        return Post.newBuilder()
                .setId(String.valueOf(post.getId()))
                .setTitle(post.getTitle())
                .setDescription(post.getDescription())
                .setArea(post.getArea())
                .setMaxTenants(post.getMaxTenants())
                .setTypeId(String.valueOf(post.getType().getId()))
                .setStatusId(String.valueOf(post.getStatus().getId()))
                .setEnergyRatingId(String.valueOf(post.getEnergyRating().getId()))
                .setCostId(String.valueOf(post.getCost().getId()))
                .setAddressId(String.valueOf(post.getAddress().getId()))
                .addAllAmenityId(mapAmenityIdProto(post.getAmenities()))
                .addAllImageId(mapImageIdProto(post.getImages()))
                .build();
    }

    public static HousingType mapHousingTypeProto(dk.via.mithus.Shared.HousingType housingType) {
        return dk.via.mithus.protobuf.HousingType.newBuilder()
                .setId(String.valueOf(housingType.getId()))
                .setName(housingType.getName())
                .build();
    }

    public static PostStatus mapPostStatusProto(dk.via.mithus.Shared.PostStatus postStatus) {
        return PostStatus.newBuilder()
                .setId(String.valueOf(postStatus.getId()))
                .setStatus(postStatus.getStatus())
                .build();
    }

    public static EnergyRating mapEnergyRatingProto(dk.via.mithus.Shared.EnergyRating energyRating) {
        return EnergyRating.newBuilder()
                .setId(String.valueOf(energyRating.getId()))
                .setName(energyRating.getName())
                .build();
    }

    public static Cost mapCostProto(dk.via.mithus.Shared.Cost cost) {
        return Cost.newBuilder()
                .setId(String.valueOf(cost.getId()))
                .setDeposit(cost.getDeposit())
                .setMoveInPrice(cost.getMoveInPrice())
                .setUtilities(cost.getUtilities())
                .setMonthlyRent(cost.getMonthlyRent())
                .build();
    }

    public static Address mapAddressProto(dk.via.mithus.Shared.Address address) {
        return Address.newBuilder()
                .setId(String.valueOf(address.getId()))
                .setStreet(address.getStreet())
                .setCity(address.getCity())
                .setCountry(address.getCountry())
                .setZipCode(address.getZipCode())
                .build();
    }

    public static Collection<String> mapAmenityIdProto(Collection<dk.via.mithus.Shared.Amenity> amenities) {
        Collection<String> amenityList = new ArrayList<>();

        for (dk.via.mithus.Shared.Amenity amenity : amenities) {
            Amenity amenityProto = AmenityMapper.mapProto(amenity);
            amenityList.add(amenityProto.getId());
        }

        return amenityList;
    }

    public static Collection<String> mapImageIdProto(Collection<dk.via.mithus.Shared.Image> images) {
        Collection<String> imageList = new ArrayList<>();

        for (dk.via.mithus.Shared.Image image : images) {
            Image.Builder imageBuilder = Image.newBuilder()
                    .setId(String.valueOf(image.getId()))
                    .setAddress(image.getAddress());

            imageList.add(imageBuilder.build().getId());
        }

        return imageList;
    }
}
