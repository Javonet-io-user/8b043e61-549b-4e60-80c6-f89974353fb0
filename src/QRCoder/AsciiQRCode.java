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

public class AsciiQRCode extends AbstractQRCode implements IDisposable {
  protected NObject javonetHandle;

  public AsciiQRCode() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("QRCoder.AsciiQRCode");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public AsciiQRCode(QRCodeData data) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("QRCoder.AsciiQRCode", data);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public AsciiQRCode(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String GetGraphic(java.lang.Integer repeatPerModule) {
    try {
      java.lang.String res = javonetHandle.invoke("GetGraphic", repeatPerModule);
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
      java.lang.Integer repeatPerModule,
      java.lang.String darkColorString,
      java.lang.String whiteSpaceString,
      java.lang.String endOfLine) {
    try {
      java.lang.String res =
          javonetHandle.invoke(
              "GetGraphic", repeatPerModule, darkColorString, whiteSpaceString, endOfLine);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String[] GetLineByLineGraphic(
      java.lang.Integer repeatPerModule, Class<?> returnArrayType) {
    try {
      Object[] res = javonetHandle.invoke("GetLineByLineGraphic", repeatPerModule);
      if (res == null) return null;
      return (java.lang.String[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String[] GetLineByLineGraphic(
      java.lang.Integer repeatPerModule,
      java.lang.String darkColorString,
      java.lang.String whiteSpaceString,
      Class<?> returnArrayType) {
    try {
      Object[] res =
          javonetHandle.invoke(
              "GetLineByLineGraphic", repeatPerModule, darkColorString, whiteSpaceString);
      if (res == null) return null;
      return (java.lang.String[])
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
