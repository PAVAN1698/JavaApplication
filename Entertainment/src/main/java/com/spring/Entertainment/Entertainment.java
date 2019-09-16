package com.spring.Entertainment;

public class Entertainment {
String moviename;
String movietype;
String actorname;
int duration;

public Entertainment() {

	// TODO Auto-generated constructor stub
}

public Entertainment(String moviename, String movietype, String actorname, int duration) {
 
	this.moviename = moviename;
	this.movietype = movietype;
	this.actorname = actorname;
	this.duration = duration;
}

public String getMoviename() {
	return moviename;
}

public void setMoviename(String moviename) {
	this.moviename = moviename;
}

public String getMovietype() {
	return movietype;
}

public void setMovietype(String movietype) {
	this.movietype = movietype;
}

public String getActorname() {
	return actorname;
}

public void setActorname(String actorname) {
	this.actorname = actorname;
}

public int getDuration() {
	return duration;
}

public void setDuration(int duration) {
	this.duration = duration;
}

@Override
public String toString() {
	return "Entertainment [moviename=" + moviename + ", movietype=" + movietype + ", actorname=" + actorname
			+ ", duration=" + duration + "]";
}
}
