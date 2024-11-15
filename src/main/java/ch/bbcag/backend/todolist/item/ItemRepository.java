package ch.bbcag.backend.todolist.item;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ItemRepository extends JpaRepository<Item, Integer> {
    @Query("SELECT i FROM Item i WHERE i.name LIKE CONCAT('%', :name, '%')")
    List<Item> findByName(String name);
    List<Item> findByNameContains(String name);
}