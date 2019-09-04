package com.zend.ide.n;

import java.util.ArrayList;
import java.util.List;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class ej
  implements DocumentListener, ea
{
  protected dz a;
  protected List b;
  protected List c;

  public ej(dz paramdz)
  {
    this.a = paramdz;
  }

  public void b(dz paramdz)
  {
    paramdz.addDocumentListener(this);
    paramdz.a(this);
  }

  public void c(dz paramdz)
  {
    paramdz.removeDocumentListener(this);
    paramdz.b(this);
  }

  public void insertUpdate(DocumentEvent paramDocumentEvent)
  {
    a(paramDocumentEvent, this.b);
  }

  public void removeUpdate(DocumentEvent paramDocumentEvent)
  {
    b(paramDocumentEvent, this.b);
  }

  public void changedUpdate(DocumentEvent paramDocumentEvent)
  {
    c(paramDocumentEvent, this.b);
  }

  protected static final void a(DocumentEvent paramDocumentEvent, List paramList)
  {
    if (paramList != null)
      synchronized (paramList)
      {
        int i = paramList.size();
        for (int j = 0; j < i; j++)
        {
          DocumentListener localDocumentListener = (ea)paramList.get(j);
          localDocumentListener.insertUpdate(paramDocumentEvent);
        }
      }
  }

  protected static final void b(DocumentEvent paramDocumentEvent, List paramList)
  {
    if (paramList != null)
      synchronized (paramList)
      {
        int i = paramList.size();
        for (int j = 0; j < i; j++)
        {
          DocumentListener localDocumentListener = (ea)paramList.get(j);
          localDocumentListener.removeUpdate(paramDocumentEvent);
        }
      }
  }

  protected static final void c(DocumentEvent paramDocumentEvent, List paramList)
  {
    if (paramList != null)
      synchronized (paramList)
      {
        int i = paramList.size();
        for (int j = 0; j < i; j++)
        {
          DocumentListener localDocumentListener = (ea)paramList.get(j);
          localDocumentListener.changedUpdate(paramDocumentEvent);
        }
      }
  }

  public void a(DocumentListener paramDocumentListener)
  {
    if (this.b == null)
      this.b = new ArrayList(2);
    synchronized (this.b)
    {
      if (!this.b.contains(paramDocumentListener))
        this.b.add(paramDocumentListener);
    }
  }

  public void b(DocumentListener paramDocumentListener)
  {
    if (this.b != null)
      this.b.remove(paramDocumentListener);
  }

  public void a(ea paramea)
  {
    if (this.c == null)
      this.c = new ArrayList(2);
    if (!this.c.contains(paramea))
      this.c.add(paramea);
  }

  public void b(ea paramea)
  {
    if (this.c != null)
      this.c.remove(paramea);
  }

  public void a(String paramString1, String paramString2)
  {
    a(paramString1, paramString2, this.c);
  }

  public void a(String paramString, boolean paramBoolean)
  {
    a(paramString, paramBoolean, this.c);
  }

  protected static final void a(String paramString1, String paramString2, List paramList)
  {
    if (paramList != null)
      synchronized (paramList)
      {
        int i = paramList.size();
        for (int j = 0; j < i; j++)
        {
          ea localea = (ea)paramList.get(j);
          localea.a(paramString1, paramString2);
        }
      }
  }

  protected static final void a(String paramString, boolean paramBoolean, List paramList)
  {
    if (paramList != null)
      synchronized (paramList)
      {
        int i = paramList.size();
        for (int j = 0; j < i; j++)
        {
          ea localea = (ea)paramList.get(j);
          localea.a(paramString, paramBoolean);
        }
      }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.ej
 * JD-Core Version:    0.6.0
 */