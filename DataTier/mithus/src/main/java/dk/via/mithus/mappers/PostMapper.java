package dk.via.mithus.mappers;

import dk.via.mithus.protobuf.Post;

public abstract class PostMapper {
    public static Post mapProto(dk.via.mithus.Shared.Post post) {
        return Post.newBuilder()
                .setId(post.getId().toString())
                .setTitle(post.getTitle())
                .setDescription(post.getDescription())
                .setStreet(post.getStreet())
                .setArea(post.getArea())
                .setMaxTenants(post.getMaxTenants())
                .setEnergyRating(post.getEnergyRating())
                .setDeposit(post.getDeposit())
                .setMoveInPrice(post.getMoveInPrice())
                .setUtilities(post.getUtilities())
                .setIsFurnished(post.isFurnished())
                .setHasBalcony(post.isHasBalcony())
                .setSmokingAllowed(post.isSmokingAllowed())
                .setHasParking(post.isHasParking())
                .setHasDryer(post.isHasDryer())
                .setHasMonthlyRent(post.isHasMonthlyRent())
                .setUserId(post.getId().toString())
                .build();
    }
}
