package com.zend.ide.desktop;

import com.zend.ide.be.l;
import com.zend.ide.k.c;
import com.zend.ide.k.e;
import com.zend.ide.k.f;
import com.zend.ide.util.bb;
import com.zend.ide.util.bn;
import com.zend.ide.util.bp;
import com.zend.ide.util.bs;
import com.zend.ide.util.bt;
import com.zend.ide.util.cu;
import com.zend.ide.util.s;
import com.zend.ide.y.i;
import java.util.Hashtable;
import java.util.Vector;
import javax.swing.ActionMap;
import javax.swing.JComponent;

public class fa
  implements cu, c
{
  private l a;
  private Hashtable b;
  private i c;
  private fc d;
  private String e = "messagesComponent";
  private bt f;

  public fa(l paraml)
  {
    this.a = paraml;
    this.b = new Hashtable(5);
    i();
    h();
    paraml.a(this.d);
  }

  public void a(e parame, String paramString)
  {
    bp.a(parame);
    parame.a(this);
    parame.q().a(q());
    f localf = parame.x();
    localf.a(this.d);
    a(localf.m(), parame);
    if (localf.c())
    {
      ActionMap localActionMap = localf.g().getActionMap();
      if (localActionMap.get("closeMessageComponentActionKey") == null)
      {
        ff localff = new ff(this, parame);
        localActionMap.put("closeMessageComponentActionKey", localff);
        ((s)parame.q()).a("keys.closeMessageComponent", localff, "default", true);
      }
    }
    this.a.a(localf.b(), localf.f(), localf.g(), localf.e(), paramString);
  }

  public void b(e parame)
  {
    f localf = parame.x();
    if (localf.c())
    {
      this.a.e(localf.b());
      b(localf.m(), parame);
      localf.b(this.d);
    }
  }

  public e a(Object paramObject)
  {
    Object localObject = this.b.get(paramObject);
    if ((localObject != null) && (((Vector)localObject).size() > 0))
      return (e)((Vector)localObject).lastElement();
    return null;
  }

  public e b()
  {
    return (e)this.a.g();
  }

  public void c(e parame)
  {
    this.a.a(parame.x().g());
  }

  private void a(Object paramObject, e parame)
  {
    Object localObject = this.b.get(paramObject);
    if (localObject != null)
    {
      ((Vector)localObject).add(parame);
    }
    else
    {
      Vector localVector = new Vector();
      localVector.add(parame);
      this.b.put(paramObject, localVector);
    }
  }

  private void b(Object paramObject, e parame)
  {
    Object localObject = this.b.get(paramObject);
    if ((localObject != null) && (((Vector)localObject).size() > 0))
      ((Vector)localObject).remove(parame);
  }

  private void d()
  {
    b().x().h();
  }

  private void e()
  {
    b().x().i();
  }

  private void f()
  {
    b().x().j();
  }

  private void g()
  {
    b().x().d();
  }

  private void h()
  {
    this.c = new i(c());
    this.c.a("application.openNextEntry", "openNextEntryActionKey", 2);
    this.c.a("application.closeMessageComponent", "closeMessageComponentActionKey", 1);
  }

  private void i()
  {
    this.d = new fc(this);
    this.f = new bt(this);
  }

  public boolean d(boolean paramBoolean)
  {
    return true;
  }

  public bb q()
  {
    return this.d;
  }

  public JComponent c()
  {
    return this.a.b();
  }

  public void d(String paramString)
  {
    this.e = paramString;
  }

  public String r()
  {
    return this.e;
  }

  public String a(int paramInt1, int paramInt2)
  {
    return r();
  }

  public void a(bn parambn)
  {
    q().a(parambn.q());
  }

  public Object s()
  {
    return null;
  }

  public void c(Object paramObject)
  {
  }

  public bs t()
  {
    return this.f;
  }

  static String a(fa paramfa)
  {
    return paramfa.e;
  }

  static fc a(fa paramfa)
  {
    return paramfa.d;
  }

  static void c(fa paramfa)
  {
    paramfa.d();
  }

  static void d(fa paramfa)
  {
    paramfa.e();
  }

  static void e(fa paramfa)
  {
    paramfa.f();
  }

  static void b(fa paramfa)
  {
    paramfa.g();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.fa
 * JD-Core Version:    0.6.0
 */