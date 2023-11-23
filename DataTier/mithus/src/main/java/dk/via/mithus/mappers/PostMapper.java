package dk.via.mithus.mappers;

import dk.via.mithus.protobuf.*;

import java.util.ArrayList;
import java.util.Collection;

public abstract class PostMapper {
    public static Post mapProto(dk.via.mithus.Shared.Post post) {
        return Post.newBuilder()
                .setId(post.getId())
                .setTitle(post.getTitle())
                .setDescription(post.getDescription())
                .setArea(post.getArea())
                .setMaxTenants(post.getMaxTenants())
                .setHousingType(mapHousingTypeProto(post.getType()))
                .setStatus(mapPostStatusProto(post.getStatus()))
                .setEnergyRating(mapEnergyRatingProto(post.getEnergyRating()))
                .setCost(mapCostProto(post.getCost()))
                .setAddress(mapAddressProto(post.getAddress()))
                .addAllAmenity(mapAmenitiesProto(post.getAmenities()))
                .addAllImage(mapImagesProto(post.getImages()))
                .build();
    }

    public static HousingType mapHousingTypeProto(dk.via.mithus.Shared.HousingType housingType) {
        return dk.via.mithus.protobuf.HousingType.newBuilder()
                .setId(housingType.getId())
                .setName(housingType.getName())
                .build();
    }

    public static PostStatus mapPostStatusProto(dk.via.mithus.Shared.PostStatus postStatus) {
        return PostStatus.newBuilder()
                .setId(postStatus.getId())
                .setStatus(postStatus.getStatus())
                .build();
    }

    public static EnergyRating mapEnergyRatingProto(dk.via.mithus.Shared.EnergyRating energyRating) {
        return EnergyRating.newBuilder()
                .setId(energyRating.getId())
                .setName(energyRating.getName())
                .build();
    }

    public static Cost mapCostProto(dk.via.mithus.Shared.Cost cost) {
        return Cost.newBuilder()
                .setId(cost.getId())
                .setDeposit(cost.getDeposit())
                .setMoveInPrice(cost.getMoveInPrice())
                .setUtilities(cost.getUtilities())
                .setMonthlyRent(cost.getMonthlyRent())
                .build();
    }

    public static Address mapAddressProto(dk.via.mithus.Shared.Address address) {
        return Address.newBuilder()
                .setId(address.getId())
                .setStreet(address.getStreet())
                .setCity(address.getCity())
                .setCountry(address.getCountry())
                .setZipCode(address.getZipCode())
                .build();
    }

    public static Collection<Amenity> mapAmenitiesProto(Collection<dk.via.mithus.Shared.Amenity> amenities) {
        Collection<Amenity> amenityCollection = new ArrayList<>();

        for (dk.via.mithus.Shared.Amenity amenity : amenities) {
            amenityCollection.add(AmenityMapper.mapProto(amenity));
        }

        return amenityCollection;
    }

    public static Collection<Image> mapImagesProto(Collection<dk.via.mithus.Shared.Image> images) {
        Collection<Image> imageCollection = new ArrayList<>();

        for (dk.via.mithus.Shared.Image image : images) {
            Image.Builder imageBuilder = Image.newBuilder()
                    .setId(image.getId())
                    .setAddress(image.getAddress());

            imageCollection.add(imageBuilder.build());
        }

        return imageCollection;
    }
}
