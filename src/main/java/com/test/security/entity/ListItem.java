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

    @Builder.Default
    private String message = "";

    @Builder.Default
    private Boolean checked = false;

    @ManyToOne(optional = false)
    @JoinColumn(name = "BELONG_TO")
    private User belongsTo;

}
