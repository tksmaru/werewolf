package org.tksmaru.werewolf.controller.werewolf;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;

public class AmebaMenuController extends Controller {

	@Override
	public Navigation run() throws Exception {

		return forward("amebaMenu.jsp");
	}
}
