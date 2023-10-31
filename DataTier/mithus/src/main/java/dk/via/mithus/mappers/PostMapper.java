package dk.via.mithus.mappers;

import dk.via.mithus.Shared.Image;
import dk.via.mithus.protobuf.Post;

public abstract class PostMapper {
    public static Post mapProto(dk.via.mithus.Shared.Post post) {
        Iterable<Image> images = (Iterable<Image>) post.getImages().iterator();

        return Post.newBuilder()
                .setId(String.valueOf(post.getId()))
                .setTitle(post.getTitle())
                .setDescription(post.getDescription())
                .setStreet(post.getStreet())
                .setArea(post.getArea())
                .setType(post.getType())
                .setMaxTenants(post.getMaxTenants())
                .setEnergyRating(post.getEnergyRating())
                .setDeposit(post.getDeposit())
                .setMoveInPrice(post.getMoveInPrice())
                .setUtilities(post.getUtilities())
                .setMonthlyRent(post.getMonthlyRent())
                .setStatus(post.getStatus())
                .setIsFurnished(post.isFurnished())
                .setHasBalcony(post.isHasBalcony())
                .setSmokingAllowed(post.isSmokingAllowed())
                .setHasParking(post.isHasParking())
                .setHasDryer(post.isHasDryer())
                .setHasDishwasher(post.isHasDishwasher())
                .setHasWashingMachine(post.isHasWashingMachine())
                .build();
    }
}
