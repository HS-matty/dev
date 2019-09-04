package com.zend.ide.h;

import com.zend.ide.util.cl;
import com.zend.ide.util.d.g;
import com.zend.ide.util.eo;
import com.zend.ide.util.es;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.Icon;

public class bg extends es
{
  protected String d = null;
  protected Icon e = null;
  protected String f = null;
  protected boolean g = true;
  protected boolean h = false;
  protected boolean i = false;
  protected boolean j = false;
  final be k;

  public bg(be parambe, Object paramObject, boolean paramBoolean)
  {
    super(parambe, paramObject, paramBoolean);
  }

  protected void g()
  {
    this.g = true;
    this.d = null;
    this.e = null;
    this.f = null;
  }

  public String toString()
  {
    if (this.d == null)
      this.d = h();
    return this.d;
  }

  protected String h()
  {
    return "ExplorerTreeNode for file: " + getUserObject().toString();
  }

  public Icon b(boolean paramBoolean)
  {
    if (this.e == null)
      this.e = c(paramBoolean);
    return this.e;
  }

  protected Icon c(boolean paramBoolean)
  {
    return null;
  }

  public void a(Object paramObject)
  {
    setUserObject(paramObject);
  }

  public String i()
  {
    if (this.g)
      j();
    return this.f;
  }

  protected void j()
  {
  }

  public boolean k()
  {
    if (this.g)
      j();
    return this.h;
  }

  public boolean l()
  {
    if (this.g)
      j();
    return this.i;
  }

  public boolean m()
  {
    if (this.g)
      j();
    return this.j;
  }

  public boolean n()
  {
    return true;
  }

  protected void a(ArrayList paramArrayList1, ArrayList paramArrayList2, g paramg)
  {
    super.a(paramArrayList1, paramArrayList2, paramg);
    if (paramArrayList1 != null)
    {
      Iterator localIterator = paramArrayList1.iterator();
      while (localIterator.hasNext())
        try
        {
          bg localbg = (bg)localIterator.next();
          this.k.f(localbg.getUserObject());
        }
        catch (Exception localException)
        {
          cl.a(localException);
        }
    }
  }

  protected void a(Object[] paramArrayOfObject)
  {
    ArrayList localArrayList = new ArrayList(paramArrayOfObject.length);
    for (int m = 0; m < paramArrayOfObject.length; m++)
    {
      bg localbg = this.k.e(paramArrayOfObject[m]);
      if (localbg == null)
        continue;
      localArrayList.add(localbg);
    }
    if (localArrayList.size() > 0)
      b(localArrayList);
  }

  protected void b(ArrayList paramArrayList)
  {
    a(paramArrayList, null, null);
  }

  protected void b(Object paramObject)
  {
    this.k.a(this, eo.b, false);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.h.bg
 * JD-Core Version:    0.6.0
 */