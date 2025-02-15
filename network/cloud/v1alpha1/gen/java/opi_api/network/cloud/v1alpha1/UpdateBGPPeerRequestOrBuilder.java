// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cloudrpc.proto

package opi_api.network.cloud.v1alpha1;

public interface UpdateBGPPeerRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opi_api.network.cloud.v1alpha1.UpdateBGPPeerRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * updated bgppeer info
   * </pre>
   *
   * <code>.opi_api.network.cloud.v1alpha1.BGPPeer bgppeer = 1;</code>
   * @return Whether the bgppeer field is set.
   */
  boolean hasBgppeer();
  /**
   * <pre>
   * updated bgppeer info
   * </pre>
   *
   * <code>.opi_api.network.cloud.v1alpha1.BGPPeer bgppeer = 1;</code>
   * @return The bgppeer.
   */
  opi_api.network.cloud.v1alpha1.BGPPeer getBgppeer();
  /**
   * <pre>
   * updated bgppeer info
   * </pre>
   *
   * <code>.opi_api.network.cloud.v1alpha1.BGPPeer bgppeer = 1;</code>
   */
  opi_api.network.cloud.v1alpha1.BGPPeerOrBuilder getBgppeerOrBuilder();

  /**
   * <pre>
   * list of fields to update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   * <pre>
   * list of fields to update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   * <pre>
   * list of fields to update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
