package org.tksmaru.werewolf.controller.werewolf;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;

public class MenuController extends Controller {

	@Override
	public Navigation run() throws Exception {

		return forward("menu.jsp");
	}
}
