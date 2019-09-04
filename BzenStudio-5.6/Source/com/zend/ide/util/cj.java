package com.zend.ide.util;

import com.zend.ide.be.k;
import java.awt.print.Pageable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import javax.swing.SwingUtilities;

class cj
  implements Runnable
{
  private Pageable a;
  final ch b;

  public cj(ch paramch, Pageable paramPageable)
  {
    this.a = paramPageable;
  }

  public void run()
  {
    ch.e().setPageable(this.a);
    if (ch.e().printDialog())
    {
      ch.b().a(ct.a(1360));
      try
      {
        ch.e().print();
      }
      catch (PrinterException localPrinterException)
      {
      }
      ch.b().b(ct.a(1360));
    }
    SwingUtilities.invokeLater(new ub(this));
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.util.cj
 * JD-Core Version:    0.6.0
 */