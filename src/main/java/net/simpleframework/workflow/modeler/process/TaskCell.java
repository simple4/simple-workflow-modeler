package net.simpleframework.workflow.modeler.process;

import net.simpleframework.common.StringUtils;
import net.simpleframework.workflow.modeler.Application;
import net.simpleframework.workflow.schema.AbstractTaskNode;
import net.simpleframework.workflow.schema.EndNode;
import net.simpleframework.workflow.schema.StartNode;
import net.simpleframework.workflow.schema.UserNode;

import com.mxgraph.model.mxCell;
import com.mxgraph.model.mxGeometry;

/**
 * 这是一个开源的软件，请在LGPLv3下合法使用、修改或重新发布。
 * 
 * @author 陈侃(cknet@126.com, 13910090885)
 *         http://code.google.com/p/simpleframework/
 *         http://www.simpleframework.net
 */
public class TaskCell extends mxCell {

	public TaskCell(final AbstractTaskNode taskNode, final double x, final double y) {
		setVertex(true);
		setId(taskNode.getId());
		setConnectable(true);
		setValue(new CellValue(taskNode));

		final mxGeometry geometry = new mxGeometry(x, y, 32, 32);
		setGeometry(geometry);

		final StringBuilder sb = new StringBuilder();
		sb.append("shape=image;align=center;");
		sb.append("verticalLabelPosition=bottom;spacingBottom=6;");
		sb.append("resizable=0;editable=0;autosize=1;");
		sb.append("image=/")
				.append(StringUtils.replace(Application.class.getPackage().getName(), ".", "/"))
				.append("/images/");
		if (taskNode instanceof UserNode) {
			sb.append("node_user.gif");
		} else if (taskNode instanceof StartNode) {
			sb.append("node_start.gif");
		} else if (taskNode instanceof EndNode) {
			sb.append("node_end.gif");
		} else {
			sb.append("node_auto.gif");
		}
		setStyle(sb.toString());
	}

	private static final long serialVersionUID = -6483469577079287775L;
}
