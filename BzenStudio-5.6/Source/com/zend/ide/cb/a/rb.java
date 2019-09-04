package com.zend.ide.cb.a;

import com.zend.ide.cb.c.w;
import com.zend.ide.cb.q;
import com.zend.ide.util.ct;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.table.TableColumn;

class rb extends AbstractAction
{
  final pd a;

  public rb(pd parampd)
  {
    super(ct.a(1472));
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    if (pd.l(this.a) != null)
    {
      String str = a();
      if (str == null)
        pd.c(this.a).a(pd.l(this.a), ct.a(1473) + ct.a(1474), true);
      try
      {
        pd.l(this.a).c(str);
      }
      catch (NumberFormatException localNumberFormatException)
      {
        pd.c(this.a).a(pd.l(this.a), ct.a(1473) + ct.a(1474), true);
      }
      catch (Throwable localThrowable)
      {
        pd.c(this.a).b(pd.l(this.a), ct.a(1473) + localThrowable.getMessage(), true);
      }
    }
  }

  private String a()
  {
    int i = this.a.getSelectedRow();
    String str = pd.l(this.a).n();
    TableColumn[] arrayOfTableColumn = a(str);
    if ((arrayOfTableColumn == null) || (arrayOfTableColumn.length == 0))
      return null;
    StringBuffer localStringBuffer = new StringBuffer();
    for (int j = 0; j < arrayOfTableColumn.length; j++)
    {
      int k = arrayOfTableColumn[j].getModelIndex();
      Object localObject = this.a.getValueAt(i, k);
      if (localObject == null)
        continue;
      if (localStringBuffer.length() > 0)
        localStringBuffer.append(',');
      localStringBuffer.append(localObject.toString().trim());
    }
    if (localStringBuffer.length() == 0)
      return null;
    return localStringBuffer.toString();
  }

  private TableColumn[] a(String paramString)
  {
    if (paramString == null)
      return null;
    String[] arrayOfString = paramString.split(",");
    TableColumn[] arrayOfTableColumn = new TableColumn[arrayOfString.length];
    for (int i = 0; i < arrayOfTableColumn.length; i++)
      arrayOfTableColumn[i] = this.a.getColumn(arrayOfString[i]);
    return arrayOfTableColumn;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.a.rb
 * JD-Core Version:    0.6.0
 */