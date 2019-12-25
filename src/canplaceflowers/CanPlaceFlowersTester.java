package canplaceflowers;

public class CanPlaceFlowersTester {

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (null == flowerbed || flowerbed.length == 0) {
            return false;
        }
        int temp = -1;
        int positionCount = 0;
        for (int i = 0; i < flowerbed.length; i ++) {
            if (flowerbed[i] == 0) {
                if (i > 0 && i < flowerbed.length - 1) {
                    if (flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0) {
                        positionCount ++;
                        flowerbed[i] = 1;
                    }
                } else if (i == 0) {
                    if (flowerbed.length == 1) {
                        return true;
                    }
                    if (flowerbed[i + 1] == 0) {
                        positionCount ++;
                        flowerbed[i] = 1;
                    }
                } else if (i == flowerbed.length - 1){
                    if (flowerbed[i - 1] == 0) {
                        positionCount ++;
                        flowerbed[i] = 1;
                    }
                }

            }
        }

        if (n <= positionCount) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        CanPlaceFlowersTester cpf = new CanPlaceFlowersTester();
        boolean case1 = cpf.canPlaceFlowers(new int[]{1, 0, 0,0, 0, 1}, 2);
        System.out.println(case1);

        boolean case2 = cpf.canPlaceFlowers(new int[]{1, 0, 0,0,0, 0, 1}, 2);
        System.out.println(case2);

        boolean case3 = cpf.canPlaceFlowers(new int[]{0, 1, 0, 0, 0, 1}, 3);
        System.out.println(case3);

        boolean case4 = cpf.canPlaceFlowers(new int[]{1,0,0,0,1,0,0}, 2);
        System.out.println(case4);

        boolean case5= cpf.canPlaceFlowers(new int[]{0}, 1);
        System.out.println(case5);


    }
}
