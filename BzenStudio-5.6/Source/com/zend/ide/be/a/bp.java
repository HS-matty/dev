package com.zend.ide.be.a;

import com.zend.ide.be.h;
import com.zend.ide.be.i;
import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Rectangle;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JWindow;
import javax.swing.border.Border;

class bp extends JPanel
{
  private ArrayList a;
  private ArrayList b;
  private Border c;
  final f e;

  public bp(f paramf, boolean paramBoolean)
  {
    setLayout(new FlowLayout(paramBoolean ? 1 : 0, 0, 0));
    setOpaque(false);
    setBorder(f.d());
    this.c = (paramBoolean ? BorderFactory.createCompoundBorder(f.e(), BorderFactory.createEmptyBorder(12, 1, 12, 1)) : BorderFactory.createCompoundBorder(f.f(), BorderFactory.createEmptyBorder(1, 12, 1, 12)));
    this.a = new ArrayList();
    this.b = new ArrayList();
  }

  public void a(w paramw, i parami)
  {
    b();
    c(paramw, parami);
    a(paramw, parami.b);
    b(paramw, parami);
  }

  public void a(w paramw)
  {
    int i = this.a.size();
    for (int j = 0; j < i; j++)
    {
      if (paramw != this.a.get(j))
        continue;
      this.a.remove(j);
      this.b.remove(j);
      break;
    }
    JWindow localJWindow = f.a(this.e, paramw);
    localJWindow.setVisible(false);
    localJWindow.dispose();
    f.d(this.e).setIgnoreRepaint(true);
    f.d(this.e).remove(paramw.b());
    f.d(this.e).setIgnoreRepaint(false);
    a(paramw.c());
  }

  public void c(w paramw)
  {
    i locali = b(paramw);
    br localbr = paramw.c();
    localbr.a(locali, paramw.d().e());
    invalidate();
  }

  public void b(w paramw, i parami)
  {
    b();
    br localbr = paramw.c();
    localbr.a(parami, paramw.d().e());
    i locali = null;
    int i = this.a.size();
    for (int j = 0; j < i; j++)
    {
      if (paramw != this.a.get(j))
        continue;
      locali = (i)this.b.get(j);
      this.b.set(j, parami);
      break;
    }
    if (locali.e != parami.e)
      a(paramw, locali, parami);
    boolean bool = locali.b;
    if (parami.b)
    {
      if (!bool)
        a(paramw, true);
      localObject = f.a(this.e, paramw);
      ((JWindow)localObject).setBounds(parami.f);
      ((JWindow)localObject).setVisible(parami.a);
      return;
    }
    if (bool)
      a(paramw, false);
    Object localObject = paramw.b();
    f.d(this.e).remove((Component)localObject);
    if (parami.a)
      f.d(this.e).add((Component)localObject, parami);
  }

  private void a(w paramw, i parami1, i parami2)
  {
    int i = this.a.size();
    if (parami2.e == -1)
    {
      if (this.a.get(i - 1) == paramw)
      {
        parami2.e = parami1.e;
        return;
      }
      parami2.e = (((i)this.b.get(i - 1)).e + 1);
      a(paramw.c());
      a(paramw.c(), i);
      this.a.remove(paramw);
      this.b.remove(parami2);
      this.a.add(paramw);
      this.b.add(parami2);
      return;
    }
    this.a.remove(paramw);
    this.b.remove(parami2);
    for (int j = 0; j < this.b.size(); j++)
    {
      i locali = (i)this.b.get(j);
      if (locali.e >= parami2.e)
        break;
    }
    a(paramw.c());
    a(paramw.c(), j);
    if (j == this.b.size())
    {
      this.a.add(paramw);
      this.b.add(parami2);
      return;
    }
    this.a.add(j, paramw);
    this.b.add(j, parami2);
    for (int k = j + 1; k < this.a.size(); k++)
      ((i)this.b.get(k)).e += 1;
  }

  private void a(w paramw, boolean paramBoolean)
  {
    JComponent localJComponent = paramw.b();
    paramw.b(f.a(this.e));
    paramw.b(f.f(this.e));
    JWindow localJWindow = f.a(this.e, paramw);
    if (paramBoolean)
    {
      f.d(this.e).remove(localJComponent);
      localJWindow.getContentPane().add(localJComponent);
      paramw.a(f.f(this.e));
    }
    else
    {
      localJWindow.setVisible(false);
      paramw.a(f.a(this.e));
    }
  }

  public i b(w paramw)
  {
    b();
    int i = this.a.size();
    for (int j = 0; j < i; j++)
      if (paramw == this.a.get(j))
        return (i)this.b.get(j);
    return null;
  }

  private void c(w paramw, i parami)
  {
    int i = this.a.size();
    if (parami.e == -1)
      if (i == 0)
        parami.e = 0;
      else
        parami.e = (((i)this.b.get(i - 1)).e + 1);
    br localbr = paramw.c();
    localbr.a(parami, paramw.d().e());
    int j = 0;
    for (int k = 0; k < i; k++)
    {
      i locali = (i)this.b.get(k);
      if (parami.e < locali.e)
      {
        this.a.add(k, paramw);
        this.b.add(k, parami);
        a(localbr, k);
        return;
      }
      if (parami.e != locali.e)
        continue;
      locali.e += 1;
      w localw = (w)this.a.get(k);
      this.a.set(k, paramw);
      paramw = localw;
      this.b.set(k, parami);
      parami = locali;
      if (j != 0)
        continue;
      j = 1;
      a(localbr, k);
    }
    this.a.add(paramw);
    this.b.add(parami);
    if (j == 0)
      a(localbr, i);
    for (k = i; k >= 0; k--)
    {
      parami = (i)this.b.get(k);
      if ((!parami.a) || (parami.b))
        return;
      paramw = (w)this.a.get(k);
      f.b(this.e).a(paramw.b(), parami);
    }
  }

  private void b()
  {
    int i = this.a.size();
    for (int j = 0; j < i; j++)
    {
      i locali = (i)this.b.get(j);
      if (!locali.a)
        continue;
      w localw = (w)this.a.get(j);
      if (locali.b)
      {
        Rectangle localRectangle = f.a(this.e, localw).getBounds();
        if (!localRectangle.isEmpty())
          locali.f = localRectangle;
      }
      else
      {
        locali = f.b(this.e).a(localw.b());
        if (locali == null)
          continue;
        this.b.set(j, locali);
      }
    }
  }

  private void a(br parambr, int paramInt)
  {
    parambr.setBorder(this.c);
    if (paramInt > getComponentCount())
      add(parambr);
    else
      add(parambr, paramInt);
    if (getComponentCount() == 1)
      f.e(this.e).invalidate();
  }

  private void a(br parambr)
  {
    remove(parambr);
    if (getComponentCount() == 0)
      f.e(this.e).invalidate();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.be.a.bp
 * JD-Core Version:    0.6.0
 */