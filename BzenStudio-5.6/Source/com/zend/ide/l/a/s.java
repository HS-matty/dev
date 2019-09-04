package com.zend.ide.l.a;

import com.a.a.a;
import com.a.e;
import com.a.h;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class s extends a
{
  com.a.a.b d = new com.a.a.b("memntos", new o());

  public s()
  {
    super("TreeSnapshot", com.zend.ide.p.fb.b.class);
  }

  public s(String paramString)
  {
    super(paramString, com.zend.ide.p.fb.b.class);
  }

  public void a(Object paramObject)
  {
    super.a(paramObject);
    if (paramObject != null)
      this.d.a(((com.zend.ide.p.fb.b)paramObject).a().toArray());
  }

  public Object a(e parame)
  {
    h localh = (h)parame.b().get(0);
    LinkedList localLinkedList = new LinkedList(Arrays.asList((Object[])(Object[])localh.b()));
    localh = (h)parame.b().get(1);
    Rectangle localRectangle = (Rectangle)localh.b();
    return new com.zend.ide.p.fb.b(localLinkedList, localRectangle);
  }

  public e e()
  {
    com.zend.ide.p.fb.b localb = (com.zend.ide.p.fb.b)c();
    e locale = new e();
    Rectangle localRectangle = localb.b();
    ArrayList localArrayList = new ArrayList(2);
    localArrayList.add(0, this.d);
    localArrayList.add(1, localRectangle);
    locale.a(localArrayList);
    return locale;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.l.a.s
 * JD-Core Version:    0.6.0
 */