// <auto-generated>
//     Generated by the protocol buffer compiler.  DO NOT EDIT!
//     source: Protos/protobuf.proto
// </auto-generated>
#pragma warning disable 0414, 1591, 8981, 0612
#region Designer generated code

using grpc = global::Grpc.Core;

namespace Dk.Via.Mithus.Protobuf {
  public static partial class UserService
  {
    static readonly string __ServiceName = "dk.via.mithus.protobuf.UserService";

    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static void __Helper_SerializeMessage(global::Google.Protobuf.IMessage message, grpc::SerializationContext context)
    {
      #if !GRPC_DISABLE_PROTOBUF_BUFFER_SERIALIZATION
      if (message is global::Google.Protobuf.IBufferMessage)
      {
        context.SetPayloadLength(message.CalculateSize());
        global::Google.Protobuf.MessageExtensions.WriteTo(message, context.GetBufferWriter());
        context.Complete();
        return;
      }
      #endif
      context.Complete(global::Google.Protobuf.MessageExtensions.ToByteArray(message));
    }

    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static class __Helper_MessageCache<T>
    {
      public static readonly bool IsBufferMessage = global::System.Reflection.IntrospectionExtensions.GetTypeInfo(typeof(global::Google.Protobuf.IBufferMessage)).IsAssignableFrom(typeof(T));
    }

    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static T __Helper_DeserializeMessage<T>(grpc::DeserializationContext context, global::Google.Protobuf.MessageParser<T> parser) where T : global::Google.Protobuf.IMessage<T>
    {
      #if !GRPC_DISABLE_PROTOBUF_BUFFER_SERIALIZATION
      if (__Helper_MessageCache<T>.IsBufferMessage)
      {
        return parser.ParseFrom(context.PayloadAsReadOnlySequence());
      }
      #endif
      return parser.ParseFrom(context.PayloadAsNewBuffer());
    }

    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static readonly grpc::Marshaller<global::Dk.Via.Mithus.Protobuf.RegisterUser> __Marshaller_dk_via_mithus_protobuf_RegisterUser = grpc::Marshallers.Create(__Helper_SerializeMessage, context => __Helper_DeserializeMessage(context, global::Dk.Via.Mithus.Protobuf.RegisterUser.Parser));
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static readonly grpc::Marshaller<global::Dk.Via.Mithus.Protobuf.User> __Marshaller_dk_via_mithus_protobuf_User = grpc::Marshallers.Create(__Helper_SerializeMessage, context => __Helper_DeserializeMessage(context, global::Dk.Via.Mithus.Protobuf.User.Parser));
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static readonly grpc::Marshaller<global::Dk.Via.Mithus.Protobuf.LoginUser> __Marshaller_dk_via_mithus_protobuf_LoginUser = grpc::Marshallers.Create(__Helper_SerializeMessage, context => __Helper_DeserializeMessage(context, global::Dk.Via.Mithus.Protobuf.LoginUser.Parser));
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static readonly grpc::Marshaller<global::Dk.Via.Mithus.Protobuf.SearchField> __Marshaller_dk_via_mithus_protobuf_SearchField = grpc::Marshallers.Create(__Helper_SerializeMessage, context => __Helper_DeserializeMessage(context, global::Dk.Via.Mithus.Protobuf.SearchField.Parser));

    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static readonly grpc::Method<global::Dk.Via.Mithus.Protobuf.RegisterUser, global::Dk.Via.Mithus.Protobuf.User> __Method_CreateUser = new grpc::Method<global::Dk.Via.Mithus.Protobuf.RegisterUser, global::Dk.Via.Mithus.Protobuf.User>(
        grpc::MethodType.Unary,
        __ServiceName,
        "CreateUser",
        __Marshaller_dk_via_mithus_protobuf_RegisterUser,
        __Marshaller_dk_via_mithus_protobuf_User);

    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static readonly grpc::Method<global::Dk.Via.Mithus.Protobuf.LoginUser, global::Dk.Via.Mithus.Protobuf.User> __Method_LoginUsers = new grpc::Method<global::Dk.Via.Mithus.Protobuf.LoginUser, global::Dk.Via.Mithus.Protobuf.User>(
        grpc::MethodType.Unary,
        __ServiceName,
        "LoginUsers",
        __Marshaller_dk_via_mithus_protobuf_LoginUser,
        __Marshaller_dk_via_mithus_protobuf_User);

    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static readonly grpc::Method<global::Dk.Via.Mithus.Protobuf.SearchField, global::Dk.Via.Mithus.Protobuf.User> __Method_FindUser = new grpc::Method<global::Dk.Via.Mithus.Protobuf.SearchField, global::Dk.Via.Mithus.Protobuf.User>(
        grpc::MethodType.Unary,
        __ServiceName,
        "FindUser",
        __Marshaller_dk_via_mithus_protobuf_SearchField,
        __Marshaller_dk_via_mithus_protobuf_User);

    /// <summary>Service descriptor</summary>
    public static global::Google.Protobuf.Reflection.ServiceDescriptor Descriptor
    {
      get { return global::Dk.Via.Mithus.Protobuf.ProtobufReflection.Descriptor.Services[0]; }
    }

    /// <summary>Client for UserService</summary>
    public partial class UserServiceClient : grpc::ClientBase<UserServiceClient>
    {
      /// <summary>Creates a new client for UserService</summary>
      /// <param name="channel">The channel to use to make remote calls.</param>
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public UserServiceClient(grpc::ChannelBase channel) : base(channel)
      {
      }
      /// <summary>Creates a new client for UserService that uses a custom <c>CallInvoker</c>.</summary>
      /// <param name="callInvoker">The callInvoker to use to make remote calls.</param>
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public UserServiceClient(grpc::CallInvoker callInvoker) : base(callInvoker)
      {
      }
      /// <summary>Protected parameterless constructor to allow creation of test doubles.</summary>
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      protected UserServiceClient() : base()
      {
      }
      /// <summary>Protected constructor to allow creation of configured clients.</summary>
      /// <param name="configuration">The client configuration.</param>
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      protected UserServiceClient(ClientBaseConfiguration configuration) : base(configuration)
      {
      }

      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual global::Dk.Via.Mithus.Protobuf.User CreateUser(global::Dk.Via.Mithus.Protobuf.RegisterUser request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
      {
        return CreateUser(request, new grpc::CallOptions(headers, deadline, cancellationToken));
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual global::Dk.Via.Mithus.Protobuf.User CreateUser(global::Dk.Via.Mithus.Protobuf.RegisterUser request, grpc::CallOptions options)
      {
        return CallInvoker.BlockingUnaryCall(__Method_CreateUser, null, options, request);
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual grpc::AsyncUnaryCall<global::Dk.Via.Mithus.Protobuf.User> CreateUserAsync(global::Dk.Via.Mithus.Protobuf.RegisterUser request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
      {
        return CreateUserAsync(request, new grpc::CallOptions(headers, deadline, cancellationToken));
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual grpc::AsyncUnaryCall<global::Dk.Via.Mithus.Protobuf.User> CreateUserAsync(global::Dk.Via.Mithus.Protobuf.RegisterUser request, grpc::CallOptions options)
      {
        return CallInvoker.AsyncUnaryCall(__Method_CreateUser, null, options, request);
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual global::Dk.Via.Mithus.Protobuf.User LoginUsers(global::Dk.Via.Mithus.Protobuf.LoginUser request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
      {
        return LoginUsers(request, new grpc::CallOptions(headers, deadline, cancellationToken));
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual global::Dk.Via.Mithus.Protobuf.User LoginUsers(global::Dk.Via.Mithus.Protobuf.LoginUser request, grpc::CallOptions options)
      {
        return CallInvoker.BlockingUnaryCall(__Method_LoginUsers, null, options, request);
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual grpc::AsyncUnaryCall<global::Dk.Via.Mithus.Protobuf.User> LoginUsersAsync(global::Dk.Via.Mithus.Protobuf.LoginUser request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
      {
        return LoginUsersAsync(request, new grpc::CallOptions(headers, deadline, cancellationToken));
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual grpc::AsyncUnaryCall<global::Dk.Via.Mithus.Protobuf.User> LoginUsersAsync(global::Dk.Via.Mithus.Protobuf.LoginUser request, grpc::CallOptions options)
      {
        return CallInvoker.AsyncUnaryCall(__Method_LoginUsers, null, options, request);
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual global::Dk.Via.Mithus.Protobuf.User FindUser(global::Dk.Via.Mithus.Protobuf.SearchField request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
      {
        return FindUser(request, new grpc::CallOptions(headers, deadline, cancellationToken));
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual global::Dk.Via.Mithus.Protobuf.User FindUser(global::Dk.Via.Mithus.Protobuf.SearchField request, grpc::CallOptions options)
      {
        return CallInvoker.BlockingUnaryCall(__Method_FindUser, null, options, request);
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual grpc::AsyncUnaryCall<global::Dk.Via.Mithus.Protobuf.User> FindUserAsync(global::Dk.Via.Mithus.Protobuf.SearchField request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
      {
        return FindUserAsync(request, new grpc::CallOptions(headers, deadline, cancellationToken));
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual grpc::AsyncUnaryCall<global::Dk.Via.Mithus.Protobuf.User> FindUserAsync(global::Dk.Via.Mithus.Protobuf.SearchField request, grpc::CallOptions options)
      {
        return CallInvoker.AsyncUnaryCall(__Method_FindUser, null, options, request);
      }
      /// <summary>Creates a new instance of client from given <c>ClientBaseConfiguration</c>.</summary>
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      protected override UserServiceClient NewInstance(ClientBaseConfiguration configuration)
      {
        return new UserServiceClient(configuration);
      }
    }

  }
  public static partial class PostService
  {
    static readonly string __ServiceName = "dk.via.mithus.protobuf.PostService";

    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static void __Helper_SerializeMessage(global::Google.Protobuf.IMessage message, grpc::SerializationContext context)
    {
      #if !GRPC_DISABLE_PROTOBUF_BUFFER_SERIALIZATION
      if (message is global::Google.Protobuf.IBufferMessage)
      {
        context.SetPayloadLength(message.CalculateSize());
        global::Google.Protobuf.MessageExtensions.WriteTo(message, context.GetBufferWriter());
        context.Complete();
        return;
      }
      #endif
      context.Complete(global::Google.Protobuf.MessageExtensions.ToByteArray(message));
    }

    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static class __Helper_MessageCache<T>
    {
      public static readonly bool IsBufferMessage = global::System.Reflection.IntrospectionExtensions.GetTypeInfo(typeof(global::Google.Protobuf.IBufferMessage)).IsAssignableFrom(typeof(T));
    }

    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static T __Helper_DeserializeMessage<T>(grpc::DeserializationContext context, global::Google.Protobuf.MessageParser<T> parser) where T : global::Google.Protobuf.IMessage<T>
    {
      #if !GRPC_DISABLE_PROTOBUF_BUFFER_SERIALIZATION
      if (__Helper_MessageCache<T>.IsBufferMessage)
      {
        return parser.ParseFrom(context.PayloadAsReadOnlySequence());
      }
      #endif
      return parser.ParseFrom(context.PayloadAsNewBuffer());
    }

    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static readonly grpc::Marshaller<global::Dk.Via.Mithus.Protobuf.Post> __Marshaller_dk_via_mithus_protobuf_Post = grpc::Marshallers.Create(__Helper_SerializeMessage, context => __Helper_DeserializeMessage(context, global::Dk.Via.Mithus.Protobuf.Post.Parser));
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static readonly grpc::Marshaller<global::Dk.Via.Mithus.Protobuf.SearchField> __Marshaller_dk_via_mithus_protobuf_SearchField = grpc::Marshallers.Create(__Helper_SerializeMessage, context => __Helper_DeserializeMessage(context, global::Dk.Via.Mithus.Protobuf.SearchField.Parser));
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static readonly grpc::Marshaller<global::Dk.Via.Mithus.Protobuf.Void> __Marshaller_dk_via_mithus_protobuf_Void = grpc::Marshallers.Create(__Helper_SerializeMessage, context => __Helper_DeserializeMessage(context, global::Dk.Via.Mithus.Protobuf.Void.Parser));
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static readonly grpc::Marshaller<global::Dk.Via.Mithus.Protobuf.Posts> __Marshaller_dk_via_mithus_protobuf_Posts = grpc::Marshallers.Create(__Helper_SerializeMessage, context => __Helper_DeserializeMessage(context, global::Dk.Via.Mithus.Protobuf.Posts.Parser));

    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static readonly grpc::Method<global::Dk.Via.Mithus.Protobuf.Post, global::Dk.Via.Mithus.Protobuf.Post> __Method_CreatePost = new grpc::Method<global::Dk.Via.Mithus.Protobuf.Post, global::Dk.Via.Mithus.Protobuf.Post>(
        grpc::MethodType.Unary,
        __ServiceName,
        "CreatePost",
        __Marshaller_dk_via_mithus_protobuf_Post,
        __Marshaller_dk_via_mithus_protobuf_Post);

    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static readonly grpc::Method<global::Dk.Via.Mithus.Protobuf.SearchField, global::Dk.Via.Mithus.Protobuf.Post> __Method_FindPost = new grpc::Method<global::Dk.Via.Mithus.Protobuf.SearchField, global::Dk.Via.Mithus.Protobuf.Post>(
        grpc::MethodType.Unary,
        __ServiceName,
        "FindPost",
        __Marshaller_dk_via_mithus_protobuf_SearchField,
        __Marshaller_dk_via_mithus_protobuf_Post);

    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static readonly grpc::Method<global::Dk.Via.Mithus.Protobuf.Void, global::Dk.Via.Mithus.Protobuf.Posts> __Method_GetPosts = new grpc::Method<global::Dk.Via.Mithus.Protobuf.Void, global::Dk.Via.Mithus.Protobuf.Posts>(
        grpc::MethodType.Unary,
        __ServiceName,
        "GetPosts",
        __Marshaller_dk_via_mithus_protobuf_Void,
        __Marshaller_dk_via_mithus_protobuf_Posts);

    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static readonly grpc::Method<global::Dk.Via.Mithus.Protobuf.SearchField, global::Dk.Via.Mithus.Protobuf.Posts> __Method_GetPostsByLandlord = new grpc::Method<global::Dk.Via.Mithus.Protobuf.SearchField, global::Dk.Via.Mithus.Protobuf.Posts>(
        grpc::MethodType.Unary,
        __ServiceName,
        "GetPostsByLandlord",
        __Marshaller_dk_via_mithus_protobuf_SearchField,
        __Marshaller_dk_via_mithus_protobuf_Posts);

    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static readonly grpc::Method<global::Dk.Via.Mithus.Protobuf.Post, global::Dk.Via.Mithus.Protobuf.Void> __Method_UpdatePost = new grpc::Method<global::Dk.Via.Mithus.Protobuf.Post, global::Dk.Via.Mithus.Protobuf.Void>(
        grpc::MethodType.Unary,
        __ServiceName,
        "UpdatePost",
        __Marshaller_dk_via_mithus_protobuf_Post,
        __Marshaller_dk_via_mithus_protobuf_Void);

    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static readonly grpc::Method<global::Dk.Via.Mithus.Protobuf.Post, global::Dk.Via.Mithus.Protobuf.Void> __Method_DeletePost = new grpc::Method<global::Dk.Via.Mithus.Protobuf.Post, global::Dk.Via.Mithus.Protobuf.Void>(
        grpc::MethodType.Unary,
        __ServiceName,
        "DeletePost",
        __Marshaller_dk_via_mithus_protobuf_Post,
        __Marshaller_dk_via_mithus_protobuf_Void);

    /// <summary>Service descriptor</summary>
    public static global::Google.Protobuf.Reflection.ServiceDescriptor Descriptor
    {
      get { return global::Dk.Via.Mithus.Protobuf.ProtobufReflection.Descriptor.Services[1]; }
    }

    /// <summary>Client for PostService</summary>
    public partial class PostServiceClient : grpc::ClientBase<PostServiceClient>
    {
      /// <summary>Creates a new client for PostService</summary>
      /// <param name="channel">The channel to use to make remote calls.</param>
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public PostServiceClient(grpc::ChannelBase channel) : base(channel)
      {
      }
      /// <summary>Creates a new client for PostService that uses a custom <c>CallInvoker</c>.</summary>
      /// <param name="callInvoker">The callInvoker to use to make remote calls.</param>
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public PostServiceClient(grpc::CallInvoker callInvoker) : base(callInvoker)
      {
      }
      /// <summary>Protected parameterless constructor to allow creation of test doubles.</summary>
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      protected PostServiceClient() : base()
      {
      }
      /// <summary>Protected constructor to allow creation of configured clients.</summary>
      /// <param name="configuration">The client configuration.</param>
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      protected PostServiceClient(ClientBaseConfiguration configuration) : base(configuration)
      {
      }

      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual global::Dk.Via.Mithus.Protobuf.Post CreatePost(global::Dk.Via.Mithus.Protobuf.Post request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
      {
        return CreatePost(request, new grpc::CallOptions(headers, deadline, cancellationToken));
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual global::Dk.Via.Mithus.Protobuf.Post CreatePost(global::Dk.Via.Mithus.Protobuf.Post request, grpc::CallOptions options)
      {
        return CallInvoker.BlockingUnaryCall(__Method_CreatePost, null, options, request);
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual grpc::AsyncUnaryCall<global::Dk.Via.Mithus.Protobuf.Post> CreatePostAsync(global::Dk.Via.Mithus.Protobuf.Post request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
      {
        return CreatePostAsync(request, new grpc::CallOptions(headers, deadline, cancellationToken));
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual grpc::AsyncUnaryCall<global::Dk.Via.Mithus.Protobuf.Post> CreatePostAsync(global::Dk.Via.Mithus.Protobuf.Post request, grpc::CallOptions options)
      {
        return CallInvoker.AsyncUnaryCall(__Method_CreatePost, null, options, request);
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual global::Dk.Via.Mithus.Protobuf.Post FindPost(global::Dk.Via.Mithus.Protobuf.SearchField request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
      {
        return FindPost(request, new grpc::CallOptions(headers, deadline, cancellationToken));
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual global::Dk.Via.Mithus.Protobuf.Post FindPost(global::Dk.Via.Mithus.Protobuf.SearchField request, grpc::CallOptions options)
      {
        return CallInvoker.BlockingUnaryCall(__Method_FindPost, null, options, request);
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual grpc::AsyncUnaryCall<global::Dk.Via.Mithus.Protobuf.Post> FindPostAsync(global::Dk.Via.Mithus.Protobuf.SearchField request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
      {
        return FindPostAsync(request, new grpc::CallOptions(headers, deadline, cancellationToken));
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual grpc::AsyncUnaryCall<global::Dk.Via.Mithus.Protobuf.Post> FindPostAsync(global::Dk.Via.Mithus.Protobuf.SearchField request, grpc::CallOptions options)
      {
        return CallInvoker.AsyncUnaryCall(__Method_FindPost, null, options, request);
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual global::Dk.Via.Mithus.Protobuf.Posts GetPosts(global::Dk.Via.Mithus.Protobuf.Void request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
      {
        return GetPosts(request, new grpc::CallOptions(headers, deadline, cancellationToken));
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual global::Dk.Via.Mithus.Protobuf.Posts GetPosts(global::Dk.Via.Mithus.Protobuf.Void request, grpc::CallOptions options)
      {
        return CallInvoker.BlockingUnaryCall(__Method_GetPosts, null, options, request);
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual grpc::AsyncUnaryCall<global::Dk.Via.Mithus.Protobuf.Posts> GetPostsAsync(global::Dk.Via.Mithus.Protobuf.Void request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
      {
        return GetPostsAsync(request, new grpc::CallOptions(headers, deadline, cancellationToken));
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual grpc::AsyncUnaryCall<global::Dk.Via.Mithus.Protobuf.Posts> GetPostsAsync(global::Dk.Via.Mithus.Protobuf.Void request, grpc::CallOptions options)
      {
        return CallInvoker.AsyncUnaryCall(__Method_GetPosts, null, options, request);
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual global::Dk.Via.Mithus.Protobuf.Posts GetPostsByLandlord(global::Dk.Via.Mithus.Protobuf.SearchField request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
      {
        return GetPostsByLandlord(request, new grpc::CallOptions(headers, deadline, cancellationToken));
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual global::Dk.Via.Mithus.Protobuf.Posts GetPostsByLandlord(global::Dk.Via.Mithus.Protobuf.SearchField request, grpc::CallOptions options)
      {
        return CallInvoker.BlockingUnaryCall(__Method_GetPostsByLandlord, null, options, request);
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual grpc::AsyncUnaryCall<global::Dk.Via.Mithus.Protobuf.Posts> GetPostsByLandlordAsync(global::Dk.Via.Mithus.Protobuf.SearchField request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
      {
        return GetPostsByLandlordAsync(request, new grpc::CallOptions(headers, deadline, cancellationToken));
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual grpc::AsyncUnaryCall<global::Dk.Via.Mithus.Protobuf.Posts> GetPostsByLandlordAsync(global::Dk.Via.Mithus.Protobuf.SearchField request, grpc::CallOptions options)
      {
        return CallInvoker.AsyncUnaryCall(__Method_GetPostsByLandlord, null, options, request);
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual global::Dk.Via.Mithus.Protobuf.Void UpdatePost(global::Dk.Via.Mithus.Protobuf.Post request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
      {
        return UpdatePost(request, new grpc::CallOptions(headers, deadline, cancellationToken));
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual global::Dk.Via.Mithus.Protobuf.Void UpdatePost(global::Dk.Via.Mithus.Protobuf.Post request, grpc::CallOptions options)
      {
        return CallInvoker.BlockingUnaryCall(__Method_UpdatePost, null, options, request);
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual grpc::AsyncUnaryCall<global::Dk.Via.Mithus.Protobuf.Void> UpdatePostAsync(global::Dk.Via.Mithus.Protobuf.Post request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
      {
        return UpdatePostAsync(request, new grpc::CallOptions(headers, deadline, cancellationToken));
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual grpc::AsyncUnaryCall<global::Dk.Via.Mithus.Protobuf.Void> UpdatePostAsync(global::Dk.Via.Mithus.Protobuf.Post request, grpc::CallOptions options)
      {
        return CallInvoker.AsyncUnaryCall(__Method_UpdatePost, null, options, request);
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual global::Dk.Via.Mithus.Protobuf.Void DeletePost(global::Dk.Via.Mithus.Protobuf.Post request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
      {
        return DeletePost(request, new grpc::CallOptions(headers, deadline, cancellationToken));
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual global::Dk.Via.Mithus.Protobuf.Void DeletePost(global::Dk.Via.Mithus.Protobuf.Post request, grpc::CallOptions options)
      {
        return CallInvoker.BlockingUnaryCall(__Method_DeletePost, null, options, request);
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual grpc::AsyncUnaryCall<global::Dk.Via.Mithus.Protobuf.Void> DeletePostAsync(global::Dk.Via.Mithus.Protobuf.Post request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
      {
        return DeletePostAsync(request, new grpc::CallOptions(headers, deadline, cancellationToken));
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual grpc::AsyncUnaryCall<global::Dk.Via.Mithus.Protobuf.Void> DeletePostAsync(global::Dk.Via.Mithus.Protobuf.Post request, grpc::CallOptions options)
      {
        return CallInvoker.AsyncUnaryCall(__Method_DeletePost, null, options, request);
      }
      /// <summary>Creates a new instance of client from given <c>ClientBaseConfiguration</c>.</summary>
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      protected override PostServiceClient NewInstance(ClientBaseConfiguration configuration)
      {
        return new PostServiceClient(configuration);
      }
    }

  }
}
#endregion
