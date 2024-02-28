//there is an ambuza cement factory. 
// if factory produce 250 Ton in 30 min then how many ton factory will produce in 1 day and 1 years?
// if 1 sack can adjust 50kg cement than how much  stack factory can produce in 1 year.
// if  factory profit 1 sack is rs.15.5  than how much total compnay sell and and get profit in 1 years?
// if there is 1 room content 15 sack then how much 50 room content ?
// base/ceiling 1 ft content 3.2 sack 
//ceiling 40 square.ft =?
//base 50 square ft = ?
// total building sack need?
// c.p = 750
//total cost = ?

public class Construction {
    public static void main(String[] args) {
        int productionRatePer30Min = 250 ;//in tons
        int minutesInDay = 24 * 60;// 24 hours in a day, 60 minutes in a hours
        int minutesInYear = 365 * 24 * 60; // 365 days in a year
        int kgPerStack = 50; // in kilograms
        double profitPerStack = 15.5; // in Rs.
        int sackInOneRoom = 15;
        int numberOfRooms = 50;
        double sackPerSquareFoot = 3.2;
        int ceilingArea = 40;// in square foot
        int baseArea = 50; // in square foot
        double costPerSack = 750; // in rs.

        int productionPerDay = (productionRatePer30Min * minutesInDay) / 30;
        int productionPerYear = (productionRatePer30Min * minutesInYear ) / 30;
        int stacksPerYear = productionPerYear * 1000 / kgPerStack;// convert tons to kilograms
        double totalRevenue = stacksPerYear * profitPerStack;
        //Assuming profit is revenue minus production cost
        double productionCost = productionPerDay * profitPerStack;
        double totalProfit = totalRevenue - productionCost;
        int sacksInFiftyRooms = sackInOneRoom * numberOfRooms;
        double sacksForCeiling = ceilingArea * sackPerSquareFoot;
        double sacksForBase = baseArea * sackPerSquareFoot;
        double totalSacksNeeded = sacksForCeiling + sacksForBase;
        double totalCost = totalSacksNeeded * costPerSack;


        System.out.println("Production per day:" + productionPerDay + "tons");
        System.out.println("production per year:" + productionPerYear + "tons");
        System.out.println("stacks produced in one years:" + stacksPerYear);
        System.out.println("Total revenue in one years: Rs." + totalRevenue);
        System.out.println("Total profit in one year: Rs." + totalProfit);
        System.out.println("Number of sacks in 50 rooms:" + sacksInFiftyRooms);
        System.out.println("Number of sacks needed for the ceiling:" + sacksForCeiling);
        System.out.println("Number of sacks needed for the base:" + sacksForBase);
        System.out.println("Total number of sacks needed for the building:" + totalSacksNeeded);
        System.out.println("Total cost needed for the building: Rs." + totalCost);
    }
    
}
