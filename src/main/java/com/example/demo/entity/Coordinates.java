package com.example.demo.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.data.geo.Point;

@Entity
public class Coordinates {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Point location;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Point getLocation() {
		return location;
	}
	public void setLocation(Point location) {
		this.location = location;
	}
//	public List<Point> getLocations() {
//		return locations;
//	}
//	public void setLocations(List<Point> locations) {
//		this.locations = locations;
//	}
//	private List<Point> locations;

}
