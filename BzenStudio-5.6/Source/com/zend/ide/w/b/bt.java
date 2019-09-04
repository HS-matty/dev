package com.zend.ide.w.b;

import com.zend.ide.desktop.bq;
import com.zend.ide.util.ct;
import com.zend.ide.util.cv;
import java.awt.FlowLayout;
import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

class bt extends JPanel
  implements g
{
  private JButton a;
  private JButton b;
  private Action c;
  private Action d;
  final bs e;

  public bt(bs parambs)
  {
    setLayout(new FlowLayout(0, 2, 5));
    KeyStroke localKeyStroke1 = KeyStroke.getKeyStroke(114, 2);
    KeyStroke localKeyStroke2 = KeyStroke.getKeyStroke(114, 0);
    this.c = new bn(parambs, ct.a(1249), cv.b("diffNext.gif"));
    this.d = new bo(parambs, ct.a(1250), cv.b("diffPrev.gif"));
    InputMap localInputMap = getInputMap(2);
    ActionMap localActionMap = getActionMap();
    localActionMap.put("nextDiff", this.c);
    localActionMap.put("prevDiff", this.d);
    localInputMap.put(localKeyStroke2, "nextDiff");
    localInputMap.put(localKeyStroke1, "prevDiff");
    this.a = new bq();
    this.b = new bq();
    this.c.putValue("AcceleratorKey", localKeyStroke2);
    this.d.putValue("AcceleratorKey", localKeyStroke1);
    this.a.setAction(this.c);
    this.b.setAction(this.d);
    add(this.a);
    add(this.b);
    bs.i(parambs).a(this);
  }

  public void a(bk parambk)
  {
    this.c.setEnabled(parambk.b());
    this.d.setEnabled(parambk.c());
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.w.b.bt
 * JD-Core Version:    0.6.0
 */