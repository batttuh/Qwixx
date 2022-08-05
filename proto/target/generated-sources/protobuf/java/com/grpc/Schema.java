// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: schema.proto

package com.grpc;

public final class Schema {
  private Schema() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_grpc_Dice_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_grpc_Dice_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_grpc_Room_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_grpc_Room_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_grpc_User_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_grpc_User_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_grpc_Empty_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_grpc_Empty_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_grpc_UserList_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_grpc_UserList_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_grpc_Response_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_grpc_Response_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_grpc_Time_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_grpc_Time_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014schema.proto\022\010com.grpc\"\214\001\n\004Dice\022\016\n\006num" +
      "ber\030\001 \001(\005\022&\n\tdiceColor\030\002 \001(\0162\023.com.grpc." +
      "Dice.Type\"L\n\004Type\022\t\n\005white\020\000\022\017\n\013secondWh" +
      "ite\020\001\022\010\n\004blue\020\002\022\t\n\005green\020\003\022\007\n\003red\020\004\022\n\n\006y" +
      "ellow\020\005\"\'\n\004Room\022\016\n\006roomId\030\001 \001(\t\022\017\n\007sixSi" +
      "de\030\002 \001(\010\"^\n\004User\022\n\n\002id\030\001 \001(\t\022\034\n\004room\030\002 \001" +
      "(\0132\016.com.grpc.Room\022\035\n\005dices\030\003 \003(\0132\016.com." +
      "grpc.Dice\022\r\n\005queue\030\004 \001(\005\"\007\n\005Empty\")\n\010Use" +
      "rList\022\035\n\005users\030\001 \003(\0132\016.com.grpc.User\"&\n\010" +
      "Response\022\r\n\005error\030\001 \001(\005\022\013\n\003msg\030\002 \001(\t\"2\n\004",
      "Time\022\014\n\004Time\030\001 \001(\005\022\034\n\004room\030\002 \001(\0132\016.com.g" +
      "rpc.Room2\302\003\n\014QwixxService\022(\n\004join\022\016.com." +
      "grpc.User\032\016.com.grpc.User\"\000\022*\n\006create\022\016." +
      "com.grpc.User\032\016.com.grpc.User\"\000\0225\n\013getAl" +
      "lUsers\022\016.com.grpc.Room\032\022.com.grpc.UserLi" +
      "st\"\0000\001\022,\n\010nextUser\022\016.com.grpc.Room\032\016.com" +
      ".grpc.User\"\000\0221\n\013currentUser\022\016.com.grpc.R" +
      "oom\032\016.com.grpc.User\"\0000\001\022-\n\010rollDice\022\016.co" +
      "m.grpc.User\032\017.com.grpc.Empty\"\000\0225\n\017receiv" +
      "eRollDice\022\016.com.grpc.Room\032\016.com.grpc.Use",
      "r\"\0000\001\022,\n\007setTime\022\016.com.grpc.Time\032\017.com.g" +
      "rpc.Empty\"\000\0220\n\nstartTimer\022\016.com.grpc.Roo" +
      "m\032\016.com.grpc.Time\"\0000\001B\002P\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_com_grpc_Dice_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_grpc_Dice_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_grpc_Dice_descriptor,
        new java.lang.String[] { "Number", "DiceColor", });
    internal_static_com_grpc_Room_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_grpc_Room_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_grpc_Room_descriptor,
        new java.lang.String[] { "RoomId", "SixSide", });
    internal_static_com_grpc_User_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_com_grpc_User_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_grpc_User_descriptor,
        new java.lang.String[] { "Id", "Room", "Dices", "Queue", });
    internal_static_com_grpc_Empty_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_com_grpc_Empty_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_grpc_Empty_descriptor,
        new java.lang.String[] { });
    internal_static_com_grpc_UserList_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_com_grpc_UserList_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_grpc_UserList_descriptor,
        new java.lang.String[] { "Users", });
    internal_static_com_grpc_Response_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_com_grpc_Response_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_grpc_Response_descriptor,
        new java.lang.String[] { "Error", "Msg", });
    internal_static_com_grpc_Time_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_com_grpc_Time_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_grpc_Time_descriptor,
        new java.lang.String[] { "Time", "Room", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
