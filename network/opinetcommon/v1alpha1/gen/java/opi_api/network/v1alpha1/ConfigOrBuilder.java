// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: openconfig_interfaces.proto

package opi_api.network.v1alpha1;

public interface ConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opi_api.network.v1alpha1.Config)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Name of the interface.  This is the opaque object
   * used for designating the created interface.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Name of the interface.  This is the opaque object
   * used for designating the created interface.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Type of interface - Ethernet and others
   * </pre>
   *
   * <code>.opi_api.network.v1alpha1.InterfaceType type = 2;</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <pre>
   * Type of interface - Ethernet and others
   * </pre>
   *
   * <code>.opi_api.network.v1alpha1.InterfaceType type = 2;</code>
   * @return The type.
   */
  opi_api.network.v1alpha1.InterfaceType getType();

  /**
   * <pre>
   * MTU for the interface that can be configured
   * </pre>
   *
   * <code>uint32 mtu = 3;</code>
   * @return The mtu.
   */
  int getMtu();

  /**
   * <pre>
   * Setting the loopback mode of the interface
   * </pre>
   *
   * <code>bool loopback_mode = 4;</code>
   * @return The loopbackMode.
   */
  boolean getLoopbackMode();

  /**
   * <pre>
   * Description of the interface and usage
   * </pre>
   *
   * <code>string description = 5;</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * Description of the interface and usage
   * </pre>
   *
   * <code>string description = 5;</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * Setting for enabling/disabling the interface
   * </pre>
   *
   * <code>bool enabled = 6;</code>
   * @return The enabled.
   */
  boolean getEnabled();
}
