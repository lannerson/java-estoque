package sgps.util;


import javax.swing.tree.*;
import javax.swing.*;
import javax.swing.event.*;
import java.io.File;

/**
 *
 * @author Daniel Vilas Boas
 */
public class MenusTreeModel implements javax.swing.tree.TreeModel {

    // variavel que corresponde ao a raíz da arvore
    protected DefaultMutableTreeNode root;

    public MenusTreeModel(DefaultMutableTreeNode root) {
        this.root = root;
    }

    public void adicionaNoRoot(DefaultMutableTreeNode no) {
        root.add(no);
    }

    public void removeNoRoot(DefaultMutableTreeNode no) {
        root.removeAllChildren();
    }

    public void adicionaNo(DefaultMutableTreeNode pai, DefaultMutableTreeNode no) {
        pai.add(no);
    }


    // retornar o objeto raiz da árvore
    public Object getRoot() {
        return root;
    }

    //Informa se um objeto na árvore é uma folha
    public boolean isLeaf(Object node) {
        return ((DefaultMutableTreeNode) node).isNodeChild(root);
    }

    // Informa quantos filhos um nó possue
    public int getChildCount(Object parent) {
        int children = ((DefaultMutableTreeNode) parent).getChildCount();
        if (children == 0) {
            return 0;
        }
        return children;
    }

    // Fetch any numbered child of a node for the JTree.
    // Our model returns File objects for all nodes in the tree.  The
    // JTree displays these by calling the File.toString() method.
    public Object getChild(Object parent, int index) {
        TreeNode children = ((DefaultMutableTreeNode) parent).getChildAt(index);
        if ((children == null)) {
            return null;
        }
        return children;
    }

    // Figura a posição de um filhoa em seu nó pai.
    public int getIndexOfChild(Object parent, Object child) {
        return -1;
    }

    // This method is invoked by the JTree only for editable trees.
    // This TreeModel does not allow editing, so we do not implement
    // this method.  The JTree editable property is false by default.
    public void valueForPathChanged(TreePath path, Object newvalue) {
    }

    // Since this is not an editable tree model, we never fire any events,
    // so we don't actually have to keep track of interested listeners
    public void addTreeModelListener(TreeModelListener l) {
    }

    public void removeTreeModelListener(TreeModelListener l) {
    }
}
