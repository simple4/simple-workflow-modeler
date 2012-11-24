package net.simpleframework.workflow.modeler.process;

import net.simpleframework.workflow.schema.Node;

/**
 * 这是一个开源的软件，请在LGPLv3下合法使用、修改或重新发布。
 * 
 * @author 陈侃(cknet@126.com, 13910090885)
 *         http://code.google.com/p/simpleframework/
 *         http://www.simpleframework.net
 */
public class CellValue implements java.io.Serializable {
	private final String text;

	private final Class<? extends Node> nodeClass;

	public CellValue(final Node node) {
		nodeClass = node.getClass();
		text = node.toString();
	}

	public Class<?> getNodeClass() {
		return nodeClass;
	}

	@Override
	public String toString() {
		return text;
	}

	private static final long serialVersionUID = -7189892545391572964L;
}
