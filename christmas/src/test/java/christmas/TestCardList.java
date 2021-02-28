package test.examples.christmas;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

import java.nio.file.FileSystems;
import java.nio.file.Path;

import javax.xml.bind.JAXBException;

import org.junit.Before;
import org.junit.Test;

import christmas.LoadCardList;

public class TestCardList {
  private static LoadCardList cardList = new LoadCardList();
  private Path in = FileSystems.getDefault().getPath("src/test/resources", "ChristmasList.xml");
  private Path out = FileSystems.getDefault().getPath("src/test/resources", "ChristmasList2.xml");

  @Before
  public void setup() {
    out.toFile().delete();

    try {
      cardList.readXMLFile(in);
    }
    catch (JAXBException e) {
      e.printStackTrace();
    }
  }

//  @Test
//  public void testLoad() {
//    assertThat(cardList.list.getList().isEmpty(), is(false));
//  }

  @Test
  public void testOutput() {
    try {
      cardList.writeXMLFile(out);
    }
    catch (JAXBException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    assertTrue(out.toFile().exists());
  }
}
