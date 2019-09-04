package com.zend.ide.cb.a;

import com.zend.ide.p.d.bp;
import com.zend.ide.r.p;
import com.zend.ide.util.ct;
import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

class jd extends JPanel
{
  private JTextField a = new JTextField();
  private bp b;
  private JButton c;
  private String d;
  final dd e;

  public jd(dd paramdd)
  {
    setLayout(new BorderLayout());
    add(this.a);
  }

  public void a(String paramString)
  {
    this.a.setText(paramString);
  }

  public String a()
  {
    return this.a.getText();
  }

  JTextField a()
  {
    return this.a;
  }

  public void a(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      if (this.b == null)
      {
        this.b = new je(this, false);
        p.e().b(this.b);
        this.b.setFileSelectionMode(2);
        this.b.setMultiSelectionEnabled(false);
        this.c = new JButton(new nc(this));
        this.c.setToolTipText(ct.a(1518));
        this.c.setPreferredSize(new Dimension(24, 20));
      }
      add(this.c, "East");
      validate();
    }
    else if (this.c != null)
    {
      remove(this.c);
      validate();
    }
  }

  static JTextField a(jd paramjd)
  {
    return paramjd.a;
  }

  static String b(jd paramjd)
  {
    return paramjd.d;
  }

  static bp c(jd paramjd)
  {
    return paramjd.b;
  }

  static String a(jd paramjd, String paramString)
  {
    return paramjd.d = paramString;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.a.jd
 * JD-Core Version:    0.6.0
 */