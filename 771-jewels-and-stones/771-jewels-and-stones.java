class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> jewelStore = new HashSet<>();
	for (char c : jewels.toCharArray()) {
		jewelStore.add(c);
	}
	int count = 0;
	for (int i = 0; i < stones.length(); i++) {
		if (jewelStore.contains(stones.charAt(i))) {
			count += 1;
		}
	}
	return count;
    }
}