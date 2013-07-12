/**
 * Code generated by "Wire" protobuf compiler, do not edit.
 * Source file: ../runtime/src/main/proto/edge_cases.proto
 */
package com.squareup.protos.edgecases;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import com.squareup.wire.Wire;

public final class OneField
    implements Message {

  public static final Integer opt_int32_default = 0;

  @ProtoField(
    tag = 1,
    type = Wire.INT32
  )
  public final Integer opt_int32;

  private OneField(Builder builder) {
    this.opt_int32 = builder.opt_int32;
  }

  @Override
  public boolean equals(Object other) {
    if (!(other instanceof OneField)) return false;
    return Wire.equals(opt_int32, ((OneField) other).opt_int32);
  }

  @Override
  public int hashCode() {
    return opt_int32 != null ? opt_int32.hashCode() : 0;
  }

  @Override
  public String toString() {
    return String.format("OneField{" +
        "opt_int32=%s}",
        opt_int32);
  }

  public static final class Builder
      implements Message.Builder<OneField> {

    public Integer opt_int32;

    public Builder() {
    }

    public Builder(OneField message) {
      if (message == null) return;
      this.opt_int32 = message.opt_int32;
    }

    public Builder opt_int32(Integer opt_int32) {
      this.opt_int32 = opt_int32;
      return this;
    }

    @Override
    public boolean isInitialized() {
      return true;
    }

    @Override
    public OneField build() {
      return new OneField(this);
    }
  }
}
