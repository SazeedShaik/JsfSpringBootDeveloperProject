package com.jsfspring.controller;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import javax.annotation.PostConstruct;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import com.jsfspring.beans.Developer;
import com.jsfspring.repository.DeveloperRepository;

@Named
@ViewScoped
public class DeveloperController implements Serializable {
	
  private static final long serialVersionUID = 1L;

  @Inject
  private DeveloperRepository developerrepo;

  private List<Developer> developers;
  
  private Developer developer = new Developer();

  
  @PostConstruct
  //method to get all developers
  public void init(){
    developers = developerrepo.findAll();
  }
 
 //method to save a developer
  public String save()  {
	  developerrepo.save(developer);
	  developer = new Developer();
	  return "developer" + "?faces-redirect=true";
  }
  
  //method to view a developer
  public String view(Developer developer)  {
	Map<String,Object> sessionMap = FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
	sessionMap.put("developer", developer);
	return "viewdeveloper" + "?faces-redirect=true";
  }
  
  //method to update the developer skills
  public String update(Developer developer){
	Developer tempdev =  developerrepo.getOne(developer.getId());
	developer.setSkills(tempdev.getSkills() + "," + developer.getSkills());
	developerrepo.save(developer);
	return "developer" + "?faces-redirect=true";
   }

  public List<Developer> getDevelopers() {
	return developers;
  }

  public void setDevelopers(List<Developer> developers) {
	this.developers = developers;
  }

  public Developer getDeveloper() {
	return developer;
  }

  public void setDeveloper(Developer developer) {
	this.developer = developer;
  }
 }