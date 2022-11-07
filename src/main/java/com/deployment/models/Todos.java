package com.deployment.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="todos")
public class Todos {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long Id;
	private String activity;
	private String status;
	
	
	public Long getId() {
		return Id;
	}


	public void setId(Long id) {
		Id = id;
	}


	public String getActivity() {
		return activity;
	}


	public void setActivity(String activity) {
		this.activity = activity;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}

	
	public Todos() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Todos(Long id, String activity, String status) {
		super();
		this.activity = activity;
		this.status = status;
	}


	@Override
	public String toString() {
		return "Todos [Id=" + Id + ", activity=" + activity + ", status=" + status + "]";
	}
	
	
}
