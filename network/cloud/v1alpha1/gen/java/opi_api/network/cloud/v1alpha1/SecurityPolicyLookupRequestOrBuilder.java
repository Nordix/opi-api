// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: networkpolicy.proto

package opi_api.network.cloud.v1alpha1;

public interface SecurityPolicyLookupRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opi_api.network.cloud.v1alpha1.SecurityPolicyLookupRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * security policy uuid to do the lookup in
   * </pre>
   *
   * <code>string policy_name_ref = 1;</code>
   * @return Whether the policyNameRef field is set.
   */
  boolean hasPolicyNameRef();
  /**
   * <pre>
   * security policy uuid to do the lookup in
   * </pre>
   *
   * <code>string policy_name_ref = 1;</code>
   * @return The policyNameRef.
   */
  java.lang.String getPolicyNameRef();
  /**
   * <pre>
   * security policy uuid to do the lookup in
   * </pre>
   *
   * <code>string policy_name_ref = 1;</code>
   * @return The bytes for policyNameRef.
   */
  com.google.protobuf.ByteString
      getPolicyNameRefBytes();

  /**
   * <pre>
   * vnic specific policies will be evaluated when vnic info is provided
   * </pre>
   *
   * <code>.opi_api.network.cloud.v1alpha1.SecurityPolicyLookupRequest.VnicLookupInfo vnic_lookup_info = 2;</code>
   * @return Whether the vnicLookupInfo field is set.
   */
  boolean hasVnicLookupInfo();
  /**
   * <pre>
   * vnic specific policies will be evaluated when vnic info is provided
   * </pre>
   *
   * <code>.opi_api.network.cloud.v1alpha1.SecurityPolicyLookupRequest.VnicLookupInfo vnic_lookup_info = 2;</code>
   * @return The vnicLookupInfo.
   */
  opi_api.network.cloud.v1alpha1.SecurityPolicyLookupRequest.VnicLookupInfo getVnicLookupInfo();
  /**
   * <pre>
   * vnic specific policies will be evaluated when vnic info is provided
   * </pre>
   *
   * <code>.opi_api.network.cloud.v1alpha1.SecurityPolicyLookupRequest.VnicLookupInfo vnic_lookup_info = 2;</code>
   */
  opi_api.network.cloud.v1alpha1.SecurityPolicyLookupRequest.VnicLookupInfoOrBuilder getVnicLookupInfoOrBuilder();

  /**
   * <pre>
   * packet match fields
   * </pre>
   *
   * <code>.opi_api.network.cloud.v1alpha1.PolicyLookupMatch match_fields = 3;</code>
   * @return Whether the matchFields field is set.
   */
  boolean hasMatchFields();
  /**
   * <pre>
   * packet match fields
   * </pre>
   *
   * <code>.opi_api.network.cloud.v1alpha1.PolicyLookupMatch match_fields = 3;</code>
   * @return The matchFields.
   */
  opi_api.network.cloud.v1alpha1.PolicyLookupMatch getMatchFields();
  /**
   * <pre>
   * packet match fields
   * </pre>
   *
   * <code>.opi_api.network.cloud.v1alpha1.PolicyLookupMatch match_fields = 3;</code>
   */
  opi_api.network.cloud.v1alpha1.PolicyLookupMatchOrBuilder getMatchFieldsOrBuilder();

  public opi_api.network.cloud.v1alpha1.SecurityPolicyLookupRequest.LookupInfoCase getLookupInfoCase();
}
