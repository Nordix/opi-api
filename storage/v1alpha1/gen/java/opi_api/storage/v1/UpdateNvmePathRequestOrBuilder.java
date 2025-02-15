// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: backend_nvme.proto

package opi_api.storage.v1;

public interface UpdateNvmePathRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opi_api.storage.v1.UpdateNvmePathRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The object's `name` field is used to identify the object to be updated.
   * </pre>
   *
   * <code>.opi_api.storage.v1.NvmePath nvme_path = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the nvmePath field is set.
   */
  boolean hasNvmePath();
  /**
   * <pre>
   * The object's `name` field is used to identify the object to be updated.
   * </pre>
   *
   * <code>.opi_api.storage.v1.NvmePath nvme_path = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The nvmePath.
   */
  opi_api.storage.v1.NvmePath getNvmePath();
  /**
   * <pre>
   * The object's `name` field is used to identify the object to be updated.
   * </pre>
   *
   * <code>.opi_api.storage.v1.NvmePath nvme_path = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  opi_api.storage.v1.NvmePathOrBuilder getNvmePathOrBuilder();

  /**
   * <pre>
   * The list of fields to update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   * <pre>
   * The list of fields to update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   * <pre>
   * The list of fields to update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();

  /**
   * <pre>
   * If set to true, and the object is not found, a new object will be created.
   * In this situation, `update_mask` is ignored.
   * </pre>
   *
   * <code>bool allow_missing = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The allowMissing.
   */
  boolean getAllowMissing();
}
