package org.tksmaru.werewolf.controller.werewolf;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;

import twitter4j.ResponseList;
import twitter4j.Status;
import twitter4j.Twitter;

public class TestController extends Controller {

	@Override
	public Navigation run() throws Exception {

		Twitter twitter = (Twitter) sessionScope("twitter");
		ResponseList<Status> statusList = twitter.getUserTimeline();
		requestScope("statusList", statusList);

		return forward("menu.jsp");
	}
}
