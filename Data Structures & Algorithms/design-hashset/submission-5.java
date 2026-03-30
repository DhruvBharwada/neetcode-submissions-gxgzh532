class MyHashSet {
    private static final int size = 769;
    private LinkedList<Integer>[] buckets;
    public MyHashSet() {
        buckets = new LinkedList[size];
    }

    public int hash(int key){
        return key%size;
    }
    
    public void add(int key) {
        int index = hash(key);
        if(buckets[index]==null){
            buckets[index]= new LinkedList<>();
        }
        if (!buckets[index].contains(key)) {
            buckets[index].add(key);
        }
    }
    
    public void remove(int key) {
        int index = hash(key);
        if (buckets[index] != null) {
            buckets[index].remove((Integer) key);
        }
    }
    
    public boolean contains(int key) {
        int index = hash(key);

        if (buckets[index] == null) {
            return false;
        }

        return buckets[index].contains(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */