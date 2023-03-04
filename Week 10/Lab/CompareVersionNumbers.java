class CompareVersionNumbers {
    public int compareVersion(String version1, String version2) {
        String[] version1Numbers = version1.split("\\.");
        String[] version2Numbers = version2.split("\\.");
        int maxSize = Math.max(version1Numbers.length, version2Numbers.length);
        int answer = 0;
        for(int i=0; i<maxSize; i++) {
            int version1Number = i>=version1Numbers.length ? 0 : Integer.parseInt(version1Numbers[i]);
            int version2Number = i>=version2Numbers.length ? 0 : Integer.parseInt(version2Numbers[i]);
            if(version1Number > version2Number) {
                return 1;
            } 
            else if (version1Number < version2Number) {
                return -1;
            }
        }
        return 0;
    }
}
