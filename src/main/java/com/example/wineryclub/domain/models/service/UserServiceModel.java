package com.example.wineryclub.domain.models.service;

import com.example.wineryclub.domain.entities.Role;
import com.example.wineryclub.domain.entities.Wine;

import java.util.List;
import java.util.Set;

public class UserServiceModel extends BaseServiceModel {

    private String fullName;
    private String username;
    private String password;
    private String country;
    private String town;
    private int age;
    private String email;
    private List<Wine> favoriteWines;
    private Set<RoleServiceModel> authorities;

    public UserServiceModel() {
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Wine> getFavoriteWines() {
        return favoriteWines;
    }

    public void setFavoriteWines(List<Wine> favoriteWines) {
        this.favoriteWines = favoriteWines;
    }

    public Set<RoleServiceModel> getAuthorities() {
        return authorities;
    }

    public void setAuthorities(Set<RoleServiceModel> authorities) {
        this.authorities = authorities;
    }
}
