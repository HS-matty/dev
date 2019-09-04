package com.zend.ide.d;

import com.zend.ide.p.w;
import com.zend.ide.util.ct;
import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JTextField;
import javax.swing.LookAndFeel;
import javax.swing.UIDefaults;
import javax.swing.UIManager;

class f
  implements FocusListener
{
  final bi a;

  f(bi parambi)
  {
  }

  public void focusGained(FocusEvent paramFocusEvent)
  {
    bi.a(this.a).setBackground(Color.white);
    bi.a(this.a).setForeground(UIManager.getLookAndFeel().getDefaults().getColor("TextField.foreground"));
    if (bi.a(this.a).getText().equals(ct.a(663)))
      bi.a(this.a).setText("");
    bi.b(this.a).setEnabled(true);
    bi.a(this.a).setEditable(false);
  }

  public void focusLost(FocusEvent paramFocusEvent)
  {
    bi.a(this.a, bi.a(this.a).getText());
    bi.a(this.a).setEditable(true);
    bi.a(this.a).setText(ct.a(663));
    bi.a(this.a).setForeground(UIManager.getLookAndFeel().getDefaults().getColor("TextField.inactiveForeground"));
    bi.a(this.a).setBackground(UIManager.getLookAndFeel().getDefaults().getColor("TextField.inactiveBackground"));
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.d.f
 * JD-Core Version:    0.6.0
 */