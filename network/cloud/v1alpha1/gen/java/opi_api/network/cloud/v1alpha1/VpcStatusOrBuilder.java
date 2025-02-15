// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vpc.proto

package opi_api.network.cloud.v1alpha1;

public interface VpcStatusOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opi_api.network.cloud.v1alpha1.VpcStatus)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * vpc hw handle
   * </pre>
   *
   * <code>.opi_api.network.opinetcommon.v1alpha1.HwHandle hw_handle = 1;</code>
   * @return Whether the hwHandle field is set.
   */
  boolean hasHwHandle();
  /**
   * <pre>
   * vpc hw handle
   * </pre>
   *
   * <code>.opi_api.network.opinetcommon.v1alpha1.HwHandle hw_handle = 1;</code>
   * @return The hwHandle.
   */
  opi_api.network.opinetcommon.v1alpha1.HwHandle getHwHandle();
  /**
   * <pre>
   * vpc hw handle
   * </pre>
   *
   * <code>.opi_api.network.opinetcommon.v1alpha1.HwHandle hw_handle = 1;</code>
   */
  opi_api.network.opinetcommon.v1alpha1.HwHandleOrBuilder getHwHandleOrBuilder();

  /**
   * <pre>
   * vpc's layer2 hw handle
   * </pre>
   *
   * <code>.opi_api.network.opinetcommon.v1alpha1.HwHandle bd_hw_handle = 2;</code>
   * @return Whether the bdHwHandle field is set.
   */
  boolean hasBdHwHandle();
  /**
   * <pre>
   * vpc's layer2 hw handle
   * </pre>
   *
   * <code>.opi_api.network.opinetcommon.v1alpha1.HwHandle bd_hw_handle = 2;</code>
   * @return The bdHwHandle.
   */
  opi_api.network.opinetcommon.v1alpha1.HwHandle getBdHwHandle();
  /**
   * <pre>
   * vpc's layer2 hw handle
   * </pre>
   *
   * <code>.opi_api.network.opinetcommon.v1alpha1.HwHandle bd_hw_handle = 2;</code>
   */
  opi_api.network.opinetcommon.v1alpha1.HwHandleOrBuilder getBdHwHandleOrBuilder();

  /**
   * <pre>
   * number of subnets in the vpc
   * </pre>
   *
   * <code>int32 subnet_count = 3;</code>
   * @return The subnetCount.
   */
  int getSubnetCount();
}
