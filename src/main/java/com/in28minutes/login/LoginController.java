package com.in28minutes.login;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

	@Autowired
	List<Movie> popularMovies;

	@Autowired
	private LoginService loginService;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String showLoginPage() throws FileNotFoundException, IOException, ParseException {
		// ensures nothing getting duplicated and added
		popularMovies.clear();
		System.out.println("Show login page method being called");
		JSONParser parser = new JSONParser();
		File infoResource = ResourceUtils.getFile("classpath:popular_movies.json");
		JSONArray array = (JSONArray) parser.parse(new FileReader(infoResource));

		for (Object item : array) {

			JSONObject movie = (JSONObject) item;
			// System.out.println(movie);
			popularMovies.add(new Movie((String) movie.get("Movie"), (String) movie.get("Summary")));

		}
		// for some reason first entry is empty so size is 21 but with 20 movies
		System.out.println(popularMovies.size());
		System.out.println(popularMovies.toString());
		return "login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String handleUserLogin(ModelMap model, @RequestParam String name, @RequestParam String password) {

		if (!loginService.validateUser(name, password)) {
			model.put("errorMessage", "Invalid Credentials");
			return "login";
		}

		model.put("name", name);
		return "welcome";
	}
}
