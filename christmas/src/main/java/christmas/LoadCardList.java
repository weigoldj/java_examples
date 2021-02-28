package christmas;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;


public class LoadCardList {

//  private Path path = FileSystems.getDefault().getPath("../resources", "ChristmasList.xml");
//  private Path out = FileSystems.getDefault().getPath("../resources", "ChristmasList2.xml");
  public CardListXML list;

  public LoadCardList() { }


  public void readXMLFile(Path path) throws JAXBException {
    JAXBContext jaxbContext = JAXBContext.newInstance(CardListXML.class);
    Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

    // We had written this file in marshalling example
    System.out.println("Reading file " + path.toString());

    list = (CardListXML) jaxbUnmarshaller.unmarshal( path.toFile() );
    System.out.println(list.toString());
  }

  public void writeXMLFile(Path out) throws JAXBException {
    JAXBContext jaxbContext = JAXBContext.newInstance(CardListXML.class);
    Marshaller marshaller = jaxbContext.createMarshaller();

    marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

    marshaller.marshal(list, out.toFile());
    marshaller.marshal(list, System.out);
  }
}
