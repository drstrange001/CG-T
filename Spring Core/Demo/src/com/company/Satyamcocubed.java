package com.company;

public class Satyamcocubed {

    static class Farm {
        public int hens;
        public int cows;

        public Farm(int i, int i1) {
            hens = i;
            cows = i1;
        }
    }

    public static int maxLegs(Farm[] farms) {
        int maxCount = Integer.MIN_VALUE;
        int curCount = 0;
        for (Farm farm : farms) {
            curCount = (farm.cows * 4) + (farm.hens * 2);
            if (curCount > maxCount) {
                maxCount = curCount;
            }
        }
        return maxCount;
    }

    public static char classifySteel(int h, float c, int ts) {
        if (h > 60 && c > 0.8 && ts > 5700) {
            return 'A';
        } else if (h > 60 && c > 0.8) {
            return 'B';
        } else if (h > 60 && ts > 5700) {
            return 'C';
        } else if (c > 0.8 && ts > 5700) {
            return 'D';
        } else if (h > 60 || c > 0.8 || ts > 5700) {
            return 'E';
        }
        return 'F';
    }

    public static int findPairCount(int[] arr, int diff) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++)
                if (arr[i] - arr[j] == diff ||
                        arr[j] - arr[i] == diff)
                    count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(classifySteel(50, (float) 0.6, 5500));
        Farm[] farms = new Farm[4];
        farms[0] = new Farm(10, 32);
        farms[1] = new Farm(23, 16);
        farms[2] = new Farm(21, 89);
        farms[3] = new Farm(27, 22);
        System.out.println(maxLegs(farms));
        System.out.println(findPairCount(new int[]{2,5,6,4,8},3));
    }
}
