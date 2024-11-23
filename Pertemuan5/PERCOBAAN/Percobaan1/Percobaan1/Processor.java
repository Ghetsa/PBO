package Pertemuan5.PERCOBAAN.Percobaan1.Percobaan1;

public class Processor {

    private String merk;
    private double cache;

    Processor() {

        
    }

    Processor(String merk, double cache) {
        this.merk = merk;
        this.cache = cache;
    }
    public void info() {
        System.out.printf("Merk Processor = %s\n", merk);
        System.out.printf("Cache Memory = %.2f MB\n", cache);
    }

    public String getMerk() {
        return merk;
      }
    
      public void setMerk(String newMerk) {
        merk = newMerk;
      }
    public double getCache() {
        return cache;
      }
    
      public void setCache(double newCache) {
        cache = newCache;
      }
}
