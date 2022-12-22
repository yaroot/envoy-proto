// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/extensions/wasm/v3/wasm.proto

package io.envoyproxy.envoy.extensions.wasm.v3;

public interface CapabilityRestrictionConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:envoy.extensions.wasm.v3.CapabilityRestrictionConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The Proxy-Wasm capabilities which will be allowed. Capabilities are mapped by
   * name. The ``SanitizationConfig`` which each capability maps to is currently unimplemented and ignored,
   * and so should be left empty.
   * The capability names are given in the
   * `Proxy-Wasm ABI &lt;https://github.com/proxy-wasm/spec/tree/master/abi-versions/vNEXT&gt;`_.
   * Additionally, the following WASI capabilities from
   * `this list &lt;https://github.com/WebAssembly/WASI/blob/master/phases/snapshot/docs.md#modules&gt;`_
   * are implemented and can be allowed:
   * ``fd_write``, ``fd_read``, ``fd_seek``, ``fd_close``, ``fd_fdstat_get``, ``environ_get``, ``environ_sizes_get``,
   * ``args_get``, ``args_sizes_get``, ``proc_exit``, ``clock_time_get``, ``random_get``.
   * </pre>
   *
   * <code>map&lt;string, .envoy.extensions.wasm.v3.SanitizationConfig&gt; allowed_capabilities = 1;</code>
   */
  int getAllowedCapabilitiesCount();
  /**
   * <pre>
   * The Proxy-Wasm capabilities which will be allowed. Capabilities are mapped by
   * name. The ``SanitizationConfig`` which each capability maps to is currently unimplemented and ignored,
   * and so should be left empty.
   * The capability names are given in the
   * `Proxy-Wasm ABI &lt;https://github.com/proxy-wasm/spec/tree/master/abi-versions/vNEXT&gt;`_.
   * Additionally, the following WASI capabilities from
   * `this list &lt;https://github.com/WebAssembly/WASI/blob/master/phases/snapshot/docs.md#modules&gt;`_
   * are implemented and can be allowed:
   * ``fd_write``, ``fd_read``, ``fd_seek``, ``fd_close``, ``fd_fdstat_get``, ``environ_get``, ``environ_sizes_get``,
   * ``args_get``, ``args_sizes_get``, ``proc_exit``, ``clock_time_get``, ``random_get``.
   * </pre>
   *
   * <code>map&lt;string, .envoy.extensions.wasm.v3.SanitizationConfig&gt; allowed_capabilities = 1;</code>
   */
  boolean containsAllowedCapabilities(
      java.lang.String key);
  /**
   * Use {@link #getAllowedCapabilitiesMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, io.envoyproxy.envoy.extensions.wasm.v3.SanitizationConfig>
  getAllowedCapabilities();
  /**
   * <pre>
   * The Proxy-Wasm capabilities which will be allowed. Capabilities are mapped by
   * name. The ``SanitizationConfig`` which each capability maps to is currently unimplemented and ignored,
   * and so should be left empty.
   * The capability names are given in the
   * `Proxy-Wasm ABI &lt;https://github.com/proxy-wasm/spec/tree/master/abi-versions/vNEXT&gt;`_.
   * Additionally, the following WASI capabilities from
   * `this list &lt;https://github.com/WebAssembly/WASI/blob/master/phases/snapshot/docs.md#modules&gt;`_
   * are implemented and can be allowed:
   * ``fd_write``, ``fd_read``, ``fd_seek``, ``fd_close``, ``fd_fdstat_get``, ``environ_get``, ``environ_sizes_get``,
   * ``args_get``, ``args_sizes_get``, ``proc_exit``, ``clock_time_get``, ``random_get``.
   * </pre>
   *
   * <code>map&lt;string, .envoy.extensions.wasm.v3.SanitizationConfig&gt; allowed_capabilities = 1;</code>
   */
  java.util.Map<java.lang.String, io.envoyproxy.envoy.extensions.wasm.v3.SanitizationConfig>
  getAllowedCapabilitiesMap();
  /**
   * <pre>
   * The Proxy-Wasm capabilities which will be allowed. Capabilities are mapped by
   * name. The ``SanitizationConfig`` which each capability maps to is currently unimplemented and ignored,
   * and so should be left empty.
   * The capability names are given in the
   * `Proxy-Wasm ABI &lt;https://github.com/proxy-wasm/spec/tree/master/abi-versions/vNEXT&gt;`_.
   * Additionally, the following WASI capabilities from
   * `this list &lt;https://github.com/WebAssembly/WASI/blob/master/phases/snapshot/docs.md#modules&gt;`_
   * are implemented and can be allowed:
   * ``fd_write``, ``fd_read``, ``fd_seek``, ``fd_close``, ``fd_fdstat_get``, ``environ_get``, ``environ_sizes_get``,
   * ``args_get``, ``args_sizes_get``, ``proc_exit``, ``clock_time_get``, ``random_get``.
   * </pre>
   *
   * <code>map&lt;string, .envoy.extensions.wasm.v3.SanitizationConfig&gt; allowed_capabilities = 1;</code>
   */
  /* nullable */
io.envoyproxy.envoy.extensions.wasm.v3.SanitizationConfig getAllowedCapabilitiesOrDefault(
      java.lang.String key,
      /* nullable */
io.envoyproxy.envoy.extensions.wasm.v3.SanitizationConfig defaultValue);
  /**
   * <pre>
   * The Proxy-Wasm capabilities which will be allowed. Capabilities are mapped by
   * name. The ``SanitizationConfig`` which each capability maps to is currently unimplemented and ignored,
   * and so should be left empty.
   * The capability names are given in the
   * `Proxy-Wasm ABI &lt;https://github.com/proxy-wasm/spec/tree/master/abi-versions/vNEXT&gt;`_.
   * Additionally, the following WASI capabilities from
   * `this list &lt;https://github.com/WebAssembly/WASI/blob/master/phases/snapshot/docs.md#modules&gt;`_
   * are implemented and can be allowed:
   * ``fd_write``, ``fd_read``, ``fd_seek``, ``fd_close``, ``fd_fdstat_get``, ``environ_get``, ``environ_sizes_get``,
   * ``args_get``, ``args_sizes_get``, ``proc_exit``, ``clock_time_get``, ``random_get``.
   * </pre>
   *
   * <code>map&lt;string, .envoy.extensions.wasm.v3.SanitizationConfig&gt; allowed_capabilities = 1;</code>
   */
  io.envoyproxy.envoy.extensions.wasm.v3.SanitizationConfig getAllowedCapabilitiesOrThrow(
      java.lang.String key);
}
