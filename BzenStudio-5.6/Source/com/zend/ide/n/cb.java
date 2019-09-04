package com.zend.ide.n;

import com.zend.ide.i.n;
import com.zend.ide.j.h;
import com.zend.ide.n.a.e;
import com.zend.ide.n.a.m;
import com.zend.ide.p.ba;
import com.zend.ide.p.e.b;
import com.zend.ide.util.cl;
import com.zend.ide.util.ct;
import com.zend.ide.util.cu;
import com.zend.ide.util.s;
import com.zend.ide.y.i;
import java.awt.Container;
import java.awt.Frame;
import java.io.File;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.Element;

public class cb extends ca
  implements ac, cu
{
  private m f;
  private n g;
  private sc e;
  private boolean s = false;
  private Hashtable h = new Hashtable();
  private jd d = new jd(this);

  public cb()
  {
    super("BookmarksTool");
  }

  protected void a(bw parambw)
  {
    this.f = new hc(this, "bookmark", parambw);
    this.f.a(b.c);
    s locals = (s)parambw.q();
    ActionMap localActionMap = parambw.c().getActionMap();
    Object localObject = new fc(this, null);
    localActionMap.put("removeAllBookmarksAction", (Action)localObject);
    locals.a("keys.removeAllBookmarks", (Action)localObject, "editor", false);
    locals.a("keys.removeAllBookmarks", (Action)localObject, "textComponent", false);
    localObject = new ff(this, null);
    localActionMap.put("toggleBookmarkAction", (Action)localObject);
    locals.a("keys.toggleBookmark", (Action)localObject, "textComponent", false);
    localObject = new ez(this, null);
    localActionMap.put("gotoNextBookmarkAction", (Action)localObject);
    locals.a("keys.gotoNextBookmark", (Action)localObject, "editor", false);
    locals.a("keys.gotoNextBookmark", (Action)localObject, "textComponent", false);
    localObject = new fa(this, null);
    localActionMap.put("gotoNextProjectBookmarkAction", (Action)localObject);
    locals.a("keys.gotoNextProjectBookmark", (Action)localObject, "editor", false);
    locals.a("keys.gotoNextProjectBookmark", (Action)localObject, "textComponent", false);
    localObject = new fb(this, null);
    localActionMap.put("openBookmarksDialogAction", (Action)localObject);
    locals.a("keys.openBookmarksDialog", (Action)localObject, "editor", false);
    locals.a("keys.openBookmarksDialog", (Action)localObject, "textComponent", false);
    a().a(this.d);
  }

  public bw a()
  {
    return b();
  }

  public m b()
  {
    return this.f;
  }

  public JDialog c()
  {
    return this.g;
  }

  public it a(co paramco)
  {
    return (it)this.h.get(paramco);
  }

  private sc a()
  {
    if (this.e == null)
      this.e = new sc(this);
    return this.e;
  }

  protected void d()
  {
    c().a("phpEditorPane.removeAllBookmarks", "removeAllBookmarksAction");
    c().a("phpEditorPane.toggleBookmark", "toggleBookmarkAction");
    c().a("phpEditorPane.gotoNextBookmark", "gotoNextBookmarkAction");
    c().a("phpEditorPane.gotoNextProjectBookmark", "gotoNextProjectBookmarkAction");
    c().a("phpEditorPane.openBookmarksDialog", "openBookmarksDialogAction");
  }

  public Object e()
  {
    List localList = this.f.m();
    co[] arrayOfco = new co[localList.size()];
    localList.toArray(arrayOfco);
    u localu = new u();
    localu.a(arrayOfco);
    return localu;
  }

  public void b(Object paramObject)
  {
    this.f.b();
    this.h.clear();
    u localu = (u)paramObject;
    co[] arrayOfco = localu.b();
    if (arrayOfco == null)
      return;
    for (int i = 0; i < arrayOfco.length; i++)
      this.f.a(arrayOfco[i]);
  }

  private void h()
  {
    sc localsc = a();
    if (this.g == null)
    {
      this.g = new v(this, (Frame)a().c().getTopLevelAncestor(), ct.a(819), true, localsc);
      this.g.getContentPane().add(localsc);
      this.g.pack();
      this.g.B();
    }
    this.g.setVisible(true);
    this.g.requestFocus();
    localsc.requestFocus();
  }

  private void a(int paramInt)
  {
    try
    {
      a().d(a().getLineStartOffset(paramInt));
    }
    catch (BadLocationException localBadLocationException)
    {
      a().a(paramInt, true);
    }
  }

  private void a()
  {
    int i = a().a();
    b(i);
  }

  private void b(int paramInt)
  {
    String str1 = a().k();
    co localco1 = (co)this.f.a(str1, paramInt);
    if (localco1 == null)
    {
      com.zend.ide.bc.c.a().a("add_bookmark");
      co localco2 = new co(str1, paramInt);
      Document localDocument = a().getDocument();
      Element localElement1 = localDocument.getDefaultRootElement();
      Element localElement2 = localElement1.getElement(paramInt);
      int i = localElement2.getStartOffset();
      int j = localElement2.getEndOffset();
      if (i < j)
        try
        {
          String str2 = localDocument.getText(i, j - i).trim();
          if (!str2.equals(""))
            localco2.b(str2);
        }
        catch (BadLocationException localBadLocationException)
        {
          cl.a(localBadLocationException);
        }
      this.f.a(localco2);
    }
    else
    {
      this.f.b(localco1);
      this.h.remove(localco1);
    }
  }

  private e a(boolean paramBoolean1, int paramInt, boolean paramBoolean2)
  {
    bw localbw = a();
    paramInt = paramInt == -1 ? localbw.d() : paramInt;
    if (paramBoolean1)
      return a(localbw, paramInt, paramBoolean2);
    e locale = a(localbw, paramInt, true);
    if (locale == null)
    {
      String str = this.f.a(localbw.k());
      if (str == null)
        return null;
      if (h.m.g(str).exists())
      {
        localbw.a(str, null, -1);
        localbw.a(0, true);
        this.s = true;
        locale = a(false, -1, paramBoolean2);
      }
      else
      {
        dz localdz = localbw.a(str);
        if (localdz != null)
        {
          locale = a(localdz, 0, true);
        }
        else
        {
          int i = ba.a(com.zend.ide.bd.c.b().h(), ct.a(861, str), ct.a(94), 0, 0);
          if (i == 0)
            this.f.a(str);
        }
      }
    }
    return locale;
  }

  private e a(dz paramdz, int paramInt, boolean paramBoolean)
  {
    String str = paramdz.k();
    List localList = this.f.b(str);
    if (localList.isEmpty())
      return null;
    Iterator localIterator = localList.iterator();
    while (localIterator.hasNext())
    {
      e locale = (e)localIterator.next();
      if ((locale.b() == 0) && (this.s))
      {
        this.s = false;
        return locale;
      }
      if (locale.b() > paramdz.p() - 1)
      {
        this.f.b(locale);
        return a(paramdz, paramInt, paramBoolean);
      }
      if (locale.b() > paramInt)
        return locale;
    }
    this.s = false;
    if (!paramBoolean)
      return (e)localList.get(0);
    return null;
  }

  static Hashtable d(cb paramcb)
  {
    return paramcb.h;
  }

  static void a(cb paramcb, int paramInt)
  {
    paramcb.b(paramInt);
  }

  static void a(cb paramcb)
  {
    paramcb.h();
  }

  static m b(cb paramcb)
  {
    return paramcb.f;
  }

  static void c(cb paramcb)
  {
    paramcb.a();
  }

  static e a(cb paramcb, boolean paramBoolean1, int paramInt, boolean paramBoolean2)
  {
    return paramcb.a(paramBoolean1, paramInt, paramBoolean2);
  }

  static void b(cb paramcb, int paramInt)
  {
    paramcb.a(paramInt);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.cb
 * JD-Core Version:    0.6.0
 */