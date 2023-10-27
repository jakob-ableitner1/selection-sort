public class MainClass {
    public static void main(String[] args){
        int[] numbers = {5, 1, 3, 18, 6, 5, 4, 9};
        char[] characters = {'j', 'a', 'w', 'p', 'd'};

        sort(numbers);
        sort(characters);
    }

    public static void sort(int[] numbers){
        int startingIndex = 0;
        for(int number : numbers){
            int minIndex = startingIndex;
            for(int i=startingIndex + 1; i<numbers.length; i++){
                if (numbers[i] < numbers[minIndex]){
                    minIndex = i;
                }
            }

            //switch array elements
            numbers[startingIndex] = numbers[minIndex];
            numbers[minIndex] = number;

            startingIndex++;
        }

        System.out.print("Numbers in ascending order: ");
        for (int number : numbers){
            System.out.print(number + " ");
        }
        System.out.println();
    }

    public static void sort(char[] chars){
        int startingIndex = 0;
        for(char character : chars){
            int minIndex = startingIndex;
            for(int i=startingIndex + 1; i<chars.length; i++){
                if (chars[i] < chars[minIndex]){
                    minIndex = i;
                }
            }

            //switch array elements
            chars[startingIndex] = chars[minIndex];
            chars[minIndex] = character;

            startingIndex++;
        }

        System.out.print("Characters in ascending order: ");
        for (char character : chars){
            System.out.print(character + " ");
        }
    }
}
