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

public class Base64QRCode extends AbstractQRCode implements IDisposable {
  protected NObject javonetHandle;

  public Base64QRCode() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("QRCoder.Base64QRCode");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Base64QRCode(QRCodeData data) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("QRCoder.Base64QRCode", data);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Base64QRCode(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void SetQRCodeData(QRCodeData data) {
    try {
      javonetHandle.invoke("SetQRCodeData", data);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
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
      java.lang.String darkColorHtmlHex,
      java.lang.String lightColorHtmlHex,
      java.lang.Boolean drawQuietZones,
      Base64QRCode.ImageType imgType) {
    try {
      java.lang.String res =
          javonetHandle.invoke(
              "GetGraphic",
              pixelsPerModule,
              darkColorHtmlHex,
              lightColorHtmlHex,
              drawQuietZones,
              NEnum.fromJavaEnum(imgType));
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
      Base64QRCode.ImageType imgType) {
    try {
      java.lang.String res =
          javonetHandle.invoke(
              "GetGraphic",
              pixelsPerModule,
              darkColor,
              lightColor,
              drawQuietZones,
              NEnum.fromJavaEnum(imgType));
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
      Bitmap icon,
      java.lang.Integer iconSizePercent,
      java.lang.Integer iconBorderWidth,
      java.lang.Boolean drawQuietZones,
      Base64QRCode.ImageType imgType) {
    try {
      java.lang.String res =
          javonetHandle.invoke(
              "GetGraphic",
              pixelsPerModule,
              darkColor,
              lightColor,
              icon,
              iconSizePercent,
              iconBorderWidth,
              drawQuietZones,
              NEnum.fromJavaEnum(imgType));
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

  public enum ImageType {
    Gif(0L),
    Jpeg(1L),
    Png(2L),
    ;
    private long numVal;

    ImageType(long numVal) {
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
