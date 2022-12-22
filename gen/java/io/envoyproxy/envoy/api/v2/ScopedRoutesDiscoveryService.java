// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/api/v2/srds.proto

package io.envoyproxy.envoy.api.v2;

/**
 * <pre>
 * The Scoped Routes Discovery Service (SRDS) API distributes
 * :ref:`ScopedRouteConfiguration&lt;envoy_api_msg.ScopedRouteConfiguration&gt;`
 * resources. Each ScopedRouteConfiguration resource represents a "routing
 * scope" containing a mapping that allows the HTTP connection manager to
 * dynamically assign a routing table (specified via a
 * :ref:`RouteConfiguration&lt;envoy_api_msg_RouteConfiguration&gt;` message) to each
 * HTTP request.
 * </pre>
 *
 * Protobuf service {@code envoy.api.v2.ScopedRoutesDiscoveryService}
 */
public  abstract class ScopedRoutesDiscoveryService
    implements com.google.protobuf.Service {
  protected ScopedRoutesDiscoveryService() {}

  public interface Interface {
    /**
     * <code>rpc StreamScopedRoutes(stream .envoy.api.v2.DiscoveryRequest) returns (stream .envoy.api.v2.DiscoveryResponse);</code>
     */
    public abstract void streamScopedRoutes(
        com.google.protobuf.RpcController controller,
        io.envoyproxy.envoy.api.v2.DiscoveryRequest request,
        com.google.protobuf.RpcCallback<io.envoyproxy.envoy.api.v2.DiscoveryResponse> done);

    /**
     * <code>rpc DeltaScopedRoutes(stream .envoy.api.v2.DeltaDiscoveryRequest) returns (stream .envoy.api.v2.DeltaDiscoveryResponse);</code>
     */
    public abstract void deltaScopedRoutes(
        com.google.protobuf.RpcController controller,
        io.envoyproxy.envoy.api.v2.DeltaDiscoveryRequest request,
        com.google.protobuf.RpcCallback<io.envoyproxy.envoy.api.v2.DeltaDiscoveryResponse> done);

    /**
     * <code>rpc FetchScopedRoutes(.envoy.api.v2.DiscoveryRequest) returns (.envoy.api.v2.DiscoveryResponse) { ... }</code>
     */
    public abstract void fetchScopedRoutes(
        com.google.protobuf.RpcController controller,
        io.envoyproxy.envoy.api.v2.DiscoveryRequest request,
        com.google.protobuf.RpcCallback<io.envoyproxy.envoy.api.v2.DiscoveryResponse> done);

  }

  public static com.google.protobuf.Service newReflectiveService(
      final Interface impl) {
    return new ScopedRoutesDiscoveryService() {
      @java.lang.Override
      public  void streamScopedRoutes(
          com.google.protobuf.RpcController controller,
          io.envoyproxy.envoy.api.v2.DiscoveryRequest request,
          com.google.protobuf.RpcCallback<io.envoyproxy.envoy.api.v2.DiscoveryResponse> done) {
        impl.streamScopedRoutes(controller, request, done);
      }

      @java.lang.Override
      public  void deltaScopedRoutes(
          com.google.protobuf.RpcController controller,
          io.envoyproxy.envoy.api.v2.DeltaDiscoveryRequest request,
          com.google.protobuf.RpcCallback<io.envoyproxy.envoy.api.v2.DeltaDiscoveryResponse> done) {
        impl.deltaScopedRoutes(controller, request, done);
      }

      @java.lang.Override
      public  void fetchScopedRoutes(
          com.google.protobuf.RpcController controller,
          io.envoyproxy.envoy.api.v2.DiscoveryRequest request,
          com.google.protobuf.RpcCallback<io.envoyproxy.envoy.api.v2.DiscoveryResponse> done) {
        impl.fetchScopedRoutes(controller, request, done);
      }

    };
  }

  public static com.google.protobuf.BlockingService
      newReflectiveBlockingService(final BlockingInterface impl) {
    return new com.google.protobuf.BlockingService() {
      public final com.google.protobuf.Descriptors.ServiceDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }

      public final com.google.protobuf.Message callBlockingMethod(
          com.google.protobuf.Descriptors.MethodDescriptor method,
          com.google.protobuf.RpcController controller,
          com.google.protobuf.Message request)
          throws com.google.protobuf.ServiceException {
        if (method.getService() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "Service.callBlockingMethod() given method descriptor for " +
            "wrong service type.");
        }
        switch(method.getIndex()) {
          case 0:
            return impl.streamScopedRoutes(controller, (io.envoyproxy.envoy.api.v2.DiscoveryRequest)request);
          case 1:
            return impl.deltaScopedRoutes(controller, (io.envoyproxy.envoy.api.v2.DeltaDiscoveryRequest)request);
          case 2:
            return impl.fetchScopedRoutes(controller, (io.envoyproxy.envoy.api.v2.DiscoveryRequest)request);
          default:
            throw new java.lang.AssertionError("Can't get here.");
        }
      }

      public final com.google.protobuf.Message
          getRequestPrototype(
          com.google.protobuf.Descriptors.MethodDescriptor method) {
        if (method.getService() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "Service.getRequestPrototype() given method " +
            "descriptor for wrong service type.");
        }
        switch(method.getIndex()) {
          case 0:
            return io.envoyproxy.envoy.api.v2.DiscoveryRequest.getDefaultInstance();
          case 1:
            return io.envoyproxy.envoy.api.v2.DeltaDiscoveryRequest.getDefaultInstance();
          case 2:
            return io.envoyproxy.envoy.api.v2.DiscoveryRequest.getDefaultInstance();
          default:
            throw new java.lang.AssertionError("Can't get here.");
        }
      }

      public final com.google.protobuf.Message
          getResponsePrototype(
          com.google.protobuf.Descriptors.MethodDescriptor method) {
        if (method.getService() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "Service.getResponsePrototype() given method " +
            "descriptor for wrong service type.");
        }
        switch(method.getIndex()) {
          case 0:
            return io.envoyproxy.envoy.api.v2.DiscoveryResponse.getDefaultInstance();
          case 1:
            return io.envoyproxy.envoy.api.v2.DeltaDiscoveryResponse.getDefaultInstance();
          case 2:
            return io.envoyproxy.envoy.api.v2.DiscoveryResponse.getDefaultInstance();
          default:
            throw new java.lang.AssertionError("Can't get here.");
        }
      }

    };
  }

  /**
   * <code>rpc StreamScopedRoutes(stream .envoy.api.v2.DiscoveryRequest) returns (stream .envoy.api.v2.DiscoveryResponse);</code>
   */
  public abstract void streamScopedRoutes(
      com.google.protobuf.RpcController controller,
      io.envoyproxy.envoy.api.v2.DiscoveryRequest request,
      com.google.protobuf.RpcCallback<io.envoyproxy.envoy.api.v2.DiscoveryResponse> done);

  /**
   * <code>rpc DeltaScopedRoutes(stream .envoy.api.v2.DeltaDiscoveryRequest) returns (stream .envoy.api.v2.DeltaDiscoveryResponse);</code>
   */
  public abstract void deltaScopedRoutes(
      com.google.protobuf.RpcController controller,
      io.envoyproxy.envoy.api.v2.DeltaDiscoveryRequest request,
      com.google.protobuf.RpcCallback<io.envoyproxy.envoy.api.v2.DeltaDiscoveryResponse> done);

  /**
   * <code>rpc FetchScopedRoutes(.envoy.api.v2.DiscoveryRequest) returns (.envoy.api.v2.DiscoveryResponse) { ... }</code>
   */
  public abstract void fetchScopedRoutes(
      com.google.protobuf.RpcController controller,
      io.envoyproxy.envoy.api.v2.DiscoveryRequest request,
      com.google.protobuf.RpcCallback<io.envoyproxy.envoy.api.v2.DiscoveryResponse> done);

  public static final
      com.google.protobuf.Descriptors.ServiceDescriptor
      getDescriptor() {
    return io.envoyproxy.envoy.api.v2.SrdsProto.getDescriptor().getServices().get(0);
  }
  public final com.google.protobuf.Descriptors.ServiceDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }

  public final void callMethod(
      com.google.protobuf.Descriptors.MethodDescriptor method,
      com.google.protobuf.RpcController controller,
      com.google.protobuf.Message request,
      com.google.protobuf.RpcCallback<
        com.google.protobuf.Message> done) {
    if (method.getService() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "Service.callMethod() given method descriptor for wrong " +
        "service type.");
    }
    switch(method.getIndex()) {
      case 0:
        this.streamScopedRoutes(controller, (io.envoyproxy.envoy.api.v2.DiscoveryRequest)request,
          com.google.protobuf.RpcUtil.<io.envoyproxy.envoy.api.v2.DiscoveryResponse>specializeCallback(
            done));
        return;
      case 1:
        this.deltaScopedRoutes(controller, (io.envoyproxy.envoy.api.v2.DeltaDiscoveryRequest)request,
          com.google.protobuf.RpcUtil.<io.envoyproxy.envoy.api.v2.DeltaDiscoveryResponse>specializeCallback(
            done));
        return;
      case 2:
        this.fetchScopedRoutes(controller, (io.envoyproxy.envoy.api.v2.DiscoveryRequest)request,
          com.google.protobuf.RpcUtil.<io.envoyproxy.envoy.api.v2.DiscoveryResponse>specializeCallback(
            done));
        return;
      default:
        throw new java.lang.AssertionError("Can't get here.");
    }
  }

  public final com.google.protobuf.Message
      getRequestPrototype(
      com.google.protobuf.Descriptors.MethodDescriptor method) {
    if (method.getService() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "Service.getRequestPrototype() given method " +
        "descriptor for wrong service type.");
    }
    switch(method.getIndex()) {
      case 0:
        return io.envoyproxy.envoy.api.v2.DiscoveryRequest.getDefaultInstance();
      case 1:
        return io.envoyproxy.envoy.api.v2.DeltaDiscoveryRequest.getDefaultInstance();
      case 2:
        return io.envoyproxy.envoy.api.v2.DiscoveryRequest.getDefaultInstance();
      default:
        throw new java.lang.AssertionError("Can't get here.");
    }
  }

  public final com.google.protobuf.Message
      getResponsePrototype(
      com.google.protobuf.Descriptors.MethodDescriptor method) {
    if (method.getService() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "Service.getResponsePrototype() given method " +
        "descriptor for wrong service type.");
    }
    switch(method.getIndex()) {
      case 0:
        return io.envoyproxy.envoy.api.v2.DiscoveryResponse.getDefaultInstance();
      case 1:
        return io.envoyproxy.envoy.api.v2.DeltaDiscoveryResponse.getDefaultInstance();
      case 2:
        return io.envoyproxy.envoy.api.v2.DiscoveryResponse.getDefaultInstance();
      default:
        throw new java.lang.AssertionError("Can't get here.");
    }
  }

  public static Stub newStub(
      com.google.protobuf.RpcChannel channel) {
    return new Stub(channel);
  }

  public static final class Stub extends io.envoyproxy.envoy.api.v2.ScopedRoutesDiscoveryService implements Interface {
    private Stub(com.google.protobuf.RpcChannel channel) {
      this.channel = channel;
    }

    private final com.google.protobuf.RpcChannel channel;

    public com.google.protobuf.RpcChannel getChannel() {
      return channel;
    }

    public  void streamScopedRoutes(
        com.google.protobuf.RpcController controller,
        io.envoyproxy.envoy.api.v2.DiscoveryRequest request,
        com.google.protobuf.RpcCallback<io.envoyproxy.envoy.api.v2.DiscoveryResponse> done) {
      channel.callMethod(
        getDescriptor().getMethods().get(0),
        controller,
        request,
        io.envoyproxy.envoy.api.v2.DiscoveryResponse.getDefaultInstance(),
        com.google.protobuf.RpcUtil.generalizeCallback(
          done,
          io.envoyproxy.envoy.api.v2.DiscoveryResponse.class,
          io.envoyproxy.envoy.api.v2.DiscoveryResponse.getDefaultInstance()));
    }

    public  void deltaScopedRoutes(
        com.google.protobuf.RpcController controller,
        io.envoyproxy.envoy.api.v2.DeltaDiscoveryRequest request,
        com.google.protobuf.RpcCallback<io.envoyproxy.envoy.api.v2.DeltaDiscoveryResponse> done) {
      channel.callMethod(
        getDescriptor().getMethods().get(1),
        controller,
        request,
        io.envoyproxy.envoy.api.v2.DeltaDiscoveryResponse.getDefaultInstance(),
        com.google.protobuf.RpcUtil.generalizeCallback(
          done,
          io.envoyproxy.envoy.api.v2.DeltaDiscoveryResponse.class,
          io.envoyproxy.envoy.api.v2.DeltaDiscoveryResponse.getDefaultInstance()));
    }

    public  void fetchScopedRoutes(
        com.google.protobuf.RpcController controller,
        io.envoyproxy.envoy.api.v2.DiscoveryRequest request,
        com.google.protobuf.RpcCallback<io.envoyproxy.envoy.api.v2.DiscoveryResponse> done) {
      channel.callMethod(
        getDescriptor().getMethods().get(2),
        controller,
        request,
        io.envoyproxy.envoy.api.v2.DiscoveryResponse.getDefaultInstance(),
        com.google.protobuf.RpcUtil.generalizeCallback(
          done,
          io.envoyproxy.envoy.api.v2.DiscoveryResponse.class,
          io.envoyproxy.envoy.api.v2.DiscoveryResponse.getDefaultInstance()));
    }
  }

  public static BlockingInterface newBlockingStub(
      com.google.protobuf.BlockingRpcChannel channel) {
    return new BlockingStub(channel);
  }

  public interface BlockingInterface {
    public io.envoyproxy.envoy.api.v2.DiscoveryResponse streamScopedRoutes(
        com.google.protobuf.RpcController controller,
        io.envoyproxy.envoy.api.v2.DiscoveryRequest request)
        throws com.google.protobuf.ServiceException;

    public io.envoyproxy.envoy.api.v2.DeltaDiscoveryResponse deltaScopedRoutes(
        com.google.protobuf.RpcController controller,
        io.envoyproxy.envoy.api.v2.DeltaDiscoveryRequest request)
        throws com.google.protobuf.ServiceException;

    public io.envoyproxy.envoy.api.v2.DiscoveryResponse fetchScopedRoutes(
        com.google.protobuf.RpcController controller,
        io.envoyproxy.envoy.api.v2.DiscoveryRequest request)
        throws com.google.protobuf.ServiceException;
  }

  private static final class BlockingStub implements BlockingInterface {
    private BlockingStub(com.google.protobuf.BlockingRpcChannel channel) {
      this.channel = channel;
    }

    private final com.google.protobuf.BlockingRpcChannel channel;

    public io.envoyproxy.envoy.api.v2.DiscoveryResponse streamScopedRoutes(
        com.google.protobuf.RpcController controller,
        io.envoyproxy.envoy.api.v2.DiscoveryRequest request)
        throws com.google.protobuf.ServiceException {
      return (io.envoyproxy.envoy.api.v2.DiscoveryResponse) channel.callBlockingMethod(
        getDescriptor().getMethods().get(0),
        controller,
        request,
        io.envoyproxy.envoy.api.v2.DiscoveryResponse.getDefaultInstance());
    }


    public io.envoyproxy.envoy.api.v2.DeltaDiscoveryResponse deltaScopedRoutes(
        com.google.protobuf.RpcController controller,
        io.envoyproxy.envoy.api.v2.DeltaDiscoveryRequest request)
        throws com.google.protobuf.ServiceException {
      return (io.envoyproxy.envoy.api.v2.DeltaDiscoveryResponse) channel.callBlockingMethod(
        getDescriptor().getMethods().get(1),
        controller,
        request,
        io.envoyproxy.envoy.api.v2.DeltaDiscoveryResponse.getDefaultInstance());
    }


    public io.envoyproxy.envoy.api.v2.DiscoveryResponse fetchScopedRoutes(
        com.google.protobuf.RpcController controller,
        io.envoyproxy.envoy.api.v2.DiscoveryRequest request)
        throws com.google.protobuf.ServiceException {
      return (io.envoyproxy.envoy.api.v2.DiscoveryResponse) channel.callBlockingMethod(
        getDescriptor().getMethods().get(2),
        controller,
        request,
        io.envoyproxy.envoy.api.v2.DiscoveryResponse.getDefaultInstance());
    }

  }

  // @@protoc_insertion_point(class_scope:envoy.api.v2.ScopedRoutesDiscoveryService)
}
