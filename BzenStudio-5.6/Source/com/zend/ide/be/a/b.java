package com.zend.ide.be.a;

import com.zend.ide.be.c;
import com.zend.ide.be.h;
import com.zend.ide.be.i;
import com.zend.ide.be.j;
import com.zend.ide.be.k;
import com.zend.ide.be.l;
import com.zend.ide.util.cl;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.util.Hashtable;
import java.util.Set;
import javax.swing.Icon;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JToolBar;

public class b extends c
{
  private f c = new f(this);
  private Hashtable d = new Hashtable();
  private Hashtable e = new Hashtable();
  private bj f;
  private JToolBar g;
  private JMenuBar h;
  private o i;

  public b()
  {
    h();
    Container localContainer = this.f.getContentPane();
    localContainer.add(this.c.b());
    this.g = new JToolBar(0);
    this.g.setLayout(new FlowLayout(3, 2, 0));
    this.g.setFloatable(false);
    this.g.setRollover(true);
    localContainer.add(this.g, "North");
    this.h = new bk(null);
    this.f.setJMenuBar(this.h);
    bs localbs = new bs();
    this.i = new o(localbs);
    localContainer.add(localbs, "South");
  }

  private void h()
  {
    this.f = new bj();
    Dimension localDimension = Toolkit.getDefaultToolkit().getScreenSize();
    this.f.setSize(localDimension.width * 8 / 9, localDimension.height * 8 / 9);
    this.f.setLocationRelativeTo(null);
    this.f.setState(6);
    this.f.validate();
  }

  public JFrame b()
  {
    return this.f;
  }

  public JToolBar c()
  {
    return this.g;
  }

  public JMenuBar d()
  {
    return this.h;
  }

  protected void a(String paramString, h paramh, i parami)
  {
    w localw = new w(this, paramString, paramh);
    this.d.put(paramString, localw);
    this.c.a(localw, parami);
  }

  protected void g(String paramString)
  {
    w localw = (w)this.d.get(paramString);
    i locali = f.d(localw);
    if (locali != null)
      this.e.put(paramString, locali);
    this.c.a(localw);
    this.d.remove(paramString);
  }

  public i b(String paramString)
  {
    i locali = null;
    w localw = (w)this.d.get(paramString);
    if (localw != null)
      locali = f.d(localw);
    if (locali == null)
      locali = (i)this.e.get(paramString);
    if (locali != null)
      locali = (i)locali.clone();
    return locali;
  }

  public void a(String paramString, i parami)
  {
    e(paramString);
    parami = (i)parami.clone();
    this.e.put(paramString, parami);
    h localh = d(paramString);
    if (localh == null)
      return;
    w localw = (w)this.d.get(paramString);
    this.c.b(localw, parami);
  }

  public Object f()
  {
    String[] arrayOfString = a();
    i[] arrayOfi = new i[arrayOfString.length];
    for (int j = 0; j < arrayOfString.length; j++)
      arrayOfi[j] = b(arrayOfString[j]);
    Object[] arrayOfObject = new Object[4];
    arrayOfObject[0] = arrayOfString;
    arrayOfObject[1] = arrayOfi;
    arrayOfObject[2] = b().getBounds();
    arrayOfObject[3] = this.c.c();
    return arrayOfObject;
  }

  private String[] a()
  {
    String[] arrayOfString = new String[this.e.size()];
    this.e.keySet().toArray(arrayOfString);
    return arrayOfString;
  }

  public void a(Object paramObject)
  {
    try
    {
      Object[] arrayOfObject = (Object[])(Object[])paramObject;
      String[] arrayOfString = (String[])(String[])arrayOfObject[0];
      i[] arrayOfi = (i[])(i[])arrayOfObject[1];
      Rectangle localRectangle = (Rectangle)arrayOfObject[2];
      bd localbd = (bd)arrayOfObject[3];
      for (int j = 0; j < arrayOfString.length; j++)
        a(arrayOfString[j], arrayOfi[j]);
      b().setBounds(localRectangle);
      this.c.a(localbd);
    }
    catch (Exception localException)
    {
      cl.a("Unsupported desktop snapshot");
    }
  }

  public void a(String paramString1, String paramString2)
  {
    h localh = d(paramString1);
    if ((localh instanceof bl))
    {
      ((bl)localh).f(paramString2);
      w localw = (w)this.d.get(paramString1);
      this.c.g(localw);
    }
  }

  public void a(String paramString, Icon paramIcon)
  {
    h localh = d(paramString);
    if ((localh instanceof bl))
    {
      ((bl)localh).b(paramIcon);
      w localw = (w)this.d.get(paramString);
      this.c.g(localw);
    }
  }

  public void b(String paramString1, String paramString2)
  {
    h localh = d(paramString1);
    if ((localh instanceof bl))
    {
      ((bl)localh).g(paramString2);
      w localw = (w)this.d.get(paramString1);
      this.c.g(localw);
    }
  }

  public j a(String paramString1, Icon paramIcon, String paramString2, JComponent paramJComponent, boolean paramBoolean, i parami, String paramString3)
  {
    return new bn(paramString1, paramIcon, paramString2, paramBoolean, parami, paramJComponent, paramString3);
  }

  public l a(String paramString1, Icon paramIcon, String paramString2, boolean paramBoolean, i parami)
  {
    return new bo(paramString1, paramIcon, paramBoolean, parami, paramString2);
  }

  public k g()
  {
    return this.i;
  }

  public h a(String paramString)
  {
    if (!this.d.containsKey(paramString))
      throw new IllegalArgumentException("No such window with the given id - " + paramString);
    w localw = (w)this.d.get(paramString);
    return localw.d();
  }

  public boolean b(String paramString)
  {
    return this.d.containsKey(paramString);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.be.a.b
 * JD-Core Version:    0.6.0
 */