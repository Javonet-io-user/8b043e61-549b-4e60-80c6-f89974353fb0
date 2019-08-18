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

public class SvgQRCodeHelper {
  protected NObject javonetHandle;

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String GetQRCode(
      java.lang.String plainText,
      java.lang.Integer pixelsPerModule,
      java.lang.String darkColorHex,
      java.lang.String lightColorHex,
      QRCodeGenerator.ECCLevel eccLevel,
      java.lang.Boolean forceUtf8,
      java.lang.Boolean utf8BOM,
      QRCodeGenerator.EciMode eciMode,
      java.lang.Integer requestedVersion,
      java.lang.Boolean drawQuietZones,
      SvgQRCode.SizingMode sizingMode) {
    try {
      java.lang.String res =
          Javonet.getType("QRCoder.SvgQRCodeHelper")
              .invoke(
                  "GetQRCode",
                  plainText,
                  pixelsPerModule,
                  darkColorHex,
                  lightColorHex,
                  NEnum.fromJavaEnum(eccLevel),
                  forceUtf8,
                  utf8BOM,
                  NEnum.fromJavaEnum(eciMode),
                  requestedVersion,
                  drawQuietZones,
                  NEnum.fromJavaEnum(sizingMode));
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
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
