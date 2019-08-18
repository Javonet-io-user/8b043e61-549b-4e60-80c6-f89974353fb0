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

public class QRCode extends AbstractQRCode implements IDisposable {
  protected NObject javonetHandle;

  public QRCode() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("QRCoder.QRCode");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public QRCode(QRCodeData data) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("QRCoder.QRCode", data);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public QRCode(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public Bitmap GetGraphic(java.lang.Integer pixelsPerModule) {
    try {
      Object res = javonetHandle.invoke("GetGraphic", pixelsPerModule);
      if (res == null) return null;
      return new Bitmap((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public Bitmap GetGraphic(
      java.lang.Integer pixelsPerModule,
      java.lang.String darkColorHtmlHex,
      java.lang.String lightColorHtmlHex,
      java.lang.Boolean drawQuietZones) {
    try {
      Object res =
          javonetHandle.invoke(
              "GetGraphic", pixelsPerModule, darkColorHtmlHex, lightColorHtmlHex, drawQuietZones);
      if (res == null) return null;
      return new Bitmap((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public Bitmap GetGraphic(
      java.lang.Integer pixelsPerModule,
      Color darkColor,
      Color lightColor,
      java.lang.Boolean drawQuietZones) {
    try {
      Object res =
          javonetHandle.invoke(
              "GetGraphic", pixelsPerModule, darkColor, lightColor, drawQuietZones);
      if (res == null) return null;
      return new Bitmap((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public Bitmap GetGraphic(
      java.lang.Integer pixelsPerModule,
      Color darkColor,
      Color lightColor,
      Bitmap icon,
      java.lang.Integer iconSizePercent,
      java.lang.Integer iconBorderWidth,
      java.lang.Boolean drawQuietZones) {
    try {
      Object res =
          javonetHandle.invoke(
              "GetGraphic",
              pixelsPerModule,
              darkColor,
              lightColor,
              icon,
              iconSizePercent,
              iconBorderWidth,
              drawQuietZones);
      if (res == null) return null;
      return new Bitmap((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
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
