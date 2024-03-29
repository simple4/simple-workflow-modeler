package net.simpleframework.workflow.modeler;

import java.awt.Font;
import java.util.Enumeration;
import java.util.Map;

import javax.swing.UIDefaults;
import javax.swing.UIManager;

import net.simpleframework.common.ClassUtils;
import net.simpleframework.common.ClassUtils.IScanResourcesCallback;
import net.simpleframework.common.I18n;
import net.simpleframework.common.ObjectEx;
import net.simpleframework.workflow.modeler.utils.SplashScreen;
import net.simpleframework.workflow.modeler.utils.SwingUtils;
import net.simpleframework.workflow.remote.IWorkflowRemote;

/**
 * 这是一个开源的软件，请在LGPLv3下合法使用、修改或重新发布。
 * 
 * @author 陈侃(cknet@126.com, 13910090885)
 *         http://code.google.com/p/simpleframework/
 *         http://www.simpleframework.net
 */
@SuppressWarnings("serial")
public class Application extends ObjectEx {

	public static void main(final String[] args) {
		get().startup(args);
	}

	public static Application get() {
		return singleton(Application.class);
	}

	SplashScreen splash;

	private IMainPane mainPane;

	void startup(final String[] args) {
		try {
			ClassUtils.scanResources("net.simpleframework.workflow",
					new IScanResourcesCallback[] { I18n.getBasenamesCallback() });

			// ui
			splash = new SplashScreen(0) {

				@Override
				protected String getInfo() {
					return null;
				}
			};
			mainPane = new MainFrame();
		} catch (final Exception e) {
			log.error(e);
		} finally {
			if (splash != null) {
				splash.dispose();
			}
		}
	}

	public IMainPane getMainPane() {
		return mainPane;
	}

	public void shutdown() {
		System.exit(0);
	}

	static final Font defautFont = new Font(Font.DIALOG, Font.PLAIN, 12);

	static {
		final UIDefaults defaults = UIManager.getDefaults();
		final Enumeration<?> keys = defaults.keys();
		while (keys.hasMoreElements()) {
			final Object key = keys.nextElement();
			if (key instanceof String && ((String) key).endsWith(".font")) {
				defaults.put(key, defautFont);
			}
		}
	}

	public static boolean isError(final Map<String, Object> kv) {
		final String error = (String) kv.get("error");
		if (error != null) {
			SwingUtils.showError(error);
			return true;
		}
		return false;
	}

	public static IWorkflowRemote remote() {
		return singleton(DefaultModelerRemote.class);
	}
}
