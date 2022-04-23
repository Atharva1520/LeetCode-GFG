public class Codec {
 HashMap<Integer,String> map = new HashMap<>();
    int key = 1;
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        map.put(key,longUrl);
        key++;
        return Integer.toString(key - 1);
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        int temp = Integer.parseInt(shortUrl);
      return  map.get(temp);
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));