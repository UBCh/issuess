package ru.netology.manager;

import ru.netology.domain.Issues;
import ru.netology.repositiry.RepositoryIssues;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collection;

public class ManagerRepositoryIssues implements Comparable <ManagerRepositoryIssues> {

    public ManagerRepositoryIssues() {
    }
public RepositoryIssues repository = new RepositoryIssues();
 public Issues issues =new Issues(issues.author(), issues.closed(),issues.assignee(),issues.label);

    public void add(Issues issues) {
        repository.save(issues);
    }

    public Collection<Issues> findAll() {
        return repository.getAll();
    }

    public String addClosed (String closed){
        closed =issues.setClosed(closed);
        return closed;

    }
    @Override

    public int compareTo(ManagerRepositoryIssues o) {
        int result = this.repository.author.compareTo(o.author);
        if (result == 0) {
            result = this.repository.closed.compareTo(o.closed);
        }
        return result;

    }



    public Collection<Issues> searcyBy(String search) {
        Collection result = new ArrayList<>();
        for ( result: repository.getAll()) {
            if (matches(repository, search)) {
                Collection tmp = new ArrayList();
                 compareTo(tmp);
                result = tmp;
            }
        }

        return result;
    }


    public boolean matches(Issues issues, String search) {
        if (repository.getByAuthor().contains(search)) {
                return true;
            }

       if (repository.getByLabel().contains(search)) {
                return true;
            }
            if (repository.getByAssignee().contains(search)) {
                return true;
            }
        if (repository.getByClose().contains(search)) {
            return true;
        }
        return false;
    }


}
