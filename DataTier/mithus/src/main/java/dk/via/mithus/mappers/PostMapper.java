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
                .setType(mapPostTypeProto(post.getType()))
                .setStatus(mapPostStatusProto(post.getStatus()))
                .setEnergyRating(mapEnergyRatingProto(post.getEnergyRating()))
                .setCost(mapCostProto(post.getCost()))
                .setAddress(mapAddressProto(post.getAddress()))
                .addAllAmenity(mapAmenityProto(post.getAmenities()))
                .addAllImage(mapImageProto(post.getImages()))
                .build();
    }

    public static PostType mapPostTypeProto(dk.via.mithus.Shared.PostType postType) {
        return PostType.newBuilder()
                .setId(String.valueOf(postType.getId()))
                .setName(postType.getName())
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

    public static Collection<Amenity> mapAmenityProto(Collection<dk.via.mithus.Shared.Amenity> amenities) {
        Collection<Amenity> amenityList = new ArrayList<>();

        for (dk.via.mithus.Shared.Amenity amenity : amenities) {
            Amenity amenityProto = AmenityMapper.mapProto(amenity);
            amenityList.add(amenityProto);
        }

        return amenityList;
    }

    public static Collection<Image> mapImageProto(Collection<dk.via.mithus.Shared.Image> images) {
        Collection<Image> imageList = new ArrayList<>();

        for (dk.via.mithus.Shared.Image image : images) {
            Image.Builder imageBuilder = Image.newBuilder()
                    .setId(String.valueOf(image.getId()))
                    .setAddress(image.getAddress());

            imageList.add(imageBuilder.build());
        }

        return imageList;
    }
}
