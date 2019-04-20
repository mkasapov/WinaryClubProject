package com.example.wineryclub.domain.entities;

import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "users")
public class User extends BaseEntity implements UserDetails {

  private String fullName;
  private String username;
  private String password;
  private String country;
  private String town;
  private int age;
  private String email;

  private List<Wine> favoriteWines;
  private Set<Role> authorities;

  public User() {
  }

  @Override
  @Column(name = "username", nullable = false, unique = true, updatable = false)
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  @Override
  @Column(name = "password", nullable = false)
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  @Column(name = "email", nullable = false, unique = true)
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  @Override
  @ManyToMany(targetEntity = Role.class, fetch = FetchType.EAGER)
  @JoinTable(
          name = "users_roles",
          joinColumns = @JoinColumn(
                  name = "user_id",
                  referencedColumnName = "id"
          ),
          inverseJoinColumns = @JoinColumn(
                  name = "role_id",
                  referencedColumnName = "id"
          )
  )
  public Set<Role> getAuthorities() {
    return authorities;
  }

  public void setAuthorities(Set<Role> authorities) {
    this.authorities = authorities;
  }

  @Column(name = "full_name", nullable = false)
  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  @Column(name = "country", nullable = false)
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }
  @Column(name = "town", nullable = false)
  public String getTown() {
    return town;
  }

  public void setTown(String town) {
    this.town = town;
  }
  @Column(name = "age", nullable = false)
  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  @ManyToMany(targetEntity = Wine.class, fetch = FetchType.EAGER)
  @JoinTable(
          name = "users_favorite_wine",
          joinColumns = @JoinColumn(
                  name = "user_id",
                  referencedColumnName = "id"
          ),
          inverseJoinColumns = @JoinColumn(
                  name = "wine_id",
                  referencedColumnName = "id"
          )
  )
  public List<Wine> getFavoriteWines() {
    return favoriteWines;
  }

  public void setFavoriteWines(List<Wine> favoriteWines) {
    this.favoriteWines = favoriteWines;
  }

  @Override
  @Transient
  public boolean isAccountNonExpired() {
    return true;
  }

  @Override
  @Transient
  public boolean isAccountNonLocked() {
    return true;
  }

  @Override
  @Transient
  public boolean isCredentialsNonExpired() {
    return true;
  }

  @Override
  @Transient
  public boolean isEnabled() {
    return true;
  }
}
