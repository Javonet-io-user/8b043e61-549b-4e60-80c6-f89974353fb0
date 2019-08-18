package jio.System.Collections;

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
import jio.System.Collections.*;
import jio.System.*;

public class BitArray implements ICollection, IEnumerable, ICloneable, Iterable<Object> {
  protected NObject javonetHandle;

  @Override
  public Iterator<Object> iterator() {
    return (Iterator<Object>) this.IEnumerable_GetEnumerator();
  }

  public BitArray(java.lang.Integer length) {
    try {
      javonetHandle = Javonet.New("System.Collections.BitArray", length);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public BitArray(java.lang.Integer length, java.lang.Boolean defaultValue) {
    try {
      javonetHandle = Javonet.New("System.Collections.BitArray", length, defaultValue);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public BitArray(java.lang.Byte[] bytes) {
    try {
      javonetHandle = Javonet.New("System.Collections.BitArray", new Object[] {bytes});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public BitArray(java.lang.Boolean[] values) {
    try {
      javonetHandle = Javonet.New("System.Collections.BitArray", new Object[] {values});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public BitArray(java.lang.Integer[] values) {
    try {
      javonetHandle = Javonet.New("System.Collections.BitArray", new Object[] {values});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public BitArray(BitArray bits) {
    try {
      javonetHandle = Javonet.New("System.Collections.BitArray", bits);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public BitArray(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IEnumerator IEnumerable_GetEnumerator() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("jio.System.Collections.IEnumerable")
              .invoke("GetEnumerator");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
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
