package com.example.movies;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

//import org.springframework.data.mongodb.core.mapping.DocumentReference;
import java.lang.String;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Document(collection="cinema")
@AllArgsConstructor
@NoArgsConstructor
public class Movie {
	
	@Id
	private ObjectId id;
	private String imdbId;
	private String title;
	private String trailerLink;
	private String releaseDate;
	private String poster;
	private List<String> genres;
	private List<String> backdrops;
	
//	@DocumentReference
	private List<String> reveiewIds;

	public ObjectId getId() {
		return id;
	}
	
	public void setId(ObjectId id) {
		this.id = id;
	}

	public String getImdbId() {
		return imdbId;
	}

	public void setImdbId(String imdbId) {
		this.imdbId = imdbId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTrailerLink() {
		return trailerLink;
	}

	public void setTrailerLink(String trailerLink) {
		this.trailerLink = trailerLink;
	}
	
	public String getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String getPoster() {
		return poster;
	}

	public void setPoster(String poster) {
		this.poster = poster;
	}

	public List<String> getGenres() {
		return genres;
	}

	public void setGenres(List<String> genres) {
		this.genres = genres;
	}

	public List<String> getBackdrops() {
		return backdrops;
	}

	public void setBackdrops(List<String> backdrops) {
		this.backdrops = backdrops;
	}

	public List<String> getReveiewIds() {
		return reveiewIds;
	}

	public void setReveiewIds(List<String> reveiewIds) {
		this.reveiewIds = reveiewIds;
	}

	public Movie(ObjectId id, String imdbId, String title, String trailerLink, String releaseDate, String poster,
			List<String> genres, List<String> backdrops, List<String> reveiewIds) {
		super();
		this.id = id;
		this.imdbId = imdbId;
		this.title = title;
		this.trailerLink = trailerLink;
		this.releaseDate = releaseDate;
		this.poster = poster;
		this.genres = genres;
		this.backdrops = backdrops;
		this.reveiewIds = reveiewIds;
	}	
}
