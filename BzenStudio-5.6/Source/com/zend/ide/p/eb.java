package com.zend.ide.p;

import com.zend.ide.p.ab.h;
import com.zend.ide.p.ab.o;
import java.util.Comparator;
import javax.swing.ListSelectionModel;
import javax.swing.table.TableModel;

public class eb extends bm
{
  protected h a;

  public eb()
  {
    d();
  }

  public eb(TableModel paramTableModel)
  {
    super(paramTableModel);
    d();
  }

  private void d()
  {
    o localo = (o)getModel();
    localo.a(getTableHeader());
    getSelectionModel().addListSelectionListener(localo.a(this));
  }

  public void setModel(TableModel paramTableModel)
  {
    o localo = (o)getModel();
    if (localo == null)
      localo = a();
    localo.a(paramTableModel);
    super.setModel(localo);
  }

  protected o a()
  {
    this.a = new h();
    o localo = new o(this.a);
    return localo;
  }

  public TableModel e()
  {
    o localo = (o)getModel();
    return localo.a();
  }

  public void a(int paramInt)
  {
    a(paramInt, 1);
  }

  public void a(int paramInt1, int paramInt2)
  {
    if ((paramInt2 != 1) && (paramInt2 != -1) && (paramInt2 != 0))
      throw new IllegalArgumentException("Direction must be ASCENDING, DESCENDING or NOT_SORTED.");
    ((o)getModel()).a(paramInt1, paramInt2);
  }

  public int b(int paramInt)
  {
    return ((o)getModel()).d(paramInt);
  }

  public void a(Class paramClass, Comparator paramComparator)
  {
    this.a.b(paramClass, paramComparator);
  }

  public void a(int paramInt, Comparator paramComparator)
  {
    this.a.a(paramInt, paramComparator);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.p.eb
 * JD-Core Version:    0.6.0
 */