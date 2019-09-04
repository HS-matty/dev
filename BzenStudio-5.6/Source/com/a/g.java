package com.a;

import java.util.Stack;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

class g extends DefaultHandler
{
  private Object a = null;
  private Stack b = new Stack();
  private boolean c;
  private String d;

  public void startDocument()
    throws SAXException
  {
    this.c = false;
    this.d = null;
  }

  private Object b()
  {
    return this.a;
  }

  public void startElement(String paramString1, String paramString2, String paramString3, Attributes paramAttributes)
    throws SAXException
  {
    paramAttributes = f.b(paramAttributes);
    if (this.c)
      return;
    d locald = b.a(paramString3);
    c localc = new c(locald);
    c.a(localc).a(paramAttributes);
    if (locald != null)
      locald.a(c.a(localc));
    this.b.push(localc);
  }

  public void endElement(String paramString1, String paramString2, String paramString3)
    throws SAXException
  {
    if (this.c)
    {
      if (!this.d.equals(paramString3))
        return;
      this.c = false;
      this.d = null;
      return;
    }
    c localc1 = (c)this.b.pop();
    d locald = c.b(localc1);
    Object localObject = locald.a(c.a(localc1));
    if (localObject != null)
    {
      if (!this.b.isEmpty())
      {
        c localc2 = (c)this.b.peek();
        c.a(localc2).a(locald.d(), localObject);
      }
      else
      {
        this.a = localObject;
      }
    }
    else
      this.a = null;
  }

  static Object a(g paramg)
  {
    return paramg.b();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.a.g
 * JD-Core Version:    0.6.0
 */