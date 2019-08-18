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

public class QRCodeGenerator implements IDisposable {
  protected NObject javonetHandle;

  public QRCodeGenerator() {
    try {
      javonetHandle = Javonet.New("QRCoder.QRCodeGenerator");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public QRCodeGenerator(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public QRCodeData CreateQrCode(PayloadGenerator.Payload payload) {
    try {
      Object res = javonetHandle.invoke("CreateQrCode", payload);
      if (res == null) return null;
      return new QRCodeData((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public QRCodeData CreateQrCode(
      PayloadGenerator.Payload payload, QRCodeGenerator.ECCLevel eccLevel) {
    try {
      Object res = javonetHandle.invoke("CreateQrCode", payload, NEnum.fromJavaEnum(eccLevel));
      if (res == null) return null;
      return new QRCodeData((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public QRCodeData CreateQrCode(
      java.lang.String plainText,
      QRCodeGenerator.ECCLevel eccLevel,
      java.lang.Boolean forceUtf8,
      java.lang.Boolean utf8BOM,
      QRCodeGenerator.EciMode eciMode,
      java.lang.Integer requestedVersion) {
    try {
      Object res =
          javonetHandle.invoke(
              "CreateQrCode",
              plainText,
              NEnum.fromJavaEnum(eccLevel),
              forceUtf8,
              utf8BOM,
              NEnum.fromJavaEnum(eciMode),
              requestedVersion);
      if (res == null) return null;
      return new QRCodeData((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public QRCodeData CreateQrCode(java.lang.Byte[] binaryData, QRCodeGenerator.ECCLevel eccLevel) {
    try {
      Object res =
          javonetHandle.invoke(
              "CreateQrCode", new Object[] {binaryData}, NEnum.fromJavaEnum(eccLevel));
      if (res == null) return null;
      return new QRCodeData((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static QRCodeData GenerateQrCode(PayloadGenerator.Payload payload) {
    try {
      Object res = Javonet.getType("QRCoder.QRCodeGenerator").invoke("GenerateQrCode", payload);
      if (res == null) return null;
      return new QRCodeData((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static QRCodeData GenerateQrCode(
      PayloadGenerator.Payload payload, QRCodeGenerator.ECCLevel eccLevel) {
    try {
      Object res =
          Javonet.getType("QRCoder.QRCodeGenerator")
              .invoke("GenerateQrCode", payload, NEnum.fromJavaEnum(eccLevel));
      if (res == null) return null;
      return new QRCodeData((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static QRCodeData GenerateQrCode(
      java.lang.String plainText,
      QRCodeGenerator.ECCLevel eccLevel,
      java.lang.Boolean forceUtf8,
      java.lang.Boolean utf8BOM,
      QRCodeGenerator.EciMode eciMode,
      java.lang.Integer requestedVersion) {
    try {
      Object res =
          Javonet.getType("QRCoder.QRCodeGenerator")
              .invoke(
                  "GenerateQrCode",
                  plainText,
                  NEnum.fromJavaEnum(eccLevel),
                  forceUtf8,
                  utf8BOM,
                  NEnum.fromJavaEnum(eciMode),
                  requestedVersion);
      if (res == null) return null;
      return new QRCodeData((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static QRCodeData GenerateQrCode(
      java.lang.Byte[] binaryData, QRCodeGenerator.ECCLevel eccLevel) {
    try {
      Object res =
          Javonet.getType("QRCoder.QRCodeGenerator")
              .invoke("GenerateQrCode", new Object[] {binaryData}, NEnum.fromJavaEnum(eccLevel));
      if (res == null) return null;
      return new QRCodeData((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Dispose() {
    try {
      javonetHandle.explicitInterface("jio.System.IDisposable").invoke("Dispose");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public enum EciMode {
    Default(0L),
    Iso8859_1(3L),
    Iso8859_2(4L),
    Utf8(26L),
    ;
    private long numVal;

    EciMode(long numVal) {
      this.numVal = numVal;
    }

    public long getNumVal() {
      return numVal;
    }
  }

  public enum ECCLevel {
    L(0L),
    M(1L),
    Q(2L),
    H(3L),
    ;
    private long numVal;

    ECCLevel(long numVal) {
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
