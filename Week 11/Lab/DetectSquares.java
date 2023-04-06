class static DetectSquares {

    Map<String, Integer> countOfPoints;
    public DetectSquares() {
        countOfPoints = new HashMap<>();
    }
    public void add(int[] point) {
        String key = getKeyForPoint(point);
        countOfPoints.put(key, countOfPoints.getOrDefault(key, 0)+1);

    }
    public static int count(int[] point) {
        int count = 0;
        for(String key: countOfPoints.keySet()) 
        {
            int[] pickedPoint = getPointFromKey(key);
            if(pickedPoint[0]==point[0] || pickedPoint[1]==point[1]) continue;
            else if(Math.abs(pickedPoint[0]-point[0]) == Math.abs(pickedPoint[1]-point[1])) 
            {
                String keyOfPoint1 = getKeyForPoint(new int[] {point[0], pickedPoint[1]});
                String keyOfPoint2 = getKeyForPoint(new int[] {pickedPoint[0], point[1]});
                count = count + countOfPoints.get(key)*countOfPoints.getOrDefault(keyOfPoint1,0)*countOfPoints.getOrDefault(keyOfPoint2,0);
            }
        }
        return count;
    }   
    private static String getKeyForPoint(int[] point) 
    {
        return point[0] +" "+ point[1]; 
    } 
    private int[] getPointFromKey(String key) { 
        String[] points = key.split(" "); 
        int[] point = new int[2]; point[0] = Integer.parseInt(points[0]); 
        point[1] = Integer.parseInt(points[1]); return point; 
    }
}
