package com.stackroute.muzixservice.domain;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table
public class Track {

    @Id
    @Column(name="trackid")
    private  int TrackId;
    @Column(name="trackname")
    private String TrackName;
    @Column(name="trackcomments")
    private String TrackComments;
}
