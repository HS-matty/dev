package com.zend.ide.n;

import com.zend.ide.j.h;
import com.zend.ide.r.bo;
import com.zend.ide.r.o;
import com.zend.ide.r.p;
import com.zend.ide.r.r;
import com.zend.ide.util.bh;
import com.zend.ide.util.cl;
import com.zend.ide.util.ct;
import com.zend.ide.y.b;
import com.zend.ide.y.c;
import com.zend.ide.y.e;
import com.zend.ide.y.f;
import java.beans.PropertyChangeListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.event.EventListenerList;
import javax.swing.text.AbstractDocument.AbstractElement;
import javax.swing.text.AbstractDocument.Content;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.Element;
import javax.swing.text.GapContent;
import javax.swing.text.PlainDocument;

public class ho extends PlainDocument
  implements dz, com.zend.ide.util.cu, r
{
  private static bh a = bh.a;
  private static e b;
  private String c;
  private boolean d = false;
  private bh e = a;
  private cx f = new cx(this, null);
  public boolean g = false;
  private boolean h = true;
  private du i;
  private cv j = new cv(this);
  private String m = null;
  private pb o;
  private PropertyChangeListener k = new cu(this, null);
  private PropertyChangeListener p = new vd(this, null);
  private ArrayList l;
  private boolean n = true;

  public ho()
  {
    this(new GapContent(1024));
  }

  public ho(AbstractDocument.Content paramContent)
  {
    super(paramContent);
    addDocumentListener(this.f);
    Integer localInteger = (Integer)b.a("editing.tabSize").c();
    putProperty("tabSize", localInteger);
    i();
    p.e().a(this);
  }

  protected du a()
  {
    if (this.i == null)
      this.i = kc.a(this);
    return this.i;
  }

  private void i()
  {
    if (b != null)
    {
      b.a(this.p, "desktop.phpVersion");
      return;
    }
    f localf = new f();
    b = new e(localf);
    localf.a("editing.encoding", this.k);
    localf.a("desktop.phpVersion", this.p);
    b.a("editing.encoding");
    b.a("desktop.phpVersion");
  }

  public boolean m()
  {
    return this.g;
  }

  public boolean b()
  {
    int i1 = 0;
    if (Thread.currentThread() != getCurrentWriter())
    {
      writeLock();
      i1 = 1;
    }
    return i1;
  }

  protected AbstractDocument.AbstractElement createDefaultRoot()
  {
    he localhe = new he(this, null, null);
    Element localElement = createLeafElement(localhe, null, 0, 1);
    Element[] arrayOfElement = new Element[1];
    arrayOfElement[0] = localElement;
    localhe.replace(0, 0, arrayOfElement);
    return localhe;
  }

  private AbstractDocument.AbstractElement a(int paramInt)
  {
    if ((paramInt >= 0) && (paramInt < p()))
    {
      AbstractDocument.AbstractElement localAbstractElement1 = (AbstractDocument.AbstractElement)getDefaultRootElement();
      AbstractDocument.AbstractElement localAbstractElement2 = (AbstractDocument.AbstractElement)localAbstractElement1.getChildAt(paramInt);
      return localAbstractElement2;
    }
    return null;
  }

  public void a(int paramInt, String paramString, Object paramObject)
  {
    AbstractDocument.AbstractElement localAbstractElement = a(paramInt);
    if (localAbstractElement != null)
    {
      boolean bool = false;
      try
      {
        bool = b();
        localAbstractElement.addAttribute(paramString, paramObject);
      }
      catch (Exception localException)
      {
        cl.a(localException);
      }
      finally
      {
        if (bool)
          writeUnlock();
      }
    }
  }

  public void a(int paramInt, String paramString)
  {
    AbstractDocument.AbstractElement localAbstractElement = a(paramInt);
    if (localAbstractElement != null)
    {
      boolean bool = false;
      try
      {
        bool = b();
        localAbstractElement.removeAttribute(paramString);
      }
      catch (Exception localException)
      {
        cl.a(localException);
      }
      finally
      {
        if (bool)
          writeUnlock();
      }
    }
  }

  public void a(ea paramea)
  {
    if (this.l == null)
      this.l = new ArrayList(2);
    if (!this.l.contains(paramea))
      this.l.add(paramea);
  }

  public void b(ea paramea)
  {
    if (this.l != null)
      this.l.remove(paramea);
  }

  private static void a(String paramString1, String paramString2, List paramList)
  {
    if (paramList == null)
      return;
    synchronized (paramList)
    {
      int i1 = paramList.size();
      for (int i2 = 0; i2 < i1; i2++)
      {
        ea localea = (ea)paramList.get(i2);
        localea.a(paramString1, paramString2);
      }
    }
  }

  private static void a(String paramString, boolean paramBoolean, List paramList)
  {
    if (paramList == null)
      return;
    synchronized (paramList)
    {
      int i1 = paramList.size();
      for (int i2 = 0; i2 < i1; i2++)
      {
        ea localea = (ea)paramList.get(i2);
        localea.a(paramString, paramBoolean);
      }
    }
  }

  public void a(bo parambo)
  {
    this.i = kc.a(this);
    a(this.c, this.c, this.l);
  }

  public void a(o paramo)
  {
    this.i = kc.a(this);
  }

  public void c(o paramo)
  {
    this.i = kc.a(this);
  }

  protected Element createLeafElement(Element paramElement, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    return new hf(this, paramElement, paramAttributeSet, paramInt1, paramInt2);
  }

  protected Element createBranchElement(Element paramElement, AttributeSet paramAttributeSet)
  {
    return new hd(this, paramElement, paramAttributeSet);
  }

  public void c(boolean paramBoolean)
  {
    if (this.d == paramBoolean)
      return;
    this.d = paramBoolean;
    a(k(), paramBoolean, this.l);
    if (!paramBoolean)
      addDocumentListener(this.f);
  }

  public boolean l()
  {
    return this.d;
  }

  public void removeDocumentListener(DocumentListener paramDocumentListener)
  {
    super.removeDocumentListener(paramDocumentListener);
    if (((paramDocumentListener instanceof cs)) && (f() == 0))
    {
      d(this.c);
      removeDocumentListener(this.f);
      p.e().b(this);
    }
  }

  private void c(String paramString)
  {
    if (paramString != null)
    {
      this.m = paramString;
      File localFile = h.m.g(paramString);
      h.m.b(this.j, localFile);
      try
      {
        h.m.b(paramString, ct.a(253, paramString));
      }
      catch (IOException localIOException)
      {
        cl.a(localIOException);
      }
    }
  }

  private void d(String paramString)
  {
    if (paramString != null)
    {
      this.m = null;
      File localFile = h.m.g(paramString);
      h.m.c(this.j, localFile);
      h.m.r(paramString);
    }
  }

  public void b(String paramString)
  {
    if ((paramString == this.c) || ((paramString != null) && (this.c != null) && (paramString.equals(this.c))))
    {
      if ((paramString != null) && (this.m == null))
        c(this.c);
      return;
    }
    d(this.c);
    String str = this.c;
    this.c = paramString;
    c(this.c);
    a(str, this.c);
    if ((this.c == null) || (!this.c.equals(str)))
      a(str, this.c, this.l);
  }

  private void a(String paramString1, String paramString2)
  {
    String str1 = (paramString1 == null) || (paramString1.indexOf(".") == -1) ? null : paramString1.substring(paramString1.lastIndexOf(".") + 1);
    String str2 = (paramString2 == null) || (paramString2.indexOf(".") == -1) ? null : paramString2.substring(paramString2.lastIndexOf(".") + 1);
    if ((str1 == null) || (str2 == null) || (!str1.equals(str2)))
    {
      this.i = kc.a(this);
      return;
    }
  }

  public String k()
  {
    return this.c;
  }

  public void a(boolean paramBoolean)
  {
    this.n = paramBoolean;
  }

  public boolean a()
  {
    File localFile = h.m.g(this.c);
    long l1 = 0L;
    Object localObject = getProperty("lastModified");
    if (localObject != null)
      l1 = ((Long)localObject).longValue();
    return l1 != localFile.lastModified();
  }

  private void d()
  {
    if (!this.n)
      return;
    if (!a())
      return;
    if (!this.h)
      return;
    this.h = false;
    cs localcs = e();
    if (localcs != null)
      localcs.a(this);
    this.h = true;
  }

  protected void fireInsertUpdate(DocumentEvent paramDocumentEvent)
  {
    a().a(paramDocumentEvent);
    super.fireInsertUpdate(paramDocumentEvent);
  }

  protected void fireRemoveUpdate(DocumentEvent paramDocumentEvent)
  {
    a().a(paramDocumentEvent);
    super.fireRemoveUpdate(paramDocumentEvent);
  }

  public Object b(int paramInt)
    throws BadLocationException
  {
    try
    {
      readLock();
      Object localObject1 = a().b(paramInt);
      return localObject1;
    }
    finally
    {
      readUnlock();
    }
    throw localObject2;
  }

  public int c(int paramInt)
    throws BadLocationException
  {
    try
    {
      readLock();
      int i1 = a().a(paramInt);
      return i1;
    }
    finally
    {
      readUnlock();
    }
    throw localObject;
  }

  public void a(bh parambh)
  {
    this.e = parambh;
  }

  public bh n()
  {
    return this.e;
  }

  public Document getDocument()
  {
    return this;
  }

  public String getText()
  {
    String str;
    try
    {
      str = getText(0, getLength());
    }
    catch (BadLocationException localBadLocationException)
    {
      str = null;
    }
    return str;
  }

  public int getLineStartOffset(int paramInt)
    throws BadLocationException
  {
    Element localElement = getDefaultRootElement();
    int i1 = localElement.getElementCount();
    if (paramInt < 0)
      throw new BadLocationException("Negative line", -1);
    if (paramInt >= i1)
      throw new BadLocationException("No such line", getLength() + 1);
    return localElement.getElement(paramInt).getStartOffset();
  }

  public int getLineOfOffset(int paramInt)
    throws BadLocationException
  {
    if (paramInt < 0)
      throw new BadLocationException("Can't translate offset to line", -1);
    if (paramInt > getLength())
      throw new BadLocationException("Can't translate offset to line", getLength() + 1);
    return getDefaultRootElement().getElementIndex(paramInt);
  }

  public int p()
  {
    return getDefaultRootElement().getElementCount();
  }

  private cs e()
  {
    Object[] arrayOfObject = this.listenerList.getListenerList();
    for (int i1 = 0; i1 < arrayOfObject.length; i1++)
      if ((arrayOfObject[i1] instanceof cs))
        return (cs)arrayOfObject[i1];
    return null;
  }

  public int f()
  {
    int i1 = 0;
    Object[] arrayOfObject = this.listenerList.getListenerList();
    for (int i2 = 0; i2 < arrayOfObject.length; i2++)
    {
      if (!(arrayOfObject[i2] instanceof cs))
        continue;
      i1++;
    }
    return i1;
  }

  public pb a()
  {
    if (this.o == null)
      this.o = new nb();
    return this.o;
  }

  static void b(ho paramho, DocumentEvent paramDocumentEvent)
  {
    paramho.fireChangedUpdate(paramDocumentEvent);
  }

  static void c(ho paramho, DocumentEvent paramDocumentEvent)
  {
    paramho.fireChangedUpdate(paramDocumentEvent);
  }

  static void d(ho paramho, DocumentEvent paramDocumentEvent)
  {
    paramho.fireChangedUpdate(paramDocumentEvent);
  }

  static void a(ho paramho, DocumentEvent paramDocumentEvent)
  {
    paramho.fireChangedUpdate(paramDocumentEvent);
  }

  static void a(ho paramho, String paramString)
  {
    paramho.d(paramString);
  }

  static void a(ho paramho)
  {
    paramho.d();
  }

  static bh a(bh parambh)
  {
    a = parambh;
    return parambh;
  }

  static du b(ho paramho)
  {
    return paramho.i;
  }

  static du a(ho paramho, du paramdu)
  {
    return paramho.i = paramdu;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.ho
 * JD-Core Version:    0.6.0
 */