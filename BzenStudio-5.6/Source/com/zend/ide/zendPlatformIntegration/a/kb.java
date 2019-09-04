package com.zend.ide.zendPlatformIntegration.a;

import com.zend.ide.zendPlatformIntegration.b.b.f;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JTable;
import javax.swing.JTree;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;
import javax.swing.tree.TreeModel;

public class kb extends JTree
  implements TableCellRenderer
{
  protected int a;
  private DefaultTableCellRenderer b = new DefaultTableCellRenderer();
  final jb c;

  public kb(jb paramjb, TreeModel paramTreeModel)
  {
    super(paramTreeModel);
  }

  public void setBounds(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.setBounds(paramInt1, 0, paramInt3, this.c.getHeight());
  }

  public void paint(Graphics paramGraphics)
  {
    paramGraphics.translate(0, -this.a * getRowHeight());
    super.paint(paramGraphics);
  }

  public Component getTableCellRendererComponent(JTable paramJTable, Object paramObject, boolean paramBoolean1, boolean paramBoolean2, int paramInt1, int paramInt2)
  {
    Component localComponent = this.b.getTableCellRendererComponent(paramJTable, paramObject, paramBoolean1, paramBoolean2, paramInt1, paramInt2);
    int i = 5;
    if (paramInt2 == i)
    {
      String[] arrayOfString = f.a().f();
      String str = (String)paramObject;
      int j = 0;
      for (int k = 0; k < arrayOfString.length; k++)
      {
        if (!str.equals(arrayOfString[k]))
          continue;
        j = 1;
        break;
      }
      if (j == 0)
      {
        Font localFont = UIManager.getFont("Label.font").deriveFont(1);
        localComponent.setFont(localFont);
      }
    }
    return this.b;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.zendPlatformIntegration.a.kb
 * JD-Core Version:    0.6.0
 */