// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: frontend_nvme_pcie.proto

package opi_api.storage.v1;

public interface NVMeNamespaceListResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opi_api.storage.v1.NVMeNamespaceListResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .opi_api.storage.v1.NVMeNamespace namespace = 1;</code>
   */
  java.util.List<opi_api.storage.v1.NVMeNamespace> 
      getNamespaceList();
  /**
   * <code>repeated .opi_api.storage.v1.NVMeNamespace namespace = 1;</code>
   */
  opi_api.storage.v1.NVMeNamespace getNamespace(int index);
  /**
   * <code>repeated .opi_api.storage.v1.NVMeNamespace namespace = 1;</code>
   */
  int getNamespaceCount();
  /**
   * <code>repeated .opi_api.storage.v1.NVMeNamespace namespace = 1;</code>
   */
  java.util.List<? extends opi_api.storage.v1.NVMeNamespaceOrBuilder> 
      getNamespaceOrBuilderList();
  /**
   * <code>repeated .opi_api.storage.v1.NVMeNamespace namespace = 1;</code>
   */
  opi_api.storage.v1.NVMeNamespaceOrBuilder getNamespaceOrBuilder(
      int index);
}
