package com.zend.ide.util;

import com.zend.ide.i.n;
import com.zend.ide.p.cd;
import java.awt.Container;
import java.awt.Dimension;
import java.io.File;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.text.html.HTMLDocument;
import javax.swing.text.html.HTMLEditorKit;

public class ei extends n
  implements cu
{
  private File c;

  public ei(File paramFile, JFrame paramJFrame)
  {
    super(paramJFrame, false);
    this.c = paramFile;
    setTitle(ct.a(272));
    c();
    setSize(500, 500);
    pack();
    B();
  }

  private void c()
  {
    JEditorPane localJEditorPane = new JEditorPane();
    cd localcd = new cd(localJEditorPane);
    localcd.setPreferredSize(new Dimension(400, 400));
    HTMLEditorKit localHTMLEditorKit = new HTMLEditorKit();
    HTMLDocument localHTMLDocument = (HTMLDocument)localHTMLEditorKit.createDefaultDocument();
    localJEditorPane.setDocument(localHTMLDocument);
    localJEditorPane.setEditorKit(localHTMLEditorKit);
    localJEditorPane.setEditable(false);
    localJEditorPane.addHyperlinkListener(new bm(this));
    localHTMLEditorKit.install(localJEditorPane);
    try
    {
      localJEditorPane.setPage(this.c.toURL());
    }
    catch (Exception localException)
    {
      cl.a(localException);
    }
    addWindowListener(new k(this));
    getContentPane().add(localcd);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.util.ei
 * JD-Core Version:    0.6.0
 */