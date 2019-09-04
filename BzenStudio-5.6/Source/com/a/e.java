package com.a;

import java.util.ArrayList;
import java.util.List;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.AttributesImpl;

public class e
{
  private Attributes a;
  private List b;
  private String c;

  public void a(String paramString1, String paramString2)
  {
    if (this.a == null)
      this.a = new AttributesImpl();
    ((AttributesImpl)this.a).addAttribute("", paramString1, "", "", paramString2);
  }

  public Attributes c()
  {
    return this.a;
  }

  public String a(String paramString)
  {
    for (int i = 0; i < this.a.getLength(); i++)
    {
      String str = this.a.getLocalName(i);
      if (str.equals(paramString))
        return this.a.getValue(i);
    }
    return "";
  }

  public void a(Attributes paramAttributes)
  {
    this.a = paramAttributes;
  }

  public void a(List paramList)
  {
    this.b = paramList;
  }

  public void a(String paramString, Object paramObject)
  {
    a(new h(paramString, paramObject));
  }

  public void a(d paramd)
  {
    if (this.b == null)
      this.b = new ArrayList();
    this.b.add(paramd);
  }

  private void a(h paramh)
  {
    if (this.b == null)
      this.b = new ArrayList();
    this.b.add(paramh);
  }

  public List b()
  {
    return this.b;
  }

  public String a()
  {
    return this.c;
  }

  public void a(String paramString)
  {
    this.c = paramString;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.a.e
 * JD-Core Version:    0.6.0
 */