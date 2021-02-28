package christmas;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "CARD")
@XmlType(propOrder={"to", "address", "message"})
public class CardXML {

  private String to;
  private String address;
  private String message;

  public CardXML() {}

  public String getTo() {
    return to;
  }
  public String getAddress() {
    return address;
  }
  public String getMessage() {
    return message;
  }

  @XmlElement(name = "TO")
  public void setTo(String to) {
    this.to = to;
  }

  @XmlElement(name = "ADDRESS")
  public void setAddress(String address) {
    this.address = address;
  }

  @XmlElement(name = "MESSAGE")
  public void setMessage(String message) {
    this.message = message;
  }

  public String toSting() {
    StringBuffer sb = new StringBuffer();
    sb.append("CARD[ ");
    sb.append(" to:" + to);
    sb.append(", address:" + address);
    sb.append(", message:" + message);
    sb.append(" ] ");
    return sb.toString();
  }
}
