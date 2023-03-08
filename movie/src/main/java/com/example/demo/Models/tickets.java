package com.example.demo.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class tickets {
		@Id
		private String movie;
		private int duration;
		private int release_year;
		private String director;
		private String production;
		public tickets(String movie,String director,int duration,  String production, int release_year) {
			super();
			this.movie = movie;
			this.director = director;
			this.duration = duration;
			this.production = production;
			this.release_year = release_year;
		}
		public tickets() {
			super();
			// TODO Auto-generated constructor stub
		}
		public String getMovie() {
			return movie;
		}
		public void setMovie(String movie) {
			this.movie = movie;
		}
		public int getDuration() {
			return duration;
		}
		public void setDuration(int duration) {
			this.duration = duration;
		}
		public int getRelease_year() {
			return release_year;
		}
		public void setRelease_year(int release_year) {
			this.release_year = release_year;
		}
		public String getDirector() {
			return director;
		}
		public void setDirector(String director) {
			this.director = director;
		}
		public String getProduction() {
			return production;
		}
		public void setProduction(String production) {
			this.production = production;
		}		
}
