// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protobuf.proto

package dk.via.mithus.protobuf;

public interface UserCreationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:dk.via.mithus.protobuf.UserCreation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string email = 1;</code>
   * @return The email.
   */
  java.lang.String getEmail();
  /**
   * <code>string email = 1;</code>
   * @return The bytes for email.
   */
  com.google.protobuf.ByteString
      getEmailBytes();

  /**
   * <code>string password = 2;</code>
   * @return The password.
   */
  java.lang.String getPassword();
  /**
   * <code>string password = 2;</code>
   * @return The bytes for password.
   */
  com.google.protobuf.ByteString
      getPasswordBytes();

  /**
   * <code>string firstName = 3;</code>
   * @return The firstName.
   */
  java.lang.String getFirstName();
  /**
   * <code>string firstName = 3;</code>
   * @return The bytes for firstName.
   */
  com.google.protobuf.ByteString
      getFirstNameBytes();

  /**
   * <code>string lastName = 4;</code>
   * @return The lastName.
   */
  java.lang.String getLastName();
  /**
   * <code>string lastName = 4;</code>
   * @return The bytes for lastName.
   */
  com.google.protobuf.ByteString
      getLastNameBytes();

  /**
   * <code>int64 roleId = 5;</code>
   * @return The roleId.
   */
  long getRoleId();
}