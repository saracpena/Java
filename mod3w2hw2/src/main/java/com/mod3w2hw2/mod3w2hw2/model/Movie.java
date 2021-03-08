package com.mod3w2hw2.mod3w2hw2.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@JsonIgnoreProperties
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Movie {
    
    private int movie_id;
    private String title;
    private int year;
    private String director;
    private String genre;
    
}