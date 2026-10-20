package CorePrograms.Methods.Level3;

public class FootballTeam {
    // method to generate random heights
    public int[] generateHeights() {
        int[] heights = new int[11];
        for (int i = 0; i < heights.length; i++) {
            heights[i] = (int) (Math.random() * 101) + 150;
        }
        return heights;
    }
    // method to find the sum of heights
    public int findSum(int[] heights) {
        int sum = 0;
        for (int i = 0; i < heights.length; i++) {
            sum += heights[i];
        }
        return sum;
    }
    // method to find the mean height
    public double findMean(int[] heights) {
        int sum = findSum(heights);
        return (double) sum / heights.length;
    }
    // method to find the shortest height
    public int findShortest(int[] heights) {
        int shortest = heights[0];

        for (int i = 1; i < heights.length; i++) {
            if (heights[i] < shortest) {
                shortest = heights[i];
            }
        }
        return shortest;
    }
    // method to find the tallest height
    public int findTallest(int[] heights) {
        int tallest = heights[0];

        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > tallest) {
                tallest = heights[i];
            }
        }

        return tallest;
    }
    public static void main(String[] args){
        // to create object
        FootballTeam obj = new FootballTeam();

        // to generate heights
        int[] heights = obj.generateHeights();

        // to print the heights
        System.out.println("Heights of the 11 players:");

        for (int i = 0; i < heights.length; i++) {
            System.out.println("Player " + (i + 1) + ": " + heights[i] + " cm");
        }
        // to call methods
        int sum = obj.findSum(heights);
        double mean = obj.findMean(heights);
        int shortest = obj.findShortest(heights);
        int tallest = obj.findTallest(heights);

        // to print the results
        System.out.println("Sum of heights = " + sum + " cm");
        System.out.println("Mean height = " + mean + " cm");
        System.out.println("Shortest height = " + shortest + " cm");
        System.out.println("Tallest height = " + tallest + " cm");
    }
}
