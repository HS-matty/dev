package com.zend.ide.s;

import com.zend.ide.b.d;
import java.util.ArrayList;
import javax.swing.ListModel;
import javax.swing.event.ListDataEvent;
import javax.swing.event.ListDataListener;

class w
  implements ListModel
{
  private ListDataEvent a = new ListDataEvent(this, 0, 0, 0);
  private int b = 0;
  private d[] c;
  private ArrayList d = new ArrayList(4);

  private w()
  {
  }

  private d[] c()
  {
    return this.c;
  }

  private void a(d[] paramArrayOfd)
  {
    this.c = paramArrayOfd;
    this.b = paramArrayOfd.length;
    b();
  }

  public int getSize()
  {
    return this.b;
  }

  public Object getElementAt(int paramInt)
  {
    return this.c[paramInt];
  }

  public void addListDataListener(ListDataListener paramListDataListener)
  {
    this.d.add(paramListDataListener);
  }

  public void removeListDataListener(ListDataListener paramListDataListener)
  {
    this.d.remove(paramListDataListener);
  }

  private void b()
  {
    for (int i = 0; i < this.d.size(); i++)
      ((ListDataListener)this.d.get(i)).contentsChanged(this.a);
  }

  w(b paramb)
  {
    this();
  }

  static void a(w paramw, d[] paramArrayOfd)
  {
    paramw.a(paramArrayOfd);
  }

  static d[] a(w paramw)
  {
    return paramw.c();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.s.w
 * JD-Core Version:    0.6.0
 */