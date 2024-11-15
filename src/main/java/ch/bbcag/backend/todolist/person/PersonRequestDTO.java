package ch.bbcag.backend.todolist.person;

import jakarta.validation.constraints.NotBlank;

import java.util.ArrayList;
import java.util.Objects;
import java.util.List;

public class PersonRequestDTO {

    private List<Integer> itemIds = new ArrayList<>();

    public List<Integer> getItemIds() {
        return itemIds;
    }

    public void setItemIds(List<Integer> itemIds) {
        this.itemIds = itemIds;
    }

    @NotBlank(message = "must not be blank")
    private String username;


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PersonRequestDTO personRequestDTO)) {
            return false;
        }

        return username.equals(personRequestDTO.username);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username);
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

}
