// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: frontend_nvme_pcie.proto

package opi_api.storage.v1;

public interface CreateNvmeSubsystemRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opi_api.storage.v1.CreateNvmeSubsystemRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.opi_api.storage.v1.NvmeSubsystem nvme_subsystem = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the nvmeSubsystem field is set.
   */
  boolean hasNvmeSubsystem();
  /**
   * <code>.opi_api.storage.v1.NvmeSubsystem nvme_subsystem = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The nvmeSubsystem.
   */
  opi_api.storage.v1.NvmeSubsystem getNvmeSubsystem();
  /**
   * <code>.opi_api.storage.v1.NvmeSubsystem nvme_subsystem = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  opi_api.storage.v1.NvmeSubsystemOrBuilder getNvmeSubsystemOrBuilder();

  /**
   * <code>string nvme_subsystem_id = 3;</code>
   * @return The nvmeSubsystemId.
   */
  java.lang.String getNvmeSubsystemId();
  /**
   * <code>string nvme_subsystem_id = 3;</code>
   * @return The bytes for nvmeSubsystemId.
   */
  com.google.protobuf.ByteString
      getNvmeSubsystemIdBytes();
}
