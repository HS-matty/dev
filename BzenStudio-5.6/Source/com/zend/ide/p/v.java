package com.zend.ide.p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;
import javax.swing.DefaultListModel;

public class v extends DefaultListModel
{
  private ArrayList a = new ArrayList();
  private Vector b = new Vector();
  final bc c;

  public v(bc parambc)
  {
  }

  protected boolean a(Object paramObject)
  {
    while ((paramObject instanceof m))
      paramObject = ((m)paramObject).b();
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext())
    {
      l locall = (l)localIterator.next();
      if (!locall.a(paramObject))
        return false;
    }
    return true;
  }

  public void a(l paraml)
  {
    if (!this.a.contains(paraml))
    {
      this.a.add(paraml);
      b();
    }
  }

  public void b(l paraml)
  {
    if (this.a.contains(paraml))
    {
      this.a.remove(paraml);
      b();
    }
  }

  protected void b()
  {
    Iterator localIterator = this.b.iterator();
    int i = 0;
    while (localIterator.hasNext())
    {
      Object localObject = localIterator.next();
      if (!a(localObject))
      {
        super.removeElement(localObject);
        continue;
      }
      if (i == getSize())
        super.addElement(localObject);
      else if (!localObject.equals(get(i)))
        super.insertElementAt(localObject, i);
      i++;
    }
  }

  protected boolean b(Object paramObject)
  {
    return true;
  }

  protected boolean a(int paramInt, Object paramObject)
  {
    if (b(paramObject))
    {
      if (paramInt == getSize())
        this.b.add(paramObject);
      else
        this.b.add(paramInt, paramObject);
      if (a(paramObject))
        return true;
    }
    return false;
  }

  public void setElementAt(Object paramObject, int paramInt)
  {
    removeElementAt(paramInt);
    insertElementAt(paramObject, paramInt);
  }

  public void insertElementAt(Object paramObject, int paramInt)
  {
    if (a(paramInt, paramObject))
      super.insertElementAt(paramObject, paramInt);
  }

  public void addElement(Object paramObject)
  {
    if (a(getSize(), paramObject))
      super.addElement(paramObject);
  }

  public Object set(int paramInt, Object paramObject)
  {
    Object localObject = remove(paramInt);
    insertElementAt(paramObject, paramInt);
    return localObject;
  }

  public void add(int paramInt, Object paramObject)
  {
    if (a(paramInt, paramObject))
      super.add(paramInt, paramObject);
  }

  public void setSize(int paramInt)
  {
    super.setSize(paramInt);
    this.b.setSize(paramInt);
  }

  public void removeElementAt(int paramInt)
  {
    this.b.removeElement(getElementAt(paramInt));
    super.removeElementAt(paramInt);
  }

  public boolean removeElement(Object paramObject)
  {
    this.b.removeElement(paramObject);
    return super.removeElement(paramObject);
  }

  public void removeAllElements()
  {
    this.b.removeAllElements();
    super.removeAllElements();
  }

  public Object remove(int paramInt)
  {
    this.b.remove(getElementAt(paramInt));
    return super.remove(paramInt);
  }

  public void clear()
  {
    super.clear();
    this.b.clear();
  }

  public void removeRange(int paramInt1, int paramInt2)
  {
    int i = this.b.indexOf(getElementAt(paramInt1));
    int j = this.b.indexOf(getElementAt(paramInt2));
    for (int k = j; k >= i; k--)
      this.b.removeElementAt(k);
    super.removeRange(paramInt1, paramInt2);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.p.v
 * JD-Core Version:    0.6.0
 */