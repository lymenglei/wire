// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: menglei/protos.proto
package protoGen.menglei;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import okio.ByteString;

public final class role_regist_req extends Message<role_regist_req, role_regist_req.Builder> {
  public static final ProtoAdapter<role_regist_req> ADAPTER = ProtoAdapter.newMessageAdapter(role_regist_req.class);

  private static final long serialVersionUID = 0L;

  public static final String DEFAULT_NAME = "";

  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String name;

  public role_regist_req(String name) {
    this(name, ByteString.EMPTY);
  }

  public role_regist_req(String name, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.name = name;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.name = name;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof role_regist_req)) return false;
    role_regist_req o = (role_regist_req) other;
    return unknownFields().equals(o.unknownFields())
        && Internal.equals(name, o.name);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (name != null ? name.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  public static final class Builder extends Message.Builder<role_regist_req, Builder> {
    public String name;

    public Builder() {
    }

    public Builder name(String name) {
      this.name = name;
      return this;
    }

    @Override
    public role_regist_req build() {
      return new role_regist_req(name, super.buildUnknownFields());
    }
  }
}
