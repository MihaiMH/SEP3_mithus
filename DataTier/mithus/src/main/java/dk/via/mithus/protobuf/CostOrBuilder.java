// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protobuf.proto

package dk.via.mithus.protobuf;

public interface CostOrBuilder extends
    // @@protoc_insertion_point(interface_extends:dk.via.mithus.protobuf.Cost)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string id = 1;</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <code>string id = 1;</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <code>double deposit = 2;</code>
   * @return The deposit.
   */
  double getDeposit();

  /**
   * <code>double moveInPrice = 3;</code>
   * @return The moveInPrice.
   */
  double getMoveInPrice();

  /**
   * <code>double utilities = 4;</code>
   * @return The utilities.
   */
  double getUtilities();

  /**
   * <code>double monthlyRent = 5;</code>
   * @return The monthlyRent.
   */
  double getMonthlyRent();
}
