package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Issues;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ManagerRepositoryIssuesTest {
    public Collection<Issues> issuess = new ArrayList<>();
    ManagerRepositoryIssues manager = new ManagerRepositoryIssues();
    public Issues issues1 = new Issues("ivanov","available", "petrov", "project1");
    public Issues issues2 = new Issues("petrov","closed", "sidorov", "project2");
    public Issues issues3 = new Issues("sidorov","closed", "ivanov", "project3");

    @BeforeEach
    public void shouldAdd() {
        manager.add(issues1);
        manager.add(issues2);
        manager.add(issues3);

    }

    @Test
    void shouldFindAll() {
        assertEquals(List.of(issues1,issues2,issues3), manager.findAll());

    }

    @Test
    void compareTo() {

    }


    @Test
    public void shouldSearchByAuthor() {
        assertEquals(List.of(issues1),manager.searcyBy("ivanov"));
    }

    @Test
    public void shouldSearchByClosed() {
         assertEquals(List.of(issues2, issues3),manager.searcyBy("closed"));
    }

}