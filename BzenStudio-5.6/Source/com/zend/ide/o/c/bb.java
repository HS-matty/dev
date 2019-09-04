package com.zend.ide.o.c;

import com.zend.ide.p.bt;
import com.zend.ide.p.by;
import com.zend.ide.util.cl;
import java.awt.Component;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JTree;

class bb extends by
{
  private Pattern b = Pattern.compile("\t");
  final bo a;

  bb(bo parambo)
  {
  }

  public Component getTreeCellRendererComponent(JTree paramJTree, Object paramObject, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, int paramInt, boolean paramBoolean4)
  {
    String str = paramJTree.convertValueToText(paramObject, paramBoolean1, paramBoolean2, paramBoolean3, paramInt, paramBoolean4);
    str = this.b.matcher(str).replaceAll("    ");
    super.getTreeCellRendererComponent(paramJTree, str, paramBoolean1, paramBoolean2, paramBoolean3, paramInt, paramBoolean4);
    if ((paramObject instanceof bt))
    {
      localObject = (bt)paramObject;
      try
      {
        setIcon(((bt)localObject).e());
      }
      catch (ClassCastException localClassCastException)
      {
        cl.a("Exception original type: " + ((bt)localObject).e());
        cl.a(localClassCastException);
      }
      setToolTipText(str);
    }
    Object localObject = getText();
    int i;
    if ((localObject != null) && ((i = ((String)localObject).indexOf("::")) != -1))
    {
      int j = ((String)localObject).indexOf("=");
      if (i < j)
        localObject = ((String)localObject).substring(((String)localObject).indexOf("::") + 2);
    }
    setText((String)localObject);
    return (Component)this;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.o.c.bb
 * JD-Core Version:    0.6.0
 */