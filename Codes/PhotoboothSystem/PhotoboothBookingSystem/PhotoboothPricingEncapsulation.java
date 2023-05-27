package PhotoboothBookingSystem;

import java.util.HashMap;

public class PhotoboothPricingEncapsulation {
    private HashMap<String, Double> design = new HashMap<>();
    private HashMap<String, Double> designts = new HashMap<>();
    private HashMap<String, Double> designdedication = new HashMap<>();
    private HashMap<String, Double> designpolaroid = new HashMap<>();
    private Double magnetic = 500.0;
    private Double ownLayout = 2500.0;
    private Double magneticTs = 1000.0;
    private Double ownLayoutTs = 2800.0;
    private Double ownLayoutDedication = 3000.0;
    private Double magneticpolaroid = 1000.0;
    private Double ownLayoutpolaroid = 2800.0;

    public PhotoboothPricingEncapsulation() {
    	design.put("Choose 4R/Standard Layout Design", 0.0);
        design.put("1. Disney Princess (Arial)", 2500.0);
        design.put("2. Butterfly", 2500.0);
        design.put("3. Wreck it ralph (Vanellope)", 2500.0);
        design.put("4. Flower Roses", 2500.0);
        design.put("5. BTS", 2500.0);
        design.put("6. Barbie", 2500.0);
        design.put("7. Frozen", 2500.0);
        design.put("8. Encanto", 2500.0);
        design.put("9. Jungle", 2500.0);
        design.put("10. Flower (2)", 2500.0);
        design.put("11. Racing", 2500.0);
        design.put("12. Disney Princess (Arial2)", 2500.0);
        design.put("13. SuperDad", 2500.0);
        design.put("14. Ligthing Mcqueen", 2500.0);
        design.put("15. Mickey Mouse", 2500.0);
        design.put("16. Disney Princess (Cinderella)", 2500.0);
        design.put("17. Umbrella", 2500.0);
        design.put("18. 80's", 2500.0);
        design.put("19. Unicorn", 2500.0);
        design.put("20. Smurf", 2500.0);
        design.put("21. Babyshark", 2500.0);
        
        designts.put("Choose 4R/Standard Layout Design", 0.0);
        designts.put("1. Disney Princess (Arial)", 2800.0);
        designts.put("2. Butterfly", 2800.0);
        designts.put("3. Wreck it ralph (Vanellope)", 2800.0);
        designts.put("4. Flower Roses", 2800.0);
        designts.put("5. BTS", 2800.0);
        designts.put("6. Barbie", 2800.0);
        designts.put("7. Frozen", 2800.0);
        designts.put("8. Encanto", 2800.0);
        designts.put("9. Jungle", 2800.0);
        designts.put("10. Flower (2)", 2800.0);
        
        designdedication.put("Choose 4R/Standard Layout Design", 0.0);
        designdedication.put("1. Disney Princess (Arial)", 3000.0);
        designdedication.put("2. Butterfly", 3000.0);
        designdedication.put("3. Wreck it ralph (Vanellope)", 3000.0);
        designdedication.put("4. Flower Roses", 2800.0);
        designdedication.put("5. BTS", 3000.0);
        designdedication.put("6. Barbie", 3000.0);
        designdedication.put("7. Frozen", 3000.0);
        designdedication.put("8. Encanto", 3000.0);
        designdedication.put("9. Jungle", 3000.0);
        designdedication.put("10. Flower (2)", 3000.0);
        
        designpolaroid.put("Choose Polaroid Layout Size", 0.0);
        designpolaroid.put("1. Polaroid Height(4.1) Width(4.1)", 2800.0);
        designpolaroid.put("2. Polaroid Height(3.3) Width(4.5)", 2800.0);
    }

    public PhotoboothPricingEncapsulation(Double magnetic,Double ownLayout) {
        this.magnetic = magnetic;
        this.ownLayout = ownLayout;
    }
   

    public double calculatePackageStandard(String designPrice, String magneticPrice ) {
    	 double designCost = design.getOrDefault(designPrice, 0.0);
         double magneticCost = magneticPrice != null ? magnetic : 0.0;
         return designCost + magneticCost;
    }
    
    public double calculatePackageStandard2(String ownLayoutPriceTs, String magneticPrice) {
    	double magneticCost = magneticPrice != null ? magnetic : 0.0;
    	double ownlayoutCost = ownLayout != null ? ownLayout : 0.0;
    	return ownlayoutCost + magneticCost;
    }
    
    public double calculatePackageTwinstrip(String designPriceTs, boolean magneticSelected) {
        double designCostTs = designts.getOrDefault(designPriceTs, 0.0);
        double magneticCostTs = magneticSelected ? magneticTs : 0.0;
        return designCostTs + magneticCostTs;
    }

    public double calculatePackageTwinstrip2(boolean ownLayoutSelected, boolean magneticSelected) {
        double magneticCostTs = magneticSelected ? magneticTs : 0.0;
        double ownLayoutCostTs = ownLayoutSelected ? ownLayoutTs : 0.0;
        return ownLayoutCostTs + magneticCostTs;
    }
    
    public double calculatePackageDedication(String designPriceDedication, boolean magneticSelected) {
        double designCostDedication = designdedication.getOrDefault(designPriceDedication, 0.0);
        double magneticCostdedication = magneticSelected ? magnetic : 0.0;
        return designCostDedication + magneticCostdedication;
    }

    public double calculatePackageDedication2(boolean ownLayoutSelected, boolean magneticSelected) {
        double magneticCostdedication = magneticSelected ? magnetic : 0.0;
        double ownLayoutCostDedication = ownLayoutSelected ? ownLayoutDedication : 0.0;
        return ownLayoutCostDedication + magneticCostdedication;
    }
    
    public double calculatePackagePolaroid(String designPricePolaroid, boolean magneticSelected) {
        double designCostPolaroid = designpolaroid.getOrDefault(designPricePolaroid, 0.0);
        double magneticCostPolaroid = magneticSelected ? magneticpolaroid  : 0.0;
        return designCostPolaroid + magneticCostPolaroid;
    }

    public double calculatePackagePolaroid2(boolean ownLayoutSelected, boolean magneticSelected) {
        double magneticCostPolaroid = magneticSelected ? magneticpolaroid  : 0.0;
        double ownLayoutCostPolaroid = ownLayoutSelected ? ownLayoutpolaroid  : 0.0;
        return ownLayoutCostPolaroid + magneticCostPolaroid;
    }
}

