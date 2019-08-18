package QRCoder;

import Common.Activation;
import static Common.JavonetHelper.Convert;
import static Common.JavonetHelper.getGetObjectName;
import static Common.JavonetHelper.getReturnObjectName;
import static Common.JavonetHelper.ConvertToConcreteInterfaceImplementation;
import Common.JavonetHelper;
import Common.MethodTypeAnnotation;
import com.javonet.Javonet;
import com.javonet.JavonetException;
import com.javonet.JavonetFramework;
import com.javonet.api.NObject;
import com.javonet.api.NEnum;
import com.javonet.api.keywords.NRef;
import com.javonet.api.keywords.NOut;
import com.javonet.api.NControlContainer;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Iterator;
import java.lang.*;
import QRCoder.*;
import jio.System.Drawing.*;
import jio.System.*;

public class SvgQRCode extends AbstractQRCode implements IDisposable {
  protected NObject javonetHandle;

  public SvgQRCode() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("QRCoder.SvgQRCode");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public SvgQRCode(QRCodeData data) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("QRCoder.SvgQRCode", data);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public SvgQRCode(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String GetGraphic(java.lang.Integer pixelsPerModule) {
    try {
      java.lang.String res = javonetHandle.invoke("GetGraphic", pixelsPerModule);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String GetGraphic(
      java.lang.Integer pixelsPerModule,
      Color darkColor,
      Color lightColor,
      java.lang.Boolean drawQuietZones,
      SvgQRCode.SizingMode sizingMode) {
    try {
      java.lang.String res =
          javonetHandle.invoke(
              "GetGraphic",
              pixelsPerModule,
              darkColor,
              lightColor,
              drawQuietZones,
              NEnum.fromJavaEnum(sizingMode));
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String GetGraphic(
      java.lang.Integer pixelsPerModule,
      java.lang.String darkColorHex,
      java.lang.String lightColorHex,
      java.lang.Boolean drawQuietZones,
      SvgQRCode.SizingMode sizingMode) {
    try {
      java.lang.String res =
          javonetHandle.invoke(
              "GetGraphic",
              pixelsPerModule,
              darkColorHex,
              lightColorHex,
              drawQuietZones,
              NEnum.fromJavaEnum(sizingMode));
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String GetGraphic(
      Size viewBox, java.lang.Boolean drawQuietZones, SvgQRCode.SizingMode sizingMode) {
    try {
      java.lang.String res =
          javonetHandle.invoke(
              "GetGraphic", viewBox, drawQuietZones, NEnum.fromJavaEnum(sizingMode));
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String GetGraphic(
      Size viewBox,
      Color darkColor,
      Color lightColor,
      java.lang.Boolean drawQuietZones,
      SvgQRCode.SizingMode sizingMode) {
    try {
      java.lang.String res =
          javonetHandle.invoke(
              "GetGraphic",
              viewBox,
              darkColor,
              lightColor,
              drawQuietZones,
              NEnum.fromJavaEnum(sizingMode));
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String GetGraphic(
      Size viewBox,
      java.lang.String darkColorHex,
      java.lang.String lightColorHex,
      java.lang.Boolean drawQuietZones,
      SvgQRCode.SizingMode sizingMode) {
    try {
      java.lang.String res =
          javonetHandle.invoke(
              "GetGraphic",
              viewBox,
              darkColorHex,
              lightColorHex,
              drawQuietZones,
              NEnum.fromJavaEnum(sizingMode));
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Dispose() {
    try {
      javonetHandle.invoke("Dispose");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public enum SizingMode {
    WidthHeightAttribute(0L),
    ViewBoxAttribute(1L),
    ;
    private long numVal;

    SizingMode(long numVal) {
      this.numVal = numVal;
    }

    public long getNumVal() {
      return numVal;
    }
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
