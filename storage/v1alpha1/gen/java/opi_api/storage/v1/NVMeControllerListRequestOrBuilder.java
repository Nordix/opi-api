// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: frontend_nvme_pcie.proto

package opi_api.storage.v1;

public interface NVMeControllerListRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opi_api.storage.v1.NVMeControllerListRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.opi_api.common.v1.ObjectKey subsystem_id = 1;</code>
   * @return Whether the subsystemId field is set.
   */
  boolean hasSubsystemId();
  /**
   * <code>.opi_api.common.v1.ObjectKey subsystem_id = 1;</code>
   * @return The subsystemId.
   */
  opi_api.common.v1.ObjectKey getSubsystemId();
  /**
   * <code>.opi_api.common.v1.ObjectKey subsystem_id = 1;</code>
   */
  opi_api.common.v1.ObjectKeyOrBuilder getSubsystemIdOrBuilder();
}
