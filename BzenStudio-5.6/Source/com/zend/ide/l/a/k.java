package com.zend.ide.l.a;

import com.a.a.a;
import com.a.b;
import com.zend.ide.l.l;
import org.xml.sax.Attributes;

public class k extends a
{
  private String f = null;
  private a i = null;

  public k()
  {
    super("project_entity", com.zend.ide.l.e.class);
  }

  public void a(Object paramObject)
  {
    super.a(paramObject);
    l locall = (l)paramObject;
    String str = (String)locall.c();
    if (locall.c().equals("editor"))
      str = "editor_component";
    this.i = ((a)b.a(str));
    this.i.a(locall.b());
  }

  public Object a(com.a.e parame)
  {
    this.f = parame.a("ID");
    if (this.f.equals("editor"))
      this.f = "editor_component";
    this.i = ((a)b.a(this.f));
    if (this.i != null)
    {
      Object localObject = this.i.a(parame);
      return new com.zend.ide.l.e(localObject, this.f);
    }
    return null;
  }

  public com.a.e e()
  {
    com.a.e locale1 = new com.a.e();
    l locall = (l)c();
    locale1.a("ID", (String)locall.c());
    com.a.e locale2 = this.i.e();
    Attributes localAttributes = locale2.c();
    if (localAttributes != null)
    {
      int j = localAttributes.getLength();
      for (int k = 0; k < j; k++)
        locale1.a(localAttributes.getLocalName(k), localAttributes.getValue(k));
    }
    locale1.a(locale2.b());
    return locale1;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.l.a.k
 * JD-Core Version:    0.6.0
 */