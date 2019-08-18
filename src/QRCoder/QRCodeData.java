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
import jio.System.Collections.*;
import jio.System.Collections.Generic.*;

public class QRCodeData implements IDisposable {
  protected NObject javonetHandle;
  /** SetProperty */
  @MethodTypeAnnotation(type = "SetField")
  public void setModuleMatrix(List<BitArray> value) {
    try {
      javonetHandle.set("ModuleMatrix", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public List<BitArray> getModuleMatrix() {
    try {
      Object res = javonetHandle.<NObject>get("ModuleMatrix");
      if (res == null) return null;
      return new List<BitArray>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getVersion() {
    try {
      java.lang.Integer res = javonetHandle.get("Version");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }

  public QRCodeData(java.lang.Integer version) {
    try {
      javonetHandle = Javonet.New("QRCoder.QRCodeData", version);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public QRCodeData(java.lang.String pathToRawData, QRCodeData.Compression compressMode) {
    try {
      javonetHandle =
          Javonet.New("QRCoder.QRCodeData", pathToRawData, NEnum.fromJavaEnum(compressMode));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public QRCodeData(java.lang.Byte[] rawData, QRCodeData.Compression compressMode) {
    try {
      javonetHandle =
          Javonet.New(
              "QRCoder.QRCodeData", new Object[] {rawData}, NEnum.fromJavaEnum(compressMode));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public QRCodeData(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Byte[] GetRawData(
      QRCodeData.Compression compressMode, Class<?> returnArrayType) {
    try {
      Object[] res = javonetHandle.invoke("GetRawData", NEnum.fromJavaEnum(compressMode));
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
  public void SaveRawData(java.lang.String filePath, QRCodeData.Compression compressMode) {
    try {
      javonetHandle.invoke("SaveRawData", filePath, NEnum.fromJavaEnum(compressMode));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
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

  public enum Compression {
    Uncompressed(0L),
    Deflate(1L),
    GZip(2L),
    ;
    private long numVal;

    Compression(long numVal) {
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
