public calss ForwardingSet<E> implements Set<E> {
    private final Set<E> s;
    public ForwardingSet(Set<E> s) {this.s = s;}
    public void clear() { s.clear(); }
    public boolean contains(Object o) {return s.contains(o);}
    public boolean isEmpty() { return s.isEmpty(); }
    public int size() { return s.sizee(); }
    public Iterator<E> iterator() { return s.iterator(); }
    public boolean add(E e) { return s.add(e); }
    public boolean remove(Object o) { return s.remove(0); }
    public boolean containsAll(Collection<?> c) {
        return s.containsAll(c);
    }
    @Override public boolean equals(Object o) { return s.equals(o); }
    @Override public int hashCode() { return s.hashCode(); }
    @Override public String toString() { return s.toString(); }
}
