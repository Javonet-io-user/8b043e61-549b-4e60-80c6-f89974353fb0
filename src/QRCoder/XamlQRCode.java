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
import jio.System.Windows.Media.*;
import jio.System.Windows.*;
import jio.System.*;

public class XamlQRCode extends AbstractQRCode implements IDisposable {
  protected NObject javonetHandle;

  public XamlQRCode() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("QRCoder.XamlQRCode");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public XamlQRCode(QRCodeData data) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("QRCoder.XamlQRCode", data);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public XamlQRCode(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public DrawingImage GetGraphic(java.lang.Integer pixelsPerModule) {
    try {
      Object res = javonetHandle.invoke("GetGraphic", pixelsPerModule);
      if (res == null) return null;
      return new DrawingImage((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public DrawingImage GetGraphic(
      java.lang.Integer pixelsPerModule, java.lang.Boolean drawQuietZones) {
    try {
      Object res = javonetHandle.invoke("GetGraphic", pixelsPerModule, drawQuietZones);
      if (res == null) return null;
      return new DrawingImage((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public DrawingImage GetGraphic(Size viewBox, java.lang.Boolean drawQuietZones) {
    try {
      Object res = javonetHandle.invoke("GetGraphic", viewBox, drawQuietZones);
      if (res == null) return null;
      return new DrawingImage((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public DrawingImage GetGraphic(
      java.lang.Integer pixelsPerModule,
      java.lang.String darkColorHex,
      java.lang.String lightColorHex,
      java.lang.Boolean drawQuietZones) {
    try {
      Object res =
          javonetHandle.invoke(
              "GetGraphic", pixelsPerModule, darkColorHex, lightColorHex, drawQuietZones);
      if (res == null) return null;
      return new DrawingImage((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public DrawingImage GetGraphic(
      Size viewBox, Brush darkBrush, Brush lightBrush, java.lang.Boolean drawQuietZones) {
    try {
      Object res =
          javonetHandle.invoke("GetGraphic", viewBox, darkBrush, lightBrush, drawQuietZones);
      if (res == null) return null;
      return new DrawingImage((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Double GetUnitsPerModule(Size viewBox, java.lang.Boolean drawQuietZones) {
    try {
      java.lang.Double res = javonetHandle.invoke("GetUnitsPerModule", viewBox, drawQuietZones);
      if (res == null) return 0.0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0.0;
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
