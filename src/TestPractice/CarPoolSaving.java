package TestPractice;

public class CarPoolSaving {
    double costPerMile = 0;
    double MileCost = 0;

    public double carCostPerMile(double totalMile , int milePerGallon) {
         costPerMile =totalMile/milePerGallon;
        return costPerMile;
    }

    public double totalMilePerDay(double totalMile,double costPerMile) {
        double MileCost = totalMile * costPerMile;
        this.MileCost = MileCost;
        return MileCost;
    }

    public double averageMilePerDay(double totalMilePerDay, double totalGallonPerDay) {
        return totalMilePerDay / totalGallonPerDay;
    }

    public double totalCostOnDallyBasis(double parkFee, double tollGateFee) {
        return MileCost + parkFee + tollGateFee;
    }
}
