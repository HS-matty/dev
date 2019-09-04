package com.a;

import com.zend.ide.util.cl;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.util.Iterator;
import java.util.List;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.AttributesImpl;

public abstract class f
{
  public static void a(String paramString, Object paramObject)
    throws IOException
  {
    a(paramString, paramObject, null);
  }

  public static void a(String paramString1, Object paramObject, String paramString2)
    throws IOException
  {
    FileOutputStream localFileOutputStream = new FileOutputStream(paramString1);
    BufferedWriter localBufferedWriter = new BufferedWriter(new OutputStreamWriter(localFileOutputStream, "UTF-8"));
    localBufferedWriter.write("<?xml version='1.0' encoding='UTF-8'?>");
    localBufferedWriter.newLine();
    localBufferedWriter.newLine();
    if (paramString2 != null)
    {
      localBufferedWriter.write("<!-- " + paramString2 + " -->");
      localBufferedWriter.newLine();
      localBufferedWriter.newLine();
    }
    d locald;
    if ((paramObject instanceof d))
      locald = (d)paramObject;
    else
      locald = b.b(paramObject.getClass().getName());
    locald.a(paramObject);
    a(0, locald, localBufferedWriter);
    localBufferedWriter.flush();
    localBufferedWriter.close();
  }

  private static void a(int paramInt, d paramd, BufferedWriter paramBufferedWriter)
    throws IOException
  {
    try
    {
      String str = paramd.d();
      e locale = paramd.e();
      List localList = locale.b();
      int i = (localList != null) && (localList.size() > 0) ? 1 : 0;
      int j = (locale.a() != null) && (!locale.a().equals("")) ? 1 : 0;
      a(paramInt, paramBufferedWriter);
      paramBufferedWriter.write("<");
      paramBufferedWriter.write(str);
      a(locale.c(), paramBufferedWriter);
      if ((i == 0) && (j == 0))
      {
        paramBufferedWriter.write("/>");
        paramBufferedWriter.newLine();
        return;
      }
      paramBufferedWriter.write(">");
      paramBufferedWriter.newLine();
      if (j != 0)
      {
        a(paramInt + 1, paramBufferedWriter);
        paramBufferedWriter.write(locale.a());
        paramBufferedWriter.newLine();
      }
      if (i != 0)
      {
        Iterator localIterator = localList.iterator();
        while (localIterator.hasNext())
        {
          Object localObject = localIterator.next();
          d locald;
          if ((localObject instanceof d))
          {
            locald = (d)localObject;
          }
          else
          {
            locald = b.b(localObject.getClass().getName());
            locald.a(localObject);
          }
          a(paramInt + 1, locald, paramBufferedWriter);
        }
      }
      a(paramInt, paramBufferedWriter);
      paramBufferedWriter.write("</");
      paramBufferedWriter.write(str);
      paramBufferedWriter.write(">");
      paramBufferedWriter.newLine();
    }
    catch (IOException localIOException)
    {
      throw new IOException("Failed writing the tag -  " + (paramd == null ? null : paramd.d()) + ", " + localIOException.getMessage());
    }
  }

  private static void a(Attributes paramAttributes, BufferedWriter paramBufferedWriter)
    throws IOException
  {
    if ((paramAttributes == null) || (paramAttributes.getLength() == 0))
      return;
    for (int i = 0; i < paramAttributes.getLength(); i++)
    {
      String str = paramAttributes.getLocalName(i);
      if ("".equals(str))
        str = paramAttributes.getQName(i);
      paramBufferedWriter.write(" ");
      paramBufferedWriter.write(str);
      paramBufferedWriter.write("=\"");
      try
      {
        paramBufferedWriter.write(b(paramAttributes.getValue(i)));
      }
      catch (IOException localIOException)
      {
        paramBufferedWriter.write("");
        cl.a("Failed writing attribute: " + str);
      }
      paramBufferedWriter.write("\"");
    }
  }

  private static void a(int paramInt, BufferedWriter paramBufferedWriter)
    throws IOException
  {
    for (int i = 0; i < paramInt; i++)
      paramBufferedWriter.write(9);
  }

  public static Object a(String paramString)
    throws SAXException, ParserConfigurationException, IOException
  {
    return a(new FileInputStream(paramString));
  }

  public static Object a(InputStream paramInputStream)
    throws SAXException, ParserConfigurationException, IOException
  {
    SAXParser localSAXParser = SAXParserFactory.newInstance().newSAXParser();
    g localg = new g();
    localSAXParser.parse(paramInputStream, localg);
    return g.a(localg);
  }

  public static String b(String paramString)
  {
    if (paramString == null)
      return null;
    paramString = paramString.replaceAll("&", "&amp;");
    paramString = paramString.replaceAll("\"", "&quot;");
    paramString = paramString.replaceAll("<", "&lt;");
    paramString = paramString.replaceAll(">", "&gt;");
    paramString = paramString.replaceAll("\n", "&#10;");
    paramString = paramString.replaceAll("\r", "&#13;");
    paramString = paramString.replaceAll("\t", "&#9;");
    return paramString;
  }

  private static Attributes a(Attributes paramAttributes)
  {
    AttributesImpl localAttributesImpl = null;
    if (paramAttributes != null)
    {
      localAttributesImpl = new AttributesImpl();
      for (int i = 0; i < paramAttributes.getLength(); i++)
      {
        String str = paramAttributes.getLocalName(i);
        if ("".equals(str))
          str = paramAttributes.getQName(i);
        localAttributesImpl.addAttribute("", str, "", "", paramAttributes.getValue(i));
      }
    }
    return localAttributesImpl;
  }

  static Attributes b(Attributes paramAttributes)
  {
    return a(paramAttributes);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.a.f
 * JD-Core Version:    0.6.0
 */