class CountSquares {
       private Map<Integer, Map<Integer, Integer>> map;
    public CountSquares() {
           map = new HashMap<>();
    }
    
    public void add(int[] point) {
        int x = point[0];
        int y = point[1];

        map.putIfAbsent(x, new HashMap<>());
        Map<Integer, Integer> yMap = map.get(x);
        yMap.put(y, yMap.getOrDefault(y, 0) + 1);
    }
    
    public int count(int[] point) {
        int x = point[0];
        int y = point[1];
        int ans = 0;

        if (!map.containsKey(x))
            return 0;

        for (int x2 : map.keySet()) {

            if (x2 == x)
                continue;

            int d = x2 - x;

            // Upper square
            ans += map.get(x2).getOrDefault(y, 0)
                 * map.get(x).getOrDefault(y + d, 0)
                 * map.get(x2).getOrDefault(y + d, 0);

            // Lower square
            ans += map.get(x2).getOrDefault(y, 0)
                 * map.get(x).getOrDefault(y - d, 0)
                 * map.get(x2).getOrDefault(y - d, 0);
         }
    return ans;
    }
}
