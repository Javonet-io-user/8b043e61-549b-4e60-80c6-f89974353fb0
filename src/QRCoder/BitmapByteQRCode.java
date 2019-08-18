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
import jio.System.*;

public class BitmapByteQRCode extends AbstractQRCode implements IDisposable {
  protected NObject javonetHandle;

  public BitmapByteQRCode() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("QRCoder.BitmapByteQRCode");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public BitmapByteQRCode(QRCodeData data) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("QRCoder.BitmapByteQRCode", data);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public BitmapByteQRCode(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Byte[] GetGraphic(java.lang.Integer pixelsPerModule, Class<?> returnArrayType) {
    try {
      Object[] res = javonetHandle.invoke("GetGraphic", pixelsPerModule);
      if (res == null) return null;
      return (java.lang.Byte[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Byte[] GetGraphic(
      java.lang.Integer pixelsPerModule,
      java.lang.String darkColorHtmlHex,
      java.lang.String lightColorHtmlHex,
      Class<?> returnArrayType) {
    try {
      Object[] res =
          javonetHandle.invoke("GetGraphic", pixelsPerModule, darkColorHtmlHex, lightColorHtmlHex);
      if (res == null) return null;
      return (java.lang.Byte[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Byte[] GetGraphic(
      java.lang.Integer pixelsPerModule,
      java.lang.Byte[] darkColorRgb,
      java.lang.Byte[] lightColorRgb,
      Class<?> returnArrayType) {
    try {
      Object[] res =
          javonetHandle.invoke(
              "GetGraphic",
              pixelsPerModule,
              new Object[] {darkColorRgb},
              new Object[] {lightColorRgb});
      if (res == null) return null;
      return (java.lang.Byte[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
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
