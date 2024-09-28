package com.test.security.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "LIST_ITEMS")
public class ListItem {

    @Id
    @GeneratedValue
    private Long id;

    private Integer index;

    private String message;

    private Boolean checked;

    @ManyToOne
    private User belongsTo;

}
