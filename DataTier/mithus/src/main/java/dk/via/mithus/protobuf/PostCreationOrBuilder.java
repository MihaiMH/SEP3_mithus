// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protobuf.proto

package dk.via.mithus.protobuf;

public interface PostCreationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:dk.via.mithus.protobuf.PostCreation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 id = 1;</code>
   * @return The id.
   */
  long getId();

  /**
   * <code>string title = 2;</code>
   * @return The title.
   */
  java.lang.String getTitle();
  /**
   * <code>string title = 2;</code>
   * @return The bytes for title.
   */
  com.google.protobuf.ByteString
      getTitleBytes();

  /**
   * <code>string description = 3;</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <code>string description = 3;</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <code>double area = 4;</code>
   * @return The area.
   */
  double getArea();

  /**
   * <code>int32 maxTenants = 5;</code>
   * @return The maxTenants.
   */
  int getMaxTenants();

  /**
   * <code>string creationDate = 6;</code>
   * @return The creationDate.
   */
  java.lang.String getCreationDate();
  /**
   * <code>string creationDate = 6;</code>
   * @return The bytes for creationDate.
   */
  com.google.protobuf.ByteString
      getCreationDateBytes();

  /**
   * <code>.dk.via.mithus.protobuf.HousingType housingType = 7;</code>
   * @return Whether the housingType field is set.
   */
  boolean hasHousingType();
  /**
   * <code>.dk.via.mithus.protobuf.HousingType housingType = 7;</code>
   * @return The housingType.
   */
  dk.via.mithus.protobuf.HousingType getHousingType();
  /**
   * <code>.dk.via.mithus.protobuf.HousingType housingType = 7;</code>
   */
  dk.via.mithus.protobuf.HousingTypeOrBuilder getHousingTypeOrBuilder();

  /**
   * <code>.dk.via.mithus.protobuf.EnergyRating energyRating = 8;</code>
   * @return Whether the energyRating field is set.
   */
  boolean hasEnergyRating();
  /**
   * <code>.dk.via.mithus.protobuf.EnergyRating energyRating = 8;</code>
   * @return The energyRating.
   */
  dk.via.mithus.protobuf.EnergyRating getEnergyRating();
  /**
   * <code>.dk.via.mithus.protobuf.EnergyRating energyRating = 8;</code>
   */
  dk.via.mithus.protobuf.EnergyRatingOrBuilder getEnergyRatingOrBuilder();

  /**
   * <code>.dk.via.mithus.protobuf.PostStatus status = 9;</code>
   * @return Whether the status field is set.
   */
  boolean hasStatus();
  /**
   * <code>.dk.via.mithus.protobuf.PostStatus status = 9;</code>
   * @return The status.
   */
  dk.via.mithus.protobuf.PostStatus getStatus();
  /**
   * <code>.dk.via.mithus.protobuf.PostStatus status = 9;</code>
   */
  dk.via.mithus.protobuf.PostStatusOrBuilder getStatusOrBuilder();

  /**
   * <code>.dk.via.mithus.protobuf.User landlord = 10;</code>
   * @return Whether the landlord field is set.
   */
  boolean hasLandlord();
  /**
   * <code>.dk.via.mithus.protobuf.User landlord = 10;</code>
   * @return The landlord.
   */
  dk.via.mithus.protobuf.User getLandlord();
  /**
   * <code>.dk.via.mithus.protobuf.User landlord = 10;</code>
   */
  dk.via.mithus.protobuf.UserOrBuilder getLandlordOrBuilder();

  /**
   * <code>repeated .dk.via.mithus.protobuf.Image image = 11;</code>
   */
  java.util.List<dk.via.mithus.protobuf.Image> 
      getImageList();
  /**
   * <code>repeated .dk.via.mithus.protobuf.Image image = 11;</code>
   */
  dk.via.mithus.protobuf.Image getImage(int index);
  /**
   * <code>repeated .dk.via.mithus.protobuf.Image image = 11;</code>
   */
  int getImageCount();
  /**
   * <code>repeated .dk.via.mithus.protobuf.Image image = 11;</code>
   */
  java.util.List<? extends dk.via.mithus.protobuf.ImageOrBuilder> 
      getImageOrBuilderList();
  /**
   * <code>repeated .dk.via.mithus.protobuf.Image image = 11;</code>
   */
  dk.via.mithus.protobuf.ImageOrBuilder getImageOrBuilder(
      int index);

  /**
   * <code>.dk.via.mithus.protobuf.Address address = 12;</code>
   * @return Whether the address field is set.
   */
  boolean hasAddress();
  /**
   * <code>.dk.via.mithus.protobuf.Address address = 12;</code>
   * @return The address.
   */
  dk.via.mithus.protobuf.Address getAddress();
  /**
   * <code>.dk.via.mithus.protobuf.Address address = 12;</code>
   */
  dk.via.mithus.protobuf.AddressOrBuilder getAddressOrBuilder();

  /**
   * <code>.dk.via.mithus.protobuf.Cost cost = 13;</code>
   * @return Whether the cost field is set.
   */
  boolean hasCost();
  /**
   * <code>.dk.via.mithus.protobuf.Cost cost = 13;</code>
   * @return The cost.
   */
  dk.via.mithus.protobuf.Cost getCost();
  /**
   * <code>.dk.via.mithus.protobuf.Cost cost = 13;</code>
   */
  dk.via.mithus.protobuf.CostOrBuilder getCostOrBuilder();

  /**
   * <code>repeated .dk.via.mithus.protobuf.Amenity amenity = 14;</code>
   */
  java.util.List<dk.via.mithus.protobuf.Amenity> 
      getAmenityList();
  /**
   * <code>repeated .dk.via.mithus.protobuf.Amenity amenity = 14;</code>
   */
  dk.via.mithus.protobuf.Amenity getAmenity(int index);
  /**
   * <code>repeated .dk.via.mithus.protobuf.Amenity amenity = 14;</code>
   */
  int getAmenityCount();
  /**
   * <code>repeated .dk.via.mithus.protobuf.Amenity amenity = 14;</code>
   */
  java.util.List<? extends dk.via.mithus.protobuf.AmenityOrBuilder> 
      getAmenityOrBuilderList();
  /**
   * <code>repeated .dk.via.mithus.protobuf.Amenity amenity = 14;</code>
   */
  dk.via.mithus.protobuf.AmenityOrBuilder getAmenityOrBuilder(
      int index);
}
