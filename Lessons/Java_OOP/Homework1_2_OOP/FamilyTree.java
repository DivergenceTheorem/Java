package Homework1_2_OOP;

import java.util.ArrayList;
import java.util.List;

public class FamilyTree {
    private Human root;
    private List<Human> members;

    public FamilyTree(Human root) {
        this.root = root;
        this.members = new ArrayList<>();
        this.members.add(root);
    }

    public Human getRoot() {
        return root;
    }

    public void setRoot(Human root) {
        this.root = root;
    }

    public void addMember(Human human) {
        this.members.add(human);
    }

    public List<Human> getMembers() {
        return members;
    }

    public Human findHumanByName(String name) {
        for (Human human : members) {
            if (human.getName().equalsIgnoreCase(name)) {
                return human;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Human human : members) {
            sb.append(human.toString()).append("\n");
        }
        return sb.toString();
    }
}

