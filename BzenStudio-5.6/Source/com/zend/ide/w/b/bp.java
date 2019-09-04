package com.zend.ide.w.b;

import com.zend.ide.util.cu;
import com.zend.ide.util.cv;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.Reader;
import javax.swing.ActionMap;
import javax.swing.ImageIcon;
import javax.swing.InputMap;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.KeyStroke;
import javax.swing.SwingUtilities;

class bp extends JFrame
  implements cu
{
  private bs a;

  public bp()
  {
    Dimension localDimension1 = Toolkit.getDefaultToolkit().getScreenSize();
    Dimension localDimension2 = new Dimension((int)(localDimension1.getWidth() * 0.9D), (int)(localDimension1.getHeight() * 0.9D));
    setSize(localDimension2);
    setLocationRelativeTo(null);
    setTitle("");
    getContentPane().setLayout(new BorderLayout());
    this.a = new bs(this, true);
    getContentPane().add(this.a);
    setIconImage(cv.b("application32.gif").getImage());
    b();
  }

  private void b()
  {
    JPanel localJPanel = (JPanel)getContentPane();
    ActionMap localActionMap = localJPanel.getActionMap();
    InputMap localInputMap = localJPanel.getInputMap(2);
    localActionMap.put("escAction", new bm(this, null));
    localInputMap.put(KeyStroke.getKeyStroke(27, 0), "escAction");
    addWindowListener(new d(this));
  }

  public void a(w paramw, Reader paramReader, String paramString1, String paramString2)
  {
    SwingUtilities.invokeLater(new k(this, paramw, paramReader, paramString1, paramString2));
  }

  static bs a(bp parambp)
  {
    return parambp.a;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.w.b.bp
 * JD-Core Version:    0.6.0
 */