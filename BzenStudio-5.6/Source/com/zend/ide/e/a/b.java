package com.zend.ide.e.a;

import com.zend.ide.p.cd;
import com.zend.ide.util.cu;
import com.zend.ide.y.g;
import com.zend.ide.y.h;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.KeyStroke;

public abstract class b
  implements a, cu
{
  protected int a = 0;
  protected String b = "";
  private JScrollPane c;

  public JComponent e()
  {
    this.c = new cd(d());
    this.c.setBackground(Color.white);
    this.c.setBorder(BorderFactory.createEmptyBorder(3, 3, 3, 3));
    return this.c;
  }

  public abstract JComponent d();

  public String a(String paramString)
  {
    KeyStroke localKeyStroke = (KeyStroke)g.a(paramString).d();
    int i = localKeyStroke.getModifiers();
    int j = localKeyStroke.getKeyCode();
    String str = KeyEvent.getKeyText(j);
    if (!a(i, j))
      str = KeyEvent.getKeyModifiersText(i) + "-" + str;
    return str;
  }

  private static boolean a(int paramInt1, int paramInt2)
  {
    return (paramInt1 == 0) && (paramInt2 >= 112) && (paramInt2 <= 123);
  }

  public int b()
  {
    return this.a;
  }

  public String c()
  {
    return this.b;
  }

  public void b(String paramString)
  {
    this.b = paramString;
  }

  public void a(int paramInt)
  {
    this.a = paramInt;
  }

  public String toString()
  {
    return c();
  }

  public JPanel a(String paramString, ImageIcon[] paramArrayOfImageIcon)
  {
    JPanel localJPanel = new JPanel(new BorderLayout());
    JTextArea localJTextArea = new JTextArea(paramString);
    localJTextArea.setWrapStyleWord(true);
    localJTextArea.setFocusable(false);
    localJTextArea.setEditable(false);
    localJTextArea.setLineWrap(true);
    localJTextArea.setBackground(Color.white);
    localJPanel.add(localJTextArea, "North");
    localJPanel.setAlignmentY(0.0F);
    if ((paramArrayOfImageIcon != null) && (paramArrayOfImageIcon.length > 0))
    {
      Box localBox = new Box(0);
      for (int i = 0; i < paramArrayOfImageIcon.length; i++)
      {
        ImageIcon localImageIcon = paramArrayOfImageIcon[i];
        localBox.add(new JLabel(localImageIcon, 0));
        localBox.add(Box.createHorizontalStrut(10));
      }
      localJPanel.add(localBox, "Center");
    }
    localJPanel.setBackground(Color.white);
    return localJPanel;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.e.a.b
 * JD-Core Version:    0.6.0
 */