package com.test.security.repository;

import com.test.security.entity.ListItem;
import com.test.security.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ListItemRepository extends JpaRepository<ListItem, Long> {

    List<ListItem> findByBelongsTo(User user);

}
