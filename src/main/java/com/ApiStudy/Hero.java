package com.ApiStudy;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Hero {

private Integer id;
private String name;
private String description;
private Integer health;
private Integer armour;
private Integer shield;
private String realName;
private Integer age;
private Object height;
private String affiliation;
private String baseOfOperations;
private Integer difficulty;
private String url;
private Role role;
private List<SubRole> subRoles = null;
private List<Ability> abilities = null;

public Integer getId() {
return id;
}

public void setId(Integer id) {
this.id = id;
}

public String getName() {
return name;
}

public void setName(String name) {
this.name = name;
}

public String getDescription() {
return description;
}

public void setDescription(String description) {
this.description = description;
}

public Integer getHealth() {
return health;
}

public void setHealth(Integer health) {
this.health = health;
}

public Integer getArmour() {
return armour;
}

public void setArmour(Integer armour) {
this.armour = armour;
}

public Integer getShield() {
return shield;
}

public void setShield(Integer shield) {
this.shield = shield;
}

public String getRealName() {
return realName;
}

public void setRealName(String realName) {
this.realName = realName;
}

public Integer getAge() {
return age;
}

public void setAge(Integer age) {
this.age = age;
}

public Object getHeight() {
return height;
}

public void setHeight(Object height) {
this.height = height;
}

public String getAffiliation() {
return affiliation;
}

public void setAffiliation(String affiliation) {
this.affiliation = affiliation;
}

public String getBaseOfOperations() {
return baseOfOperations;
}

public void setBaseOfOperations(String baseOfOperations) {
this.baseOfOperations = baseOfOperations;
}

public Integer getDifficulty() {
return difficulty;
}

public void setDifficulty(Integer difficulty) {
this.difficulty = difficulty;
}

public String getUrl() {
return url;
}

public void setUrl(String url) {
this.url = url;
}

public Role getRole() {
return role;
}

public void setRole(Role role) {
this.role = role;
}

public List<SubRole> getSubRoles() {
return subRoles;
}

public void setSubRoles(List<SubRole> subRoles) {
this.subRoles = subRoles;
}

public List<Ability> getAbilities() {
return abilities;
}

public void setAbilities(List<Ability> abilities) {
this.abilities = abilities;
}

}