package lesson2;

public class Main {
    public static void main(String[] args) {

        int SizeArrayX = 4;
        int SizeArrayY = 4;
        String[][] array1 = new String[SizeArrayX][SizeArrayY];
        FillingArray(array1);
        try {
            MassString(array1);
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }



    }

    public static void MassString(String[][] array) throws MyArraySizeException, MyArrayDataException {
        if (array.length != 4)
            throw new MyArraySizeException("Длинная массива должна быть равна 4, длинна вашего массива равна " + array.length + "  измениете длину массива ", array.length);
        if (array[1].length != 4)
            throw new MyArraySizeException("Длинная массива должна быть равна 4, длинна вашего массива равна " + array[1].length + "  измениете длину массива ", array[1].length);

        System.out.println("Подали массив размерностью " + array.length + ":" + array[1].length);
        PrintArray(array);

        int i = 0;
        int j = 0;

        for (i = 0; i < array.length; i++) {
            for (j = 0; j < array[i].length; j++) {

                try {
                    Integer.parseInt(array[i][j]);

                }catch (NumberFormatException e){
                throw new MyArrayDataException("НЕвозможно преобразовать значение ячейки " + i + ":" + j);
                }





                if (i == 0 && j != 0) {
                    array[i][j] = "" + (Integer.valueOf(array[0][j - 1]) + Integer.valueOf(array[i][j])) + "";

                }
                if (i != 0 && j == 0) {
                    array[i][j] = "" + (Integer.valueOf(array[i - 1][0]) + Integer.valueOf(array[i][j])) + "";

                }
                if (i != 0 && j != 0) {
                    array[i][j] = String.valueOf(Integer.valueOf(array[0][j - 1]) + Integer.valueOf(array[i][j]));

                }
            }


        }
        PrintArray(array);

    }

    //заполняем массив
    public static void FillingArray(String[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = String.valueOf(i + j);//"ww";//
            }
        }
    }

    //печатаем массив
    public static void PrintArray(String[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }

}
