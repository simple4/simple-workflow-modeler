package net.simpleframework.workflow.modeler.utils;

import javax.swing.JComponent;

/**
 * 这是一个开源的软件，请在LGPLv3下合法使用、修改或重新发布。
 * 
 * @author 陈侃(cknet@126.com, 13910090885)
 *         http://code.google.com/p/simpleframework/
 *         http://www.simpleframework.net
 */
public interface ITabbedContent {

	JComponent getComponent();

	Object getIdentifier();

	String getTitle();

	TreeNodeEx getTreeNode();

	Object getUserObject();

	boolean isModify();

	void onModified(boolean modify);

	void save();
}
