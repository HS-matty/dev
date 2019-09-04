package com.zend.ide.p;

import com.zend.ide.util.s;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.swing.tree.TreeNode;
import javax.swing.tree.TreePath;

public class bf extends s
{
  final bs g;

  public bf(bs parambs)
  {
  }

  public Map c(String paramString)
  {
    if (!paramString.equals("multipleSelection"))
      return super.c(paramString);
    TreePath[] arrayOfTreePath = this.g.getSelectionPaths();
    HashSet localHashSet = new HashSet();
    ArrayList localArrayList = new ArrayList();
    Map localMap1 = super.c(paramString);
    for (int i = 0; (i < arrayOfTreePath.length) && (!localMap1.isEmpty()); i++)
    {
      String str1 = this.g.c((TreeNode)arrayOfTreePath[i].getLastPathComponent());
      if (!localHashSet.add(str1))
        continue;
      localArrayList.clear();
      Map localMap2 = super.c(str1);
      Iterator localIterator = localMap1.keySet().iterator();
      String str2;
      while (localIterator.hasNext())
      {
        str2 = (String)localIterator.next();
        if (!localMap2.containsKey(str2))
          localArrayList.add(str2);
      }
      localIterator = localArrayList.iterator();
      while (localIterator.hasNext())
      {
        str2 = (String)localIterator.next();
        localMap1.remove(str2);
      }
    }
    return localMap1;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.p.bf
 * JD-Core Version:    0.6.0
 */