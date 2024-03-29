package net.simpleframework.workflow.modeler.process;

import static net.simpleframework.common.I18n.$m;

import java.awt.event.ActionEvent;

import net.simpleframework.workflow.modeler.ApplicationActions;
import net.simpleframework.workflow.modeler.ApplicationActions.ApplicationAction;
import net.simpleframework.workflow.schema.EndNode;
import net.simpleframework.workflow.schema.StartNode;
import net.simpleframework.workflow.schema.SubNode;
import net.simpleframework.workflow.schema.UserNode;

/**
 * 这是一个开源的软件，请在LGPLv3下合法使用、修改或重新发布。
 * 
 * @author 陈侃(cknet@126.com, 13910090885)
 *         http://code.google.com/p/simpleframework/
 *         http://www.simpleframework.net
 */
@SuppressWarnings("serial")
public final class ModelActions {

	private final ModelGraph modelGraph;

	public ModelActions(final ModelGraph modelGraph) {
		this.modelGraph = modelGraph;
	}

	public CellDeleteAction createCellDeleteAction(final Object cell) {
		return new CellDeleteAction(cell);
	}

	public CellPropertiesAction createCellPropertiesAction(final Object cell) {
		return new CellPropertiesAction(cell);
	}

	public ModelPropertiesAction createModelPropertiesAction() {
		return new ModelPropertiesAction();
	}

	class CellDeleteAction extends ApplicationAction {
		private final Object cell;

		public CellDeleteAction(final Object cell) {
			super($m("Menu.Delete"), ApplicationActions.deleteIcon);
			this.cell = cell;
		}

		@Override
		protected void actionInvoked(final ActionEvent e) {
			modelGraph.getGraph().removeCells(new Object[] { cell });
		}
	}

	class CellPropertiesAction extends ApplicationAction {
		private final Object cell;

		public CellPropertiesAction(final Object cell) {
			super($m("Menu.Property"), ApplicationActions.propertyIcon);
			this.cell = cell;
		}

		@Override
		protected void actionInvoked(final ActionEvent e) {
			if (cell instanceof TaskCell) {
				final TaskCell tCell = (TaskCell) cell;
				final Class<?> nClass = ((CellValue) tCell.getValue()).getNodeClass();
				if (UserNode.class.equals(nClass)) {
					new UserNodeEditor(modelGraph, tCell);
				} else if (SubNode.class.equals(nClass)) {
					new SubNodeEditor(modelGraph, tCell);
				} else if (StartNode.class.equals(nClass)) {
					new StartNodeEditor(modelGraph, tCell);
				} else if (EndNode.class.equals(nClass)) {
					new EndNodeEditor(modelGraph, tCell);
				}
			} else if (cell instanceof TransitionCell) {
				new TransitionEditor(modelGraph, (TransitionCell) cell);
			}
		}
	}

	class ModelPropertiesAction extends ApplicationAction {

		public ModelPropertiesAction() {
			super($m("Menu.Property"), ApplicationActions.propertyIcon);
		}

		@Override
		protected void actionInvoked(final ActionEvent e) {
			new ModelEditor(modelGraph);
		}
	}
}
