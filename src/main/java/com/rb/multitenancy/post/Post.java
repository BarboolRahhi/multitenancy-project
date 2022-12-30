package com.rb.multitenancy.post;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Post {

    @Id
    @GeneratedValue
    private long id;
    private String title;
    private String description;

    public Post(String title, String description) {
        this.title = title;
        this.description = description;
    }

}
