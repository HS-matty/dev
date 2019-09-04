package com.zend.ide.p.ab;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import javax.swing.Icon;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import javax.swing.text.JTextComponent;

public class n
{
  public static int a(JTable paramJTable)
  {
    return a(paramJTable, 20, 200);
  }

  public static int a(JTable paramJTable, int paramInt1, int paramInt2)
  {
    int i = paramJTable.getColumnCount();
    int j = 0;
    Dimension localDimension1 = paramJTable.getIntercellSpacing();
    if (i > 0)
    {
      int[] arrayOfInt = new int[i];
      for (int k = 0; k < i; k++)
      {
        arrayOfInt[k] = a(paramJTable, k, true, paramInt1, paramInt2);
        j += arrayOfInt[k];
      }
      j += (i - 1) * localDimension1.width;
      JTableHeader localJTableHeader = paramJTable.getTableHeader();
      Dimension localDimension2 = localJTableHeader.getPreferredSize();
      localDimension2.width = j;
      Dimension localDimension3 = paramJTable.getIntercellSpacing();
      Dimension localDimension4 = new Dimension();
      int m = paramJTable.getRowHeight();
      if (m == 0)
        m = 16;
      localDimension2.height += (m + localDimension3.height) * paramJTable.getRowCount();
      localDimension4.width = j;
      TableColumnModel localTableColumnModel = paramJTable.getColumnModel();
      for (int n = 0; n < i; n++)
      {
        TableColumn localTableColumn = localTableColumnModel.getColumn(n);
        localTableColumn.setPreferredWidth(arrayOfInt[n]);
      }
      paramJTable.invalidate();
      paramJTable.doLayout();
      paramJTable.repaint();
    }
    return j;
  }

  private static int a(JTable paramJTable, int paramInt1, boolean paramBoolean, int paramInt2, int paramInt3)
  {
    TableColumn localTableColumn = paramJTable.getColumnModel().getColumn(paramInt1);
    int i = 0;
    TableCellRenderer localTableCellRenderer;
    Component localComponent;
    Object localObject3;
    Object localObject4;
    Object localObject5;
    if (paramBoolean)
    {
      localTableCellRenderer = localTableColumn.getHeaderRenderer();
      Object localObject1;
      Object localObject2;
      if (localTableCellRenderer != null)
      {
        localComponent = localTableCellRenderer.getTableCellRendererComponent(paramJTable, localTableColumn.getHeaderValue(), false, false, 0, paramInt1);
        if ((localComponent instanceof JTextComponent))
        {
          localObject1 = (JTextComponent)localComponent;
          localObject2 = ((JTextComponent)localObject1).getText();
          localObject3 = ((JTextComponent)localObject1).getFont();
          localObject4 = ((JTextComponent)localObject1).getFontMetrics((Font)localObject3);
          i = SwingUtilities.computeStringWidth((FontMetrics)localObject4, (String)localObject2);
        }
        else if ((localComponent instanceof JLabel))
        {
          localObject1 = (JLabel)localComponent;
          localObject2 = ((JLabel)localObject1).getText();
          localObject3 = ((JLabel)localObject1).getFont();
          localObject4 = ((JLabel)localObject1).getFontMetrics((Font)localObject3);
          i = SwingUtilities.computeStringWidth((FontMetrics)localObject4, (String)localObject2);
          localObject5 = ((JLabel)localObject1).getIcon();
          if (localObject5 != null)
            i = ((Icon)localObject5).getIconWidth() + ((JLabel)localObject1).getIconTextGap();
        }
        else
        {
          i = localComponent.getPreferredSize().width;
        }
      }
      else
      {
        try
        {
          localObject1 = (String)localTableColumn.getHeaderValue();
          localObject2 = new JLabel((String)localObject1);
          localObject3 = ((JLabel)localObject2).getFont();
          localObject4 = ((JLabel)localObject2).getFontMetrics((Font)localObject3);
          i = SwingUtilities.computeStringWidth((FontMetrics)localObject4, (String)localObject1);
        }
        catch (ClassCastException localClassCastException)
        {
          i = 0;
        }
      }
    }
    if (i == 0)
      paramInt2 = 5;
    for (int k = 0; k < paramJTable.getRowCount(); k++)
    {
      localTableCellRenderer = paramJTable.getCellRenderer(k, paramInt1);
      localComponent = localTableCellRenderer.getTableCellRendererComponent(paramJTable, paramJTable.getValueAt(k, paramInt1), false, false, k, paramInt1);
      if ((localComponent instanceof JTextComponent))
      {
        localObject3 = (JTextComponent)localComponent;
        localObject4 = ((JTextComponent)localObject3).getText();
        localObject5 = ((JTextComponent)localObject3).getFont();
        FontMetrics localFontMetrics = ((JTextComponent)localObject3).getFontMetrics((Font)localObject5);
        int m = SwingUtilities.computeStringWidth(localFontMetrics, (String)localObject4);
        i = Math.max(i, m);
      }
      else
      {
        int j = localComponent.getPreferredSize().width;
        i = Math.max(i, j);
      }
    }
    return Math.min(i + paramInt2, paramInt3);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.p.ab.n
 * JD-Core Version:    0.6.0
 */