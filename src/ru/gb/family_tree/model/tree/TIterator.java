package ru.gb.family_tree.model.tree;

import java.util.Iterator;
import java.util.List;

public class TIterator<T> implements Iterator<T> {
    private int index;
    private List<T> humanList;

    public TIterator(List<T> humanList) {
        this.humanList = humanList;
    }

    @Override
    public boolean hasNext() {
        return index < humanList.size();
    }

    @Override
    public T next() {
        return humanList.get(index++);
    }
}
