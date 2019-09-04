package com.zend.ide.n;

import com.zend.ide.util.cu;
import javax.swing.Action;
import javax.swing.text.DefaultEditorKit;
import javax.swing.text.Document;
import javax.swing.text.Position.Bias;

public class hg extends DefaultEditorKit
  implements cu
{
  private static Position.Bias[] c = new Position.Bias[1];
  private Action[] a;
  private static final Action[] b = { new hs(), new ja(), new ie(), new hq(), new hx(), new hw(), new re(), new qe(), new hr("selection-begin-line", true), new hr("caret-begin-line", false), new ht("selection-end-line", true), new ht("caret-end-line", false), new ia(), new hv(), new hz("caret-next-word", false), new hz("selection-next-word", true), new ib("caret-previous-word", false, false), new ib("selection-previous-word", true, false), new ib("backspaceCtrlAction", false, true), new hy("caret-forward", false, 3), new hy("caret-backward", false, 7), new hy("selection-forward", true, 3), new hy("selection-backward", true, 7), new hy("caret-up", false, 1), new hy("caret-down", false, 5), new hy("selection-up", true, 1), new hy("selection-down", true, 5), new ig("page-up", -1, false), new ig("page-down", 1, false), new ig("selection-page-up", -1, true), new ig("selection-page-down", 1, true) };

  public hg()
  {
    Action[] arrayOfAction = super.getActions();
    this.a = new Action[arrayOfAction.length + b.length];
    for (int i = 0; i < arrayOfAction.length; i++)
      this.a[i] = arrayOfAction[i];
    for (i = 0; i < b.length; i++)
      this.a[(i + arrayOfAction.length)] = b[i];
  }

  public Document createDefaultDocument()
  {
    return null;
  }

  public String getContentType()
  {
    return "text/php";
  }

  public Action[] getActions()
  {
    return this.a;
  }

  static Position.Bias[] a()
  {
    return c;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.hg
 * JD-Core Version:    0.6.0
 */