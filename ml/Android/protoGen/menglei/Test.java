// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: menglei/test.proto
package protoGen.menglei;

import android.os.Parcelable;
import android.support.annotation.Nullable;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.lang.Double;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import okio.ByteString;

/**
 * δ��Ч��
 */
public final class Test extends AndroidMessage<Test, Test.Builder> {
  public static final ProtoAdapter<Test> ADAPTER = ProtoAdapter.newMessageAdapter(Test.class);

  public static final Parcelable.Creator<Test> CREATOR = AndroidMessage.newCreator(ADAPTER);

  private static final long serialVersionUID = 0L;

  public static final String DEFAULT_NAME = "";

  public static final Integer DEFAULT_COUNT = 0;

  public static final Double DEFAULT_MASS_KILOGRAMS = 0.0d;

  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  @Nullable
  public final String name;

  @WireField(
      tag = 2,
      adapter = "com.squareup.wire.ProtoAdapter#STRING",
      label = WireField.Label.REPEATED
  )
  public final List<String> picture_urls;

  @WireField(
      tag = 3,
      adapter = "com.squareup.wire.ProtoAdapter#INT32"
  )
  @Nullable
  public final Integer count;

  @WireField(
      tag = 4,
      adapter = "com.squareup.wire.ProtoAdapter#DOUBLE"
  )
  @Nullable
  public final Double mass_kilograms;

  public Test(@Nullable String name, List<String> picture_urls, @Nullable Integer count,
      @Nullable Double mass_kilograms) {
    this(name, picture_urls, count, mass_kilograms, ByteString.EMPTY);
  }

  public Test(@Nullable String name, List<String> picture_urls, @Nullable Integer count,
      @Nullable Double mass_kilograms, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.name = name;
    this.picture_urls = Internal.immutableCopyOf("picture_urls", picture_urls);
    this.count = count;
    this.mass_kilograms = mass_kilograms;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.name = name;
    builder.picture_urls = Internal.copyOf("picture_urls", picture_urls);
    builder.count = count;
    builder.mass_kilograms = mass_kilograms;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof Test)) return false;
    Test o = (Test) other;
    return unknownFields().equals(o.unknownFields())
        && Internal.equals(name, o.name)
        && picture_urls.equals(o.picture_urls)
        && Internal.equals(count, o.count)
        && Internal.equals(mass_kilograms, o.mass_kilograms);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (name != null ? name.hashCode() : 0);
      result = result * 37 + picture_urls.hashCode();
      result = result * 37 + (count != null ? count.hashCode() : 0);
      result = result * 37 + (mass_kilograms != null ? mass_kilograms.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  public static final class Builder extends Message.Builder<Test, Builder> {
    public String name;

    public List<String> picture_urls;

    public Integer count;

    public Double mass_kilograms;

    public Builder() {
      picture_urls = Internal.newMutableList();
    }

    public Builder name(String name) {
      this.name = name;
      return this;
    }

    public Builder picture_urls(List<String> picture_urls) {
      Internal.checkElementsNotNull(picture_urls);
      this.picture_urls = picture_urls;
      return this;
    }

    public Builder count(Integer count) {
      this.count = count;
      return this;
    }

    public Builder mass_kilograms(Double mass_kilograms) {
      this.mass_kilograms = mass_kilograms;
      return this;
    }

    @Override
    public Test build() {
      return new Test(name, picture_urls, count, mass_kilograms, super.buildUnknownFields());
    }
  }
}
