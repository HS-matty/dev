package com.zend.ide.cb.b;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

public class b
{
  private String a;

  public b(String paramString)
  {
    this.a = paramString;
  }

  public ArrayList a()
    throws ParserConfigurationException, SAXException, IOException
  {
    SAXParser localSAXParser = SAXParserFactory.newInstance().newSAXParser();
    c localc = new c();
    localSAXParser.parse(new InputSource(new FileReader(this.a)), localc);
    return localc.a();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.b.b
 * JD-Core Version:    0.6.0
 */