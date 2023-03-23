package com.bange.datastructure.structure;

public class SparseArray {
    public static void main(String[] args) {
        // 创建一个而为数组11*11，0表示无棋子 1表示黑子 2 蓝紫
        int[][] arr = new int[11][11];
        arr[1][2] = 1;
        arr[2][3] = 2;
        // 列长度
//        System.out.println(arr[0].length);
//        // 行长度
//        System.out.println(arr.length);
        System.out.println("-------------------------打印原数组----------------------------");
        printArr(arr);

        // 转换成稀疏数组
        // 有效数字
        int significantDigitNum = getSignificantDigitNum(arr);
        // 创建稀疏数组
        int[][] sparseArr = createSparse(arr, significantDigitNum);
        System.out.println("-------------------------打印稀疏数组----------------------------");
        printArr(sparseArr);

        //还原稀疏数组
        int[][] arr1 = restoreSparseArr(sparseArr);
        System.out.println("-------------------------还原数组----------------------------");
        printArr(arr1);

    }
        //还原数组
    private static int[][] restoreSparseArr(int[][] sparseArr) {
        int row= sparseArr[0][0];
        int col= sparseArr[0][1];
        int[][] arr1 = new int[row][col];
        for (int i = 1; i < sparseArr.length ; i++) {
            int k= sparseArr[i][0];
            int m = sparseArr[i][1];
            int v = sparseArr[i][2];
            arr1[k][m]=v;
        }
        return arr1;
    }

    //创建稀疏数组
    private static int[][] createSparse(int[][] arr, int significantDigitNum) {
        int count = 0;
        int[][] sparseArr = new int[significantDigitNum + 1][3];
        sparseArr[0][0] = arr.length;
        sparseArr[0][1] = arr[0].length;
        sparseArr[0][2] = significantDigitNum;
        for (int k = 0; k < arr.length; k++) {
            for (int m = 0; m < arr[0].length; m++) {
                if (arr[k][m] > 0) {
                    count++;
                    sparseArr[count][0] = k;
                    sparseArr[count][1] = m;
                    sparseArr[count][2] = arr[k][m];
                }
            }
        }
        return sparseArr;
    }

    // 获取有效数字
    private static int getSignificantDigitNum(int[][] arr) {
        int significantDigitNum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] > 0) {
                    significantDigitNum++;
                }
            }
        }
        return significantDigitNum;
    }

    // 打印数组
    private static void printArr(int[][] sparseArr) {
        for (int i = 0; i < sparseArr.length; i++) {
            for (int j = 0; j < sparseArr[0].length; j++) {
                System.out.printf("%d ", sparseArr[i][j]);
            }
            System.out.println();
        }
    }
}
