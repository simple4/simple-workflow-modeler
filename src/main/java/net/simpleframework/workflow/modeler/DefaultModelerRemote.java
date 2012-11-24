package net.simpleframework.workflow.modeler;

import java.io.IOException;
import java.util.Map;

import net.simpleframework.common.StringUtils;
import net.simpleframework.common.web.HttpClient;
import net.simpleframework.workflow.remote.AbstractWorkflowRemote;

/**
 * 这是一个开源的软件，请在LGPLv3下合法使用、修改或重新发布。
 * 
 * @author 陈侃(cknet@126.com, 13910090885)
 *         http://code.google.com/p/simpleframework/
 *         http://www.simpleframework.net
 */
public class DefaultModelerRemote extends AbstractWorkflowRemote {

	private final String remote_page = StringUtils.text(
			ModelerSettings.get().getProperty("remote_page"),
			"/sf/workflow-web-remote-ModelerRemotePage");

	@Override
	public Map<String, Object> call(final String url, final String method,
			final Map<String, Object> data) throws IOException {
		final HttpClient httpClient = HttpClient.of(url);
		final Map<String, Object> json = httpClient.post(remote_page + "?method=" + method, data);
		final String jsessionid = (String) json.get("jsessionid");
		if (StringUtils.hasText(jsessionid)) {
			httpClient.setJsessionid(jsessionid);
		}
		return json;
	}
}
