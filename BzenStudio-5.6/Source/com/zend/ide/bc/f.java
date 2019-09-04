package com.zend.ide.bc;

import com.zend.ide.util.cv;
import java.awt.Window;
import javax.help.DefaultHelpBroker;
import javax.help.HelpSet;
import javax.help.WindowPresentation;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class f extends DefaultHelpBroker
{
  public f()
  {
  }

  public f(HelpSet paramHelpSet)
  {
    super(paramHelpSet);
    a();
  }

  public void a()
  {
    initPresentation();
    WindowPresentation localWindowPresentation = getWindowPresentation();
    Window localWindow = localWindowPresentation.getHelpWindow();
    if (localWindow != null)
      ((JFrame)localWindow).setIconImage(cv.b("application32.gif").getImage());
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.bc.f
 * JD-Core Version:    0.6.0
 */