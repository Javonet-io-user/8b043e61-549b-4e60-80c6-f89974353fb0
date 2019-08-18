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

public class PostscriptQRCode extends AbstractQRCode implements IDisposable {
  protected NObject javonetHandle;

  public PostscriptQRCode() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("QRCoder.PostscriptQRCode");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public PostscriptQRCode(QRCodeData data) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("QRCoder.PostscriptQRCode", data);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public PostscriptQRCode(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String GetGraphic(
      java.lang.Integer pointsPerModule, java.lang.Boolean epsFormat) {
    try {
      java.lang.String res = javonetHandle.invoke("GetGraphic", pointsPerModule, epsFormat);
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
      java.lang.Integer pointsPerModule,
      Color darkColor,
      Color lightColor,
      java.lang.Boolean drawQuietZones,
      java.lang.Boolean epsFormat) {
    try {
      java.lang.String res =
          javonetHandle.invoke(
              "GetGraphic", pointsPerModule, darkColor, lightColor, drawQuietZones, epsFormat);
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
      java.lang.Integer pointsPerModule,
      java.lang.String darkColorHex,
      java.lang.String lightColorHex,
      java.lang.Boolean drawQuietZones,
      java.lang.Boolean epsFormat) {
    try {
      java.lang.String res =
          javonetHandle.invoke(
              "GetGraphic",
              pointsPerModule,
              darkColorHex,
              lightColorHex,
              drawQuietZones,
              epsFormat);
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
      Size viewBox, java.lang.Boolean drawQuietZones, java.lang.Boolean epsFormat) {
    try {
      java.lang.String res = javonetHandle.invoke("GetGraphic", viewBox, drawQuietZones, epsFormat);
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
      java.lang.Boolean epsFormat) {
    try {
      java.lang.String res =
          javonetHandle.invoke(
              "GetGraphic", viewBox, darkColorHex, lightColorHex, drawQuietZones, epsFormat);
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
      java.lang.Boolean epsFormat) {
    try {
      java.lang.String res =
          javonetHandle.invoke(
              "GetGraphic", viewBox, darkColor, lightColor, drawQuietZones, epsFormat);
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

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
