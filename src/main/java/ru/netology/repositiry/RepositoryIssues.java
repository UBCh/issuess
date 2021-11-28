package ru.netology.repositiry;

import ru.netology.domain.Issues;
import ru.netology.manager.ManagerRepositoryIssues;

import java.util.ArrayList;
import java.util.Collection;


public class RepositoryIssues {


    public Collection<Issues> issuess = new ArrayList<>();

    public RepositoryIssues() {
    }

    public RepositoryIssues(Collection<Issues> issuess) {
        this.issuess = issuess;
    }

    public void save(Issues issues) {
        issuess.add(issues);
    }
       public Collection<Issues> getAll() {
        return issuess;
    }

    public void removeById (int id) {
        issuess.removeIf(el -> el.getId()==id );
    }

    public Issues getByClose(String closed) {
        for (Issues item : issuess) {
            if (item.getClosed() == closed) {
                return item;
            }        }
        return null;
    }
    public Issues getByAuthor(String author) {
        for (Issues item : issuess) {
            if (item.getAuthor() == author) {
                return item;
            }
        }
        return null;
    }
    public Issues getByLabel(String label) {
        for (Issues item : issuess) {
            if (item.getLabel() == label) {
                return item;
            }
        }
        return null;
    }
    public Issues getByAssignee(String assignee) {
        for (Issues item : issuess) {
            if (item.getAssignee() == assignee ) {
                return item;
            }
        }
        return null;
    }
    public Issues getById(int id) {
        for (Issues item : issuess) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }

    public boolean add(Issues issues) {
        return issuess.add(issues);
    }

    public boolean remove(Issues issues) {
        return issuess.remove(issues);
    }

    public boolean addAll(Collection<? extends Issues> issues) {
        return this.issuess.addAll(issues);
    }

    public boolean removeAll(Collection<? extends Issues> issues) {
        return this.issuess.removeAll(issues);
    }

}


