package com.in28minutes.login;

import org.springframework.stereotype.Service;

@Service

public class Movie {
	private String title;
	private String summary;

	public Movie() {
		title = "";
		summary = "";
	}

	public Movie(String title, String summary) {

		super();

		this.title = title;

		this.summary = summary;

	}

	public String getTitle() {

		return title;

	}

	public String getSummary() {

		return summary;

	}

	@Override

	public String toString() {

		return "Movie [title=" + title + ", summary=" + summary + "]";

	}

}
