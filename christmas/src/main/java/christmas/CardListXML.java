package christmas;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="CardList")
@XmlAccessorType(XmlAccessType.FIELD)
public class CardListXML {

  @XmlElement(name="CARD")
  private List<CardXML> list;

  public CardListXML() {}

  public void setList(List<CardXML> list) {
    this.list = list;
  }

  public List<CardXML> getList() {
    return this.list;
  }

  public void update(CardXML card) {
    CardXML c = new CardXML();
    c.setTo(card.getTo());
    c.setAddress(card.getAddress());
    c.setMessage(card.getMessage());
    list.add(c);
  }

  public String toString() {
    StringBuffer sb = new StringBuffer();
    sb.append("CARDLIST[ " );
    for(CardXML c : list) {
      sb.append(c.toSting());
    }
    sb.append(" ]");
    return sb.toString();
  }
}
