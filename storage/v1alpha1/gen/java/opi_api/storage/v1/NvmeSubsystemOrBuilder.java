// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: frontend_nvme_pcie.proto

package opi_api.storage.v1;

public interface NvmeSubsystemOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opi_api.storage.v1.NvmeSubsystem)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * name is an opaque object handle that is not user settable.
   * name will be returned with created object
   * user can only set {resource}_id on the Create request object
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * name is an opaque object handle that is not user settable.
   * name will be returned with created object
   * user can only set {resource}_id on the Create request object
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * spec holds configurable values
   * </pre>
   *
   * <code>.opi_api.storage.v1.NvmeSubsystemSpec spec = 2;</code>
   * @return Whether the spec field is set.
   */
  boolean hasSpec();
  /**
   * <pre>
   * spec holds configurable values
   * </pre>
   *
   * <code>.opi_api.storage.v1.NvmeSubsystemSpec spec = 2;</code>
   * @return The spec.
   */
  opi_api.storage.v1.NvmeSubsystemSpec getSpec();
  /**
   * <pre>
   * spec holds configurable values
   * </pre>
   *
   * <code>.opi_api.storage.v1.NvmeSubsystemSpec spec = 2;</code>
   */
  opi_api.storage.v1.NvmeSubsystemSpecOrBuilder getSpecOrBuilder();

  /**
   * <pre>
   * stats holds server generated values
   * </pre>
   *
   * <code>.opi_api.storage.v1.NvmeSubsystemStatus status = 3;</code>
   * @return Whether the status field is set.
   */
  boolean hasStatus();
  /**
   * <pre>
   * stats holds server generated values
   * </pre>
   *
   * <code>.opi_api.storage.v1.NvmeSubsystemStatus status = 3;</code>
   * @return The status.
   */
  opi_api.storage.v1.NvmeSubsystemStatus getStatus();
  /**
   * <pre>
   * stats holds server generated values
   * </pre>
   *
   * <code>.opi_api.storage.v1.NvmeSubsystemStatus status = 3;</code>
   */
  opi_api.storage.v1.NvmeSubsystemStatusOrBuilder getStatusOrBuilder();
}
