package com.dev.CineBark.infra.persistence;

import com.dev.CineBark.core.enums.Ticket;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "movies")
public class MoviesEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String ticket;
    @Enumerated(EnumType.STRING)
    private Ticket typeTicket;
    private int room;
    private String description;
    private String category;
    private double rating;
    private int capacity;
    private LocalDateTime beginningMovie;
    private LocalDateTime endMovie;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private UsersEntity user;

    public MoviesEntity(){}

    public MoviesEntity(Long id, String title, String ticket, Ticket typeTicket, int room, String description, String category, double rating, int capacity, LocalDateTime beginningMovie, LocalDateTime endMovie, UsersEntity user) {
        this.id = id;
        this.title = title;
        this.ticket = ticket;
        this.typeTicket = typeTicket;
        this.room = room;
        this.description = description;
        this.category = category;
        this.rating = rating;
        this.capacity = capacity;
        this.beginningMovie = beginningMovie;
        this.endMovie = endMovie;
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTicket() {
        return ticket;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket;
    }

    public Ticket getTypeTicket() {
        return typeTicket;
    }

    public void setTypeTicket(Ticket typeTicket) {
        this.typeTicket = typeTicket;
    }

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public LocalDateTime getBeginningMovie() {
        return beginningMovie;
    }

    public void setBeginningMovie(LocalDateTime beginningMovie) {
        this.beginningMovie = beginningMovie;
    }

    public LocalDateTime getEndMovie() {
        return endMovie;
    }

    public void setEndMovie(LocalDateTime endMovie) {
        this.endMovie = endMovie;
    }

    public UsersEntity getUser() {
        return user;
    }

    public void setUser(UsersEntity user) {
        this.user = user;
    }
}
