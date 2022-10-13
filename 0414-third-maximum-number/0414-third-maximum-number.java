class Solution {
    public int thirdMax(int[] arr) {
        SortedSet< Integer > set = new TreeSet<>();
        for ( int e : arr ) set.add(e);
        if ( set.size() == 1 ) return set.first();
        else if ( set.size() == 2 ) return set.last();
        set.remove(set.last());
        set.remove(set.last());
        return set.last();
    }
}