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
import jio.System.Runtime.Serialization.*;
import jio.System.Runtime.InteropServices.*;

public class PayloadGenerator {
  protected NObject javonetHandle;

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Boolean ChecksumMod10(java.lang.String digits) {
    try {
      java.lang.Boolean res =
          Javonet.getType("QRCoder.PayloadGenerator").invoke("ChecksumMod10", digits);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }

  public abstract static class Payload {
    protected NObject javonetHandle;
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
    /** GetProperty */

    @MethodTypeAnnotation(type = "GetField")
    public QRCodeGenerator.ECCLevel getEccLevel() {
      try {
        Object res = javonetHandle.<NEnum>get("EccLevel");
        if (res == null) return null;
        return QRCodeGenerator.ECCLevel.valueOf(((NEnum) res).getValueName());
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return null;
      }
    }
    /** GetProperty */

    @MethodTypeAnnotation(type = "GetField")
    public QRCodeGenerator.EciMode getEciMode() {
      try {
        Object res = javonetHandle.<NEnum>get("EciMode");
        if (res == null) return null;
        return QRCodeGenerator.EciMode.valueOf(((NEnum) res).getValueName());
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return null;
      }
    }

    public Payload(NObject handle) {
      this.javonetHandle = handle;
    }

    public void setJavonetHandle(NObject handle) {
      this.javonetHandle = handle;
    }
    /** Method */

    @MethodTypeAnnotation(type = "Method")
    public java.lang.String ToString() {
      try {
        java.lang.String res = javonetHandle.invoke("ToString");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
  }

  public static class WiFi extends PayloadGenerator.Payload {
    protected NObject javonetHandle;

    public WiFi(
        java.lang.String ssid,
        java.lang.String password,
        PayloadGenerator.WiFi.Authentication authenticationMode,
        java.lang.Boolean isHiddenSSID) {
      super((NObject) null);
      try {
        javonetHandle =
            Javonet.New(
                "QRCoder.PayloadGenerator+WiFi",
                ssid,
                password,
                NEnum.fromJavaEnum(authenticationMode),
                isHiddenSSID);
        super.setJavonetHandle(javonetHandle);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }

    public WiFi(NObject handle) {
      super(handle);
      this.javonetHandle = handle;
    }

    public void setJavonetHandle(NObject handle) {
      this.javonetHandle = handle;
    }
    /** Method */

    @MethodTypeAnnotation(type = "Method")
    public java.lang.String ToString() {
      try {
        java.lang.String res = javonetHandle.invoke("ToString");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }

    public enum Authentication {
      WEP(0L),
      WPA(1L),
      nopass(2L),
      ;
      private long numVal;

      Authentication(long numVal) {
        this.numVal = numVal;
      }

      public long getNumVal() {
        return numVal;
      }
    }
  }

  public static class Mail extends PayloadGenerator.Payload {
    protected NObject javonetHandle;

    public Mail(java.lang.String mailReceiver, PayloadGenerator.Mail.MailEncoding encoding) {
      super((NObject) null);
      try {
        javonetHandle =
            Javonet.New(
                "QRCoder.PayloadGenerator+Mail", mailReceiver, NEnum.fromJavaEnum(encoding));
        super.setJavonetHandle(javonetHandle);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }

    public Mail(
        java.lang.String mailReceiver,
        java.lang.String subject,
        PayloadGenerator.Mail.MailEncoding encoding) {
      super((NObject) null);
      try {
        javonetHandle =
            Javonet.New(
                "QRCoder.PayloadGenerator+Mail",
                mailReceiver,
                subject,
                NEnum.fromJavaEnum(encoding));
        super.setJavonetHandle(javonetHandle);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }

    public Mail(
        java.lang.String mailReceiver,
        java.lang.String subject,
        java.lang.String message,
        PayloadGenerator.Mail.MailEncoding encoding) {
      super((NObject) null);
      try {
        javonetHandle =
            Javonet.New(
                "QRCoder.PayloadGenerator+Mail",
                mailReceiver,
                subject,
                message,
                NEnum.fromJavaEnum(encoding));
        super.setJavonetHandle(javonetHandle);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }

    public Mail(NObject handle) {
      super(handle);
      this.javonetHandle = handle;
    }

    public void setJavonetHandle(NObject handle) {
      this.javonetHandle = handle;
    }
    /** Method */

    @MethodTypeAnnotation(type = "Method")
    public java.lang.String ToString() {
      try {
        java.lang.String res = javonetHandle.invoke("ToString");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }

    public enum MailEncoding {
      MAILTO(0L),
      MATMSG(1L),
      SMTP(2L),
      ;
      private long numVal;

      MailEncoding(long numVal) {
        this.numVal = numVal;
      }

      public long getNumVal() {
        return numVal;
      }
    }
  }

  public static class SMS extends PayloadGenerator.Payload {
    protected NObject javonetHandle;

    public SMS(java.lang.String number, PayloadGenerator.SMS.SMSEncoding encoding) {
      super((NObject) null);
      try {
        javonetHandle =
            Javonet.New("QRCoder.PayloadGenerator+SMS", number, NEnum.fromJavaEnum(encoding));
        super.setJavonetHandle(javonetHandle);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }

    public SMS(
        java.lang.String number,
        java.lang.String subject,
        PayloadGenerator.SMS.SMSEncoding encoding) {
      super((NObject) null);
      try {
        javonetHandle =
            Javonet.New(
                "QRCoder.PayloadGenerator+SMS", number, subject, NEnum.fromJavaEnum(encoding));
        super.setJavonetHandle(javonetHandle);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }

    public SMS(NObject handle) {
      super(handle);
      this.javonetHandle = handle;
    }

    public void setJavonetHandle(NObject handle) {
      this.javonetHandle = handle;
    }
    /** Method */

    @MethodTypeAnnotation(type = "Method")
    public java.lang.String ToString() {
      try {
        java.lang.String res = javonetHandle.invoke("ToString");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }

    public enum SMSEncoding {
      SMS(0L),
      SMSTO(1L),
      SMS_iOS(2L),
      ;
      private long numVal;

      SMSEncoding(long numVal) {
        this.numVal = numVal;
      }

      public long getNumVal() {
        return numVal;
      }
    }
  }

  public static class MMS extends PayloadGenerator.Payload {
    protected NObject javonetHandle;

    public MMS(java.lang.String number, PayloadGenerator.MMS.MMSEncoding encoding) {
      super((NObject) null);
      try {
        javonetHandle =
            Javonet.New("QRCoder.PayloadGenerator+MMS", number, NEnum.fromJavaEnum(encoding));
        super.setJavonetHandle(javonetHandle);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }

    public MMS(
        java.lang.String number,
        java.lang.String subject,
        PayloadGenerator.MMS.MMSEncoding encoding) {
      super((NObject) null);
      try {
        javonetHandle =
            Javonet.New(
                "QRCoder.PayloadGenerator+MMS", number, subject, NEnum.fromJavaEnum(encoding));
        super.setJavonetHandle(javonetHandle);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }

    public MMS(NObject handle) {
      super(handle);
      this.javonetHandle = handle;
    }

    public void setJavonetHandle(NObject handle) {
      this.javonetHandle = handle;
    }
    /** Method */

    @MethodTypeAnnotation(type = "Method")
    public java.lang.String ToString() {
      try {
        java.lang.String res = javonetHandle.invoke("ToString");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }

    public enum MMSEncoding {
      MMS(0L),
      MMSTO(1L),
      ;
      private long numVal;

      MMSEncoding(long numVal) {
        this.numVal = numVal;
      }

      public long getNumVal() {
        return numVal;
      }
    }
  }

  public static class Geolocation extends PayloadGenerator.Payload {
    protected NObject javonetHandle;

    public Geolocation(
        java.lang.String latitude,
        java.lang.String longitude,
        PayloadGenerator.Geolocation.GeolocationEncoding encoding) {
      super((NObject) null);
      try {
        javonetHandle =
            Javonet.New(
                "QRCoder.PayloadGenerator+Geolocation",
                latitude,
                longitude,
                NEnum.fromJavaEnum(encoding));
        super.setJavonetHandle(javonetHandle);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }

    public Geolocation(NObject handle) {
      super(handle);
      this.javonetHandle = handle;
    }

    public void setJavonetHandle(NObject handle) {
      this.javonetHandle = handle;
    }
    /** Method */

    @MethodTypeAnnotation(type = "Method")
    public java.lang.String ToString() {
      try {
        java.lang.String res = javonetHandle.invoke("ToString");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }

    public enum GeolocationEncoding {
      GEO(0L),
      GoogleMaps(1L),
      ;
      private long numVal;

      GeolocationEncoding(long numVal) {
        this.numVal = numVal;
      }

      public long getNumVal() {
        return numVal;
      }
    }
  }

  public static class PhoneNumber extends PayloadGenerator.Payload {
    protected NObject javonetHandle;

    public PhoneNumber(java.lang.String number) {
      super((NObject) null);
      try {
        javonetHandle = Javonet.New("QRCoder.PayloadGenerator+PhoneNumber", number);
        super.setJavonetHandle(javonetHandle);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }

    public PhoneNumber(NObject handle) {
      super(handle);
      this.javonetHandle = handle;
    }

    public void setJavonetHandle(NObject handle) {
      this.javonetHandle = handle;
    }
    /** Method */

    @MethodTypeAnnotation(type = "Method")
    public java.lang.String ToString() {
      try {
        java.lang.String res = javonetHandle.invoke("ToString");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
  }

  public static class SkypeCall extends PayloadGenerator.Payload {
    protected NObject javonetHandle;

    public SkypeCall(java.lang.String skypeUsername) {
      super((NObject) null);
      try {
        javonetHandle = Javonet.New("QRCoder.PayloadGenerator+SkypeCall", skypeUsername);
        super.setJavonetHandle(javonetHandle);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }

    public SkypeCall(NObject handle) {
      super(handle);
      this.javonetHandle = handle;
    }

    public void setJavonetHandle(NObject handle) {
      this.javonetHandle = handle;
    }
    /** Method */

    @MethodTypeAnnotation(type = "Method")
    public java.lang.String ToString() {
      try {
        java.lang.String res = javonetHandle.invoke("ToString");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
  }

  public static class Url extends PayloadGenerator.Payload {
    protected NObject javonetHandle;

    public Url(java.lang.String url) {
      super((NObject) null);
      try {
        javonetHandle = Javonet.New("QRCoder.PayloadGenerator+Url", url);
        super.setJavonetHandle(javonetHandle);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }

    public Url(NObject handle) {
      super(handle);
      this.javonetHandle = handle;
    }

    public void setJavonetHandle(NObject handle) {
      this.javonetHandle = handle;
    }
    /** Method */

    @MethodTypeAnnotation(type = "Method")
    public java.lang.String ToString() {
      try {
        java.lang.String res = javonetHandle.invoke("ToString");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
  }

  public static class WhatsAppMessage extends PayloadGenerator.Payload {
    protected NObject javonetHandle;

    public WhatsAppMessage(java.lang.String number, java.lang.String message) {
      super((NObject) null);
      try {
        javonetHandle = Javonet.New("QRCoder.PayloadGenerator+WhatsAppMessage", number, message);
        super.setJavonetHandle(javonetHandle);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }

    public WhatsAppMessage(java.lang.String message) {
      super((NObject) null);
      try {
        javonetHandle = Javonet.New("QRCoder.PayloadGenerator+WhatsAppMessage", message);
        super.setJavonetHandle(javonetHandle);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }

    public WhatsAppMessage(NObject handle) {
      super(handle);
      this.javonetHandle = handle;
    }

    public void setJavonetHandle(NObject handle) {
      this.javonetHandle = handle;
    }
    /** Method */

    @MethodTypeAnnotation(type = "Method")
    public java.lang.String ToString() {
      try {
        java.lang.String res = javonetHandle.invoke("ToString");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
  }

  public static class Bookmark extends PayloadGenerator.Payload {
    protected NObject javonetHandle;

    public Bookmark(java.lang.String url, java.lang.String title) {
      super((NObject) null);
      try {
        javonetHandle = Javonet.New("QRCoder.PayloadGenerator+Bookmark", url, title);
        super.setJavonetHandle(javonetHandle);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }

    public Bookmark(NObject handle) {
      super(handle);
      this.javonetHandle = handle;
    }

    public void setJavonetHandle(NObject handle) {
      this.javonetHandle = handle;
    }
    /** Method */

    @MethodTypeAnnotation(type = "Method")
    public java.lang.String ToString() {
      try {
        java.lang.String res = javonetHandle.invoke("ToString");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
  }

  public static class ContactData extends PayloadGenerator.Payload {
    protected NObject javonetHandle;

    public ContactData(
        PayloadGenerator.ContactData.ContactOutputType outputType,
        java.lang.String firstname,
        java.lang.String lastname,
        java.lang.String nickname,
        java.lang.String phone,
        java.lang.String mobilePhone,
        java.lang.String workPhone,
        java.lang.String email,
        Nullable<DateTime> birthday,
        java.lang.String website,
        java.lang.String street,
        java.lang.String houseNumber,
        java.lang.String city,
        java.lang.String zipCode,
        java.lang.String country,
        java.lang.String note,
        java.lang.String stateRegion,
        PayloadGenerator.ContactData.AddressOrder addressOrder) {
      super((NObject) null);
      try {
        javonetHandle =
            Javonet.New(
                "QRCoder.PayloadGenerator+ContactData",
                NEnum.fromJavaEnum(outputType),
                firstname,
                lastname,
                nickname,
                phone,
                mobilePhone,
                workPhone,
                email,
                birthday,
                website,
                street,
                houseNumber,
                city,
                zipCode,
                country,
                note,
                stateRegion,
                NEnum.fromJavaEnum(addressOrder));
        super.setJavonetHandle(javonetHandle);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }

    public ContactData(NObject handle) {
      super(handle);
      this.javonetHandle = handle;
    }

    public void setJavonetHandle(NObject handle) {
      this.javonetHandle = handle;
    }
    /** Method */

    @MethodTypeAnnotation(type = "Method")
    public java.lang.String ToString() {
      try {
        java.lang.String res = javonetHandle.invoke("ToString");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }

    public enum ContactOutputType {
      MeCard(0L),
      VCard21(1L),
      VCard3(2L),
      VCard4(3L),
      ;
      private long numVal;

      ContactOutputType(long numVal) {
        this.numVal = numVal;
      }

      public long getNumVal() {
        return numVal;
      }
    }

    public enum AddressOrder {
      Default(0L),
      Reversed(1L),
      ;
      private long numVal;

      AddressOrder(long numVal) {
        this.numVal = numVal;
      }

      public long getNumVal() {
        return numVal;
      }
    }
  }

  public static class BitcoinAddress extends PayloadGenerator.Payload {
    protected NObject javonetHandle;

    public BitcoinAddress(
        java.lang.String address,
        Nullable<java.lang.Double> amount,
        java.lang.String label,
        java.lang.String message) {
      super((NObject) null);
      try {
        javonetHandle =
            Javonet.New("QRCoder.PayloadGenerator+BitcoinAddress", address, amount, label, message);
        super.setJavonetHandle(javonetHandle);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }

    public BitcoinAddress(NObject handle) {
      super(handle);
      this.javonetHandle = handle;
    }

    public void setJavonetHandle(NObject handle) {
      this.javonetHandle = handle;
    }
    /** Method */

    @MethodTypeAnnotation(type = "Method")
    public java.lang.String ToString() {
      try {
        java.lang.String res = javonetHandle.invoke("ToString");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
  }

  public static class SwissQrCode extends PayloadGenerator.Payload {
    protected NObject javonetHandle;

    public SwissQrCode(
        PayloadGenerator.SwissQrCode.Iban iban,
        PayloadGenerator.SwissQrCode.Currency currency,
        PayloadGenerator.SwissQrCode.Contact creditor,
        PayloadGenerator.SwissQrCode.Reference reference,
        PayloadGenerator.SwissQrCode.AdditionalInformation additionalInformation,
        PayloadGenerator.SwissQrCode.Contact debitor,
        Nullable<java.math.BigDecimal> amount,
        Nullable<DateTime> requestedDateOfPayment,
        PayloadGenerator.SwissQrCode.Contact ultimateCreditor,
        java.lang.String alternativeProcedure1,
        java.lang.String alternativeProcedure2) {
      super((NObject) null);
      try {
        javonetHandle =
            Javonet.New(
                "QRCoder.PayloadGenerator+SwissQrCode",
                iban,
                NEnum.fromJavaEnum(currency),
                creditor,
                reference,
                additionalInformation,
                debitor,
                amount,
                requestedDateOfPayment,
                ultimateCreditor,
                alternativeProcedure1,
                alternativeProcedure2);
        super.setJavonetHandle(javonetHandle);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }

    public SwissQrCode(NObject handle) {
      super(handle);
      this.javonetHandle = handle;
    }

    public void setJavonetHandle(NObject handle) {
      this.javonetHandle = handle;
    }
    /** Method */

    @MethodTypeAnnotation(type = "Method")
    public java.lang.String ToString() {
      try {
        java.lang.String res = javonetHandle.invoke("ToString");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }

    public enum Currency {
      CHF(756L),
      EUR(978L),
      ;
      private long numVal;

      Currency(long numVal) {
        this.numVal = numVal;
      }

      public long getNumVal() {
        return numVal;
      }
    }

    public static class AdditionalInformation {
      protected NObject javonetHandle;
      /** GetProperty */
      @MethodTypeAnnotation(type = "GetField")
      public java.lang.String getUnstructureMessage() {
        try {
          java.lang.String res = javonetHandle.get("UnstructureMessage");
          if (res == null) return "";
          return (java.lang.String) res;
        } catch (JavonetException _javonetException) {
          _javonetException.printStackTrace();
          return "";
        }
      }
      /** GetProperty */

      @MethodTypeAnnotation(type = "GetField")
      public java.lang.String getBillInformation() {
        try {
          java.lang.String res = javonetHandle.get("BillInformation");
          if (res == null) return "";
          return (java.lang.String) res;
        } catch (JavonetException _javonetException) {
          _javonetException.printStackTrace();
          return "";
        }
      }
      /** GetProperty */

      @MethodTypeAnnotation(type = "GetField")
      public java.lang.String getTrailer() {
        try {
          java.lang.String res = javonetHandle.get("Trailer");
          if (res == null) return "";
          return (java.lang.String) res;
        } catch (JavonetException _javonetException) {
          _javonetException.printStackTrace();
          return "";
        }
      }

      public AdditionalInformation(
          java.lang.String unstructuredMessage, java.lang.String billInformation) {
        try {
          javonetHandle =
              Javonet.New(
                  "QRCoder.PayloadGenerator+SwissQrCode+AdditionalInformation",
                  unstructuredMessage,
                  billInformation);
        } catch (JavonetException _javonetException) {
          _javonetException.printStackTrace();
        }
      }

      public AdditionalInformation(NObject handle) {
        this.javonetHandle = handle;
      }

      public void setJavonetHandle(NObject handle) {
        this.javonetHandle = handle;
      }

      public static class SwissQrCodeAdditionalInformationException extends jio.System.Exception
          implements ISerializable, _Exception {
        protected NObject javonetHandle;

        public SwissQrCodeAdditionalInformationException() {
          super((NObject) null);
          try {
            javonetHandle =
                Javonet.New(
                    "QRCoder.PayloadGenerator+SwissQrCode+AdditionalInformation+SwissQrCodeAdditionalInformationException");
            super.setJavonetHandle(javonetHandle);
          } catch (JavonetException _javonetException) {
            _javonetException.printStackTrace();
          }
        }

        public SwissQrCodeAdditionalInformationException(java.lang.String message) {
          super((NObject) null);
          try {
            javonetHandle =
                Javonet.New(
                    "QRCoder.PayloadGenerator+SwissQrCode+AdditionalInformation+SwissQrCodeAdditionalInformationException",
                    message);
            super.setJavonetHandle(javonetHandle);
          } catch (JavonetException _javonetException) {
            _javonetException.printStackTrace();
          }
        }

        public SwissQrCodeAdditionalInformationException(
            java.lang.String message, jio.System.Exception inner) {
          super((NObject) null);
          try {
            javonetHandle =
                Javonet.New(
                    "QRCoder.PayloadGenerator+SwissQrCode+AdditionalInformation+SwissQrCodeAdditionalInformationException",
                    message,
                    inner);
            super.setJavonetHandle(javonetHandle);
          } catch (JavonetException _javonetException) {
            _javonetException.printStackTrace();
          }
        }

        public SwissQrCodeAdditionalInformationException(NObject handle) {
          super(handle);
          this.javonetHandle = handle;
        }

        public void setJavonetHandle(NObject handle) {
          this.javonetHandle = handle;
        }
      }
    }

    public static class Reference {
      protected NObject javonetHandle;
      /** GetProperty */
      @MethodTypeAnnotation(type = "GetField")
      public PayloadGenerator.SwissQrCode.Reference.ReferenceType getRefType() {
        try {
          Object res = javonetHandle.<NEnum>get("RefType");
          if (res == null) return null;
          return PayloadGenerator.SwissQrCode.Reference.ReferenceType.valueOf(
              ((NEnum) res).getValueName());
        } catch (JavonetException _javonetException) {
          _javonetException.printStackTrace();
          return null;
        }
      }
      /** GetProperty */

      @MethodTypeAnnotation(type = "GetField")
      public java.lang.String getReferenceText() {
        try {
          java.lang.String res = javonetHandle.get("ReferenceText");
          if (res == null) return "";
          return (java.lang.String) res;
        } catch (JavonetException _javonetException) {
          _javonetException.printStackTrace();
          return "";
        }
      }

      public Reference(
          PayloadGenerator.SwissQrCode.Reference.ReferenceType referenceType,
          java.lang.String reference,
          Nullable<PayloadGenerator.SwissQrCode.Reference.ReferenceTextType> referenceTextType) {
        try {
          javonetHandle =
              Javonet.New(
                  "QRCoder.PayloadGenerator+SwissQrCode+Reference",
                  NEnum.fromJavaEnum(referenceType),
                  reference,
                  referenceTextType);
        } catch (JavonetException _javonetException) {
          _javonetException.printStackTrace();
        }
      }

      public Reference(NObject handle) {
        this.javonetHandle = handle;
      }

      public void setJavonetHandle(NObject handle) {
        this.javonetHandle = handle;
      }

      public enum ReferenceType {
        QRR(0L),
        SCOR(1L),
        NON(2L),
        ;
        private long numVal;

        ReferenceType(long numVal) {
          this.numVal = numVal;
        }

        public long getNumVal() {
          return numVal;
        }
      }

      public enum ReferenceTextType {
        QrReference(0L),
        CreditorReferenceIso11649(1L),
        ;
        private long numVal;

        ReferenceTextType(long numVal) {
          this.numVal = numVal;
        }

        public long getNumVal() {
          return numVal;
        }
      }

      public static class SwissQrCodeReferenceException extends jio.System.Exception
          implements ISerializable, _Exception {
        protected NObject javonetHandle;

        public SwissQrCodeReferenceException() {
          super((NObject) null);
          try {
            javonetHandle =
                Javonet.New(
                    "QRCoder.PayloadGenerator+SwissQrCode+Reference+SwissQrCodeReferenceException");
            super.setJavonetHandle(javonetHandle);
          } catch (JavonetException _javonetException) {
            _javonetException.printStackTrace();
          }
        }

        public SwissQrCodeReferenceException(java.lang.String message) {
          super((NObject) null);
          try {
            javonetHandle =
                Javonet.New(
                    "QRCoder.PayloadGenerator+SwissQrCode+Reference+SwissQrCodeReferenceException",
                    message);
            super.setJavonetHandle(javonetHandle);
          } catch (JavonetException _javonetException) {
            _javonetException.printStackTrace();
          }
        }

        public SwissQrCodeReferenceException(java.lang.String message, jio.System.Exception inner) {
          super((NObject) null);
          try {
            javonetHandle =
                Javonet.New(
                    "QRCoder.PayloadGenerator+SwissQrCode+Reference+SwissQrCodeReferenceException",
                    message,
                    inner);
            super.setJavonetHandle(javonetHandle);
          } catch (JavonetException _javonetException) {
            _javonetException.printStackTrace();
          }
        }

        public SwissQrCodeReferenceException(NObject handle) {
          super(handle);
          this.javonetHandle = handle;
        }

        public void setJavonetHandle(NObject handle) {
          this.javonetHandle = handle;
        }
      }
    }

    public static class Iban {
      protected NObject javonetHandle;
      /** GetProperty */
      @MethodTypeAnnotation(type = "GetField")
      public java.lang.Boolean getIsQrIban() {
        try {
          java.lang.Boolean res = javonetHandle.get("IsQrIban");
          if (res == null) return false;
          return res;
        } catch (JavonetException _javonetException) {
          _javonetException.printStackTrace();
          return false;
        }
      }

      public Iban(java.lang.String iban, PayloadGenerator.SwissQrCode.Iban.IbanType ibanType) {
        try {
          javonetHandle =
              Javonet.New(
                  "QRCoder.PayloadGenerator+SwissQrCode+Iban", iban, NEnum.fromJavaEnum(ibanType));
        } catch (JavonetException _javonetException) {
          _javonetException.printStackTrace();
        }
      }

      public Iban(NObject handle) {
        this.javonetHandle = handle;
      }

      public void setJavonetHandle(NObject handle) {
        this.javonetHandle = handle;
      }
      /** Method */

      @MethodTypeAnnotation(type = "Method")
      public java.lang.String ToString() {
        try {
          java.lang.String res = javonetHandle.invoke("ToString");
          if (res == null) return "";
          return (java.lang.String) res;
        } catch (JavonetException _javonetException) {
          _javonetException.printStackTrace();
          return "";
        }
      }

      public enum IbanType {
        Iban(0L),
        QrIban(1L),
        ;
        private long numVal;

        IbanType(long numVal) {
          this.numVal = numVal;
        }

        public long getNumVal() {
          return numVal;
        }
      }

      public static class SwissQrCodeIbanException extends jio.System.Exception
          implements ISerializable, _Exception {
        protected NObject javonetHandle;

        public SwissQrCodeIbanException() {
          super((NObject) null);
          try {
            javonetHandle =
                Javonet.New("QRCoder.PayloadGenerator+SwissQrCode+Iban+SwissQrCodeIbanException");
            super.setJavonetHandle(javonetHandle);
          } catch (JavonetException _javonetException) {
            _javonetException.printStackTrace();
          }
        }

        public SwissQrCodeIbanException(java.lang.String message) {
          super((NObject) null);
          try {
            javonetHandle =
                Javonet.New(
                    "QRCoder.PayloadGenerator+SwissQrCode+Iban+SwissQrCodeIbanException", message);
            super.setJavonetHandle(javonetHandle);
          } catch (JavonetException _javonetException) {
            _javonetException.printStackTrace();
          }
        }

        public SwissQrCodeIbanException(java.lang.String message, jio.System.Exception inner) {
          super((NObject) null);
          try {
            javonetHandle =
                Javonet.New(
                    "QRCoder.PayloadGenerator+SwissQrCode+Iban+SwissQrCodeIbanException",
                    message,
                    inner);
            super.setJavonetHandle(javonetHandle);
          } catch (JavonetException _javonetException) {
            _javonetException.printStackTrace();
          }
        }

        public SwissQrCodeIbanException(NObject handle) {
          super(handle);
          this.javonetHandle = handle;
        }

        public void setJavonetHandle(NObject handle) {
          this.javonetHandle = handle;
        }
      }
    }

    public static class Contact {
      protected NObject javonetHandle;

      public Contact(
          java.lang.String name,
          java.lang.String zipCode,
          java.lang.String city,
          java.lang.String country,
          java.lang.String street,
          java.lang.String houseNumber) {
        try {
          javonetHandle =
              Javonet.New(
                  "QRCoder.PayloadGenerator+SwissQrCode+Contact",
                  name,
                  zipCode,
                  city,
                  country,
                  street,
                  houseNumber);
        } catch (JavonetException _javonetException) {
          _javonetException.printStackTrace();
        }
      }

      public Contact(
          java.lang.String name,
          java.lang.String country,
          java.lang.String addressLine1,
          java.lang.String addressLine2) {
        try {
          javonetHandle =
              Javonet.New(
                  "QRCoder.PayloadGenerator+SwissQrCode+Contact",
                  name,
                  country,
                  addressLine1,
                  addressLine2);
        } catch (JavonetException _javonetException) {
          _javonetException.printStackTrace();
        }
      }

      public Contact(NObject handle) {
        this.javonetHandle = handle;
      }

      public void setJavonetHandle(NObject handle) {
        this.javonetHandle = handle;
      }
      /** Method */

      @MethodTypeAnnotation(type = "Method")
      public java.lang.String ToString() {
        try {
          java.lang.String res = javonetHandle.invoke("ToString");
          if (res == null) return "";
          return (java.lang.String) res;
        } catch (JavonetException _javonetException) {
          _javonetException.printStackTrace();
          return "";
        }
      }

      public enum AddressType {
        StructuredAddress(0L),
        CombinedAddress(1L),
        ;
        private long numVal;

        AddressType(long numVal) {
          this.numVal = numVal;
        }

        public long getNumVal() {
          return numVal;
        }
      }

      public static class SwissQrCodeContactException extends jio.System.Exception
          implements ISerializable, _Exception {
        protected NObject javonetHandle;

        public SwissQrCodeContactException() {
          super((NObject) null);
          try {
            javonetHandle =
                Javonet.New(
                    "QRCoder.PayloadGenerator+SwissQrCode+Contact+SwissQrCodeContactException");
            super.setJavonetHandle(javonetHandle);
          } catch (JavonetException _javonetException) {
            _javonetException.printStackTrace();
          }
        }

        public SwissQrCodeContactException(java.lang.String message) {
          super((NObject) null);
          try {
            javonetHandle =
                Javonet.New(
                    "QRCoder.PayloadGenerator+SwissQrCode+Contact+SwissQrCodeContactException",
                    message);
            super.setJavonetHandle(javonetHandle);
          } catch (JavonetException _javonetException) {
            _javonetException.printStackTrace();
          }
        }

        public SwissQrCodeContactException(java.lang.String message, jio.System.Exception inner) {
          super((NObject) null);
          try {
            javonetHandle =
                Javonet.New(
                    "QRCoder.PayloadGenerator+SwissQrCode+Contact+SwissQrCodeContactException",
                    message,
                    inner);
            super.setJavonetHandle(javonetHandle);
          } catch (JavonetException _javonetException) {
            _javonetException.printStackTrace();
          }
        }

        public SwissQrCodeContactException(NObject handle) {
          super(handle);
          this.javonetHandle = handle;
        }

        public void setJavonetHandle(NObject handle) {
          this.javonetHandle = handle;
        }
      }
    }

    public static class SwissQrCodeException extends jio.System.Exception
        implements ISerializable, _Exception {
      protected NObject javonetHandle;

      public SwissQrCodeException() {
        super((NObject) null);
        try {
          javonetHandle = Javonet.New("QRCoder.PayloadGenerator+SwissQrCode+SwissQrCodeException");
          super.setJavonetHandle(javonetHandle);
        } catch (JavonetException _javonetException) {
          _javonetException.printStackTrace();
        }
      }

      public SwissQrCodeException(java.lang.String message) {
        super((NObject) null);
        try {
          javonetHandle =
              Javonet.New("QRCoder.PayloadGenerator+SwissQrCode+SwissQrCodeException", message);
          super.setJavonetHandle(javonetHandle);
        } catch (JavonetException _javonetException) {
          _javonetException.printStackTrace();
        }
      }

      public SwissQrCodeException(java.lang.String message, jio.System.Exception inner) {
        super((NObject) null);
        try {
          javonetHandle =
              Javonet.New(
                  "QRCoder.PayloadGenerator+SwissQrCode+SwissQrCodeException", message, inner);
          super.setJavonetHandle(javonetHandle);
        } catch (JavonetException _javonetException) {
          _javonetException.printStackTrace();
        }
      }

      public SwissQrCodeException(NObject handle) {
        super(handle);
        this.javonetHandle = handle;
      }

      public void setJavonetHandle(NObject handle) {
        this.javonetHandle = handle;
      }
    }
  }

  public static class Girocode extends PayloadGenerator.Payload {
    protected NObject javonetHandle;

    public Girocode(
        java.lang.String iban,
        java.lang.String bic,
        java.lang.String name,
        java.math.BigDecimal amount,
        java.lang.String remittanceInformation,
        PayloadGenerator.Girocode.TypeOfRemittance typeOfRemittance,
        java.lang.String purposeOfCreditTransfer,
        java.lang.String messageToGirocodeUser,
        PayloadGenerator.Girocode.GirocodeVersion version,
        PayloadGenerator.Girocode.GirocodeEncoding encoding) {
      super((NObject) null);
      try {
        javonetHandle =
            Javonet.New(
                "QRCoder.PayloadGenerator+Girocode",
                iban,
                bic,
                name,
                amount,
                remittanceInformation,
                NEnum.fromJavaEnum(typeOfRemittance),
                purposeOfCreditTransfer,
                messageToGirocodeUser,
                NEnum.fromJavaEnum(version),
                NEnum.fromJavaEnum(encoding));
        super.setJavonetHandle(javonetHandle);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }

    public Girocode(NObject handle) {
      super(handle);
      this.javonetHandle = handle;
    }

    public void setJavonetHandle(NObject handle) {
      this.javonetHandle = handle;
    }
    /** Method */

    @MethodTypeAnnotation(type = "Method")
    public java.lang.String ToString() {
      try {
        java.lang.String res = javonetHandle.invoke("ToString");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }

    public enum GirocodeVersion {
      Version1(0L),
      Version2(1L),
      ;
      private long numVal;

      GirocodeVersion(long numVal) {
        this.numVal = numVal;
      }

      public long getNumVal() {
        return numVal;
      }
    }

    public enum TypeOfRemittance {
      Structured(0L),
      Unstructured(1L),
      ;
      private long numVal;

      TypeOfRemittance(long numVal) {
        this.numVal = numVal;
      }

      public long getNumVal() {
        return numVal;
      }
    }

    public enum GirocodeEncoding {
      UTF_8(0L),
      ISO_8859_1(1L),
      ISO_8859_2(2L),
      ISO_8859_4(3L),
      ISO_8859_5(4L),
      ISO_8859_7(5L),
      ISO_8859_10(6L),
      ISO_8859_15(7L),
      ;
      private long numVal;

      GirocodeEncoding(long numVal) {
        this.numVal = numVal;
      }

      public long getNumVal() {
        return numVal;
      }
    }

    public static class GirocodeException extends jio.System.Exception
        implements ISerializable, _Exception {
      protected NObject javonetHandle;

      public GirocodeException() {
        super((NObject) null);
        try {
          javonetHandle = Javonet.New("QRCoder.PayloadGenerator+Girocode+GirocodeException");
          super.setJavonetHandle(javonetHandle);
        } catch (JavonetException _javonetException) {
          _javonetException.printStackTrace();
        }
      }

      public GirocodeException(java.lang.String message) {
        super((NObject) null);
        try {
          javonetHandle =
              Javonet.New("QRCoder.PayloadGenerator+Girocode+GirocodeException", message);
          super.setJavonetHandle(javonetHandle);
        } catch (JavonetException _javonetException) {
          _javonetException.printStackTrace();
        }
      }

      public GirocodeException(java.lang.String message, jio.System.Exception inner) {
        super((NObject) null);
        try {
          javonetHandle =
              Javonet.New("QRCoder.PayloadGenerator+Girocode+GirocodeException", message, inner);
          super.setJavonetHandle(javonetHandle);
        } catch (JavonetException _javonetException) {
          _javonetException.printStackTrace();
        }
      }

      public GirocodeException(NObject handle) {
        super(handle);
        this.javonetHandle = handle;
      }

      public void setJavonetHandle(NObject handle) {
        this.javonetHandle = handle;
      }
    }
  }

  public static class BezahlCode extends PayloadGenerator.Payload {
    protected NObject javonetHandle;

    public BezahlCode(
        PayloadGenerator.BezahlCode.AuthorityType authority,
        java.lang.String name,
        java.lang.String account,
        java.lang.String bnc,
        java.lang.String iban,
        java.lang.String bic,
        java.lang.String reason) {
      super((NObject) null);
      try {
        javonetHandle =
            Javonet.New(
                "QRCoder.PayloadGenerator+BezahlCode",
                NEnum.fromJavaEnum(authority),
                name,
                account,
                bnc,
                iban,
                bic,
                reason);
        super.setJavonetHandle(javonetHandle);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }

    public BezahlCode(
        PayloadGenerator.BezahlCode.AuthorityType authority,
        java.lang.String name,
        java.lang.String account,
        java.lang.String bnc,
        java.math.BigDecimal amount,
        java.lang.String periodicTimeunit,
        java.lang.Integer periodicTimeunitRotation,
        Nullable<DateTime> periodicFirstExecutionDate,
        Nullable<DateTime> periodicLastExecutionDate,
        java.lang.String reason,
        java.lang.Integer postingKey,
        PayloadGenerator.BezahlCode.Currency currency,
        Nullable<DateTime> executionDate) {
      super((NObject) null);
      try {
        javonetHandle =
            Javonet.New(
                "QRCoder.PayloadGenerator+BezahlCode",
                NEnum.fromJavaEnum(authority),
                name,
                account,
                bnc,
                amount,
                periodicTimeunit,
                periodicTimeunitRotation,
                periodicFirstExecutionDate,
                periodicLastExecutionDate,
                reason,
                postingKey,
                NEnum.fromJavaEnum(currency),
                executionDate);
        super.setJavonetHandle(javonetHandle);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }

    public BezahlCode(
        PayloadGenerator.BezahlCode.AuthorityType authority,
        java.lang.String name,
        java.lang.String iban,
        java.lang.String bic,
        java.math.BigDecimal amount,
        java.lang.String periodicTimeunit,
        java.lang.Integer periodicTimeunitRotation,
        Nullable<DateTime> periodicFirstExecutionDate,
        Nullable<DateTime> periodicLastExecutionDate,
        java.lang.String creditorId,
        java.lang.String mandateId,
        Nullable<DateTime> dateOfSignature,
        java.lang.String reason,
        java.lang.String sepaReference,
        PayloadGenerator.BezahlCode.Currency currency,
        Nullable<DateTime> executionDate) {
      super((NObject) null);
      try {
        javonetHandle =
            Javonet.New(
                "QRCoder.PayloadGenerator+BezahlCode",
                NEnum.fromJavaEnum(authority),
                name,
                iban,
                bic,
                amount,
                periodicTimeunit,
                periodicTimeunitRotation,
                periodicFirstExecutionDate,
                periodicLastExecutionDate,
                creditorId,
                mandateId,
                dateOfSignature,
                reason,
                sepaReference,
                NEnum.fromJavaEnum(currency),
                executionDate);
        super.setJavonetHandle(javonetHandle);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }

    public BezahlCode(
        PayloadGenerator.BezahlCode.AuthorityType authority,
        java.lang.String name,
        java.lang.String account,
        java.lang.String bnc,
        java.lang.String iban,
        java.lang.String bic,
        java.math.BigDecimal amount,
        java.lang.String periodicTimeunit,
        java.lang.Integer periodicTimeunitRotation,
        Nullable<DateTime> periodicFirstExecutionDate,
        Nullable<DateTime> periodicLastExecutionDate,
        java.lang.String creditorId,
        java.lang.String mandateId,
        Nullable<DateTime> dateOfSignature,
        java.lang.String reason,
        java.lang.Integer postingKey,
        java.lang.String sepaReference,
        PayloadGenerator.BezahlCode.Currency currency,
        Nullable<DateTime> executionDate,
        java.lang.Integer internalMode) {
      super((NObject) null);
      try {
        javonetHandle =
            Javonet.New(
                "QRCoder.PayloadGenerator+BezahlCode",
                NEnum.fromJavaEnum(authority),
                name,
                account,
                bnc,
                iban,
                bic,
                amount,
                periodicTimeunit,
                periodicTimeunitRotation,
                periodicFirstExecutionDate,
                periodicLastExecutionDate,
                creditorId,
                mandateId,
                dateOfSignature,
                reason,
                postingKey,
                sepaReference,
                NEnum.fromJavaEnum(currency),
                executionDate,
                internalMode);
        super.setJavonetHandle(javonetHandle);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }

    public BezahlCode(NObject handle) {
      super(handle);
      this.javonetHandle = handle;
    }

    public void setJavonetHandle(NObject handle) {
      this.javonetHandle = handle;
    }
    /** Method */

    @MethodTypeAnnotation(type = "Method")
    public java.lang.String ToString() {
      try {
        java.lang.String res = javonetHandle.invoke("ToString");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }

    public enum Currency {
      ALL(8L),
      DZD(12L),
      ARS(32L),
      AUD(36L),
      BSD(44L),
      BHD(48L),
      BDT(50L),
      AMD(51L),
      BBD(52L),
      BMD(60L),
      BTN(64L),
      BOB(68L),
      BWP(72L),
      BZD(84L),
      SBD(90L),
      BND(96L),
      MMK(104L),
      BIF(108L),
      KHR(116L),
      CAD(124L),
      CVE(132L),
      KYD(136L),
      LKR(144L),
      CLP(152L),
      CNY(156L),
      COP(170L),
      KMF(174L),
      CRC(188L),
      HRK(191L),
      CUP(192L),
      CZK(203L),
      DKK(208L),
      DOP(214L),
      SVC(222L),
      ETB(230L),
      ERN(232L),
      FKP(238L),
      FJD(242L),
      DJF(262L),
      GMD(270L),
      GIP(292L),
      GTQ(320L),
      GNF(324L),
      GYD(328L),
      HTG(332L),
      HNL(340L),
      HKD(344L),
      HUF(348L),
      ISK(352L),
      INR(356L),
      IDR(360L),
      IRR(364L),
      IQD(368L),
      ILS(376L),
      JMD(388L),
      JPY(392L),
      KZT(398L),
      JOD(400L),
      KES(404L),
      KPW(408L),
      KRW(410L),
      KWD(414L),
      KGS(417L),
      LAK(418L),
      LBP(422L),
      LSL(426L),
      LRD(430L),
      LYD(434L),
      MOP(446L),
      MWK(454L),
      MYR(458L),
      MVR(462L),
      MRO(478L),
      MUR(480L),
      MXN(484L),
      MNT(496L),
      MDL(498L),
      MAD(504L),
      OMR(512L),
      NAD(516L),
      NPR(524L),
      ANG(532L),
      AWG(533L),
      VUV(548L),
      NZD(554L),
      NIO(558L),
      NGN(566L),
      NOK(578L),
      PKR(586L),
      PAB(590L),
      PGK(598L),
      PYG(600L),
      PEN(604L),
      PHP(608L),
      QAR(634L),
      RUB(643L),
      RWF(646L),
      SHP(654L),
      STD(678L),
      SAR(682L),
      SCR(690L),
      SLL(694L),
      SGD(702L),
      VND(704L),
      SOS(706L),
      ZAR(710L),
      SSP(728L),
      SZL(748L),
      SEK(752L),
      CHF(756L),
      SYP(760L),
      THB(764L),
      TOP(776L),
      TTD(780L),
      AED(784L),
      TND(788L),
      UGX(800L),
      MKD(807L),
      EGP(818L),
      GBP(826L),
      TZS(834L),
      USD(840L),
      UYU(858L),
      UZS(860L),
      WST(882L),
      YER(886L),
      TWD(901L),
      CUC(931L),
      ZWL(932L),
      TMT(934L),
      GHS(936L),
      VEF(937L),
      SDG(938L),
      UYI(940L),
      RSD(941L),
      MZN(943L),
      AZN(944L),
      RON(946L),
      CHE(947L),
      CHW(948L),
      TRY(949L),
      XAF(950L),
      XCD(951L),
      XOF(952L),
      XPF(953L),
      XBA(955L),
      XBB(956L),
      XBC(957L),
      XBD(958L),
      XAU(959L),
      XDR(960L),
      XAG(961L),
      XPT(962L),
      XTS(963L),
      XPD(964L),
      XUA(965L),
      ZMW(967L),
      SRD(968L),
      MGA(969L),
      COU(970L),
      AFN(971L),
      TJS(972L),
      AOA(973L),
      BYR(974L),
      BGN(975L),
      CDF(976L),
      BAM(977L),
      EUR(978L),
      MXV(979L),
      UAH(980L),
      GEL(981L),
      BOV(984L),
      PLN(985L),
      BRL(986L),
      CLF(990L),
      XSU(994L),
      USN(997L),
      XXX(999L),
      ;
      private long numVal;

      Currency(long numVal) {
        this.numVal = numVal;
      }

      public long getNumVal() {
        return numVal;
      }
    }

    public enum AuthorityType {
      singlepayment(0L),
      singlepaymentsepa(1L),
      singledirectdebit(2L),
      singledirectdebitsepa(3L),
      periodicsinglepayment(4L),
      periodicsinglepaymentsepa(5L),
      contact(6L),
      contact_v2(7L),
      ;
      private long numVal;

      AuthorityType(long numVal) {
        this.numVal = numVal;
      }

      public long getNumVal() {
        return numVal;
      }
    }

    public static class BezahlCodeException extends jio.System.Exception
        implements ISerializable, _Exception {
      protected NObject javonetHandle;

      public BezahlCodeException() {
        super((NObject) null);
        try {
          javonetHandle = Javonet.New("QRCoder.PayloadGenerator+BezahlCode+BezahlCodeException");
          super.setJavonetHandle(javonetHandle);
        } catch (JavonetException _javonetException) {
          _javonetException.printStackTrace();
        }
      }

      public BezahlCodeException(java.lang.String message) {
        super((NObject) null);
        try {
          javonetHandle =
              Javonet.New("QRCoder.PayloadGenerator+BezahlCode+BezahlCodeException", message);
          super.setJavonetHandle(javonetHandle);
        } catch (JavonetException _javonetException) {
          _javonetException.printStackTrace();
        }
      }

      public BezahlCodeException(java.lang.String message, jio.System.Exception inner) {
        super((NObject) null);
        try {
          javonetHandle =
              Javonet.New(
                  "QRCoder.PayloadGenerator+BezahlCode+BezahlCodeException", message, inner);
          super.setJavonetHandle(javonetHandle);
        } catch (JavonetException _javonetException) {
          _javonetException.printStackTrace();
        }
      }

      public BezahlCodeException(NObject handle) {
        super(handle);
        this.javonetHandle = handle;
      }

      public void setJavonetHandle(NObject handle) {
        this.javonetHandle = handle;
      }
    }
  }

  public static class CalendarEvent extends PayloadGenerator.Payload {
    protected NObject javonetHandle;

    public CalendarEvent(
        java.lang.String subject,
        java.lang.String description,
        java.lang.String location,
        DateTime start,
        DateTime end,
        java.lang.Boolean allDayEvent,
        PayloadGenerator.CalendarEvent.EventEncoding encoding) {
      super((NObject) null);
      try {
        javonetHandle =
            Javonet.New(
                "QRCoder.PayloadGenerator+CalendarEvent",
                subject,
                description,
                location,
                start,
                end,
                allDayEvent,
                NEnum.fromJavaEnum(encoding));
        super.setJavonetHandle(javonetHandle);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }

    public CalendarEvent(NObject handle) {
      super(handle);
      this.javonetHandle = handle;
    }

    public void setJavonetHandle(NObject handle) {
      this.javonetHandle = handle;
    }
    /** Method */

    @MethodTypeAnnotation(type = "Method")
    public java.lang.String ToString() {
      try {
        java.lang.String res = javonetHandle.invoke("ToString");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }

    public enum EventEncoding {
      iCalComplete(0L),
      Universal(1L),
      ;
      private long numVal;

      EventEncoding(long numVal) {
        this.numVal = numVal;
      }

      public long getNumVal() {
        return numVal;
      }
    }
  }

  public static class OneTimePassword extends PayloadGenerator.Payload {
    protected NObject javonetHandle;
    /** SetProperty */
    @MethodTypeAnnotation(type = "SetField")
    public void setType(PayloadGenerator.OneTimePassword.OneTimePasswordAuthType value) {
      try {
        javonetHandle.set("Type", NEnum.fromJavaEnum(value));
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetProperty */

    @MethodTypeAnnotation(type = "GetField")
    public PayloadGenerator.OneTimePassword.OneTimePasswordAuthType getType() {
      try {
        Object res = javonetHandle.<NEnum>get("Type");
        if (res == null) return null;
        return PayloadGenerator.OneTimePassword.OneTimePasswordAuthType.valueOf(
            ((NEnum) res).getValueName());
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return null;
      }
    }
    /** SetProperty */

    @MethodTypeAnnotation(type = "SetField")
    public void setSecret(java.lang.String value) {
      try {
        javonetHandle.set("Secret", value);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetProperty */

    @MethodTypeAnnotation(type = "GetField")
    public java.lang.String getSecret() {
      try {
        java.lang.String res = javonetHandle.get("Secret");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetProperty */

    @MethodTypeAnnotation(type = "SetField")
    public void setAuthAlgorithm(
        PayloadGenerator.OneTimePassword.OneTimePasswordAuthAlgorithm value) {
      try {
        javonetHandle.set("AuthAlgorithm", NEnum.fromJavaEnum(value));
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetProperty */

    @MethodTypeAnnotation(type = "GetField")
    public PayloadGenerator.OneTimePassword.OneTimePasswordAuthAlgorithm getAuthAlgorithm() {
      try {
        Object res = javonetHandle.<NEnum>get("AuthAlgorithm");
        if (res == null) return null;
        return PayloadGenerator.OneTimePassword.OneTimePasswordAuthAlgorithm.valueOf(
            ((NEnum) res).getValueName());
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return null;
      }
    }
    /** SetProperty */

    @MethodTypeAnnotation(type = "SetField")
    public void setAlgorithm(PayloadGenerator.OneTimePassword.OoneTimePasswordAuthAlgorithm value) {
      try {
        javonetHandle.set("Algorithm", NEnum.fromJavaEnum(value));
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetProperty */

    @MethodTypeAnnotation(type = "GetField")
    public PayloadGenerator.OneTimePassword.OoneTimePasswordAuthAlgorithm getAlgorithm() {
      try {
        Object res = javonetHandle.<NEnum>get("Algorithm");
        if (res == null) return null;
        return PayloadGenerator.OneTimePassword.OoneTimePasswordAuthAlgorithm.valueOf(
            ((NEnum) res).getValueName());
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return null;
      }
    }
    /** SetProperty */

    @MethodTypeAnnotation(type = "SetField")
    public void setIssuer(java.lang.String value) {
      try {
        javonetHandle.set("Issuer", value);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetProperty */

    @MethodTypeAnnotation(type = "GetField")
    public java.lang.String getIssuer() {
      try {
        java.lang.String res = javonetHandle.get("Issuer");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetProperty */

    @MethodTypeAnnotation(type = "SetField")
    public void setLabel(java.lang.String value) {
      try {
        javonetHandle.set("Label", value);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetProperty */

    @MethodTypeAnnotation(type = "GetField")
    public java.lang.String getLabel() {
      try {
        java.lang.String res = javonetHandle.get("Label");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetProperty */

    @MethodTypeAnnotation(type = "SetField")
    public void setDigits(java.lang.Integer value) {
      try {
        javonetHandle.set("Digits", value);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetProperty */

    @MethodTypeAnnotation(type = "GetField")
    public java.lang.Integer getDigits() {
      try {
        java.lang.Integer res = javonetHandle.get("Digits");
        if (res == null) return 0;
        return res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return 0;
      }
    }
    /** SetProperty */

    @MethodTypeAnnotation(type = "SetField")
    public void setCounter(Nullable<java.lang.Integer> value) {
      try {
        javonetHandle.set("Counter", value);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetProperty */

    @MethodTypeAnnotation(type = "GetField")
    public Nullable<java.lang.Integer> getCounter() {
      try {
        Object res = javonetHandle.<NObject>get("Counter");
        if (res == null) return null;
        return new Nullable<java.lang.Integer>((NObject) res);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return null;
      }
    }
    /** SetProperty */

    @MethodTypeAnnotation(type = "SetField")
    public void setPeriod(Nullable<java.lang.Integer> value) {
      try {
        javonetHandle.set("Period", value);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetProperty */

    @MethodTypeAnnotation(type = "GetField")
    public Nullable<java.lang.Integer> getPeriod() {
      try {
        Object res = javonetHandle.<NObject>get("Period");
        if (res == null) return null;
        return new Nullable<java.lang.Integer>((NObject) res);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return null;
      }
    }

    public OneTimePassword() {
      super((NObject) null);
      try {
        javonetHandle = Javonet.New("QRCoder.PayloadGenerator+OneTimePassword");
        super.setJavonetHandle(javonetHandle);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }

    public OneTimePassword(NObject handle) {
      super(handle);
      this.javonetHandle = handle;
    }

    public void setJavonetHandle(NObject handle) {
      this.javonetHandle = handle;
    }
    /** Method */

    @MethodTypeAnnotation(type = "Method")
    public java.lang.String ToString() {
      try {
        java.lang.String res = javonetHandle.invoke("ToString");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }

    public enum OneTimePasswordAuthType {
      TOTP(0L),
      HOTP(1L),
      ;
      private long numVal;

      OneTimePasswordAuthType(long numVal) {
        this.numVal = numVal;
      }

      public long getNumVal() {
        return numVal;
      }
    }

    public enum OneTimePasswordAuthAlgorithm {
      SHA1(0L),
      SHA256(1L),
      SHA512(2L),
      ;
      private long numVal;

      OneTimePasswordAuthAlgorithm(long numVal) {
        this.numVal = numVal;
      }

      public long getNumVal() {
        return numVal;
      }
    }

    public enum OoneTimePasswordAuthAlgorithm {
      SHA1(0L),
      SHA256(1L),
      SHA512(2L),
      ;
      private long numVal;

      OoneTimePasswordAuthAlgorithm(long numVal) {
        this.numVal = numVal;
      }

      public long getNumVal() {
        return numVal;
      }
    }
  }

  public static class ShadowSocksConfig extends PayloadGenerator.Payload {
    protected NObject javonetHandle;

    public ShadowSocksConfig(
        java.lang.String hostname,
        java.lang.Integer port,
        java.lang.String password,
        PayloadGenerator.ShadowSocksConfig.Method method,
        java.lang.String tag) {
      super((NObject) null);
      try {
        javonetHandle =
            Javonet.New(
                "QRCoder.PayloadGenerator+ShadowSocksConfig",
                hostname,
                port,
                password,
                NEnum.fromJavaEnum(method),
                tag);
        super.setJavonetHandle(javonetHandle);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }

    public ShadowSocksConfig(NObject handle) {
      super(handle);
      this.javonetHandle = handle;
    }

    public void setJavonetHandle(NObject handle) {
      this.javonetHandle = handle;
    }
    /** Method */

    @MethodTypeAnnotation(type = "Method")
    public java.lang.String ToString() {
      try {
        java.lang.String res = javonetHandle.invoke("ToString");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }

    public enum Method {
      Aes128Cfb(0L),
      Aes128Cfb1(1L),
      Aes128Cfb8(2L),
      Aes128Ctr(3L),
      Aes128Ofb(4L),
      Aes192Cfb(5L),
      Aes192Cfb1(6L),
      Aes192Cfb8(7L),
      Aes192Ctr(8L),
      Aes192Ofb(9L),
      Aes256Cb(10L),
      Aes256Cfb1(11L),
      Aes256Cfb8(12L),
      Aes256Ctr(13L),
      Aes256Ofb(14L),
      BfCfb(15L),
      Camellia128Cfb(16L),
      Camellia192Cfb(17L),
      Camellia256Cfb(18L),
      Cast5Cfb(19L),
      Chacha20(20L),
      DesCfb(21L),
      IdeaCfb(22L),
      Rc2Cfb(23L),
      Rc4(24L),
      Rc4Md5(25L),
      Salsa20(26L),
      Salsa20Ctr(27L),
      SeedCfb(28L),
      Table(29L),
      ;
      private long numVal;

      Method(long numVal) {
        this.numVal = numVal;
      }

      public long getNumVal() {
        return numVal;
      }
    }

    public static class ShadowSocksConfigException extends jio.System.Exception
        implements ISerializable, _Exception {
      protected NObject javonetHandle;

      public ShadowSocksConfigException() {
        super((NObject) null);
        try {
          javonetHandle =
              Javonet.New("QRCoder.PayloadGenerator+ShadowSocksConfig+ShadowSocksConfigException");
          super.setJavonetHandle(javonetHandle);
        } catch (JavonetException _javonetException) {
          _javonetException.printStackTrace();
        }
      }

      public ShadowSocksConfigException(java.lang.String message) {
        super((NObject) null);
        try {
          javonetHandle =
              Javonet.New(
                  "QRCoder.PayloadGenerator+ShadowSocksConfig+ShadowSocksConfigException", message);
          super.setJavonetHandle(javonetHandle);
        } catch (JavonetException _javonetException) {
          _javonetException.printStackTrace();
        }
      }

      public ShadowSocksConfigException(java.lang.String message, jio.System.Exception inner) {
        super((NObject) null);
        try {
          javonetHandle =
              Javonet.New(
                  "QRCoder.PayloadGenerator+ShadowSocksConfig+ShadowSocksConfigException",
                  message,
                  inner);
          super.setJavonetHandle(javonetHandle);
        } catch (JavonetException _javonetException) {
          _javonetException.printStackTrace();
        }
      }

      public ShadowSocksConfigException(NObject handle) {
        super(handle);
        this.javonetHandle = handle;
      }

      public void setJavonetHandle(NObject handle) {
        this.javonetHandle = handle;
      }
    }
  }

  public static class MoneroTransaction extends PayloadGenerator.Payload {
    protected NObject javonetHandle;

    public MoneroTransaction(
        java.lang.String address,
        Nullable<java.lang.Float> txAmount,
        java.lang.String txPaymentId,
        java.lang.String recipientName,
        java.lang.String txDescription) {
      super((NObject) null);
      try {
        javonetHandle =
            Javonet.New(
                "QRCoder.PayloadGenerator+MoneroTransaction",
                address,
                txAmount,
                txPaymentId,
                recipientName,
                txDescription);
        super.setJavonetHandle(javonetHandle);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }

    public MoneroTransaction(NObject handle) {
      super(handle);
      this.javonetHandle = handle;
    }

    public void setJavonetHandle(NObject handle) {
      this.javonetHandle = handle;
    }
    /** Method */

    @MethodTypeAnnotation(type = "Method")
    public java.lang.String ToString() {
      try {
        java.lang.String res = javonetHandle.invoke("ToString");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }

    public static class MoneroTransactionException extends jio.System.Exception
        implements ISerializable, _Exception {
      protected NObject javonetHandle;

      public MoneroTransactionException() {
        super((NObject) null);
        try {
          javonetHandle =
              Javonet.New("QRCoder.PayloadGenerator+MoneroTransaction+MoneroTransactionException");
          super.setJavonetHandle(javonetHandle);
        } catch (JavonetException _javonetException) {
          _javonetException.printStackTrace();
        }
      }

      public MoneroTransactionException(java.lang.String message) {
        super((NObject) null);
        try {
          javonetHandle =
              Javonet.New(
                  "QRCoder.PayloadGenerator+MoneroTransaction+MoneroTransactionException", message);
          super.setJavonetHandle(javonetHandle);
        } catch (JavonetException _javonetException) {
          _javonetException.printStackTrace();
        }
      }

      public MoneroTransactionException(java.lang.String message, jio.System.Exception inner) {
        super((NObject) null);
        try {
          javonetHandle =
              Javonet.New(
                  "QRCoder.PayloadGenerator+MoneroTransaction+MoneroTransactionException",
                  message,
                  inner);
          super.setJavonetHandle(javonetHandle);
        } catch (JavonetException _javonetException) {
          _javonetException.printStackTrace();
        }
      }

      public MoneroTransactionException(NObject handle) {
        super(handle);
        this.javonetHandle = handle;
      }

      public void setJavonetHandle(NObject handle) {
        this.javonetHandle = handle;
      }
    }
  }

  public static class SlovenianUpnQr extends PayloadGenerator.Payload {
    protected NObject javonetHandle;
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
    /** GetProperty */

    @MethodTypeAnnotation(type = "GetField")
    public QRCodeGenerator.ECCLevel getEccLevel() {
      try {
        Object res = javonetHandle.<NEnum>get("EccLevel");
        if (res == null) return null;
        return QRCodeGenerator.ECCLevel.valueOf(((NEnum) res).getValueName());
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return null;
      }
    }
    /** GetProperty */

    @MethodTypeAnnotation(type = "GetField")
    public QRCodeGenerator.EciMode getEciMode() {
      try {
        Object res = javonetHandle.<NEnum>get("EciMode");
        if (res == null) return null;
        return QRCodeGenerator.EciMode.valueOf(((NEnum) res).getValueName());
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return null;
      }
    }

    public SlovenianUpnQr(
        java.lang.String payerName,
        java.lang.String payerAddress,
        java.lang.String payerPlace,
        java.lang.String recipientName,
        java.lang.String recipientAddress,
        java.lang.String recipientPlace,
        java.lang.String recipientIban,
        java.lang.String description,
        java.lang.Double amount,
        java.lang.String recipientSiModel,
        java.lang.String recipientSiReference,
        java.lang.String code) {
      super((NObject) null);
      try {
        javonetHandle =
            Javonet.New(
                "QRCoder.PayloadGenerator+SlovenianUpnQr",
                payerName,
                payerAddress,
                payerPlace,
                recipientName,
                recipientAddress,
                recipientPlace,
                recipientIban,
                description,
                amount,
                recipientSiModel,
                recipientSiReference,
                code);
        super.setJavonetHandle(javonetHandle);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }

    public SlovenianUpnQr(
        java.lang.String payerName,
        java.lang.String payerAddress,
        java.lang.String payerPlace,
        java.lang.String recipientName,
        java.lang.String recipientAddress,
        java.lang.String recipientPlace,
        java.lang.String recipientIban,
        java.lang.String description,
        java.lang.Double amount,
        Nullable<DateTime> deadline,
        java.lang.String recipientSiModel,
        java.lang.String recipientSiReference,
        java.lang.String code) {
      super((NObject) null);
      try {
        javonetHandle =
            Javonet.New(
                "QRCoder.PayloadGenerator+SlovenianUpnQr",
                payerName,
                payerAddress,
                payerPlace,
                recipientName,
                recipientAddress,
                recipientPlace,
                recipientIban,
                description,
                amount,
                deadline,
                recipientSiModel,
                recipientSiReference,
                code);
        super.setJavonetHandle(javonetHandle);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }

    public SlovenianUpnQr(NObject handle) {
      super(handle);
      this.javonetHandle = handle;
    }

    public void setJavonetHandle(NObject handle) {
      this.javonetHandle = handle;
    }
    /** Method */

    @MethodTypeAnnotation(type = "Method")
    public java.lang.String ToString() {
      try {
        java.lang.String res = javonetHandle.invoke("ToString");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
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
