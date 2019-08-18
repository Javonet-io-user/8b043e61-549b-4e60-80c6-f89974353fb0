package jio.System.Drawing;

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
import jio.System.Drawing.*;
import jio.System.*;
import jio.System.IO.*;
import jio.System.Drawing.Imaging.*;
import jio.System.Runtime.Serialization.*;

public class Bitmap extends Image implements ISerializable, ICloneable, IDisposable {
  protected NObject javonetHandle;

  public Bitmap(java.lang.String filename) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.Drawing.Bitmap", filename);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Bitmap(java.lang.String filename, java.lang.Boolean useIcm) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.Drawing.Bitmap", filename, useIcm);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Bitmap(jio.System.Type type, java.lang.String resource) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.Drawing.Bitmap", type, resource);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Bitmap(Stream stream) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.Drawing.Bitmap", stream);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Bitmap(Stream stream, java.lang.Boolean useIcm) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.Drawing.Bitmap", stream, useIcm);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Bitmap(
      java.lang.Integer width,
      java.lang.Integer height,
      java.lang.Integer stride,
      PixelFormat format,
      IntPtr scan0) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "System.Drawing.Bitmap", width, height, stride, NEnum.fromJavaEnum(format), scan0);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Bitmap(java.lang.Integer width, java.lang.Integer height, PixelFormat format) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New("System.Drawing.Bitmap", width, height, NEnum.fromJavaEnum(format));
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Bitmap(java.lang.Integer width, java.lang.Integer height) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.Drawing.Bitmap", width, height);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Bitmap(java.lang.Integer width, java.lang.Integer height, Graphics g) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.Drawing.Bitmap", width, height, g);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Bitmap(Image original) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.Drawing.Bitmap", original);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Bitmap(Image original, java.lang.Integer width, java.lang.Integer height) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.Drawing.Bitmap", original, width, height);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Bitmap(Image original, Size newSize) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.Drawing.Bitmap", original, newSize);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Bitmap(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
