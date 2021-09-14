/**
 * 
 */
package popularmovies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import popularmovies.LoginService;

/**
 * @author mrutch
 *
 */
@Controller
public class LoginController {
	// set the login service - Auto Wiring
	// take bean and set it in here
	@Autowired
	LoginService service;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String showLoginPage() {
		return "login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String handleLoginRequest(@RequestParam String name, @RequestParam String password, ModelMap model) {
		if (!service.validateUser(name, password)) {
			model.put("error", "Invalid Credentials");
			return "login";
		} else {
			model.put("name", name);
			model.put("password", password);
			return "welcome";

		}
	}

}
