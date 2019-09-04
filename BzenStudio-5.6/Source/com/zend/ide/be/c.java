package com.zend.ide.be;

import java.util.Hashtable;
import java.util.Set;
import javax.swing.JComponent;

public abstract class c
  implements d
{
  private f a = new f();
  private Hashtable b = new Hashtable();

  protected f i()
  {
    return this.a;
  }

  public void a(e parame)
  {
    i().a(parame);
  }

  public void a(g paramg)
  {
    i().a(paramg);
  }

  public void a(String paramString, h paramh)
  {
    e(paramString);
    if (this.b.containsKey(paramString))
      throw new IllegalArgumentException("Cant add the same id twice");
    this.b.put(paramString, paramh);
    paramh.b().setName(paramString);
    i locali = b(paramString);
    if (locali == null)
      locali = paramh.f();
    a(paramString, paramh, locali);
    i().a(paramString);
  }

  public void a(String paramString)
    throws b
  {
    e(paramString);
    if (!this.b.containsKey(paramString))
      return;
    i().c(paramString);
    g(paramString);
    this.b.remove(paramString);
    i().b(paramString);
  }

  public String[] e()
  {
    String[] arrayOfString = new String[this.b.size()];
    this.b.keySet().toArray(arrayOfString);
    return arrayOfString;
  }

  protected h d(String paramString)
  {
    return (h)this.b.get(paramString);
  }

  public boolean c(String paramString)
  {
    e(paramString);
    f(paramString);
    i locali = b(paramString);
    return locali.a;
  }

  public void a(String paramString, boolean paramBoolean)
  {
    e(paramString);
    f(paramString);
    i locali = b(paramString);
    if (locali.a == paramBoolean)
      return;
    locali.a = paramBoolean;
    a(paramString, locali);
    i().a(paramString, paramBoolean);
  }

  protected static final void e(String paramString)
  {
    if ((paramString == null) || (paramString.equals("")))
      throw new IllegalArgumentException("ID cant be null or empty");
  }

  private void f(String paramString)
  {
    e(paramString);
    if (!this.b.containsKey(paramString))
      throw new IllegalArgumentException("unknown id = " + paramString);
  }

  protected abstract void a(String paramString, h paramh, i parami);

  protected abstract void g(String paramString);
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.be.c
 * JD-Core Version:    0.6.0
 */