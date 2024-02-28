import java.util.Scanner;

public class interface {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input wallS logics
        System.out.println("Enter the height of the wall in feet: ");
        int wallHeightFt = scanner.nextInt();
        System.out.println("Enter the length of the wall in feet: ");
        int wallLengthFt = scanner.nextInt();

        // Input brick logics
        System.out.println("Enter the height of the brick in cm: ");
        int brickHeightCm = scanner.nextInt();
        System.out.println("Enter the length of the brick in cm: ");
        int brickLengthCm = scanner.nextInt();

        // Input distance to the wall
        System.out.println("Enter the distance to the wall in km: ");
        int distanceToWallKm = scanner.nextInt();

        // Constants
        final int BRICKS_PER_TRACTOR = 500;

        // Calculating the number of bricks needed for the wall
        int wallHeightCm = wallHeightFt * 30; // 1 ft = 30 cm
        int wallLengthCm = wallLengthFt * 30;
        int brickHeightInWall = wallHeightCm / brickHeightCm;
        int brickLengthInWall = wallLengthCm / brickLengthCm;
        int totalBricksNeeded = brickHeightInWall * brickLengthInWall;

        // Calculating the number of tractors needed
        int tractorsNeeded = (int) Math.ceil((double) totalBricksNeeded / BRICKS_PER_TRACTOR);

        // Calculating the delivery charge based on the distance to the wall
        int deliveryCharge;
        if (distanceToWallKm <= 10) {
            deliveryCharge = 300;
        } else if (distanceToWallKm <= 20) {
            deliveryCharge = 350;
        } else {
            deliveryCharge = 500;
        }

        // Calculating the total cost
        int totalCost = deliveryCharge * tractorsNeeded;

        // Printing the results
        System.out.println("Total bricks needed: " + totalBricksNeeded);
        System.out.println("Number of tractors needed: " + tractorsNeeded);
        System.out.println("Total cost for delivery: Rs." + totalCost);

        scanner.close(); // Closing the scanner
    }
}
