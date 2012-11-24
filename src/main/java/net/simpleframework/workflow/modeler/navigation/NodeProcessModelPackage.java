package net.simpleframework.workflow.modeler.navigation;

import javax.swing.Icon;

import net.simpleframework.workflow.modeler.utils.SwingUtils;

/**
 * 这是一个开源的软件，请在LGPLv3下合法使用、修改或重新发布。
 * 
 * @author 陈侃(cknet@126.com, 13910090885)
 *         http://code.google.com/p/simpleframework/
 *         http://www.simpleframework.net
 */
@SuppressWarnings("serial")
public class NodeProcessModelPackage extends NavigationTreeNode {
	private static Icon packageIcon = SwingUtils.loadIcon("process_package.png");

	private final String text;

	public NodeProcessModelPackage(final String text) {
		this.text = text;
	}

	@Override
	public Icon getIcon() {
		return packageIcon;
	}

	@Override
	public String toString() {
		return text;
	}
}
